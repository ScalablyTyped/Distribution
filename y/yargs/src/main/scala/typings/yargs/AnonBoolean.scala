package typings.yargs

import typings.yargs.yargsStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBoolean extends js.Object {
  var `type`: boolean
}

object AnonBoolean {
  @scala.inline
  def apply(`type`: boolean): AnonBoolean = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBoolean]
  }
}

