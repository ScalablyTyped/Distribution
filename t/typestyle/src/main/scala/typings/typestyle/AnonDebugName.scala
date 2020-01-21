package typings.typestyle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDebugName extends js.Object {
  var debugName: String
  var result: js.Any
}

object AnonDebugName {
  @scala.inline
  def apply(debugName: String, result: js.Any): AnonDebugName = {
    val __obj = js.Dynamic.literal(debugName = debugName.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDebugName]
  }
}

