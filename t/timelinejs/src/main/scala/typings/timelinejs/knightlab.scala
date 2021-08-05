package typings.timelinejs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object knightlab {
  
  trait ITimeLine extends StObject {
    
    var asset: js.UndefOr[ITimeLineAsset] = js.undefined
    
    var date: js.UndefOr[js.Array[ITimelineDate]] = js.undefined
    
    var era: js.UndefOr[js.Array[ITimelineEra]] = js.undefined
    
    var headline: js.UndefOr[String] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ITimeLine {
    
    inline def apply(): ITimeLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITimeLine]
    }
    
    extension [Self <: ITimeLine](x: Self) {
      
      inline def setAsset(value: ITimeLineAsset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
      
      inline def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
      
      inline def setDate(value: js.Array[ITimelineDate]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setDateVarargs(value: ITimelineDate*): Self = StObject.set(x, "date", js.Array(value :_*))
      
      inline def setEra(value: js.Array[ITimelineEra]): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
      
      inline def setEraUndefined: Self = StObject.set(x, "era", js.undefined)
      
      inline def setEraVarargs(value: ITimelineEra*): Self = StObject.set(x, "era", js.Array(value :_*))
      
      inline def setHeadline(value: String): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
      
      inline def setHeadlineUndefined: Self = StObject.set(x, "headline", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ITimeLineAsset extends StObject {
    
    var caption: String
    
    var credit: String
    
    var media: String
    
    var thumbnail: js.UndefOr[String] = js.undefined
  }
  object ITimeLineAsset {
    
    inline def apply(caption: String, credit: String, media: String): ITimeLineAsset = {
      val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], credit = credit.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimeLineAsset]
    }
    
    extension [Self <: ITimeLineAsset](x: Self) {
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCredit(value: String): Self = StObject.set(x, "credit", value.asInstanceOf[js.Any])
      
      inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    }
  }
  
  trait ITimeLineConfiguration extends StObject {
    
    /*
      * Optional path to css
      */
    var css: js.UndefOr[String] = js.undefined
    
    /*
      * Optional debug to console
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /*
      * Optional use a different div id for embed
      */
    var embed_id: js.UndefOr[String] = js.undefined
    
    /*
      * Optional font
      */
    var font: js.UndefOr[String] = js.undefined
    
    /*
      * required in order to use maptype
      */
    var gmap_key: js.UndefOr[String] = js.undefined
    
    /*
      * Optional location bar hashes
      */
    var hash_bookmark: js.UndefOr[Boolean] = js.undefined
    
    var height: String
    
    /*
      * Optional path to js
      */
    @JSName("js")
    var js_ : js.UndefOr[String] = js.undefined
    
    /*
      * Optional language
      */
    var lang: js.UndefOr[String] = js.undefined
    
    /*
      * Stamen Maps:
      * toner
      * toner-lines
      * toner-labels
      * watercolor
      * sterrain
      *
      * Google Maps:
      * ROADMAP
      * TERRAIN
      * HYBRID
      * SATELLITE
      *
      * OpenStreetMap:
      * osm
      */
    var maptype: js.UndefOr[String] = js.undefined
    
    /*
      * path to json/ or link to googlespreadsheet
      * source Should be either the path to the JSON resource to load, or a JavaScript object corresponding to the
      * Timeline model.
      *
      * Here is an example using a data object:
      *
      * var dataObject = {timeline: {headline: "Headline", type: ... }}
      * createStoryJS({
      * type:       'timeline',
      * width:      '800',
      * height:     '600',
      * source:     dataObject,
      * embed_id:   'my-timeline'
      * });
      * If source is a string, we will try to automatically recognize resources that are Twitter searches, Google
      * Spreadsheets or Storify stories. Failing that, we assume the source is either JSON or JSONP. If string
      * matches on .jsonp, we will treat it as JSONP, otherwise, we will append ?callback=onJSONP_Data.
      */
    var source: js.Any
    
    /*
      * Optional start at latest date
      */
    var start_at_end: js.UndefOr[Boolean] = js.undefined
    
    /*
      * Optional start at specific slide
      */
    var start_at_slide: js.UndefOr[String] = js.undefined
    
    /*
      * Optional tweak the default zoom level
      */
    var start_zoom_adjust: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var width: String
  }
  object ITimeLineConfiguration {
    
    inline def apply(height: String, source: js.Any, width: String): ITimeLineConfiguration = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimeLineConfiguration]
    }
    
    extension [Self <: ITimeLineConfiguration](x: Self) {
      
      inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setEmbed_id(value: String): Self = StObject.set(x, "embed_id", value.asInstanceOf[js.Any])
      
      inline def setEmbed_idUndefined: Self = StObject.set(x, "embed_id", js.undefined)
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setGmap_key(value: String): Self = StObject.set(x, "gmap_key", value.asInstanceOf[js.Any])
      
      inline def setGmap_keyUndefined: Self = StObject.set(x, "gmap_key", js.undefined)
      
      inline def setHash_bookmark(value: Boolean): Self = StObject.set(x, "hash_bookmark", value.asInstanceOf[js.Any])
      
      inline def setHash_bookmarkUndefined: Self = StObject.set(x, "hash_bookmark", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setJs_(value: String): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
      
      inline def setJs_Undefined: Self = StObject.set(x, "js", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setMaptype(value: String): Self = StObject.set(x, "maptype", value.asInstanceOf[js.Any])
      
      inline def setMaptypeUndefined: Self = StObject.set(x, "maptype", js.undefined)
      
      inline def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setStart_at_end(value: Boolean): Self = StObject.set(x, "start_at_end", value.asInstanceOf[js.Any])
      
      inline def setStart_at_endUndefined: Self = StObject.set(x, "start_at_end", js.undefined)
      
      inline def setStart_at_slide(value: String): Self = StObject.set(x, "start_at_slide", value.asInstanceOf[js.Any])
      
      inline def setStart_at_slideUndefined: Self = StObject.set(x, "start_at_slide", js.undefined)
      
      inline def setStart_zoom_adjust(value: String): Self = StObject.set(x, "start_zoom_adjust", value.asInstanceOf[js.Any])
      
      inline def setStart_zoom_adjustUndefined: Self = StObject.set(x, "start_zoom_adjust", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITimelineDate
    extends StObject
       with ITimelineEra {
    
    var asset: js.UndefOr[ITimeLineAsset] = js.undefined
    
    var classname: js.UndefOr[String] = js.undefined
  }
  object ITimelineDate {
    
    inline def apply(endDate: String, headline: String, startDate: String, text: String): ITimelineDate = {
      val __obj = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], headline = headline.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimelineDate]
    }
    
    extension [Self <: ITimelineDate](x: Self) {
      
      inline def setAsset(value: ITimeLineAsset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
      
      inline def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
      
      inline def setClassname(value: String): Self = StObject.set(x, "classname", value.asInstanceOf[js.Any])
      
      inline def setClassnameUndefined: Self = StObject.set(x, "classname", js.undefined)
    }
  }
  
  trait ITimelineEra extends StObject {
    
    /*
      * format example: 2011,12,10
      */
    var endDate: String
    
    var headline: String
    
    /*
      * format example: 2011,12,10
      */
    var startDate: String
    
    var tag: js.UndefOr[String] = js.undefined
    
    var text: String
  }
  object ITimelineEra {
    
    inline def apply(endDate: String, headline: String, startDate: String, text: String): ITimelineEra = {
      val __obj = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], headline = headline.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimelineEra]
    }
    
    extension [Self <: ITimelineEra](x: Self) {
      
      inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setHeadline(value: String): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
      
      inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITimelineModel extends StObject {
    
    var timeline: ITimeLine
  }
  object ITimelineModel {
    
    inline def apply(timeline: ITimeLine): ITimelineModel = {
      val __obj = js.Dynamic.literal(timeline = timeline.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimelineModel]
    }
    
    extension [Self <: ITimelineModel](x: Self) {
      
      inline def setTimeline(value: ITimeLine): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
    }
  }
}
