package typings
package winrtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ResultSucceededBoolean extends js.Object {
  var result: winrtLib.WindowsNs.DataNs.JsonNs.JsonValue
  var succeeded: scala.Boolean
}

object Anon_ResultSucceededBoolean {
  @scala.inline
  def apply(result: winrtLib.WindowsNs.DataNs.JsonNs.JsonValue, succeeded: scala.Boolean): Anon_ResultSucceededBoolean = {
    val __obj = js.Dynamic.literal(result = result, succeeded = succeeded)
  
    __obj.asInstanceOf[Anon_ResultSucceededBoolean]
  }
}

