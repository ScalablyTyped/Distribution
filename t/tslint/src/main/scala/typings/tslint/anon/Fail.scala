package typings.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fail extends js.Object {
  var config: String
  var description: String
  var fail: js.UndefOr[scala.Nothing] = js.undefined
  var pass: String
}

object Fail {
  @scala.inline
  def apply(config: String, description: String, pass: String): Fail = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fail]
  }
}

