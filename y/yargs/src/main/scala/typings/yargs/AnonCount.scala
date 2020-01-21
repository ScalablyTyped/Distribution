package typings.yargs

import typings.yargs.yargsStrings.count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCount extends js.Object {
  var `type`: count
}

object AnonCount {
  @scala.inline
  def apply(`type`: count): AnonCount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCount]
  }
}

