package typings.uiBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCache extends js.Object {
  var cache: js.Array[js.Tuple2[String, String]]
  var styles: String
}

object AnonCache {
  @scala.inline
  def apply(cache: js.Array[js.Tuple2[String, String]], styles: String): AnonCache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCache]
  }
}

