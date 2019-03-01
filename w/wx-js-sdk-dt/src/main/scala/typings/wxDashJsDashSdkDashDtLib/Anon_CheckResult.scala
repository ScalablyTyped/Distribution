package typings
package wxDashJsDashSdkDashDtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CheckResult extends js.Object {
  var checkResult: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  var errMsg: Anon_Msg
}

object Anon_CheckResult {
  @scala.inline
  def apply(checkResult: org.scalablytyped.runtime.StringDictionary[scala.Boolean], errMsg: Anon_Msg): Anon_CheckResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checkResult")(checkResult)
    __obj.updateDynamic("errMsg")(errMsg)
    __obj.asInstanceOf[Anon_CheckResult]
  }
}

