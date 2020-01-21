package typings.tslint.ruleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICodeExample extends js.Object {
  var config: String
  var description: String
  var fail: js.UndefOr[String] = js.undefined
  var pass: String
}

object ICodeExample {
  @scala.inline
  def apply(config: String, description: String, pass: String, fail: String = null): ICodeExample = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(fail.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICodeExample]
  }
}

