package typings.yargs

import typings.yargs.yargsStrings.number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNumber extends js.Object {
  var `type`: number
}

object AnonNumber {
  @scala.inline
  def apply(`type`: number): AnonNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNumber]
  }
}

