package typings
package vscodeDashJsonrpcLib.libMessagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageType extends js.Object {
  val method: java.lang.String
  val numberOfParams: scala.Double
}

object MessageType {
  @scala.inline
  def apply(method: java.lang.String, numberOfParams: scala.Double): MessageType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("numberOfParams")(numberOfParams)
    __obj.asInstanceOf[MessageType]
  }
}

