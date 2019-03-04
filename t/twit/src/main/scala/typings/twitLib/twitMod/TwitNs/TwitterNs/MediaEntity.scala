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
    val __obj = js.Dynamic.literal(display_url = display_url, expanded_url = expanded_url, id = id, id_str = id_str, indices = indices, media_url = media_url, media_url_https = media_url_https, sizes = sizes, source_status_id = source_status_id, source_status_id_str = source_status_id_str, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MediaEntity]
  }
}

