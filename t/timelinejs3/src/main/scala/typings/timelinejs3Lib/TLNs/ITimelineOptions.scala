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

object ITimelineOptions {
  @scala.inline
  def apply(
    base_class: java.lang.String = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    default_bg_color: java.lang.String = null,
    dragging: js.UndefOr[scala.Boolean] = js.undefined,
    duration: scala.Int | scala.Double = null,
    ease: () => scala.Double = null,
    ga_property_id: js.Any = null,
    hash_bookmark: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    initial_zoom: scala.Int | scala.Double = null,
    is_embed: js.UndefOr[scala.Boolean] = js.undefined,
    language: java.lang.String = null,
    marker_height_min: scala.Int | scala.Double = null,
    marker_padding: scala.Int | scala.Double = null,
    marker_width_min: scala.Int | scala.Double = null,
    menubar_height: scala.Int | scala.Double = null,
    optimal_tick_width: scala.Int | scala.Double = null,
    scale_factor: scala.Int | scala.Double = null,
    script_path: java.lang.String = null,
    slide_default_fade: java.lang.String = null,
    slide_padding_lr: scala.Int | scala.Double = null,
    start_at_end: js.UndefOr[scala.Boolean] = js.undefined,
    start_at_slide: scala.Int | scala.Double = null,
    timenav_height: scala.Int | scala.Double = null,
    timenav_height_min: scala.Int | scala.Double = null,
    timenav_height_percentage: scala.Int | scala.Double = null,
    timenav_mobile_height_percentage: scala.Int | scala.Double = null,
    timenav_position: timelinejs3Lib.timelinejs3LibStrings.bottom | timelinejs3Lib.timelinejs3LibStrings.top = null,
    trackResize: js.UndefOr[scala.Boolean] = js.undefined,
    track_events: js.Array[
      timelinejs3Lib.timelinejs3LibStrings.back_to_start | timelinejs3Lib.timelinejs3LibStrings.nav_next | timelinejs3Lib.timelinejs3LibStrings.nav_previous | timelinejs3Lib.timelinejs3LibStrings.zoom_in | timelinejs3Lib.timelinejs3LibStrings.zoom_out
    ] = null,
    use_bc: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null,
    zoom_sequence: js.Array[scala.Double] = null
  ): ITimelineOptions = {
    val __obj = js.Dynamic.literal()
    if (base_class != null) __obj.updateDynamic("base_class")(base_class)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (default_bg_color != null) __obj.updateDynamic("default_bg_color")(default_bg_color)
    if (!js.isUndefined(dragging)) __obj.updateDynamic("dragging")(dragging)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(js.Any.fromFunction0(ease))
    if (ga_property_id != null) __obj.updateDynamic("ga_property_id")(ga_property_id)
    if (!js.isUndefined(hash_bookmark)) __obj.updateDynamic("hash_bookmark")(hash_bookmark)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (initial_zoom != null) __obj.updateDynamic("initial_zoom")(initial_zoom.asInstanceOf[js.Any])
    if (!js.isUndefined(is_embed)) __obj.updateDynamic("is_embed")(is_embed)
    if (language != null) __obj.updateDynamic("language")(language)
    if (marker_height_min != null) __obj.updateDynamic("marker_height_min")(marker_height_min.asInstanceOf[js.Any])
    if (marker_padding != null) __obj.updateDynamic("marker_padding")(marker_padding.asInstanceOf[js.Any])
    if (marker_width_min != null) __obj.updateDynamic("marker_width_min")(marker_width_min.asInstanceOf[js.Any])
    if (menubar_height != null) __obj.updateDynamic("menubar_height")(menubar_height.asInstanceOf[js.Any])
    if (optimal_tick_width != null) __obj.updateDynamic("optimal_tick_width")(optimal_tick_width.asInstanceOf[js.Any])
    if (scale_factor != null) __obj.updateDynamic("scale_factor")(scale_factor.asInstanceOf[js.Any])
    if (script_path != null) __obj.updateDynamic("script_path")(script_path)
    if (slide_default_fade != null) __obj.updateDynamic("slide_default_fade")(slide_default_fade)
    if (slide_padding_lr != null) __obj.updateDynamic("slide_padding_lr")(slide_padding_lr.asInstanceOf[js.Any])
    if (!js.isUndefined(start_at_end)) __obj.updateDynamic("start_at_end")(start_at_end)
    if (start_at_slide != null) __obj.updateDynamic("start_at_slide")(start_at_slide.asInstanceOf[js.Any])
    if (timenav_height != null) __obj.updateDynamic("timenav_height")(timenav_height.asInstanceOf[js.Any])
    if (timenav_height_min != null) __obj.updateDynamic("timenav_height_min")(timenav_height_min.asInstanceOf[js.Any])
    if (timenav_height_percentage != null) __obj.updateDynamic("timenav_height_percentage")(timenav_height_percentage.asInstanceOf[js.Any])
    if (timenav_mobile_height_percentage != null) __obj.updateDynamic("timenav_mobile_height_percentage")(timenav_mobile_height_percentage.asInstanceOf[js.Any])
    if (timenav_position != null) __obj.updateDynamic("timenav_position")(timenav_position.asInstanceOf[js.Any])
    if (!js.isUndefined(trackResize)) __obj.updateDynamic("trackResize")(trackResize)
    if (track_events != null) __obj.updateDynamic("track_events")(track_events)
    if (!js.isUndefined(use_bc)) __obj.updateDynamic("use_bc")(use_bc)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoom_sequence != null) __obj.updateDynamic("zoom_sequence")(zoom_sequence)
    __obj.asInstanceOf[ITimelineOptions]
  }
}

