package typings
package webgmeLib.GmeCommonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var msg: java.lang.String
}

object Message {
  @scala.inline
  def apply(msg: java.lang.String): Message = {
    val __obj = js.Dynamic.literal(msg = msg)
  
    __obj.asInstanceOf[Message]
  }
}

