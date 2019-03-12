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
    complete: () => scala.Unit,
    fail: () => scala.Unit,
    success: wepyLib.wxUnderscoreEnhancedMod.LagLng => scala.Unit
  ): Anon_CompleteFail = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), fail = js.Any.fromFunction0(fail), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_CompleteFail]
  }
}

