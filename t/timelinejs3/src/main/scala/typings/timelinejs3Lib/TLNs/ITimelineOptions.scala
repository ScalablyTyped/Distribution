package typings
package timelinejs3Lib.TLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITimelineOptions extends js.Object {
  /*
           * Default: 'tl-timeline
           * Removing the tl-timeline base class will disable all default stylesheets.
           */
  var base_class: js.UndefOr[java.lang.String] = js.undefined
  /*
           * Default: false
           * If true, copious console logging will be enabled.
           */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /*
           * Default: white
           * RGB values to use for slide backgrounds. Specify as hex code, CSS named color, or a Javascript object with r, g, and b properties from 0-255.
           */
  var default_bg_color: js.UndefOr[java.lang.String] = js.undefined
  /*
           * Default: true
           */
  var dragging: js.UndefOr[scala.Boolean] = js.undefined
  /*
           * Default: 1000
           * Animation duration (in milliseconds).
           */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /*
           * Default: TL.Ease.easeInOutQuint
           */
  var ease: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /*
           * Default: null
           * Google Analytics ID.
           */
  var ga_property_id: js.UndefOr[js.Any] = js.undefined
  /*
           * Default: false
           * If set to true, TimelineJS will update the browser URL each time a slide advances, so that people can link directly to specific slides.
           */
  var hash_bookmark: js.UndefOr[scala.Boolean] = js.undefined
  /*
           * Default: this._el.container.offsetHeight
           * The height of the timeline.
           */
  var height: js.UndefOr[scala.Double] = js.undefined
  /*
           * The position in the zoom_sequence series used to scale the Timeline when it is first created. Takes precedence over scale_factor.
           */
  var initial_zoom: js.UndefOr[scala.Double] = js.undefined
  /*
           * Default: false
           * If true, the class tl-timeline-embed is added to the outer Timeline container. Typically only used to support Timeline iframe embeds.
           */
  var is_embed: js.UndefOr[scala.Boolean] = js.undefined
  /*
           * Default: 'en'
           */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /*
           * Default: 30
           * The minimum marker height (in pixels).
           */
  var marker_height_min: js.UndefOr[scala.Double] = js.undefined
  /*
           * Default: 5
           * Top and bottom padding (in pixels) for markers.
           */
  var marker_padding: js.UndefOr[scala.Double] = js.undefined
  /*
           * Default: 100
           * The minimum marker witdh (in pixels).
           */
  var marker_width_min: js.UndefOr[scala.Double] = js.undefined
  /*
           * Default: 0
           */
  var menubar_height: js.UndefOr[scala.Double] = js.undefined
  /*
           * Default: 100
           * optimal distance (in pixels) between ticks on axis
           */
  var optimal_tick_width: js.UndefOr[scala.Double] = js.undefined
  /*
           * Default: 2
           * How many screen widths wide the timeline should be at first presentation.
           */
  var scale_factor: js.UndefOr[scala.Double] = js.undefined
  /*
           * Default: ''
           * Can be used to help Timeline load related resources such as CSS themes and language files. Rarely needs to be set.
           */
  var script_path: js.UndefOr[java.lang.String] = js.undefined
  /*
           * Default: '0%'
           */
  var slide_default_fade: js.UndefOr[java.lang.String] = js.undefined
  /*
           * Default: 100
           * Padding (in pixels) on the left and right of each slide.
           */
  var slide_padding_lr: js.UndefOr[scala.Double] = js.undefined
  /*
           * Default: false
           * If true, loads timeline on last slide.
           */
  var start_at_end: js.UndefOr[scala.Boolean] = js.undefined
  /*
           * Default: 0
           * The first slide to display when the timeline is loaded.
           */
  var start_at_slide: js.UndefOr[scala.Double] = js.undefined
  /*
           * Default: 150
           * The height in pixels of the timeline nav. Takes precedence over timenav_height_percentage.
           */
  var timenav_height: js.UndefOr[scala.Double] = js.undefined
  /*
           * Default: 150
           * The minimum timeline nav height (in pixels).
           */
  var timenav_height_min: js.UndefOr[scala.Double] = js.undefined
  /*
           * Default: 25
           * Specify the timeline nav height as a percentage of the screen instead of in pixels.
           */
  var timenav_height_percentage: js.UndefOr[scala.Double] = js.undefined
  /*
           * Default: 40
           * Specify the timeline nav height as a percentage of a mobile device screen.
           */
  var timenav_mobile_height_percentage: js.UndefOr[scala.Double] = js.undefined
  /*
           * Default: 'bottom'
           * Display the timeline nav on the top or bottom.
           */
  var timenav_position: js.UndefOr[
    timelinejs3Lib.timelinejs3LibStrings.bottom | timelinejs3Lib.timelinejs3LibStrings.top
  ] = js.undefined
  /*
           * Default: true
           */
  var trackResize: js.UndefOr[scala.Boolean] = js.undefined
  /*
           * Default: ['back_to_start','nav_next','nav_previous','zoom_in','zoom_out']
           */
  var track_events: js.UndefOr[
    js.Array[
      timelinejs3Lib.timelinejs3LibStrings.back_to_start | timelinejs3Lib.timelinejs3LibStrings.nav_next | timelinejs3Lib.timelinejs3LibStrings.nav_previous | timelinejs3Lib.timelinejs3LibStrings.zoom_in | timelinejs3Lib.timelinejs3LibStrings.zoom_out
    ]
  ] = js.undefined
  /*
           * Default: false
           * Use declared suffix on dates earlier than 0.
           */
  var use_bc: js.UndefOr[scala.Boolean] = js.undefined
  /*
           * Default: this._el.container.offsetWidth
           * The width of the timeline.
           */
  var width: js.UndefOr[scala.Double] = js.undefined
  /*
           * Default: [0.5, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]
           * Array of values for TimeNav zoom levels. Each value is a scale_factor, which means that at any given level, the full timeline would require that many screens to display all events.
           */
  var zoom_sequence: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

