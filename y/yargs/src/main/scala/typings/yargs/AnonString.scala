package typings.yargs

import typings.yargs.yargsBooleans.`true`
import typings.yargs.yargsStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonString extends js.Object {
  var string: `true`
  var `type`: array
}

object AnonString {
  @scala.inline
  def apply(string: `true`, `type`: array): AnonString = {
    val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonString]
  }
}

