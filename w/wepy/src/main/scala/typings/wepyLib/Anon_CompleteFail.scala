package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompleteFail extends js.Object {
  def complete(): scala.Unit
  def fail(): scala.Unit
  def success(res: wepyLib.wxUnderscoreEnhancedMod.LagLng): scala.Unit
}

object Anon_CompleteFail {
  @scala.inline
  def apply(
    complete: js.Function0[scala.Unit],
    fail: js.Function0[scala.Unit],
    success: js.Function1[wepyLib.wxUnderscoreEnhancedMod.LagLng, scala.Unit]
  ): Anon_CompleteFail = {
    val __obj = js.Dynamic.literal(complete = complete, fail = fail, success = success)
  
    __obj.asInstanceOf[Anon_CompleteFail]
  }
}

