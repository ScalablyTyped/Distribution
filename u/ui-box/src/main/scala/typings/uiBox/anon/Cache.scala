package typings.uiBox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache extends js.Object {
  var cache: js.Array[js.Tuple2[String, String]]
  var styles: String
}

object Cache {
  @scala.inline
  def apply(cache: js.Array[js.Tuple2[String, String]], styles: String): Cache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cache]
  }
}

