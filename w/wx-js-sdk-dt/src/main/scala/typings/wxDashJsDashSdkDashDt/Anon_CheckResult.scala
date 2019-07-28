package typings.wxDashJsDashSdkDashDt

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CheckResult extends js.Object {
  var checkResult: StringDictionary[Boolean]
  var errMsg: Anon_Msg
}

object Anon_CheckResult {
  @scala.inline
  def apply(checkResult: StringDictionary[Boolean], errMsg: Anon_Msg): Anon_CheckResult = {
    val __obj = js.Dynamic.literal(checkResult = checkResult, errMsg = errMsg)
  
    __obj.asInstanceOf[Anon_CheckResult]
  }
}

