package typings
package yaddaLib.libEventBusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefineEventData extends js.Object {
  var pattern: java.lang.String
  var signature: java.lang.String
}

object DefineEventData {
  @scala.inline
  def apply(pattern: java.lang.String, signature: java.lang.String): DefineEventData = {
    val __obj = js.Dynamic.literal(pattern = pattern, signature = signature)
  
    __obj.asInstanceOf[DefineEventData]
  }
}

