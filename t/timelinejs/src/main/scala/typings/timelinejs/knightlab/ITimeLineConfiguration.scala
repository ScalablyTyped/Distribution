package typings.timelinejs.knightlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimeLineConfiguration extends js.Object {
  /*
    * Optional path to css
    */
  var css: js.UndefOr[String] = js.native
  /*
    * Optional debug to console
    */
  var debug: js.UndefOr[Boolean] = js.native
  /*
    * Optional use a different div id for embed
    */
  var embed_id: js.UndefOr[String] = js.native
  /*
    * Optional font
    */
  var font: js.UndefOr[String] = js.native
  /*
    * required in order to use maptype
    */
  var gmap_key: js.UndefOr[String] = js.native
  /*
    * Optional location bar hashes
    */
  var hash_bookmark: js.UndefOr[Boolean] = js.native
  var height: String = js.native
  /*
    * Optional path to js
    */
  @JSName("js")
  var js_ : js.UndefOr[String] = js.native
  /*
    * Optional language
    */
  var lang: js.UndefOr[String] = js.native
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
  var maptype: js.UndefOr[String] = js.native
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
  var source: js.Any = js.native
  /*
    * Optional start at latest date
    */
  var start_at_end: js.UndefOr[Boolean] = js.native
  /*
    * Optional start at specific slide
    */
  var start_at_slide: js.UndefOr[String] = js.native
  /*
    * Optional tweak the default zoom level
    */
  var start_zoom_adjust: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var width: String = js.native
}

object ITimeLineConfiguration {
  @scala.inline
  def apply(height: String, source: js.Any, width: String): ITimeLineConfiguration = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimeLineConfiguration]
  }
  @scala.inline
  implicit class ITimeLineConfigurationOps[Self <: ITimeLineConfiguration] (val x: Self) extends AnyVal {
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
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: js.Any): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setCss(value: String): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setEmbed_id(value: String): Self = this.set("embed_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmbed_id: Self = this.set("embed_id", js.undefined)
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setGmap_key(value: String): Self = this.set("gmap_key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGmap_key: Self = this.set("gmap_key", js.undefined)
    @scala.inline
    def setHash_bookmark(value: Boolean): Self = this.set("hash_bookmark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHash_bookmark: Self = this.set("hash_bookmark", js.undefined)
    @scala.inline
    def setJs_(value: String): Self = this.set("js", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJs_ : Self = this.set("js", js.undefined)
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setMaptype(value: String): Self = this.set("maptype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaptype: Self = this.set("maptype", js.undefined)
    @scala.inline
    def setStart_at_end(value: Boolean): Self = this.set("start_at_end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart_at_end: Self = this.set("start_at_end", js.undefined)
    @scala.inline
    def setStart_at_slide(value: String): Self = this.set("start_at_slide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart_at_slide: Self = this.set("start_at_slide", js.undefined)
    @scala.inline
    def setStart_zoom_adjust(value: String): Self = this.set("start_zoom_adjust", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart_zoom_adjust: Self = this.set("start_zoom_adjust", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

