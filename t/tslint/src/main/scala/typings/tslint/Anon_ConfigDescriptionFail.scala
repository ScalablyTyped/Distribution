package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConfigDescriptionFail extends js.Object {
  var config: String
  var description: String
  var fail: js.UndefOr[scala.Nothing] = js.undefined
  var pass: String
}

object Anon_ConfigDescriptionFail {
  @scala.inline
  def apply(config: String, description: String, pass: String, fail: js.UndefOr[scala.Nothing] = js.undefined): Anon_ConfigDescriptionFail = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
    if (!js.isUndefined(fail)) __obj.updateDynamic("fail")(fail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ConfigDescriptionFail]
  }
}

