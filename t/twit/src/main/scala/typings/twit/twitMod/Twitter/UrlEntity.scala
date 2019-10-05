package typings.twit.twitMod.Twitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlEntity extends js.Object {
  var display_url: String
  var expanded_url: String
  var indices: js.Tuple2[Double, Double]
  var url: String
}

object UrlEntity {
  @scala.inline
  def apply(display_url: String, expanded_url: String, indices: js.Tuple2[Double, Double], url: String): UrlEntity = {
    val __obj = js.Dynamic.literal(display_url = display_url, expanded_url = expanded_url, indices = indices, url = url)
  
    __obj.asInstanceOf[UrlEntity]
  }
}

