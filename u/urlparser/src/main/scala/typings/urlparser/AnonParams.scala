package typings.urlparser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParams extends js.Object {
  var params: js.Object
  var parts: js.Array[String]
}

object AnonParams {
  @scala.inline
  def apply(params: js.Object, parts: js.Array[String]): AnonParams = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParams]
  }
}

