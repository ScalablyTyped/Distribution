
package org.scalablytyped.sbt

import sbt._
import sbt.Keys._

object ScalablyTypedPlugin extends AutoPlugin {
  override def trigger = allRequirements
  override def requires = sbt.plugins.JvmPlugin
  override def globalSettings = List(
    resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
  )

  object autoImport {
    object ScalablyTyped {
      object A {
        val angular__common = "org.scalablytyped" % "angular__common_sjs0.6_2.12" % "8.2.6-af052c"
        val angular__compiler = "org.scalablytyped" % "angular__compiler_sjs0.6_2.12" % "8.2.6-12bdf4"
        val angular__core = "org.scalablytyped" % "angular__core_sjs0.6_2.12" % "8.2.6-f193da"
        val angular__forms = "org.scalablytyped" % "angular__forms_sjs0.6_2.12" % "8.2.6-5cec2a"
        val `angular__platform-browser` = "org.scalablytyped" % "angular__platform-browser_sjs0.6_2.12" % "8.2.6-cc9d8a"
        val `angular__platform-browser-dynamic` = "org.scalablytyped" % "angular__platform-browser-dynamic_sjs0.6_2.12" % "8.2.6-d3ab46"
        val angular__router = "org.scalablytyped" % "angular__router_sjs0.6_2.12" % "8.2.6-dffeea"
        val `ant-design__create-react-context` = "org.scalablytyped" % "ant-design__create-react-context_sjs0.6_2.12" % "0.2.4-900406"
        val antd = "org.scalablytyped" % "antd_sjs0.6_2.12" % "3.23.2-cc3e16"
        val `antd-slinky-facade` = "org.scalablytyped" % "antd-slinky-facade_sjs0.6_2.12" % "201908100907-faf658"
        val axios = "org.scalablytyped" % "axios_sjs0.6_2.12" % "0.19.0-009b73"
      }
      object B {
        val `body-parser` = "org.scalablytyped" % "body-parser_sjs0.6_2.12" % "1.17-dt-20190819Z-54166b"
      }
      object C {
        val chart_dot_js = "org.scalablytyped" % "chart_dot_js_sjs0.6_2.12" % "2.8-dt-20190909Z-f53c04"
        val classnames = "org.scalablytyped" % "classnames_sjs0.6_2.12" % "2.2-dt-20190702Z-d03619"
        val connect = "org.scalablytyped" % "connect_sjs0.6_2.12" % "v3.4.0-dt-20190322Z-c4eb0c"
        val `core-js` = "org.scalablytyped" % "core-js_sjs0.6_2.12" % "2.5-dt-20190616Z-9abb1e"
        val csstype = "org.scalablytyped" % "csstype_sjs0.6_2.12" % "2.6.6-d2dd63"
      }
      object D {
        val d3 = "org.scalablytyped" % "d3_sjs0.6_2.12" % "5.7-dt-20190819Z-184c2f"
        val `d3-array` = "org.scalablytyped" % "d3-array_sjs0.6_2.12" % "2.0-dt-20190221Z-760fd0"
        val `d3-axis` = "org.scalablytyped" % "d3-axis_sjs0.6_2.12" % "1.0-dt-20190212Z-0632dc"
        val `d3-brush` = "org.scalablytyped" % "d3-brush_sjs0.6_2.12" % "1.0-dt-20190212Z-6d6f0d"
        val `d3-chord` = "org.scalablytyped" % "d3-chord_sjs0.6_2.12" % "1.0-dt-20190212Z-dd09d2"
        val `d3-collection` = "org.scalablytyped" % "d3-collection_sjs0.6_2.12" % "1.0-dt-20190212Z-fd899e"
        val `d3-color` = "org.scalablytyped" % "d3-color_sjs0.6_2.12" % "1.2-dt-20190212Z-9e3e3f"
        val `d3-contour` = "org.scalablytyped" % "d3-contour_sjs0.6_2.12" % "1.3-dt-20190205Z-b5ce89"
        val `d3-dispatch` = "org.scalablytyped" % "d3-dispatch_sjs0.6_2.12" % "1.0-dt-20190212Z-c5e11c"
        val `d3-drag` = "org.scalablytyped" % "d3-drag_sjs0.6_2.12" % "1.2-dt-20190212Z-61250a"
        val `d3-dsv` = "org.scalablytyped" % "d3-dsv_sjs0.6_2.12" % "1.0-dt-20190326Z-f16b18"
        val `d3-ease` = "org.scalablytyped" % "d3-ease_sjs0.6_2.12" % "1.0-dt-20190212Z-36846f"
        val `d3-fetch` = "org.scalablytyped" % "d3-fetch_sjs0.6_2.12" % "1.1-dt-20181228Z-8b4d69"
        val `d3-force` = "org.scalablytyped" % "d3-force_sjs0.6_2.12" % "1.2-dt-20190212Z-d3481f"
        val `d3-format` = "org.scalablytyped" % "d3-format_sjs0.6_2.12" % "1.3-dt-20190212Z-d765c1"
        val `d3-geo` = "org.scalablytyped" % "d3-geo_sjs0.6_2.12" % "1.11-dt-20190212Z-73f46c"
        val `d3-hierarchy` = "org.scalablytyped" % "d3-hierarchy_sjs0.6_2.12" % "1.1-dt-20190212Z-3dfd48"
        val `d3-interpolate` = "org.scalablytyped" % "d3-interpolate_sjs0.6_2.12" % "1.3-dt-20190212Z-28f1e7"
        val `d3-path` = "org.scalablytyped" % "d3-path_sjs0.6_2.12" % "1.0-dt-20190212Z-5022af"
        val `d3-polygon` = "org.scalablytyped" % "d3-polygon_sjs0.6_2.12" % "1.0-dt-20190212Z-240783"
        val `d3-quadtree` = "org.scalablytyped" % "d3-quadtree_sjs0.6_2.12" % "1.0-dt-20190212Z-5f0324"
        val `d3-random` = "org.scalablytyped" % "d3-random_sjs0.6_2.12" % "1.1-dt-20190212Z-f12cb3"
        val `d3-scale` = "org.scalablytyped" % "d3-scale_sjs0.6_2.12" % "2.1-dt-20190212Z-b7da72"
        val `d3-scale-chromatic` = "org.scalablytyped" % "d3-scale-chromatic_sjs0.6_2.12" % "1.3-dt-20190212Z-2ab52b"
        val `d3-selection` = "org.scalablytyped" % "d3-selection_sjs0.6_2.12" % "1.4-dt-20190710Z-f93212"
        val `d3-shape` = "org.scalablytyped" % "d3-shape_sjs0.6_2.12" % "1.3-dt-20190212Z-896440"
        val `d3-time` = "org.scalablytyped" % "d3-time_sjs0.6_2.12" % "1.0-dt-20190212Z-cd60ea"
        val `d3-time-format` = "org.scalablytyped" % "d3-time-format_sjs0.6_2.12" % "2.1-dt-20190212Z-dd1d0d"
        val `d3-timer` = "org.scalablytyped" % "d3-timer_sjs0.6_2.12" % "1.0-dt-20190212Z-8748cc"
        val `d3-transition` = "org.scalablytyped" % "d3-transition_sjs0.6_2.12" % "1.1-dt-20190212Z-d60c5b"
        val `d3-voronoi` = "org.scalablytyped" % "d3-voronoi_sjs0.6_2.12" % "1.1-dt-20190212Z-3ee740"
        val `d3-zoom` = "org.scalablytyped" % "d3-zoom_sjs0.6_2.12" % "1.7-dt-20190212Z-d63a8d"
      }
      object E {
        val electron = "org.scalablytyped" % "electron_sjs0.6_2.12" % "5.0.10-31a043"
        val exenv = "org.scalablytyped" % "exenv_sjs0.6_2.12" % "1.2-dt-20180321Z-1f017e"
        val expo = "org.scalablytyped" % "expo_sjs0.6_2.12" % "34.0.4-160fc9"
        val `expo-asset` = "org.scalablytyped" % "expo-asset_sjs0.6_2.12" % "6.0.0-c606da"
        val `expo-constants` = "org.scalablytyped" % "expo-constants_sjs0.6_2.12" % "6.0.0-cef718"
        val `expo-file-system` = "org.scalablytyped" % "expo-file-system_sjs0.6_2.12" % "6.0.2-e82cfe"
        val `expo-font` = "org.scalablytyped" % "expo-font_sjs0.6_2.12" % "6.0.1-62c242"
        val `expo-keep-awake` = "org.scalablytyped" % "expo-keep-awake_sjs0.6_2.12" % "6.0.0-3cf3e6"
        val `expo-linear-gradient` = "org.scalablytyped" % "expo-linear-gradient_sjs0.6_2.12" % "6.0.0-c5575a"
        val `expo-location` = "org.scalablytyped" % "expo-location_sjs0.6_2.12" % "6.0.0-320804"
        val `expo-permissions` = "org.scalablytyped" % "expo-permissions_sjs0.6_2.12" % "6.0.0-d072ed"
        val `expo-sqlite` = "org.scalablytyped" % "expo-sqlite_sjs0.6_2.12" % "6.0.0-0ccb5d"
        val `expo-web-browser` = "org.scalablytyped" % "expo-web-browser_sjs0.6_2.12" % "6.0.0-e0c234"
        val `expo__vector-icons` = "org.scalablytyped" % "expo__vector-icons_sjs0.6_2.12" % "9.0-dt-20190213Z-e7bf13"
        val express = "org.scalablytyped" % "express_sjs0.6_2.12" % "4.17-dt-20190819Z-c7b8a5"
        val `express-serve-static-core` = "org.scalablytyped" % "express-serve-static-core_sjs0.6_2.12" % "4.16-dt-20190819Z-a0ab1f"
        val `extract-zip` = "org.scalablytyped" % "extract-zip_sjs0.6_2.12" % "1.6-dt-20180214Z-3c007b"
      }
      object F {
        val fbemitter = "org.scalablytyped" % "fbemitter_sjs0.6_2.12" % "2.0.0-dt-20190503Z-154ed5"
        val `fortawesome__fontawesome-common-types` = "org.scalablytyped" % "fortawesome__fontawesome-common-types_sjs0.6_2.12" % "0.2.22-3c81d8"
        val `fortawesome__fontawesome-svg-core` = "org.scalablytyped" % "fortawesome__fontawesome-svg-core_sjs0.6_2.12" % "1.2.22-6b2768"
        val `fortawesome__free-solid-svg-icons` = "org.scalablytyped" % "fortawesome__free-solid-svg-icons_sjs0.6_2.12" % "5.10.2-320cd3"
        val `fortawesome__react-fontawesome` = "org.scalablytyped" % "fortawesome__react-fontawesome_sjs0.6_2.12" % "0.1.4-156be3"
      }
      object G {
        val gatsby = "org.scalablytyped" % "gatsby_sjs0.6_2.12" % "2.15.15-ff21e2"
        val `gatsby-link` = "org.scalablytyped" % "gatsby-link_sjs0.6_2.12" % "2.2.13-b8449d"
        val geojson = "org.scalablytyped" % "geojson_sjs0.6_2.12" % "7946.0-dt-20190319Z-799032"
        val googlemaps = "org.scalablytyped" % "googlemaps_sjs0.6_2.12" % "3.37-dt-20190904Z-995173"
      }
      object H {
        val highlight_dot_js = "org.scalablytyped" % "highlight_dot_js_sjs0.6_2.12" % "v9.12-dt-20190322Z-ed2b61"
        val history = "org.scalablytyped" % "history_sjs0.6_2.12" % "4.7.2-dt-20190822Z-314bbb"
        val `hoist-non-react-statics` = "org.scalablytyped" % "hoist-non-react-statics_sjs0.6_2.12" % "3.3-dt-20190402Z-ec0ebe"
      }
      object I {
        val `indefinite-observable` = "org.scalablytyped" % "indefinite-observable_sjs0.6_2.12" % "2.0.1-d9ffbc"
        val `is-buffer` = "org.scalablytyped" % "is-buffer_sjs0.6_2.12" % "2.0-dt-20181210Z-1fffde"
      }
      object J {
        val jquery = "org.scalablytyped" % "jquery_sjs0.6_2.12" % "3.3-dt-20190815Z-2fefbf"
        val jqueryui = "org.scalablytyped" % "jqueryui_sjs0.6_2.12" % "1.12-dt-20190322Z-0a401a"
        val jss = "org.scalablytyped" % "jss_sjs0.6_2.12" % "9.5-dt-20190710Z-25bdd3"
      }
      object L {
        val leaflet = "org.scalablytyped" % "leaflet_sjs0.6_2.12" % "1.5-dt-20190814Z-03d293"
        val lodash = "org.scalablytyped" % "lodash_sjs0.6_2.12" % "4.14-dt-20190827Z-a44a07"
      }
      object M {
        val `material-ui` = "org.scalablytyped" % "material-ui_sjs0.6_2.12" % "0.21-dt-20190815Z-cf55fc"
        val `material-ui__core` = "org.scalablytyped" % "material-ui__core_sjs0.6_2.12" % "3.9.3-1823c1"
        val `material-ui__icons` = "org.scalablytyped" % "material-ui__icons_sjs0.6_2.12" % "4.4.1-5a8b80"
        val mime = "org.scalablytyped" % "mime_sjs0.6_2.12" % "2.0-dt-20190205Z-4ec605"
        val mobx = "org.scalablytyped" % "mobx_sjs0.6_2.12" % "5.13.0-34bd5a"
        val `mobx-react` = "org.scalablytyped" % "mobx-react_sjs0.6_2.12" % "6.1.3-d6da1a"
        val `mobx-react-lite` = "org.scalablytyped" % "mobx-react-lite_sjs0.6_2.12" % "1.4.0-0f2888"
        val moment = "org.scalablytyped" % "moment_sjs0.6_2.12" % "2.24.0-73dd14"
      }
      object N {
        val node = "org.scalablytyped" % "node_sjs0.6_2.12" % "12.7-dt-20190911Z-772576"
      }
      object P {
        val p5 = "org.scalablytyped" % "p5_sjs0.6_2.12" % "0.9-dt-20190806Z-387427"
        val popper_dot_js = "org.scalablytyped" % "popper_dot_js_sjs0.6_2.12" % "1.15.0-301544"
        val `prop-types` = "org.scalablytyped" % "prop-types_sjs0.6_2.12" % "15.7-dt-20190903Z-b412db"
      }
      object R {
        val `range-parser` = "org.scalablytyped" % "range-parser_sjs0.6_2.12" % "1.2-dt-20181016Z-56137c"
        val `rc-mentions` = "org.scalablytyped" % "rc-mentions_sjs0.6_2.12" % "0.4.0-45b305"
        val reach__router = "org.scalablytyped" % "reach__router_sjs0.6_2.12" % "1.2-dt-20190404Z-49d4c1"
        val react = "org.scalablytyped" % "react_sjs0.6_2.12" % "16.9-dt-20190815Z-076e3c"
        val `react-addons-linked-state-mixin` = "org.scalablytyped" % "react-addons-linked-state-mixin_sjs0.6_2.12" % "0.14-dt-20190322Z-d1e6f1"
        val `react-big-calendar` = "org.scalablytyped" % "react-big-calendar_sjs0.6_2.12" % "0.22-dt-20190827Z-cd9cdc"
        val `react-dom` = "org.scalablytyped" % "react-dom_sjs0.6_2.12" % "16.9-dt-20190819Z-c20dcd"
        val `react-facade` = "org.scalablytyped" % "react-facade_sjs0.6_2.12" % "201907271018-1a7b10"
        val `react-is` = "org.scalablytyped" % "react-is_sjs0.6_2.12" % "16.7-dt-20190212Z-d625ee"
        val `react-japgolly-facade` = "org.scalablytyped" % "react-japgolly-facade_sjs0.6_2.12" % "201907271018-fae628"
        val `react-lifecycles-compat` = "org.scalablytyped" % "react-lifecycles-compat_sjs0.6_2.12" % "3.0-dt-20190116Z-7d7bf4"
        val `react-native` = "org.scalablytyped" % "react-native_sjs0.6_2.12" % "0.60-dt-20190913Z-d9e3aa"
        val `react-native-gesture-handler` = "org.scalablytyped" % "react-native-gesture-handler_sjs0.6_2.12" % "1.4.1-fe517b"
        val `react-native-vector-icons` = "org.scalablytyped" % "react-native-vector-icons_sjs0.6_2.12" % "6.4-dt-20190911Z-f4a780"
        val `react-navigation` = "org.scalablytyped" % "react-navigation_sjs0.6_2.12" % "3.0-dt-20190805Z-353510"
        val `react-redux` = "org.scalablytyped" % "react-redux_sjs0.6_2.12" % "7.1-dt-20190815Z-044d00"
        val `react-redux-facade` = "org.scalablytyped" % "react-redux-facade_sjs0.6_2.12" % "201907271018-f81a97"
        val `react-router` = "org.scalablytyped" % "react-router_sjs0.6_2.12" % "5.0-dt-20190702Z-30c9de"
        val `react-router-dom` = "org.scalablytyped" % "react-router-dom_sjs0.6_2.12" % "4.3-dt-20190822Z-3c872d"
        val `react-router-dom-slinky-facade` = "org.scalablytyped" % "react-router-dom-slinky-facade_sjs0.6_2.12" % "201908231210-c762d5"
        val `react-slick` = "org.scalablytyped" % "react-slick_sjs0.6_2.12" % "0.23-dt-20190503Z-98a10f"
        val `react-slinky-facade` = "org.scalablytyped" % "react-slinky-facade_sjs0.6_2.12" % "201908231208-4c5101"
        val `react-transition-group` = "org.scalablytyped" % "react-transition-group_sjs0.6_2.12" % "4.2-dt-20190807Z-1f1ea7"
        val redux = "org.scalablytyped" % "redux_sjs0.6_2.12" % "4.0.4-166239"
        val `redux-devtools-extension` = "org.scalablytyped" % "redux-devtools-extension_sjs0.6_2.12" % "2.13.8-e3b49c"
        val reveal = "org.scalablytyped" % "reveal_sjs0.6_2.12" % "3.3.0-dt-20190322Z-d7d867"
        val rxjs = "org.scalablytyped" % "rxjs_sjs0.6_2.12" % "6.5.3-c1508c"
      }
      object S {
        val `semantic-ui-react` = "org.scalablytyped" % "semantic-ui-react_sjs0.6_2.12" % "0.87.3-ab33dd"
        val `semantic-ui-react__event-stack` = "org.scalablytyped" % "semantic-ui-react__event-stack_sjs0.6_2.12" % "3.1.0-c79863"
        val `serve-static` = "org.scalablytyped" % "serve-static_sjs0.6_2.12" % "1.13-dt-20190819Z-86aa8b"
        val shallowequal = "org.scalablytyped" % "shallowequal_sjs0.6_2.12" % "1.1-dt-20190202Z-0de710"
        val sizzle = "org.scalablytyped" % "sizzle_sjs0.6_2.12" % "2.3-dt-20181006Z-85b909"
        val std = "org.scalablytyped" % "std_sjs0.6_2.12" % "3.7.0-dev-0b7356"
        val storybook__react = "org.scalablytyped" % "storybook__react_sjs0.6_2.12" % "4.0-dt-20190605Z-ec5536"
        val `styled-components` = "org.scalablytyped" % "styled-components_sjs0.6_2.12" % "4.1-dt-20190909Z-c83a34"
        val `symbol-observable` = "org.scalablytyped" % "symbol-observable_sjs0.6_2.12" % "1.2.0-f44c50"
      }
      object T {
        val three = "org.scalablytyped" % "three_sjs0.6_2.12" % "0.106.2-21a382"
        val tslib = "org.scalablytyped" % "tslib_sjs0.6_2.12" % "1.10.0-d82ac3"
        val typescript = "org.scalablytyped" % "typescript_sjs0.6_2.12" % "3.7.0-dev.20190914-33b593"
      }
      object U {
        val unimodules__core = "org.scalablytyped" % "unimodules__core_sjs0.6_2.12" % "3.0.2-862262"
        val `unimodules__react-native-adapter` = "org.scalablytyped" % "unimodules__react-native-adapter_sjs0.6_2.12" % "3.0.0-16da52"
      }
      object V {
        val vue = "org.scalablytyped" % "vue_sjs0.6_2.12" % "2.6.10-ba2090"
      }
      object W {
        val `webpack-env` = "org.scalablytyped" % "webpack-env_sjs0.6_2.12" % "1.14-dt-20190710Z-9b4444"
      }
      object Y {
        val `yandex-maps` = "org.scalablytyped" % "yandex-maps_sjs0.6_2.12" % "2.1-dt-20190719Z-bd9aa1"
      }
      object Z {
        val zone_dot_js = "org.scalablytyped" % "zone_dot_js_sjs0.6_2.12" % "0.9.1-bcbcde"
      }
    }
  }
}