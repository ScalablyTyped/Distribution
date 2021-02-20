package typings.timelinejs3

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.timelinejs3.anon.Color
import typings.timelinejs3.timelinejs3Strings.back_to_start
import typings.timelinejs3.timelinejs3Strings.bottom
import typings.timelinejs3.timelinejs3Strings.cosmological
import typings.timelinejs3.timelinejs3Strings.human
import typings.timelinejs3.timelinejs3Strings.nav_next
import typings.timelinejs3.timelinejs3Strings.nav_previous
import typings.timelinejs3.timelinejs3Strings.top
import typings.timelinejs3.timelinejs3Strings.zoom_in
import typings.timelinejs3.timelinejs3Strings.zoom_out
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TL {
  
  @js.native
  trait ITimeline
    extends ITimelineEvents
       with Instantiable2[
          /* containerId */ String, 
          (/* data */ ITimelineConfig) | (/* data */ String), 
          ITimeline
        ]
       with Instantiable3[
          /* containerId */ String, 
          (/* data */ ITimelineConfig) | (/* data */ String), 
          /* options */ ITimelineOptions, 
          ITimeline
        ] {
    
    def _getSlideIndex(id: String): Double = js.native
    def _getSlideIndex(id: Double): Double = js.native
    
    def add(event: ITimelineSlideData): Unit = js.native
    
    var current_id: String = js.native
    
    def getCurrentSlide(): ITimelineSlide = js.native
    
    def getData(n: Double): ITimelineSlideData = js.native
    
    def getDataById(id: String): ITimelineSlideData = js.native
    def getDataById(id: Double): ITimelineSlideData = js.native
    
    def getSlide(n: Double): ITimelineSlide = js.native
    
    def getSlideById(id: String): ITimelineSlide = js.native
    def getSlideById(id: Double): ITimelineSlide = js.native
    
    def goTo(n: Double): Unit = js.native
    
    def goToEnd(): Unit = js.native
    
    def goToId(id: String): Unit = js.native
    def goToId(id: Double): Unit = js.native
    
    def goToNext(): Unit = js.native
    
    def goToPrev(): Unit = js.native
    
    def goToStart(): Unit = js.native
    
    def remove(n: Double): Unit = js.native
    
    def removeId(id: String): Unit = js.native
    def removeId(id: Double): Unit = js.native
    
    def setConfig(config: ITimelineConfig): Unit = js.native
    
    def setZoom(level: Double): Unit = js.native
    
    def showMessage(msg: String): Unit = js.native
    
    def updateDisplay(): Unit = js.native
    
    def zoomIn(): Unit = js.native
    
    def zoomOut(): Unit = js.native
  }
  
  @js.native
  trait ITimelineConfig extends StObject {
    
    var eras: js.UndefOr[js.Array[ITimelineEra]] = js.native
    
    var events: js.Array[ITimelineSlideData] = js.native
    
    /*
      * Either human or cosmological. If no scale is specified, the default is human. The cosmological scale is
      * required to handle dates in the very distant past or future. (Before Tuesday, April 20th, 271,821 BCE
      * after Saturday, September 13 275,760 CE) For the cosmological scale, only the year is considered, but it's
      * OK to have a cosmological timeline with years between 271,821 BCE and 275,760 CE.
      */
    var scale: js.UndefOr[human | cosmological] = js.native
    
    var title: js.UndefOr[ITimelineSlideData] = js.native
  }
  object ITimelineConfig {
    
    @scala.inline
    def apply(events: js.Array[ITimelineSlideData]): ITimelineConfig = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimelineConfig]
    }
    
    @scala.inline
    implicit class ITimelineConfigMutableBuilder[Self <: ITimelineConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEras(value: js.Array[ITimelineEra]): Self = StObject.set(x, "eras", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErasUndefined: Self = StObject.set(x, "eras", js.undefined)
      
      @scala.inline
      def setErasVarargs(value: ITimelineEra*): Self = StObject.set(x, "eras", js.Array(value :_*))
      
      @scala.inline
      def setEvents(value: js.Array[ITimelineSlideData]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsVarargs(value: ITimelineSlideData*): Self = StObject.set(x, "events", js.Array(value :_*))
      
      @scala.inline
      def setScale(value: human | cosmological): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setTitle(value: ITimelineSlideData): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait ITimelineDate extends StObject {
    
    var day: js.UndefOr[Double] = js.native
    
    /*
      * A string for presenting the date. Useful if Timeline's date formatting doesn't fit your needs.
      */
    var display_date: js.UndefOr[String] = js.native
    
    /*
      * 0-23
      */
    var hour: js.UndefOr[Double] = js.native
    
    var millisecond: js.UndefOr[Double] = js.native
    
    /*
      * 0-59
      */
    var minute: js.UndefOr[Double] = js.native
    
    /*
      * 1-12
      */
    var month: js.UndefOr[Double] = js.native
    
    /*
      * 0-59
      */
    var second: js.UndefOr[Double] = js.native
    
    /*
      * BCE years should be negative numbers.
      */
    var year: Double = js.native
  }
  object ITimelineDate {
    
    @scala.inline
    def apply(year: Double): ITimelineDate = {
      val __obj = js.Dynamic.literal(year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimelineDate]
    }
    
    @scala.inline
    implicit class ITimelineDateMutableBuilder[Self <: ITimelineDate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      @scala.inline
      def setDisplay_date(value: String): Self = StObject.set(x, "display_date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay_dateUndefined: Self = StObject.set(x, "display_date", js.undefined)
      
      @scala.inline
      def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
      
      @scala.inline
      def setMillisecond(value: Double): Self = StObject.set(x, "millisecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMillisecondUndefined: Self = StObject.set(x, "millisecond", js.undefined)
      
      @scala.inline
      def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
      
      @scala.inline
      def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      @scala.inline
      def setSecond(value: Double): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
      
      @scala.inline
      def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ITimelineEra extends StObject {
    
    var end_date: ITimelineDate = js.native
    
    var start_date: ITimelineDate = js.native
    
    /*
      * Not required, but recommended.
      */
    var text: js.UndefOr[ITimelineText] = js.native
  }
  object ITimelineEra {
    
    @scala.inline
    def apply(end_date: ITimelineDate, start_date: ITimelineDate): ITimelineEra = {
      val __obj = js.Dynamic.literal(end_date = end_date.asInstanceOf[js.Any], start_date = start_date.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimelineEra]
    }
    
    @scala.inline
    implicit class ITimelineEraMutableBuilder[Self <: ITimelineEra] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd_date(value: ITimelineDate): Self = StObject.set(x, "end_date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart_date(value: ITimelineDate): Self = StObject.set(x, "start_date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: ITimelineText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait ITimelineEvents extends StObject {
    
    def addEventListener(`type`: String, fn: js.Function0[Unit]): ITimelineEvents = js.native
    def addEventListener(`type`: String, fn: js.Function0[Unit], context: js.Any): ITimelineEvents = js.native
    
    def fire(`type`: String): ITimelineEvents = js.native
    def fire(`type`: String, data: js.Any): ITimelineEvents = js.native
    
    def fireEvent(`type`: String): ITimelineEvents = js.native
    def fireEvent(`type`: String, data: js.Any): ITimelineEvents = js.native
    
    def hasEventListeners(`type`: String): Boolean = js.native
    
    def off(`type`: String, fn: js.Function0[Unit]): ITimelineEvents = js.native
    def off(`type`: String, fn: js.Function0[Unit], context: js.Any): ITimelineEvents = js.native
    
    def on(`type`: String, fn: js.Function0[Unit]): ITimelineEvents = js.native
    def on(`type`: String, fn: js.Function0[Unit], context: js.Any): ITimelineEvents = js.native
    
    def removeEventListener(`type`: String, fn: js.Function0[Unit]): ITimelineEvents = js.native
    def removeEventListener(`type`: String, fn: js.Function0[Unit], context: js.Any): ITimelineEvents = js.native
  }
  
  @js.native
  trait ITimelineMedia extends StObject {
    
    /*
      * HTML markup is OK.
      */
    var caption: js.UndefOr[String] = js.native
    
    /*
      * HTML markup is OK.
      */
    var credit: js.UndefOr[String] = js.native
    
    /*
      * A URL for an image to use in the timenav marker for this event. If omitted, Timeline will use an icon based
      * on the type of media. Not relevant for title slides, because they do not have a marker.
      */
    var thumbnail: js.UndefOr[String] = js.native
    
    /*
      * In most cases, a URL (see https://timeline.knightlab.com/docs/media-types.html for complete details).
      */
    var url: String = js.native
  }
  object ITimelineMedia {
    
    @scala.inline
    def apply(url: String): ITimelineMedia = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimelineMedia]
    }
    
    @scala.inline
    implicit class ITimelineMediaMutableBuilder[Self <: ITimelineMedia] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      @scala.inline
      def setCredit(value: String): Self = StObject.set(x, "credit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreditUndefined: Self = StObject.set(x, "credit", js.undefined)
      
      @scala.inline
      def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ITimelineOptions extends StObject {
    
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
    implicit class ITimelineOptionsMutableBuilder[Self <: ITimelineOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase_class(value: String): Self = StObject.set(x, "base_class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase_classUndefined: Self = StObject.set(x, "base_class", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDefault_bg_color(value: String): Self = StObject.set(x, "default_bg_color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefault_bg_colorUndefined: Self = StObject.set(x, "default_bg_color", js.undefined)
      
      @scala.inline
      def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggingUndefined: Self = StObject.set(x, "dragging", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEase(value: () => Double): Self = StObject.set(x, "ease", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
      
      @scala.inline
      def setGa_property_id(value: js.Any): Self = StObject.set(x, "ga_property_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGa_property_idUndefined: Self = StObject.set(x, "ga_property_id", js.undefined)
      
      @scala.inline
      def setHash_bookmark(value: Boolean): Self = StObject.set(x, "hash_bookmark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHash_bookmarkUndefined: Self = StObject.set(x, "hash_bookmark", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setInitial_zoom(value: Double): Self = StObject.set(x, "initial_zoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitial_zoomUndefined: Self = StObject.set(x, "initial_zoom", js.undefined)
      
      @scala.inline
      def setIs_embed(value: Boolean): Self = StObject.set(x, "is_embed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_embedUndefined: Self = StObject.set(x, "is_embed", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setMarker_height_min(value: Double): Self = StObject.set(x, "marker_height_min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarker_height_minUndefined: Self = StObject.set(x, "marker_height_min", js.undefined)
      
      @scala.inline
      def setMarker_padding(value: Double): Self = StObject.set(x, "marker_padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarker_paddingUndefined: Self = StObject.set(x, "marker_padding", js.undefined)
      
      @scala.inline
      def setMarker_width_min(value: Double): Self = StObject.set(x, "marker_width_min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarker_width_minUndefined: Self = StObject.set(x, "marker_width_min", js.undefined)
      
      @scala.inline
      def setMenubar_height(value: Double): Self = StObject.set(x, "menubar_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenubar_heightUndefined: Self = StObject.set(x, "menubar_height", js.undefined)
      
      @scala.inline
      def setOptimal_tick_width(value: Double): Self = StObject.set(x, "optimal_tick_width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimal_tick_widthUndefined: Self = StObject.set(x, "optimal_tick_width", js.undefined)
      
      @scala.inline
      def setScale_factor(value: Double): Self = StObject.set(x, "scale_factor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScale_factorUndefined: Self = StObject.set(x, "scale_factor", js.undefined)
      
      @scala.inline
      def setScript_path(value: String): Self = StObject.set(x, "script_path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScript_pathUndefined: Self = StObject.set(x, "script_path", js.undefined)
      
      @scala.inline
      def setSlide_default_fade(value: String): Self = StObject.set(x, "slide_default_fade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlide_default_fadeUndefined: Self = StObject.set(x, "slide_default_fade", js.undefined)
      
      @scala.inline
      def setSlide_padding_lr(value: Double): Self = StObject.set(x, "slide_padding_lr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlide_padding_lrUndefined: Self = StObject.set(x, "slide_padding_lr", js.undefined)
      
      @scala.inline
      def setStart_at_end(value: Boolean): Self = StObject.set(x, "start_at_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart_at_endUndefined: Self = StObject.set(x, "start_at_end", js.undefined)
      
      @scala.inline
      def setStart_at_slide(value: Double): Self = StObject.set(x, "start_at_slide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart_at_slideUndefined: Self = StObject.set(x, "start_at_slide", js.undefined)
      
      @scala.inline
      def setTimenav_height(value: Double): Self = StObject.set(x, "timenav_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimenav_heightUndefined: Self = StObject.set(x, "timenav_height", js.undefined)
      
      @scala.inline
      def setTimenav_height_min(value: Double): Self = StObject.set(x, "timenav_height_min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimenav_height_minUndefined: Self = StObject.set(x, "timenav_height_min", js.undefined)
      
      @scala.inline
      def setTimenav_height_percentage(value: Double): Self = StObject.set(x, "timenav_height_percentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimenav_height_percentageUndefined: Self = StObject.set(x, "timenav_height_percentage", js.undefined)
      
      @scala.inline
      def setTimenav_mobile_height_percentage(value: Double): Self = StObject.set(x, "timenav_mobile_height_percentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimenav_mobile_height_percentageUndefined: Self = StObject.set(x, "timenav_mobile_height_percentage", js.undefined)
      
      @scala.inline
      def setTimenav_position(value: bottom | top): Self = StObject.set(x, "timenav_position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimenav_positionUndefined: Self = StObject.set(x, "timenav_position", js.undefined)
      
      @scala.inline
      def setTrackResize(value: Boolean): Self = StObject.set(x, "trackResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackResizeUndefined: Self = StObject.set(x, "trackResize", js.undefined)
      
      @scala.inline
      def setTrack_events(value: js.Array[back_to_start | nav_next | nav_previous | zoom_in | zoom_out]): Self = StObject.set(x, "track_events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrack_eventsUndefined: Self = StObject.set(x, "track_events", js.undefined)
      
      @scala.inline
      def setTrack_eventsVarargs(value: (back_to_start | nav_next | nav_previous | zoom_in | zoom_out)*): Self = StObject.set(x, "track_events", js.Array(value :_*))
      
      @scala.inline
      def setUse_bc(value: Boolean): Self = StObject.set(x, "use_bc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUse_bcUndefined: Self = StObject.set(x, "use_bc", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setZoom_sequence(value: js.Array[Double]): Self = StObject.set(x, "zoom_sequence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoom_sequenceUndefined: Self = StObject.set(x, "zoom_sequence", js.undefined)
      
      @scala.inline
      def setZoom_sequenceVarargs(value: Double*): Self = StObject.set(x, "zoom_sequence", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ITimelineSlide extends StObject {
    
    var data: ITimelineSlideData = js.native
  }
  object ITimelineSlide {
    
    @scala.inline
    def apply(data: ITimelineSlideData): ITimelineSlide = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimelineSlide]
    }
    
    @scala.inline
    implicit class ITimelineSlideMutableBuilder[Self <: ITimelineSlide] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: ITimelineSlideData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ITimelineSlideData extends StObject {
    
    /*
      * Defaults to true, which means that Timeline will scan text fields and automatically add <a> tags so that
      * links and email addresses are "clickable." If set to false, you may still manually apply the tags in the
      * appropriate fields when you want links. Autolinking applies to the text field in a text object and the
      * caption and credit fields in a media object.
      */
    var autolink: js.UndefOr[Boolean] = js.native
    
    /*
      * A Javascript object. The object can have these properties:
      * url: the fully-qualified URL pointing to an image which will be used as the background
      * color: a CSS color, in hexadecimal (e.g. #0f9bd1) or a valid CSS color keyword.
      */
    var background: js.UndefOr[Color] = js.native
    
    /*
      * A string which will be used when Timeline displays the date for this. If used, override's display_date
      * values set on the start or end date for this event, which is useful if you want to control how the two
      * dates relate to each other.
      */
    var display_date: js.UndefOr[String] = js.native
    
    var end_date: js.UndefOr[ITimelineDate] = js.native
    
    /*
      * If present, Timeline will organize events with the same value for group to be in the same row or adjacent
      * rows, separate from events in other groups. The common value for the group will be shown as a label at the
      * left edge of the navigation.
      */
    var group: js.UndefOr[String] = js.native
    
    var media: js.UndefOr[ITimelineMedia] = js.native
    
    /*
      * Required for events, but not for `title` slides.
      */
    var start_date: js.UndefOr[ITimelineDate] = js.native
    
    /*
      * Not required, but recommended.
      */
    var text: js.UndefOr[ITimelineText] = js.native
    
    /*
      * A string value which is unique among all slides in your timeline. If not specified, TimelineJS will
      * construct an ID based on the headline, but if you later edit your headline, the ID will change. Unique IDs
      * are used when the hash_bookmark option is used, and can also be used with the timeline.goToId() method to
      * programmatically move the timeline to a specific slide.
      */
    var unique_id: js.UndefOr[String] = js.native
  }
  object ITimelineSlideData {
    
    @scala.inline
    def apply(): ITimelineSlideData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITimelineSlideData]
    }
    
    @scala.inline
    implicit class ITimelineSlideDataMutableBuilder[Self <: ITimelineSlideData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutolink(value: Boolean): Self = StObject.set(x, "autolink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutolinkUndefined: Self = StObject.set(x, "autolink", js.undefined)
      
      @scala.inline
      def setBackground(value: Color): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setDisplay_date(value: String): Self = StObject.set(x, "display_date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay_dateUndefined: Self = StObject.set(x, "display_date", js.undefined)
      
      @scala.inline
      def setEnd_date(value: ITimelineDate): Self = StObject.set(x, "end_date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnd_dateUndefined: Self = StObject.set(x, "end_date", js.undefined)
      
      @scala.inline
      def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setMedia(value: ITimelineMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      @scala.inline
      def setStart_date(value: ITimelineDate): Self = StObject.set(x, "start_date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart_dateUndefined: Self = StObject.set(x, "start_date", js.undefined)
      
      @scala.inline
      def setText(value: ITimelineText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setUnique_id(value: String): Self = StObject.set(x, "unique_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnique_idUndefined: Self = StObject.set(x, "unique_id", js.undefined)
    }
  }
  
  @js.native
  trait ITimelineText extends StObject {
    
    /*
      * HTML markup is OK. Blank is also OK.
      */
    var headline: js.UndefOr[String] = js.native
    
    /*
      * HTML markup is OK. Blank is also OK. Not used for era objects.
      */
    var text: js.UndefOr[String] = js.native
  }
  object ITimelineText {
    
    @scala.inline
    def apply(): ITimelineText = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITimelineText]
    }
    
    @scala.inline
    implicit class ITimelineTextMutableBuilder[Self <: ITimelineText] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeadline(value: String): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadlineUndefined: Self = StObject.set(x, "headline", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
