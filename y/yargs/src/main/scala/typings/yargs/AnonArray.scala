package typings.yargs

import typings.yargs.yargsBooleans.`true`
import typings.yargs.yargsStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArray extends js.Object {
  var array: `true`
  var `type`: string
}

object AnonArray {
  @scala.inline
  def apply(array: `true`, `type`: string): AnonArray = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArray]
  }
}

