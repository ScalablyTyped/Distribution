package typings.vscodeDashJsonrpc.libMessagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageType extends js.Object {
  val method: String
  val numberOfParams: Double
}

object MessageType {
  @scala.inline
  def apply(method: String, numberOfParams: Double): MessageType = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], numberOfParams = numberOfParams.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageType]
  }
}

