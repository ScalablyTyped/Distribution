package typings.yargs

import typings.yargs.yargsStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArrayType extends js.Object {
  var `type`: array
}

object AnonArrayType {
  @scala.inline
  def apply(`type`: array): AnonArrayType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArrayType]
  }
}

