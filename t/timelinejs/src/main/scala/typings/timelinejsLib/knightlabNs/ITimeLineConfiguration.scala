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
  var `js_`: js.UndefOr[java.lang.String] = js.undefined
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

