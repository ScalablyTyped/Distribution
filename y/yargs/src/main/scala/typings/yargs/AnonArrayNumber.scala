package typings.yargs

import typings.yargs.yargsBooleans.`true`
import typings.yargs.yargsStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArrayNumber extends js.Object {
  var number: `true`
  var `type`: array
}

object AnonArrayNumber {
  @scala.inline
  def apply(number: `true`, `type`: array): AnonArrayNumber = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArrayNumber]
  }
}

