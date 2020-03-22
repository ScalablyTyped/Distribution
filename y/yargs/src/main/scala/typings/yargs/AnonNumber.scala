package typings.yargs

import typings.yargs.yargsBooleans.`true`
import typings.yargs.yargsStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNumber extends js.Object {
  var number: `true`
  var `type`: array
}

object AnonNumber {
  @scala.inline
  def apply(number: `true`, `type`: array): AnonNumber = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNumber]
  }
}

