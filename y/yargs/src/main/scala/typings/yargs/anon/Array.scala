package typings.yargs.anon

import typings.yargs.yargsBooleans.`true`
import typings.yargs.yargsStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Array extends js.Object {
  var array: `true`
  var `type`: string
}

object Array {
  @scala.inline
  def apply(array: `true`, `type`: string): Array = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array]
  }
}

