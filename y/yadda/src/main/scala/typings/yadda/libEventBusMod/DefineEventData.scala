package typings.yadda.libEventBusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefineEventData extends js.Object {
  var pattern: String
  var signature: String
}

object DefineEventData {
  @scala.inline
  def apply(pattern: String, signature: String): DefineEventData = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DefineEventData]
  }
}

