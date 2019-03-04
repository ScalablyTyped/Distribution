package typings
package timelinejsLib.knightlabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimeLineConfiguration extends js.Object {
  /*
    * Optional path to css
    */
  var css: js.UndefOr[java.lang.String] = js.undefined
  /*
    * Optional debug to console
    */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /*
    * Optional use a different div id for embed
    */
  var embed_id: js.UndefOr[java.lang.String] = js.undefined
  /*
    * Optional font
    */
  var font: js.UndefOr[java.lang.String] = js.undefined
  /*
    * required in order to use maptype
    */
  var gmap_key: js.UndefOr[java.lang.String] = js.undefined
  /*
    * Optional location bar hashes
    */
  var hash_bookmark: js.UndefOr[scala.Boolean] = js.undefined
  var height: java.lang.String
  /*
    * Optional path to js
    */
  @JSName("js")
  var js_ : js.UndefOr[java.lang.String] = js.undefined
  /*
    * Optional language
    */
  var lang: js.UndefOr[java.lang.String] = js.undefined
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
  var maptype: js.UndefOr[java.lang.String] = js.undefined
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
  var start_at_end: js.UndefOr[scala.Boolean] = js.undefined
  /*
    * Optional start at specific slide
    */
  var start_at_slide: js.UndefOr[java.lang.String] = js.undefined
  /*
    * Optional tweak the default zoom level
    */
  var start_zoom_adjust: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var width: java.lang.String
}

object ITimeLineConfiguration {
  @scala.inline
  def apply(
    height: java.lang.String,
    source: js.Any,
    width: java.lang.String,
    css: java.lang.String = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    embed_id: java.lang.String = null,
    font: java.lang.String = null,
    gmap_key: java.lang.String = null,
    hash_bookmark: js.UndefOr[scala.Boolean] = js.undefined,
    js_ : java.lang.String = null,
    lang: java.lang.String = null,
    maptype: java.lang.String = null,
    start_at_end: js.UndefOr[scala.Boolean] = js.undefined,
    start_at_slide: java.lang.String = null,
    start_zoom_adjust: java.lang.String = null,
    `type`: java.lang.String = null
  ): ITimeLineConfiguration = {
    val __obj = js.Dynamic.literal(height = height, source = source, width = width)
    if (css != null) __obj.updateDynamic("css")(css)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (embed_id != null) __obj.updateDynamic("embed_id")(embed_id)
    if (font != null) __obj.updateDynamic("font")(font)
    if (gmap_key != null) __obj.updateDynamic("gmap_key")(gmap_key)
    if (!js.isUndefined(hash_bookmark)) __obj.updateDynamic("hash_bookmark")(hash_bookmark)
    if (js_ != null) __obj.updateDynamic("js")(js_)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (maptype != null) __obj.updateDynamic("maptype")(maptype)
    if (!js.isUndefined(start_at_end)) __obj.updateDynamic("start_at_end")(start_at_end)
    if (start_at_slide != null) __obj.updateDynamic("start_at_slide")(start_at_slide)
    if (start_zoom_adjust != null) __obj.updateDynamic("start_zoom_adjust")(start_zoom_adjust)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ITimeLineConfiguration]
  }
}

