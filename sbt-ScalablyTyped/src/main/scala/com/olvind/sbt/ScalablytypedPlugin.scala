
package org.scalablytyped.sbt

import sbt._
import sbt.Keys._

@deprecated("The pre-built distribution you're using of ScalablyTyped is deprecated. Please see https://www.scalablytyped.org for the new sbt plugin", "2020-04-19")
object ScalablyTypedPlugin extends AutoPlugin {
  override def trigger = allRequirements
  override def requires = sbt.plugins.JvmPlugin
  override def globalSettings = List(
    resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
  )

  object autoImport {
    object ScalablyTyped {
      object A {
        val angular__animations = "org.scalablytyped" % "angular__animations_sjs1_2.13" % "10.0.7-cfaf29"
        val angular__common = "org.scalablytyped" % "angular__common_sjs1_2.13" % "10.0.7-bee1a3"
        val angular__compiler = "org.scalablytyped" % "angular__compiler_sjs1_2.13" % "10.0.7-93aa63"
        val angular__core = "org.scalablytyped" % "angular__core_sjs1_2.13" % "10.0.7-9c6a7d"
        val angular__forms = "org.scalablytyped" % "angular__forms_sjs1_2.13" % "10.0.7-1e2ad7"
        val `angular__platform-browser` = "org.scalablytyped" % "angular__platform-browser_sjs1_2.13" % "10.0.7-948357"
        val `angular__platform-browser-dynamic` = "org.scalablytyped" % "angular__platform-browser-dynamic_sjs1_2.13" % "10.0.7-26f529"
        val angular__router = "org.scalablytyped" % "angular__router_sjs1_2.13" % "10.0.7-735e29"
        val `ant-design__icons` = "org.scalablytyped" % "ant-design__icons_sjs1_2.13" % "4.2.1-811f21"
        val `ant-design__icons-svg` = "org.scalablytyped" % "ant-design__icons-svg_sjs1_2.13" % "4.1.0-92fd6e"
        val `ant-design__react-slick` = "org.scalablytyped" % "ant-design__react-slick_sjs1_2.13" % "0.27.0-03924f"
        val antd = "org.scalablytyped" % "antd_sjs1_2.13" % "4.5.1-223440"
        val axios = "org.scalablytyped" % "axios_sjs1_2.13" % "0.19.2-4ff060"
      }
      object B {
        val `body-parser` = "org.scalablytyped" % "body-parser_sjs1_2.13" % "1.19-dt-20200210Z-4e311f"
      }
      object C {
        val chart_dot_js = "org.scalablytyped" % "chart_dot_js_sjs1_2.13" % "2.9-dt-20200714Z-eecfc7"
        val cheerio = "org.scalablytyped" % "cheerio_sjs1_2.13" % "v0.22.0-dt-20200708Z-5b75fc"
        val classnames = "org.scalablytyped" % "classnames_sjs1_2.13" % "2.2-dt-20200515Z-64b348"
        val connect = "org.scalablytyped" % "connect_sjs1_2.13" % "v3.4.0-dt-20200515Z-147ed2"
        val `core-js` = "org.scalablytyped" % "core-js_sjs1_2.13" % "2.5-dt-20200515Z-043d0f"
        val csstype = "org.scalablytyped" % "csstype_sjs1_2.13" % "3.0.2-b0fb5c"
      }
      object D {
        val d3 = "org.scalablytyped" % "d3_sjs1_2.13" % "5.7-dt-20200515Z-bb2dd5"
        val `d3-array` = "org.scalablytyped" % "d3-array_sjs1_2.13" % "2.0-dt-20200515Z-c6cf70"
        val `d3-axis` = "org.scalablytyped" % "d3-axis_sjs1_2.13" % "1.0-dt-20200515Z-e466f7"
        val `d3-brush` = "org.scalablytyped" % "d3-brush_sjs1_2.13" % "1.1-dt-20200605Z-3f438c"
        val `d3-chord` = "org.scalablytyped" % "d3-chord_sjs1_2.13" % "1.0-dt-20200515Z-0d394d"
        val `d3-collection` = "org.scalablytyped" % "d3-collection_sjs1_2.13" % "1.0-dt-20200515Z-c78492"
        val `d3-color` = "org.scalablytyped" % "d3-color_sjs1_2.13" % "1.2-dt-20200515Z-f0e16d"
        val `d3-contour` = "org.scalablytyped" % "d3-contour_sjs1_2.13" % "1.3-dt-20200515Z-29348d"
        val `d3-dispatch` = "org.scalablytyped" % "d3-dispatch_sjs1_2.13" % "1.0-dt-20200707Z-a00282"
        val `d3-drag` = "org.scalablytyped" % "d3-drag_sjs1_2.13" % "1.2-dt-20200515Z-8ff857"
        val `d3-dsv` = "org.scalablytyped" % "d3-dsv_sjs1_2.13" % "1.0-dt-20200515Z-559143"
        val `d3-ease` = "org.scalablytyped" % "d3-ease_sjs1_2.13" % "1.0-dt-20200515Z-a65d96"
        val `d3-fetch` = "org.scalablytyped" % "d3-fetch_sjs1_2.13" % "1.1-dt-20200515Z-aba96f"
        val `d3-force` = "org.scalablytyped" % "d3-force_sjs1_2.13" % "1.2-dt-20200515Z-77ec45"
        val `d3-format` = "org.scalablytyped" % "d3-format_sjs1_2.13" % "1.3-dt-20200515Z-1593d8"
        val `d3-geo` = "org.scalablytyped" % "d3-geo_sjs1_2.13" % "1.11-dt-20200515Z-cc907d"
        val `d3-hierarchy` = "org.scalablytyped" % "d3-hierarchy_sjs1_2.13" % "1.1-dt-20200515Z-968c80"
        val `d3-interpolate` = "org.scalablytyped" % "d3-interpolate_sjs1_2.13" % "1.3-dt-20200515Z-996f31"
        val `d3-path` = "org.scalablytyped" % "d3-path_sjs1_2.13" % "1.0-dt-20200515Z-a84c6d"
        val `d3-polygon` = "org.scalablytyped" % "d3-polygon_sjs1_2.13" % "1.0-dt-20200515Z-eee9b9"
        val `d3-quadtree` = "org.scalablytyped" % "d3-quadtree_sjs1_2.13" % "1.0-dt-20200515Z-8af91b"
        val `d3-random` = "org.scalablytyped" % "d3-random_sjs1_2.13" % "1.1-dt-20200515Z-eb4b31"
        val `d3-scale` = "org.scalablytyped" % "d3-scale_sjs1_2.13" % "2.2-dt-20200515Z-503e44"
        val `d3-scale-chromatic` = "org.scalablytyped" % "d3-scale-chromatic_sjs1_2.13" % "1.5-dt-20200515Z-e5d30e"
        val `d3-selection` = "org.scalablytyped" % "d3-selection_sjs1_2.13" % "1.4-dt-20200707Z-959b5c"
        val `d3-shape` = "org.scalablytyped" % "d3-shape_sjs1_2.13" % "1.3-dt-20200515Z-299ff3"
        val `d3-time` = "org.scalablytyped" % "d3-time_sjs1_2.13" % "1.0-dt-20200515Z-d0edc7"
        val `d3-time-format` = "org.scalablytyped" % "d3-time-format_sjs1_2.13" % "2.1-dt-20200515Z-a69292"
        val `d3-timer` = "org.scalablytyped" % "d3-timer_sjs1_2.13" % "1.0-dt-20200515Z-c954e4"
        val `d3-transition` = "org.scalablytyped" % "d3-transition_sjs1_2.13" % "1.1-dt-20200515Z-949829"
        val `d3-voronoi` = "org.scalablytyped" % "d3-voronoi_sjs1_2.13" % "1.1-dt-20200515Z-a14100"
        val `d3-zoom` = "org.scalablytyped" % "d3-zoom_sjs1_2.13" % "1.7-dt-20200515Z-e8fb7c"
        val dayjs = "org.scalablytyped" % "dayjs_sjs1_2.13" % "1.8.31-c16e23"
      }
      object E {
        val electron = "org.scalablytyped" % "electron_sjs1_2.13" % "9.1.2-0c5680"
        val `emotion-theming` = "org.scalablytyped" % "emotion-theming_sjs1_2.13" % "10.0.27-9920ad"
        val emotion__core = "org.scalablytyped" % "emotion__core_sjs1_2.13" % "10.0.28-cc9a66"
        val emotion__serialize = "org.scalablytyped" % "emotion__serialize_sjs1_2.13" % "0.11.16-a423d1"
        val emotion__styled = "org.scalablytyped" % "emotion__styled_sjs1_2.13" % "10.0.27-426b22"
        val `emotion__styled-base` = "org.scalablytyped" % "emotion__styled-base_sjs1_2.13" % "10.0.31-8eeb59"
        val emotion__utils = "org.scalablytyped" % "emotion__utils_sjs1_2.13" % "0.11.3-228a3a"
        val enzyme = "org.scalablytyped" % "enzyme_sjs1_2.13" % "3.10-dt-20200515Z-71995d"
        val exenv = "org.scalablytyped" % "exenv_sjs1_2.13" % "1.2-dt-20200515Z-cf0187"
        val expo = "org.scalablytyped" % "expo_sjs1_2.13" % "38.0.9-a7a655"
        val `expo-asset` = "org.scalablytyped" % "expo-asset_sjs1_2.13" % "8.1.7-190ef9"
        val `expo-constants` = "org.scalablytyped" % "expo-constants_sjs1_2.13" % "9.1.1-f8d0ee"
        val `expo-file-system` = "org.scalablytyped" % "expo-file-system_sjs1_2.13" % "9.1.0-2914db"
        val `expo-font` = "org.scalablytyped" % "expo-font_sjs1_2.13" % "8.2.2-05ece3"
        val `expo-keep-awake` = "org.scalablytyped" % "expo-keep-awake_sjs1_2.13" % "8.2.1-aec985"
        val `expo-linear-gradient` = "org.scalablytyped" % "expo-linear-gradient_sjs1_2.13" % "8.2.1-747275"
        val `expo-linking` = "org.scalablytyped" % "expo-linking_sjs1_2.13" % "1.0.3-3cc3b0"
        val `expo-location` = "org.scalablytyped" % "expo-location_sjs1_2.13" % "8.3.0-99373e"
        val `expo-permissions` = "org.scalablytyped" % "expo-permissions_sjs1_2.13" % "9.1.0-759ad2"
        val `expo-sqlite` = "org.scalablytyped" % "expo-sqlite_sjs1_2.13" % "8.2.1-1f399b"
        val `expo-web-browser` = "org.scalablytyped" % "expo-web-browser_sjs1_2.13" % "8.3.1-66adb8"
        val `expo__vector-icons` = "org.scalablytyped" % "expo__vector-icons_sjs1_2.13" % "10.2.0-51a719"
        val express = "org.scalablytyped" % "express_sjs1_2.13" % "4.17-dt-20200706Z-8c73d8"
        val `express-serve-static-core` = "org.scalablytyped" % "express-serve-static-core_sjs1_2.13" % "4.17-dt-20200722Z-ad54ad"
        val `extract-zip` = "org.scalablytyped" % "extract-zip_sjs1_2.13" % "1.6-dt-20200515Z-bfed85"
      }
      object F {
        val fbemitter = "org.scalablytyped" % "fbemitter_sjs1_2.13" % "2.0.0-dt-20200515Z-166464"
        val `fortawesome__fontawesome-common-types` = "org.scalablytyped" % "fortawesome__fontawesome-common-types_sjs1_2.13" % "0.2.30-70220c"
        val `fortawesome__fontawesome-svg-core` = "org.scalablytyped" % "fortawesome__fontawesome-svg-core_sjs1_2.13" % "1.2.30-5bb79a"
        val `fortawesome__free-solid-svg-icons` = "org.scalablytyped" % "fortawesome__free-solid-svg-icons_sjs1_2.13" % "5.14.0-585f2a"
        val `fortawesome__react-fontawesome` = "org.scalablytyped" % "fortawesome__react-fontawesome_sjs1_2.13" % "0.1.11-1313ea"
      }
      object G {
        val geojson = "org.scalablytyped" % "geojson_sjs1_2.13" % "7946.0-dt-20200515Z-389d0c"
        val googlemaps = "org.scalablytyped" % "googlemaps_sjs1_2.13" % "3.39-dt-20200723Z-5fe5d8"
      }
      object H {
        val highlight_dot_js = "org.scalablytyped" % "highlight_dot_js_sjs1_2.13" % "v9.12-dt-20200515Z-3aaea9"
        val history = "org.scalablytyped" % "history_sjs1_2.13" % "4.7.2-dt-20200518Z-3f7280"
        val `hoist-non-react-statics` = "org.scalablytyped" % "hoist-non-react-statics_sjs1_2.13" % "3.3-dt-20190402Z-772c87"
      }
      object I {
        val inquirer = "org.scalablytyped" % "inquirer_sjs1_2.13" % "7.3-dt-20200721Z-ec4e19"
        val `is-buffer` = "org.scalablytyped" % "is-buffer_sjs1_2.13" % "2.0-dt-20181210Z-d254d0"
      }
      object J {
        val jquery = "org.scalablytyped" % "jquery_sjs1_2.13" % "3.5-dt-20200621Z-eba646"
        val jqueryui = "org.scalablytyped" % "jqueryui_sjs1_2.13" % "1.12-dt-20200515Z-617184"
        val jss = "org.scalablytyped" % "jss_sjs1_2.13" % "10.3.0-01787b"
      }
      object L {
        val leaflet = "org.scalablytyped" % "leaflet_sjs1_2.13" % "1.5-dt-20200720Z-6288ee"
        val lodash = "org.scalablytyped" % "lodash_sjs1_2.13" % "4.14-dt-20200722Z-d8a9e0"
      }
      object M {
        val `material-ui` = "org.scalablytyped" % "material-ui_sjs1_2.13" % "0.21-dt-20200515Z-11856b"
        val `material-ui__core` = "org.scalablytyped" % "material-ui__core_sjs1_2.13" % "3.9.3-0f23fe"
        val `material-ui__icons` = "org.scalablytyped" % "material-ui__icons_sjs1_2.13" % "4.9.1-697906"
        val mime = "org.scalablytyped" % "mime_sjs1_2.13" % "2.0-dt-20200722Z-2804ea"
        val mobx = "org.scalablytyped" % "mobx_sjs1_2.13" % "5.15.4-29835d"
        val `mobx-react` = "org.scalablytyped" % "mobx-react_sjs1_2.13" % "6.2.5-6d4569"
        val `mobx-react-lite` = "org.scalablytyped" % "mobx-react-lite_sjs1_2.13" % "2.0.7-8df2aa"
        val moment = "org.scalablytyped" % "moment_sjs1_2.13" % "2.27.0-b13ce0"
      }
      object N {
        val node = "org.scalablytyped" % "node_sjs1_2.13" % "14.0-dt-20200724Z-16cddc"
      }
      object O {
        val onsenui = "org.scalablytyped" % "onsenui_sjs1_2.13" % "2.10.10-8384fa"
      }
      object P {
        val p5 = "org.scalablytyped" % "p5_sjs1_2.13" % "0.9-dt-20200711Z-9d553f"
        val popper_dot_js = "org.scalablytyped" % "popper_dot_js_sjs1_2.13" % "1.16.1-0ac557"
        val `prop-types` = "org.scalablytyped" % "prop-types_sjs1_2.13" % "15.7-dt-20200515Z-f69275"
      }
      object Q {
        val qs = "org.scalablytyped" % "qs_sjs1_2.13" % "6.9-dt-20200519Z-16080f"
      }
      object R {
        val `range-parser` = "org.scalablytyped" % "range-parser_sjs1_2.13" % "1.2-dt-20181016Z-9592a6"
        val `rc-field-form` = "org.scalablytyped" % "rc-field-form_sjs1_2.13" % "1.8.0-5d6bb1"
        val `rc-mentions` = "org.scalablytyped" % "rc-mentions_sjs1_2.13" % "1.4.0-fe291e"
        val `rc-menu` = "org.scalablytyped" % "rc-menu_sjs1_2.13" % "8.5.0-e2580e"
        val `rc-notification` = "org.scalablytyped" % "rc-notification_sjs1_2.13" % "4.4.0-869353"
        val `rc-picker` = "org.scalablytyped" % "rc-picker_sjs1_2.13" % "1.15.1-3b72c3"
        val `rc-select` = "org.scalablytyped" % "rc-select_sjs1_2.13" % "11.1.0-090663"
        val `rc-table` = "org.scalablytyped" % "rc-table_sjs1_2.13" % "7.8.6-436005"
        val `rc-tabs` = "org.scalablytyped" % "rc-tabs_sjs1_2.13" % "11.5.6-b0a604"
        val `rc-textarea` = "org.scalablytyped" % "rc-textarea_sjs1_2.13" % "0.3.0-512f58"
        val `rc-tooltip` = "org.scalablytyped" % "rc-tooltip_sjs1_2.13" % "4.2.1-cc4f6e"
        val `rc-tree` = "org.scalablytyped" % "rc-tree_sjs1_2.13" % "3.8.2-b00c27"
        val `rc-tree-select` = "org.scalablytyped" % "rc-tree-select_sjs1_2.13" % "4.1.0-b756f5"
        val `rc-trigger` = "org.scalablytyped" % "rc-trigger_sjs1_2.13" % "4.3.4-c2bbb4"
        val reach__router = "org.scalablytyped" % "reach__router_sjs1_2.13" % "1.3-dt-20200426Z-1b2f59"
        val react = "org.scalablytyped" % "react_sjs1_2.13" % "16.9-dt-20200711Z-695c73"
        val `react-addons-linked-state-mixin` = "org.scalablytyped" % "react-addons-linked-state-mixin_sjs1_2.13" % "0.14-dt-20200515Z-957d69"
        val `react-big-calendar` = "org.scalablytyped" % "react-big-calendar_sjs1_2.13" % "0.24-dt-20200718Z-0f7555"
        val `react-dom` = "org.scalablytyped" % "react-dom_sjs1_2.13" % "16.9-dt-20200519Z-e79eac"
        val `react-is` = "org.scalablytyped" % "react-is_sjs1_2.13" % "16.7-dt-20200227Z-a4798b"
        val `react-lifecycles-compat` = "org.scalablytyped" % "react-lifecycles-compat_sjs1_2.13" % "3.0-dt-20190116Z-55ef30"
        val `react-native` = "org.scalablytyped" % "react-native_sjs1_2.13" % "0.63-dt-20200723Z-c7c2f8"
        val `react-native-gesture-handler` = "org.scalablytyped" % "react-native-gesture-handler_sjs1_2.13" % "1.7.0-4940e6"
        val `react-native-safe-area-context` = "org.scalablytyped" % "react-native-safe-area-context_sjs1_2.13" % "3.0.7-4cf408"
        val `react-native-vector-icons` = "org.scalablytyped" % "react-native-vector-icons_sjs1_2.13" % "6.4-dt-20200515Z-c7ebec"
        val `react-navigation` = "org.scalablytyped" % "react-navigation_sjs1_2.13" % "4.4.0-923437"
        val `react-navigation-drawer` = "org.scalablytyped" % "react-navigation-drawer_sjs1_2.13" % "2.5.0-5488d5"
        val `react-navigation-stack` = "org.scalablytyped" % "react-navigation-stack_sjs1_2.13" % "2.8.2-92b6e0"
        val `react-redux` = "org.scalablytyped" % "react-redux_sjs1_2.13" % "7.1-dt-20200519Z-18e0d0"
        val `react-router` = "org.scalablytyped" % "react-router_sjs1_2.13" % "5.1-dt-20200629Z-43f7d1"
        val `react-router-dom` = "org.scalablytyped" % "react-router-dom_sjs1_2.13" % "5.1-dt-20200515Z-2e533d"
        val `react-router-native` = "org.scalablytyped" % "react-router-native_sjs1_2.13" % "5.1-dt-20200515Z-57cb04"
        val `react-slick` = "org.scalablytyped" % "react-slick_sjs1_2.13" % "0.23-dt-20200515Z-e3dd55"
        val redux = "org.scalablytyped" % "redux_sjs1_2.13" % "4.0.5-cefdc6"
        val `redux-devtools-extension` = "org.scalablytyped" % "redux-devtools-extension_sjs1_2.13" % "2.13.8-e5ca55"
        val reveal = "org.scalablytyped" % "reveal_sjs1_2.13" % "3.3.0-dt-20200515Z-5f36f6"
        val rxjs = "org.scalablytyped" % "rxjs_sjs1_2.13" % "6.6.2-a47ddf"
        val `rxjs-compat` = "org.scalablytyped" % "rxjs-compat_sjs1_2.13" % "6.6.2-a43b8e"
      }
      object S {
        val `scroll-into-view-if-needed` = "org.scalablytyped" % "scroll-into-view-if-needed_sjs1_2.13" % "2.2.25-2de588"
        val `semantic-ui-react` = "org.scalablytyped" % "semantic-ui-react_sjs1_2.13" % "1.1.0-d350bb"
        val `semantic-ui-react__event-stack` = "org.scalablytyped" % "semantic-ui-react__event-stack_sjs1_2.13" % "3.1.1-9f490f"
        val `serve-static` = "org.scalablytyped" % "serve-static_sjs1_2.13" % "1.13-dt-20200519Z-495fe1"
        val shallowequal = "org.scalablytyped" % "shallowequal_sjs1_2.13" % "1.1-dt-20190202Z-9b34ba"
        val sizzle = "org.scalablytyped" % "sizzle_sjs1_2.13" % "2.3-dt-20200515Z-a620e4"
        val `stardust-ui__react-component-ref` = "org.scalablytyped" % "stardust-ui__react-component-ref_sjs1_2.13" % "0.38.0-525bf1"
        val std = "org.scalablytyped" % "std_sjs1_2.13" % "3.9-7c0472"
        val storybook__addons = "org.scalablytyped" % "storybook__addons_sjs1_2.13" % "5.3.19-baddf4"
        val storybook__api = "org.scalablytyped" % "storybook__api_sjs1_2.13" % "5.3.19-c8a9fd"
        val storybook__channels = "org.scalablytyped" % "storybook__channels_sjs1_2.13" % "5.3.19-28206a"
        val storybook__react = "org.scalablytyped" % "storybook__react_sjs1_2.13" % "5.3.19-4914dc"
        val storybook__router = "org.scalablytyped" % "storybook__router_sjs1_2.13" % "5.3.19-ee948e"
        val storybook__theming = "org.scalablytyped" % "storybook__theming_sjs1_2.13" % "5.3.19-237018"
        val `styled-components` = "org.scalablytyped" % "styled-components_sjs1_2.13" % "5.1-dt-20200706Z-52fd5a"
        val `symbol-observable` = "org.scalablytyped" % "symbol-observable_sjs1_2.13" % "1.2.0-00debc"
      }
      object T {
        val three = "org.scalablytyped" % "three_sjs1_2.13" % "0.119.1-c77788"
        val through = "org.scalablytyped" % "through_sjs1_2.13" % "0.0-unknown-dt-20200515Z-b03765"
        val tslib = "org.scalablytyped" % "tslib_sjs1_2.13" % "2.0.0-3f88e3"
        val typescript = "org.scalablytyped" % "typescript_sjs1_2.13" % "3.9.7-1b8dbc"
      }
      object U {
        val `unimodules-permissions-interface` = "org.scalablytyped" % "unimodules-permissions-interface_sjs1_2.13" % "5.2.1-02d0cc"
        val unimodules__core = "org.scalablytyped" % "unimodules__core_sjs1_2.13" % "5.3.0-8345fa"
        val `unimodules__react-native-adapter` = "org.scalablytyped" % "unimodules__react-native-adapter_sjs1_2.13" % "5.4.0-6d50c6"
      }
      object V {
        val vue = "org.scalablytyped" % "vue_sjs1_2.13" % "2.6.11-0acf3f"
      }
      object W {
        val `webpack-env` = "org.scalablytyped" % "webpack-env_sjs1_2.13" % "1.15-dt-20200515Z-9f941d"
      }
      object Y {
        val `yandex-maps` = "org.scalablytyped" % "yandex-maps_sjs1_2.13" % "2.1-dt-20200723Z-04b0b3"
      }
      object Z {
        val zone_dot_js = "org.scalablytyped" % "zone_dot_js_sjs1_2.13" % "0.10.3-008dbb"
      }
    }
  }
}