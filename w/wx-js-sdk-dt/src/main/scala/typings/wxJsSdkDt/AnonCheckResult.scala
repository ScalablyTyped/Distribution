package typings.wxJsSdkDt

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCheckResult extends js.Object {
  var checkResult: StringDictionary[Boolean]
  var errMsg: AnonMsg
}

object AnonCheckResult {
  @scala.inline
  def apply(checkResult: StringDictionary[Boolean], errMsg: AnonMsg): AnonCheckResult = {
    val __obj = js.Dynamic.literal(checkResult = checkResult.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCheckResult]
  }
}

