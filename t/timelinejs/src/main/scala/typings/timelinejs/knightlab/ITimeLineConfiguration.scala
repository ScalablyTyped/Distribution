package typings.timelinejs.knightlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimeLineConfiguration extends js.Object {
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
  @scala.inline
  def apply(
    height: String,
    source: js.Any,
    width: String,
    css: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    embed_id: String = null,
    font: String = null,
    gmap_key: String = null,
    hash_bookmark: js.UndefOr[Boolean] = js.undefined,
    js_ : String = null,
    lang: String = null,
    maptype: String = null,
    start_at_end: js.UndefOr[Boolean] = js.undefined,
    start_at_slide: String = null,
    start_zoom_adjust: String = null,
    `type`: String = null
  ): ITimeLineConfiguration = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (embed_id != null) __obj.updateDynamic("embed_id")(embed_id.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (gmap_key != null) __obj.updateDynamic("gmap_key")(gmap_key.asInstanceOf[js.Any])
    if (!js.isUndefined(hash_bookmark)) __obj.updateDynamic("hash_bookmark")(hash_bookmark.get.asInstanceOf[js.Any])
    if (js_ != null) __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (maptype != null) __obj.updateDynamic("maptype")(maptype.asInstanceOf[js.Any])
    if (!js.isUndefined(start_at_end)) __obj.updateDynamic("start_at_end")(start_at_end.get.asInstanceOf[js.Any])
    if (start_at_slide != null) __obj.updateDynamic("start_at_slide")(start_at_slide.asInstanceOf[js.Any])
    if (start_zoom_adjust != null) __obj.updateDynamic("start_zoom_adjust")(start_zoom_adjust.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimeLineConfiguration]
  }
}

