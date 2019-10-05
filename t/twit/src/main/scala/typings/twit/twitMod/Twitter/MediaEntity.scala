package typings.twit.twitMod.Twitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaEntity extends js.Object {
  var display_url: String
  var expanded_url: String
  var id: Double
  var id_str: String
  var indices: js.Tuple2[Double, Double]
  var media_url: String
  var media_url_https: String
  var sizes: Sizes
  var source_status_id: Double
  var source_status_id_str: String
  var `type`: String
  var url: String
}

object MediaEntity {
  @scala.inline
  def apply(
    display_url: String,
    expanded_url: String,
    id: Double,
    id_str: String,
    indices: js.Tuple2[Double, Double],
    media_url: String,
    media_url_https: String,
    sizes: Sizes,
    source_status_id: Double,
    source_status_id_str: String,
    `type`: String,
    url: String
  ): MediaEntity = {
    val __obj = js.Dynamic.literal(display_url = display_url, expanded_url = expanded_url, id = id, id_str = id_str, indices = indices, media_url = media_url, media_url_https = media_url_https, sizes = sizes, source_status_id = source_status_id, source_status_id_str = source_status_id_str, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MediaEntity]
  }
}

