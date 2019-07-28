package typings.uiDashBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cache extends js.Object {
  var cache: js.Array[js.Tuple2[String, String]]
  var styles: String
}

object Anon_Cache {
  @scala.inline
  def apply(cache: js.Array[js.Tuple2[String, String]], styles: String): Anon_Cache = {
    val __obj = js.Dynamic.literal(cache = cache, styles = styles)
  
    __obj.asInstanceOf[Anon_Cache]
  }
}

