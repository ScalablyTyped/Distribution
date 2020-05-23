package typings.timelinejs3.TL

import typings.timelinejs3.timelinejs3Strings.back_to_start
import typings.timelinejs3.timelinejs3Strings.bottom
import typings.timelinejs3.timelinejs3Strings.nav_next
import typings.timelinejs3.timelinejs3Strings.nav_previous
import typings.timelinejs3.timelinejs3Strings.top
import typings.timelinejs3.timelinejs3Strings.zoom_in
import typings.timelinejs3.timelinejs3Strings.zoom_out
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimelineOptions extends js.Object {
  /*
    * Default: 'tl-timeline
    * Removing the tl-timeline base class will disable all default stylesheets.
    */
  var base_class: js.UndefOr[String] = js.undefined
  /*
    * Default: false
    * If true, copious console logging will be enabled.
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /*
    * Default: white
    * RGB values to use for slide backgrounds. Specify as hex code, CSS named color, or a Javascript object with r, g, and b properties from 0-255.
    */
  var default_bg_color: js.UndefOr[String] = js.undefined
  /*
    * Default: true
    */
  var dragging: js.UndefOr[Boolean] = js.undefined
  /*
    * Default: 1000
    * Animation duration (in milliseconds).
    */
  var duration: js.UndefOr[Double] = js.undefined
  /*
    * Default: TL.Ease.easeInOutQuint
    */
  var ease: js.UndefOr[js.Function0[Double]] = js.undefined
  /*
    * Default: null
    * Google Analytics ID.
    */
  var ga_property_id: js.UndefOr[js.Any] = js.undefined
  /*
    * Default: false
    * If set to true, TimelineJS will update the browser URL each time a slide advances, so that people can link directly to specific slides.
    */
  var hash_bookmark: js.UndefOr[Boolean] = js.undefined
  /*
    * Default: this._el.container.offsetHeight
    * The height of the timeline.
    */
  var height: js.UndefOr[Double] = js.undefined
  /*
    * The position in the zoom_sequence series used to scale the Timeline when it is first created. Takes precedence over scale_factor.
    */
  var initial_zoom: js.UndefOr[Double] = js.undefined
  /*
    * Default: false
    * If true, the class tl-timeline-embed is added to the outer Timeline container. Typically only used to support Timeline iframe embeds.
    */
  var is_embed: js.UndefOr[Boolean] = js.undefined
  /*
    * Default: 'en'
    */
  var language: js.UndefOr[String] = js.undefined
  /*
    * Default: 30
    * The minimum marker height (in pixels).
    */
  var marker_height_min: js.UndefOr[Double] = js.undefined
  /*
    * Default: 5
    * Top and bottom padding (in pixels) for markers.
    */
  var marker_padding: js.UndefOr[Double] = js.undefined
  /*
    * Default: 100
    * The minimum marker witdh (in pixels).
    */
  var marker_width_min: js.UndefOr[Double] = js.undefined
  /*
    * Default: 0
    */
  var menubar_height: js.UndefOr[Double] = js.undefined
  /*
    * Default: 100
    * optimal distance (in pixels) between ticks on axis
    */
  var optimal_tick_width: js.UndefOr[Double] = js.undefined
  /*
    * Default: 2
    * How many screen widths wide the timeline should be at first presentation.
    */
  var scale_factor: js.UndefOr[Double] = js.undefined
  /*
    * Default: ''
    * Can be used to help Timeline load related resources such as CSS themes and language files. Rarely needs to be set.
    */
  var script_path: js.UndefOr[String] = js.undefined
  /*
    * Default: '0%'
    */
  var slide_default_fade: js.UndefOr[String] = js.undefined
  /*
    * Default: 100
    * Padding (in pixels) on the left and right of each slide.
    */
  var slide_padding_lr: js.UndefOr[Double] = js.undefined
  /*
    * Default: false
    * If true, loads timeline on last slide.
    */
  var start_at_end: js.UndefOr[Boolean] = js.undefined
  /*
    * Default: 0
    * The first slide to display when the timeline is loaded.
    */
  var start_at_slide: js.UndefOr[Double] = js.undefined
  /*
    * Default: 150
    * The height in pixels of the timeline nav. Takes precedence over timenav_height_percentage.
    */
  var timenav_height: js.UndefOr[Double] = js.undefined
  /*
    * Default: 150
    * The minimum timeline nav height (in pixels).
    */
  var timenav_height_min: js.UndefOr[Double] = js.undefined
  /*
    * Default: 25
    * Specify the timeline nav height as a percentage of the screen instead of in pixels.
    */
  var timenav_height_percentage: js.UndefOr[Double] = js.undefined
  /*
    * Default: 40
    * Specify the timeline nav height as a percentage of a mobile device screen.
    */
  var timenav_mobile_height_percentage: js.UndefOr[Double] = js.undefined
  /*
    * Default: 'bottom'
    * Display the timeline nav on the top or bottom.
    */
  var timenav_position: js.UndefOr[bottom | top] = js.undefined
  /*
    * Default: true
    */
  var trackResize: js.UndefOr[Boolean] = js.undefined
  /*
    * Default: ['back_to_start','nav_next','nav_previous','zoom_in','zoom_out']
    */
  var track_events: js.UndefOr[js.Array[back_to_start | nav_next | nav_previous | zoom_in | zoom_out]] = js.undefined
  /*
    * Default: false
    * Use declared suffix on dates earlier than 0.
    */
  var use_bc: js.UndefOr[Boolean] = js.undefined
  /*
    * Default: this._el.container.offsetWidth
    * The width of the timeline.
    */
  var width: js.UndefOr[Double] = js.undefined
  /*
    * Default: [0.5, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]
    * Array of values for TimeNav zoom levels. Each value is a scale_factor, which means that at any given level, the full timeline would require that many screens to display all events.
    */
  var zoom_sequence: js.UndefOr[js.Array[Double]] = js.undefined
}

object ITimelineOptions {
  @scala.inline
  def apply(
    base_class: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    default_bg_color: String = null,
    dragging: js.UndefOr[Boolean] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    ease: () => Double = null,
    ga_property_id: js.Any = null,
    hash_bookmark: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    initial_zoom: js.UndefOr[Double] = js.undefined,
    is_embed: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    marker_height_min: js.UndefOr[Double] = js.undefined,
    marker_padding: js.UndefOr[Double] = js.undefined,
    marker_width_min: js.UndefOr[Double] = js.undefined,
    menubar_height: js.UndefOr[Double] = js.undefined,
    optimal_tick_width: js.UndefOr[Double] = js.undefined,
    scale_factor: js.UndefOr[Double] = js.undefined,
    script_path: String = null,
    slide_default_fade: String = null,
    slide_padding_lr: js.UndefOr[Double] = js.undefined,
    start_at_end: js.UndefOr[Boolean] = js.undefined,
    start_at_slide: js.UndefOr[Double] = js.undefined,
    timenav_height: js.UndefOr[Double] = js.undefined,
    timenav_height_min: js.UndefOr[Double] = js.undefined,
    timenav_height_percentage: js.UndefOr[Double] = js.undefined,
    timenav_mobile_height_percentage: js.UndefOr[Double] = js.undefined,
    timenav_position: bottom | top = null,
    trackResize: js.UndefOr[Boolean] = js.undefined,
    track_events: js.Array[back_to_start | nav_next | nav_previous | zoom_in | zoom_out] = null,
    use_bc: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    zoom_sequence: js.Array[Double] = null
  ): ITimelineOptions = {
    val __obj = js.Dynamic.literal()
    if (base_class != null) __obj.updateDynamic("base_class")(base_class.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (default_bg_color != null) __obj.updateDynamic("default_bg_color")(default_bg_color.asInstanceOf[js.Any])
    if (!js.isUndefined(dragging)) __obj.updateDynamic("dragging")(dragging.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(js.Any.fromFunction0(ease))
    if (ga_property_id != null) __obj.updateDynamic("ga_property_id")(ga_property_id.asInstanceOf[js.Any])
    if (!js.isUndefined(hash_bookmark)) __obj.updateDynamic("hash_bookmark")(hash_bookmark.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initial_zoom)) __obj.updateDynamic("initial_zoom")(initial_zoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(is_embed)) __obj.updateDynamic("is_embed")(is_embed.get.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (!js.isUndefined(marker_height_min)) __obj.updateDynamic("marker_height_min")(marker_height_min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marker_padding)) __obj.updateDynamic("marker_padding")(marker_padding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marker_width_min)) __obj.updateDynamic("marker_width_min")(marker_width_min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(menubar_height)) __obj.updateDynamic("menubar_height")(menubar_height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(optimal_tick_width)) __obj.updateDynamic("optimal_tick_width")(optimal_tick_width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale_factor)) __obj.updateDynamic("scale_factor")(scale_factor.get.asInstanceOf[js.Any])
    if (script_path != null) __obj.updateDynamic("script_path")(script_path.asInstanceOf[js.Any])
    if (slide_default_fade != null) __obj.updateDynamic("slide_default_fade")(slide_default_fade.asInstanceOf[js.Any])
    if (!js.isUndefined(slide_padding_lr)) __obj.updateDynamic("slide_padding_lr")(slide_padding_lr.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start_at_end)) __obj.updateDynamic("start_at_end")(start_at_end.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start_at_slide)) __obj.updateDynamic("start_at_slide")(start_at_slide.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timenav_height)) __obj.updateDynamic("timenav_height")(timenav_height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timenav_height_min)) __obj.updateDynamic("timenav_height_min")(timenav_height_min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timenav_height_percentage)) __obj.updateDynamic("timenav_height_percentage")(timenav_height_percentage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timenav_mobile_height_percentage)) __obj.updateDynamic("timenav_mobile_height_percentage")(timenav_mobile_height_percentage.get.asInstanceOf[js.Any])
    if (timenav_position != null) __obj.updateDynamic("timenav_position")(timenav_position.asInstanceOf[js.Any])
    if (!js.isUndefined(trackResize)) __obj.updateDynamic("trackResize")(trackResize.get.asInstanceOf[js.Any])
    if (track_events != null) __obj.updateDynamic("track_events")(track_events.asInstanceOf[js.Any])
    if (!js.isUndefined(use_bc)) __obj.updateDynamic("use_bc")(use_bc.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (zoom_sequence != null) __obj.updateDynamic("zoom_sequence")(zoom_sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimelineOptions]
  }
}

