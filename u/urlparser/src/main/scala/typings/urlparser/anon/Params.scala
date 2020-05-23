package typings.urlparser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  var params: js.Object
  var parts: js.Array[String]
}

object Params {
  @scala.inline
  def apply(params: js.Object, parts: js.Array[String]): Params = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}

