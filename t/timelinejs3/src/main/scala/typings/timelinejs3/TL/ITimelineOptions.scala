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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITimelineOptions extends js.Object {
  
  /*
    * Default: 'tl-timeline
    * Removing the tl-timeline base class will disable all default stylesheets.
    */
  var base_class: js.UndefOr[String] = js.native
  
  /*
    * Default: false
    * If true, copious console logging will be enabled.
    */
  var debug: js.UndefOr[Boolean] = js.native
  
  /*
    * Default: white
    * RGB values to use for slide backgrounds. Specify as hex code, CSS named color, or a Javascript object with r, g, and b properties from 0-255.
    */
  var default_bg_color: js.UndefOr[String] = js.native
  
  /*
    * Default: true
    */
  var dragging: js.UndefOr[Boolean] = js.native
  
  /*
    * Default: 1000
    * Animation duration (in milliseconds).
    */
  var duration: js.UndefOr[Double] = js.native
  
  /*
    * Default: TL.Ease.easeInOutQuint
    */
  var ease: js.UndefOr[js.Function0[Double]] = js.native
  
  /*
    * Default: null
    * Google Analytics ID.
    */
  var ga_property_id: js.UndefOr[js.Any] = js.native
  
  /*
    * Default: false
    * If set to true, TimelineJS will update the browser URL each time a slide advances, so that people can link directly to specific slides.
    */
  var hash_bookmark: js.UndefOr[Boolean] = js.native
  
  /*
    * Default: this._el.container.offsetHeight
    * The height of the timeline.
    */
  var height: js.UndefOr[Double] = js.native
  
  /*
    * The position in the zoom_sequence series used to scale the Timeline when it is first created. Takes precedence over scale_factor.
    */
  var initial_zoom: js.UndefOr[Double] = js.native
  
  /*
    * Default: false
    * If true, the class tl-timeline-embed is added to the outer Timeline container. Typically only used to support Timeline iframe embeds.
    */
  var is_embed: js.UndefOr[Boolean] = js.native
  
  /*
    * Default: 'en'
    */
  var language: js.UndefOr[String] = js.native
  
  /*
    * Default: 30
    * The minimum marker height (in pixels).
    */
  var marker_height_min: js.UndefOr[Double] = js.native
  
  /*
    * Default: 5
    * Top and bottom padding (in pixels) for markers.
    */
  var marker_padding: js.UndefOr[Double] = js.native
  
  /*
    * Default: 100
    * The minimum marker witdh (in pixels).
    */
  var marker_width_min: js.UndefOr[Double] = js.native
  
  /*
    * Default: 0
    */
  var menubar_height: js.UndefOr[Double] = js.native
  
  /*
    * Default: 100
    * optimal distance (in pixels) between ticks on axis
    */
  var optimal_tick_width: js.UndefOr[Double] = js.native
  
  /*
    * Default: 2
    * How many screen widths wide the timeline should be at first presentation.
    */
  var scale_factor: js.UndefOr[Double] = js.native
  
  /*
    * Default: ''
    * Can be used to help Timeline load related resources such as CSS themes and language files. Rarely needs to be set.
    */
  var script_path: js.UndefOr[String] = js.native
  
  /*
    * Default: '0%'
    */
  var slide_default_fade: js.UndefOr[String] = js.native
  
  /*
    * Default: 100
    * Padding (in pixels) on the left and right of each slide.
    */
  var slide_padding_lr: js.UndefOr[Double] = js.native
  
  /*
    * Default: false
    * If true, loads timeline on last slide.
    */
  var start_at_end: js.UndefOr[Boolean] = js.native
  
  /*
    * Default: 0
    * The first slide to display when the timeline is loaded.
    */
  var start_at_slide: js.UndefOr[Double] = js.native
  
  /*
    * Default: 150
    * The height in pixels of the timeline nav. Takes precedence over timenav_height_percentage.
    */
  var timenav_height: js.UndefOr[Double] = js.native
  
  /*
    * Default: 150
    * The minimum timeline nav height (in pixels).
    */
  var timenav_height_min: js.UndefOr[Double] = js.native
  
  /*
    * Default: 25
    * Specify the timeline nav height as a percentage of the screen instead of in pixels.
    */
  var timenav_height_percentage: js.UndefOr[Double] = js.native
  
  /*
    * Default: 40
    * Specify the timeline nav height as a percentage of a mobile device screen.
    */
  var timenav_mobile_height_percentage: js.UndefOr[Double] = js.native
  
  /*
    * Default: 'bottom'
    * Display the timeline nav on the top or bottom.
    */
  var timenav_position: js.UndefOr[bottom | top] = js.native
  
  /*
    * Default: true
    */
  var trackResize: js.UndefOr[Boolean] = js.native
  
  /*
    * Default: ['back_to_start','nav_next','nav_previous','zoom_in','zoom_out']
    */
  var track_events: js.UndefOr[js.Array[back_to_start | nav_next | nav_previous | zoom_in | zoom_out]] = js.native
  
  /*
    * Default: false
    * Use declared suffix on dates earlier than 0.
    */
  var use_bc: js.UndefOr[Boolean] = js.native
  
  /*
    * Default: this._el.container.offsetWidth
    * The width of the timeline.
    */
  var width: js.UndefOr[Double] = js.native
  
  /*
    * Default: [0.5, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]
    * Array of values for TimeNav zoom levels. Each value is a scale_factor, which means that at any given level, the full timeline would require that many screens to display all events.
    */
  var zoom_sequence: js.UndefOr[js.Array[Double]] = js.native
}
object ITimelineOptions {
  
  @scala.inline
  def apply(): ITimelineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimelineOptions]
  }
  
  @scala.inline
  implicit class ITimelineOptionsOps[Self <: ITimelineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBase_class(value: String): Self = this.set("base_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase_class: Self = this.set("base_class", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDefault_bg_color(value: String): Self = this.set("default_bg_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault_bg_color: Self = this.set("default_bg_color", js.undefined)
    
    @scala.inline
    def setDragging(value: Boolean): Self = this.set("dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragging: Self = this.set("dragging", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEase(value: () => Double): Self = this.set("ease", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteEase: Self = this.set("ease", js.undefined)
    
    @scala.inline
    def setGa_property_id(value: js.Any): Self = this.set("ga_property_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGa_property_id: Self = this.set("ga_property_id", js.undefined)
    
    @scala.inline
    def setHash_bookmark(value: Boolean): Self = this.set("hash_bookmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHash_bookmark: Self = this.set("hash_bookmark", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setInitial_zoom(value: Double): Self = this.set("initial_zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitial_zoom: Self = this.set("initial_zoom", js.undefined)
    
    @scala.inline
    def setIs_embed(value: Boolean): Self = this.set("is_embed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_embed: Self = this.set("is_embed", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setMarker_height_min(value: Double): Self = this.set("marker_height_min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker_height_min: Self = this.set("marker_height_min", js.undefined)
    
    @scala.inline
    def setMarker_padding(value: Double): Self = this.set("marker_padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker_padding: Self = this.set("marker_padding", js.undefined)
    
    @scala.inline
    def setMarker_width_min(value: Double): Self = this.set("marker_width_min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker_width_min: Self = this.set("marker_width_min", js.undefined)
    
    @scala.inline
    def setMenubar_height(value: Double): Self = this.set("menubar_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenubar_height: Self = this.set("menubar_height", js.undefined)
    
    @scala.inline
    def setOptimal_tick_width(value: Double): Self = this.set("optimal_tick_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimal_tick_width: Self = this.set("optimal_tick_width", js.undefined)
    
    @scala.inline
    def setScale_factor(value: Double): Self = this.set("scale_factor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale_factor: Self = this.set("scale_factor", js.undefined)
    
    @scala.inline
    def setScript_path(value: String): Self = this.set("script_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScript_path: Self = this.set("script_path", js.undefined)
    
    @scala.inline
    def setSlide_default_fade(value: String): Self = this.set("slide_default_fade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlide_default_fade: Self = this.set("slide_default_fade", js.undefined)
    
    @scala.inline
    def setSlide_padding_lr(value: Double): Self = this.set("slide_padding_lr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlide_padding_lr: Self = this.set("slide_padding_lr", js.undefined)
    
    @scala.inline
    def setStart_at_end(value: Boolean): Self = this.set("start_at_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart_at_end: Self = this.set("start_at_end", js.undefined)
    
    @scala.inline
    def setStart_at_slide(value: Double): Self = this.set("start_at_slide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart_at_slide: Self = this.set("start_at_slide", js.undefined)
    
    @scala.inline
    def setTimenav_height(value: Double): Self = this.set("timenav_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimenav_height: Self = this.set("timenav_height", js.undefined)
    
    @scala.inline
    def setTimenav_height_min(value: Double): Self = this.set("timenav_height_min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimenav_height_min: Self = this.set("timenav_height_min", js.undefined)
    
    @scala.inline
    def setTimenav_height_percentage(value: Double): Self = this.set("timenav_height_percentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimenav_height_percentage: Self = this.set("timenav_height_percentage", js.undefined)
    
    @scala.inline
    def setTimenav_mobile_height_percentage(value: Double): Self = this.set("timenav_mobile_height_percentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimenav_mobile_height_percentage: Self = this.set("timenav_mobile_height_percentage", js.undefined)
    
    @scala.inline
    def setTimenav_position(value: bottom | top): Self = this.set("timenav_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimenav_position: Self = this.set("timenav_position", js.undefined)
    
    @scala.inline
    def setTrackResize(value: Boolean): Self = this.set("trackResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackResize: Self = this.set("trackResize", js.undefined)
    
    @scala.inline
    def setTrack_eventsVarargs(value: (back_to_start | nav_next | nav_previous | zoom_in | zoom_out)*): Self = this.set("track_events", js.Array(value :_*))
    
    @scala.inline
    def setTrack_events(value: js.Array[back_to_start | nav_next | nav_previous | zoom_in | zoom_out]): Self = this.set("track_events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrack_events: Self = this.set("track_events", js.undefined)
    
    @scala.inline
    def setUse_bc(value: Boolean): Self = this.set("use_bc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUse_bc: Self = this.set("use_bc", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setZoom_sequenceVarargs(value: Double*): Self = this.set("zoom_sequence", js.Array(value :_*))
    
    @scala.inline
    def setZoom_sequence(value: js.Array[Double]): Self = this.set("zoom_sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom_sequence: Self = this.set("zoom_sequence", js.undefined)
  }
}
