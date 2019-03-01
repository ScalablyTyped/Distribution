package typings
package twitLib.twitMod.TwitNs.TwitterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaEntity extends js.Object {
  var display_url: java.lang.String
  var expanded_url: java.lang.String
  var id: scala.Double
  var id_str: java.lang.String
  var indices: js.Tuple2[scala.Double, scala.Double]
  var media_url: java.lang.String
  var media_url_https: java.lang.String
  var sizes: Sizes
  var source_status_id: scala.Double
  var source_status_id_str: java.lang.String
  var `type`: java.lang.String
  var url: java.lang.String
}

object MediaEntity {
  @scala.inline
  def apply(
    display_url: java.lang.String,
    expanded_url: java.lang.String,
    id: scala.Double,
    id_str: java.lang.String,
    indices: js.Tuple2[scala.Double, scala.Double],
    media_url: java.lang.String,
    media_url_https: java.lang.String,
    sizes: Sizes,
    source_status_id: scala.Double,
    source_status_id_str: java.lang.String,
    `type`: java.lang.String,
    url: java.lang.String
  ): MediaEntity = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("display_url")(display_url)
    __obj.updateDynamic("expanded_url")(expanded_url)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("id_str")(id_str)
    __obj.updateDynamic("indices")(indices)
    __obj.updateDynamic("media_url")(media_url)
    __obj.updateDynamic("media_url_https")(media_url_https)
    __obj.updateDynamic("sizes")(sizes)
    __obj.updateDynamic("source_status_id")(source_status_id)
    __obj.updateDynamic("source_status_id_str")(source_status_id_str)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[MediaEntity]
  }
}

