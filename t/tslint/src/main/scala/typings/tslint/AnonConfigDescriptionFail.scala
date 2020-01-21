package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfigDescriptionFail extends js.Object {
  var config: String
  var description: String
  var fail: js.UndefOr[scala.Nothing] = js.undefined
  var pass: String
}

object AnonConfigDescriptionFail {
  @scala.inline
  def apply(config: String, description: String, pass: String, fail: js.UndefOr[scala.Nothing] = js.undefined): AnonConfigDescriptionFail = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
    if (!js.isUndefined(fail)) __obj.updateDynamic("fail")(fail.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfigDescriptionFail]
  }
}

