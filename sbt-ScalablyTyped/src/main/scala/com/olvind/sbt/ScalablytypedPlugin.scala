
package org.scalablytyped.sbt

import sbt._
import sbt.Keys._

@deprecated("The pre-built distribution you're using of ScalablyTyped is deprecated. Please see https://www.scalablytyped.org for the new sbt plugin", "2020-04-19")
object ScalablyTypedPlugin extends AutoPlugin {
  override def trigger = allRequirements
  override def requires = sbt.plugins.JvmPlugin
  object autoImport {
    object ScalablyTyped {
      object A {
        val ajv = "org.scalablytyped" % "ajv_sjs1_3" % "8.11.2-9c7775"
        val `angular-devkit__core` = "org.scalablytyped" % "angular-devkit__core_sjs1_3" % "14.2.9-5d0cc1"
        val `angular-devkit__schematics` = "org.scalablytyped" % "angular-devkit__schematics_sjs1_3" % "14.2.9-a567ea"
        val angular__animations = "org.scalablytyped" % "angular__animations_sjs1_3" % "15.0.0-0ada94"
        val angular__common = "org.scalablytyped" % "angular__common_sjs1_3" % "15.0.0-d4a98d"
        val angular__compiler = "org.scalablytyped" % "angular__compiler_sjs1_3" % "15.0.0-bfe274"
        val `angular__compiler-cli` = "org.scalablytyped" % "angular__compiler-cli_sjs1_3" % "14.2.10-0f5633"
        val angular__core = "org.scalablytyped" % "angular__core_sjs1_3" % "15.0.0-90f1e3"
        val angular__forms = "org.scalablytyped" % "angular__forms_sjs1_3" % "15.0.0-9be2c4"
        val `angular__platform-browser` = "org.scalablytyped" % "angular__platform-browser_sjs1_3" % "15.0.0-c0d525"
        val `angular__platform-browser-dynamic` = "org.scalablytyped" % "angular__platform-browser-dynamic_sjs1_3" % "15.0.0-6a5ec4"
        val angular__router = "org.scalablytyped" % "angular__router_sjs1_3" % "15.0.0-803bb2"
        val `ant-design__icons` = "org.scalablytyped" % "ant-design__icons_sjs1_3" % "4.8.0-2eaf1a"
        val `ant-design__icons-svg` = "org.scalablytyped" % "ant-design__icons-svg_sjs1_3" % "4.2.1-a32040"
        val `ant-design__react-slick` = "org.scalablytyped" % "ant-design__react-slick_sjs1_3" % "0.29.2-7bb1b5"
        val antd = "org.scalablytyped" % "antd_sjs1_3" % "4.24.2-0db922"
        val axios = "org.scalablytyped" % "axios_sjs1_3" % "1.1.3-03bfe3"
      }
      object B {
        val babel__core = "org.scalablytyped" % "babel__core_sjs1_3" % "7.1-dt-20221107Z-bfbaa8"
        val babel__generator = "org.scalablytyped" % "babel__generator_sjs1_3" % "7.6-dt-20211223Z-a5f5d8"
        val babel__parser = "org.scalablytyped" % "babel__parser_sjs1_3" % "7.20.3-88d706"
        val babel__template = "org.scalablytyped" % "babel__template_sjs1_3" % "7.4-dt-20211202Z-4b071b"
        val babel__traverse = "org.scalablytyped" % "babel__traverse_sjs1_3" % "7.18-dt-20220923Z-3986dd"
        val babel__types = "org.scalablytyped" % "babel__types_sjs1_3" % "7.20.2-a7b16d"
        val `body-parser` = "org.scalablytyped" % "body-parser_sjs1_3" % "1.19-dt-20211202Z-bebfcf"
      }
      object C {
        val chart_dot_js = "org.scalablytyped" % "chart_dot_js_sjs1_3" % "4.0.1-47460e"
        val classnames = "org.scalablytyped" % "classnames_sjs1_3" % "2.3.2-843d5c"
        val connect = "org.scalablytyped" % "connect_sjs1_3" % "v3.4.0-dt-20220818Z-368123"
        val `convert-source-map` = "org.scalablytyped" % "convert-source-map_sjs1_3" % "1.5-dt-20211202Z-dea40d"
        val `core-js` = "org.scalablytyped" % "core-js_sjs1_3" % "2.5-dt-20211202Z-7b7e5d"
        val csstype = "org.scalablytyped" % "csstype_sjs1_3" % "3.1.1-b003b4"
      }
      object D {
        val d3 = "org.scalablytyped" % "d3_sjs1_3" % "7.4-dt-20221103Z-2e1cbe"
        val `d3-array` = "org.scalablytyped" % "d3-array_sjs1_3" % "3.0-dt-20220624Z-3f90a9"
        val `d3-axis` = "org.scalablytyped" % "d3-axis_sjs1_3" % "3.0-dt-20220624Z-765f1a"
        val `d3-brush` = "org.scalablytyped" % "d3-brush_sjs1_3" % "3.0-dt-20211202Z-8a7fef"
        val `d3-chord` = "org.scalablytyped" % "d3-chord_sjs1_3" % "3.0-dt-20211202Z-c7c917"
        val `d3-collection` = "org.scalablytyped" % "d3-collection_sjs1_3" % "1.0-dt-20211202Z-1b24ce"
        val `d3-color` = "org.scalablytyped" % "d3-color_sjs1_3" % "3.1-dt-20220522Z-019836"
        val `d3-contour` = "org.scalablytyped" % "d3-contour_sjs1_3" % "3.0-dt-20211202Z-88b95b"
        val `d3-delaunay` = "org.scalablytyped" % "d3-delaunay_sjs1_3" % "6.0-dt-20220524Z-f821e5"
        val `d3-dispatch` = "org.scalablytyped" % "d3-dispatch_sjs1_3" % "3.0-dt-20220624Z-dc755d"
        val `d3-drag` = "org.scalablytyped" % "d3-drag_sjs1_3" % "3.0-dt-20211202Z-875747"
        val `d3-dsv` = "org.scalablytyped" % "d3-dsv_sjs1_3" % "3.0-dt-20220819Z-00ac87"
        val `d3-ease` = "org.scalablytyped" % "d3-ease_sjs1_3" % "3.0-dt-20211223Z-91cb14"
        val `d3-fetch` = "org.scalablytyped" % "d3-fetch_sjs1_3" % "3.0-dt-20220624Z-0b7b5b"
        val `d3-force` = "org.scalablytyped" % "d3-force_sjs1_3" % "3.0-dt-20211202Z-ff421c"
        val `d3-format` = "org.scalablytyped" % "d3-format_sjs1_3" % "3.0-dt-20211202Z-95f6f8"
        val `d3-geo` = "org.scalablytyped" % "d3-geo_sjs1_3" % "3.0-dt-20211202Z-6e088b"
        val `d3-hierarchy` = "org.scalablytyped" % "d3-hierarchy_sjs1_3" % "3.1-dt-20220624Z-a9a757"
        val `d3-interpolate` = "org.scalablytyped" % "d3-interpolate_sjs1_3" % "3.0-dt-20220624Z-5df0c9"
        val `d3-path` = "org.scalablytyped" % "d3-path_sjs1_3" % "3.0-dt-20220310Z-1ae5b5"
        val `d3-polygon` = "org.scalablytyped" % "d3-polygon_sjs1_3" % "3.0-dt-20211202Z-5fd802"
        val `d3-quadtree` = "org.scalablytyped" % "d3-quadtree_sjs1_3" % "3.0-dt-20220624Z-7f1830"
        val `d3-random` = "org.scalablytyped" % "d3-random_sjs1_3" % "3.0-dt-20211202Z-f3bdb1"
        val `d3-scale` = "org.scalablytyped" % "d3-scale_sjs1_3" % "4.0-dt-20220624Z-3ab382"
        val `d3-scale-chromatic` = "org.scalablytyped" % "d3-scale-chromatic_sjs1_3" % "3.0-dt-20211202Z-e798ea"
        val `d3-selection` = "org.scalablytyped" % "d3-selection_sjs1_3" % "3.0-dt-20220720Z-6af12c"
        val `d3-shape` = "org.scalablytyped" % "d3-shape_sjs1_3" % "3.1-dt-20220624Z-7a209a"
        val `d3-time` = "org.scalablytyped" % "d3-time_sjs1_3" % "3.0-dt-20211202Z-4ef5bf"
        val `d3-time-format` = "org.scalablytyped" % "d3-time-format_sjs1_3" % "4.0-dt-20211202Z-87c6dc"
        val `d3-timer` = "org.scalablytyped" % "d3-timer_sjs1_3" % "3.0-dt-20211202Z-417973"
        val `d3-transition` = "org.scalablytyped" % "d3-transition_sjs1_3" % "3.0-dt-20220817Z-96daa9"
        val `d3-voronoi` = "org.scalablytyped" % "d3-voronoi_sjs1_3" % "1.1-dt-20220624Z-118984"
        val `d3-zoom` = "org.scalablytyped" % "d3-zoom_sjs1_3" % "3.0-dt-20220624Z-d59bf2"
        val dayjs = "org.scalablytyped" % "dayjs_sjs1_3" % "1.11.6-e1cc84"
        val `dependency-graph` = "org.scalablytyped" % "dependency-graph_sjs1_3" % "0.11.0-409ead"
      }
      object E {
        val electron = "org.scalablytyped" % "electron_sjs1_3" % "21.3.0-2111f5"
        val enzyme = "org.scalablytyped" % "enzyme_sjs1_3" % "3.10-dt-20220818Z-477cf5"
        val exenv = "org.scalablytyped" % "exenv_sjs1_3" % "1.2-dt-20211202Z-7a928a"
        val expo = "org.scalablytyped" % "expo_sjs1_3" % "47.0.6-541906"
        val `expo-asset` = "org.scalablytyped" % "expo-asset_sjs1_3" % "8.6.2-690e21"
        val `expo-constants` = "org.scalablytyped" % "expo-constants_sjs1_3" % "14.0.2-a6f76b"
        val `expo-file-system` = "org.scalablytyped" % "expo-file-system_sjs1_3" % "15.1.1-087b09"
        val `expo-font` = "org.scalablytyped" % "expo-font_sjs1_3" % "11.0.1-d65f63"
        val `expo-keep-awake` = "org.scalablytyped" % "expo-keep-awake_sjs1_3" % "11.0.1-ab8eab"
        val `expo-linear-gradient` = "org.scalablytyped" % "expo-linear-gradient_sjs1_3" % "12.0.1-c0c7be"
        val `expo-location` = "org.scalablytyped" % "expo-location_sjs1_3" % "15.0.1-259560"
        val `expo-modules-core` = "org.scalablytyped" % "expo-modules-core_sjs1_3" % "1.0.3-5e81aa"
        val `expo-permissions` = "org.scalablytyped" % "expo-permissions_sjs1_3" % "14.0.0-2ceffe"
        val `expo-sqlite` = "org.scalablytyped" % "expo-sqlite_sjs1_3" % "11.0.0-9af2d5"
        val `expo-web-browser` = "org.scalablytyped" % "expo-web-browser_sjs1_3" % "12.0.0-4c3447"
        val `expo__config-types` = "org.scalablytyped" % "expo__config-types_sjs1_3" % "47.0.0-648b9c"
        val `expo__vector-icons` = "org.scalablytyped" % "expo__vector-icons_sjs1_3" % "13.0.0-629ffa"
        val express = "org.scalablytyped" % "express_sjs1_3" % "4.17-dt-20220913Z-95b486"
        val `express-serve-static-core` = "org.scalablytyped" % "express-serve-static-core_sjs1_3" % "0.1.1-a1e441"
        val `extract-zip` = "org.scalablytyped" % "extract-zip_sjs1_3" % "2.0.1-d569db"
      }
      object F {
        val fbemitter = "org.scalablytyped" % "fbemitter_sjs1_3" % "2.0.0-dt-20220818Z-b51139"
        val `fluentui__react-component-ref` = "org.scalablytyped" % "fluentui__react-component-ref_sjs1_3" % "0.64.0-c73778"
        val `fortawesome__fontawesome-common-types` = "org.scalablytyped" % "fortawesome__fontawesome-common-types_sjs1_3" % "6.2.1-5b0560"
        val `fortawesome__fontawesome-svg-core` = "org.scalablytyped" % "fortawesome__fontawesome-svg-core_sjs1_3" % "6.2.1-eedadc"
        val `fortawesome__free-solid-svg-icons` = "org.scalablytyped" % "fortawesome__free-solid-svg-icons_sjs1_3" % "6.2.1-33e0b4"
        val `fortawesome__react-fontawesome` = "org.scalablytyped" % "fortawesome__react-fontawesome_sjs1_3" % "0.2.0-9335af"
      }
      object G {
        val geojson = "org.scalablytyped" % "geojson_sjs1_3" % "7946.0-dt-20220713Z-a8b923"
        val google_dot_maps = "org.scalablytyped" % "google_dot_maps_sjs1_3" % "3.50-dt-20221101Z-237956"
      }
      object H {
        val hammerjs = "org.scalablytyped" % "hammerjs_sjs1_3" % "2.0.8-dt-20220819Z-0a1be8"
        val highlight_dot_js = "org.scalablytyped" % "highlight_dot_js_sjs1_3" % "11.6.0-748769"
        val `hoist-non-react-statics` = "org.scalablytyped" % "hoist-non-react-statics_sjs1_3" % "3.3-dt-20220624Z-884932"
      }
      object I {
        val `is-buffer` = "org.scalablytyped" % "is-buffer_sjs1_3" % "2.0.5-536d4b"
      }
      object J {
        val jquery = "org.scalablytyped" % "jquery_sjs1_3" % "3.5-dt-20221103Z-d46671"
        val jqueryui = "org.scalablytyped" % "jqueryui_sjs1_3" % "1.12-dt-20211202Z-ee467d"
        val `jsonc-parser` = "org.scalablytyped" % "jsonc-parser_sjs1_3" % "3.2.0-d83cfc"
        val jss = "org.scalablytyped" % "jss_sjs1_3" % "10.9.2-45913c"
      }
      object L {
        val leaflet = "org.scalablytyped" % "leaflet_sjs1_3" % "1.9-dt-20221015Z-05dabc"
      }
      object M {
        val `magic-string` = "org.scalablytyped" % "magic-string_sjs1_3" % "0.26.7-8b6df4"
        val `material-ui` = "org.scalablytyped" % "material-ui_sjs1_3" % "0.21-dt-20220324Z-77c54c"
        val `material-ui__core` = "org.scalablytyped" % "material-ui__core_sjs1_3" % "4.12.4-62b3bc"
        val `material-ui__icons` = "org.scalablytyped" % "material-ui__icons_sjs1_3" % "4.11.3-6a2742"
        val `material-ui__styles` = "org.scalablytyped" % "material-ui__styles_sjs1_3" % "4.11.5-6c907f"
        val `material-ui__system` = "org.scalablytyped" % "material-ui__system_sjs1_3" % "4.12.2-feaf15"
        val `material-ui__types` = "org.scalablytyped" % "material-ui__types_sjs1_3" % "5.1.0-5f50f4"
        val mime = "org.scalablytyped" % "mime_sjs1_3" % "3.0-dt-20220804Z-32fa9f"
        val mobx = "org.scalablytyped" % "mobx_sjs1_3" % "6.7.0-e5bc7e"
        val `mobx-react` = "org.scalablytyped" % "mobx-react_sjs1_3" % "7.6.0-7cd1f5"
        val moment = "org.scalablytyped" % "moment_sjs1_3" % "2.29.4-d9a78e"
      }
      object N {
        val node = "org.scalablytyped" % "node_sjs1_3" % "18.11-dt-20221101Z-99df59"
      }
      object O {
        val onsenui = "org.scalablytyped" % "onsenui_sjs1_3" % "2.12.6-5c4f67"
      }
      object P {
        val p5 = "org.scalablytyped" % "p5_sjs1_3" % "1.4-dt-20220915Z-0af227"
        val popper_dot_js = "org.scalablytyped" % "popper_dot_js_sjs1_3" % "1.16.1-118e00"
        val `prop-types` = "org.scalablytyped" % "prop-types_sjs1_3" % "15.7-dt-20220407Z-ddcd58"
      }
      object Q {
        val qs = "org.scalablytyped" % "qs_sjs1_3" % "6.9-dt-20220913Z-b6fd95"
      }
      object R {
        val `range-parser` = "org.scalablytyped" % "range-parser_sjs1_3" % "1.2-dt-20211202Z-0a3bf8"
        val `rc-cascader` = "org.scalablytyped" % "rc-cascader_sjs1_3" % "3.7.0-9f6f89"
        val `rc-component__portal` = "org.scalablytyped" % "rc-component__portal_sjs1_3" % "1.0.3-e6b72c"
        val `rc-dialog` = "org.scalablytyped" % "rc-dialog_sjs1_3" % "9.0.2-18f26c"
        val `rc-drawer` = "org.scalablytyped" % "rc-drawer_sjs1_3" % "6.0.1-9feed5"
        val `rc-field-form` = "org.scalablytyped" % "rc-field-form_sjs1_3" % "1.27.3-496dfe"
        val `rc-image` = "org.scalablytyped" % "rc-image_sjs1_3" % "5.12.0-6237c4"
        val `rc-input` = "org.scalablytyped" % "rc-input_sjs1_3" % "0.1.4-f87565"
        val `rc-input-number` = "org.scalablytyped" % "rc-input-number_sjs1_3" % "7.3.11-7d752e"
        val `rc-mentions` = "org.scalablytyped" % "rc-mentions_sjs1_3" % "1.11.0-d3a147"
        val `rc-menu` = "org.scalablytyped" % "rc-menu_sjs1_3" % "9.7.2-41af1b"
        val `rc-motion` = "org.scalablytyped" % "rc-motion_sjs1_3" % "2.6.2-62a362"
        val `rc-notification` = "org.scalablytyped" % "rc-notification_sjs1_3" % "4.6.1-742985"
        val `rc-pagination` = "org.scalablytyped" % "rc-pagination_sjs1_3" % "3.2.0-7517ec"
        val `rc-picker` = "org.scalablytyped" % "rc-picker_sjs1_3" % "2.7.0-166bb9"
        val `rc-rate` = "org.scalablytyped" % "rc-rate_sjs1_3" % "2.9.2-7c8c31"
        val `rc-segmented` = "org.scalablytyped" % "rc-segmented_sjs1_3" % "2.1.0-1b35be"
        val `rc-select` = "org.scalablytyped" % "rc-select_sjs1_3" % "14.1.13-8ab852"
        val `rc-slider` = "org.scalablytyped" % "rc-slider_sjs1_3" % "10.1.0-9f4594"
        val `rc-steps` = "org.scalablytyped" % "rc-steps_sjs1_3" % "6.0.0-alpha.2-2a601f"
        val `rc-table` = "org.scalablytyped" % "rc-table_sjs1_3" % "7.28.1-2f8b75"
        val `rc-tabs` = "org.scalablytyped" % "rc-tabs_sjs1_3" % "12.3.0-ade279"
        val `rc-textarea` = "org.scalablytyped" % "rc-textarea_sjs1_3" % "0.4.6-b0c8dc"
        val `rc-tooltip` = "org.scalablytyped" % "rc-tooltip_sjs1_3" % "5.2.2-508ee2"
        val `rc-tree` = "org.scalablytyped" % "rc-tree_sjs1_3" % "5.7.0-c4f261"
        val `rc-tree-select` = "org.scalablytyped" % "rc-tree-select_sjs1_3" % "5.5.4-08f59c"
        val `rc-trigger` = "org.scalablytyped" % "rc-trigger_sjs1_3" % "5.3.3-ca62dd"
        val `rc-upload` = "org.scalablytyped" % "rc-upload_sjs1_3" % "4.3.4-e286fc"
        val `rc-util` = "org.scalablytyped" % "rc-util_sjs1_3" % "5.24.4-75b71b"
        val `rc-virtual-list` = "org.scalablytyped" % "rc-virtual-list_sjs1_3" % "3.4.8-831180"
        val re2 = "org.scalablytyped" % "re2_sjs1_3" % "1.17.7-090208"
        val react = "org.scalablytyped" % "react_sjs1_3" % "18.0-dt-20221104Z-0ec907"
        val `react-addons-linked-state-mixin` = "org.scalablytyped" % "react-addons-linked-state-mixin_sjs1_3" % "0.14-dt-20220818Z-bac10b"
        val `react-big-calendar` = "org.scalablytyped" % "react-big-calendar_sjs1_3" % "0.38-dt-20221003Z-f732c3"
        val `react-dom` = "org.scalablytyped" % "react-dom_sjs1_3" % "18.0-dt-20221114Z-fdab72"
        val `react-is` = "org.scalablytyped" % "react-is_sjs1_3" % "17.0-dt-20211202Z-446043"
        val `react-lifecycles-compat` = "org.scalablytyped" % "react-lifecycles-compat_sjs1_3" % "3.0-dt-20211202Z-fe6fd5"
        val `react-native` = "org.scalablytyped" % "react-native_sjs1_3" % "0.70-dt-20221018Z-3ee483"
        val `react-native-community__masked-view` = "org.scalablytyped" % "react-native-community__masked-view_sjs1_3" % "0.1.11-4771c8"
        val `react-native-gesture-handler` = "org.scalablytyped" % "react-native-gesture-handler_sjs1_3" % "2.8.0-d52920"
        val `react-native-safe-area-context` = "org.scalablytyped" % "react-native-safe-area-context_sjs1_3" % "4.3.4-a28edd"
        val `react-native-vector-icons` = "org.scalablytyped" % "react-native-vector-icons_sjs1_3" % "6.4-dt-20220830Z-68addc"
        val `react-navigation` = "org.scalablytyped" % "react-navigation_sjs1_3" % "4.4.4-55678b"
        val `react-navigation-drawer` = "org.scalablytyped" % "react-navigation-drawer_sjs1_3" % "2.7.2-dd1c28"
        val `react-navigation-stack` = "org.scalablytyped" % "react-navigation-stack_sjs1_3" % "2.10.4-9c7b3b"
        val `react-primitives` = "org.scalablytyped" % "react-primitives_sjs1_3" % "0.6-dt-20211202Z-4404b3"
        val `react-redux` = "org.scalablytyped" % "react-redux_sjs1_3" % "8.0.2-b8bcc6"
        val `react-router` = "org.scalablytyped" % "react-router_sjs1_3" % "6.4.3-9cfe8f"
        val `react-router-dom` = "org.scalablytyped" % "react-router-dom_sjs1_3" % "6.4.3-ea68ac"
        val `react-router-native` = "org.scalablytyped" % "react-router-native_sjs1_3" % "5.1-dt-20220118Z-71f499"
        val `react-slick` = "org.scalablytyped" % "react-slick_sjs1_3" % "0.23-dt-20220630Z-8b3cfc"
        val `react-test-renderer` = "org.scalablytyped" % "react-test-renderer_sjs1_3" % "18.0-dt-20220805Z-e9ba8f"
        val redux = "org.scalablytyped" % "redux_sjs1_3" % "4.2.0-1be68f"
        val `redux-devtools-extension` = "org.scalablytyped" % "redux-devtools-extension_sjs1_3" % "2.13.9-2aaffe"
        val `remix-run__router` = "org.scalablytyped" % "remix-run__router_sjs1_3" % "1.0.3-77c22e"
        val reveal_dot_js = "org.scalablytyped" % "reveal_dot_js_sjs1_3" % "4.3-dt-20221103Z-63d521"
        val rxjs = "org.scalablytyped" % "rxjs_sjs1_3" % "7.5.7-c0f8c3"
      }
      object S {
        val scheduler = "org.scalablytyped" % "scheduler_sjs1_3" % "0.16-dt-20211202Z-864a4c"
        val `scroll-into-view-if-needed` = "org.scalablytyped" % "scroll-into-view-if-needed_sjs1_3" % "2.2.29-f420a3"
        val `semantic-ui-react` = "org.scalablytyped" % "semantic-ui-react_sjs1_3" % "2.1.3-5bf7ad"
        val `semantic-ui-react__event-stack` = "org.scalablytyped" % "semantic-ui-react__event-stack_sjs1_3" % "3.1.3-f97251"
        val semver = "org.scalablytyped" % "semver_sjs1_3" % "7.3-dt-20221026Z-3e7390"
        val `serve-static` = "org.scalablytyped" % "serve-static_sjs1_3" % "1.15-dt-20220729Z-4b57f5"
        val shallowequal = "org.scalablytyped" % "shallowequal_sjs1_3" % "1.1-dt-20211202Z-33d3f1"
        val sizzle = "org.scalablytyped" % "sizzle_sjs1_3" % "2.3-dt-20211202Z-b609aa"
        val `source-map` = "org.scalablytyped" % "source-map_sjs1_3" % "0.7.4-c38b99"
        val std = "org.scalablytyped" % "std_sjs1_3" % "4.9-448261"
        val `styled-components` = "org.scalablytyped" % "styled-components_sjs1_3" % "5.3.6-cd3b4e"
        val stylis = "org.scalablytyped" % "stylis_sjs1_3" % "4.0-dt-20211202Z-298da6"
        val `symbol-observable` = "org.scalablytyped" % "symbol-observable_sjs1_3" % "4.0.0-4a980c"
      }
      object T {
        val three = "org.scalablytyped" % "three_sjs1_3" % "0.146-dt-20221106Z-b6575f"
        val tslib = "org.scalablytyped" % "tslib_sjs1_3" % "2.4.1-e16f4c"
        val typescript = "org.scalablytyped" % "typescript_sjs1_3" % "4.9.3-47e610"
      }
      object U {
        val `uri-js` = "org.scalablytyped" % "uri-js_sjs1_3" % "4.4.1-b9117c"
      }
      object V {
        val vue = "org.scalablytyped" % "vue_sjs1_3" % "3.2.45-823204"
        val `vue__compiler-core` = "org.scalablytyped" % "vue__compiler-core_sjs1_3" % "3.2.45-97d93b"
        val vue__reactivity = "org.scalablytyped" % "vue__reactivity_sjs1_3" % "3.2.45-7b628e"
        val `vue__runtime-core` = "org.scalablytyped" % "vue__runtime-core_sjs1_3" % "3.2.45-1fd4fb"
        val `vue__runtime-dom` = "org.scalablytyped" % "vue__runtime-dom_sjs1_3" % "3.2.45-cad865"
        val vue__shared = "org.scalablytyped" % "vue__shared_sjs1_3" % "3.2.45-c6abd0"
      }
      object W {
        val `webpack-env` = "org.scalablytyped" % "webpack-env_sjs1_3" % "1.18-dt-20220816Z-91f13f"
        val webxr = "org.scalablytyped" % "webxr_sjs1_3" % "0.5-dt-20220721Z-1f34f5"
      }
      object Y {
        val `yandex-maps` = "org.scalablytyped" % "yandex-maps_sjs1_3" % "2.1-dt-20221108Z-eebacb"
        val yauzl = "org.scalablytyped" % "yauzl_sjs1_3" % "2.10-dt-20220411Z-9b54f1"
      }
      object Z {
        val zone_dot_js = "org.scalablytyped" % "zone_dot_js_sjs1_3" % "0.12.0-f4307b"
      }
    }
  }
}