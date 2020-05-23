package typings.wxJsSdkDt.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckResult extends js.Object {
  var checkResult: StringDictionary[Boolean]
  var errMsg: Msg
}

object CheckResult {
  @scala.inline
  def apply(checkResult: StringDictionary[Boolean], errMsg: Msg): CheckResult = {
    val __obj = js.Dynamic.literal(checkResult = checkResult.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckResult]
  }
}

