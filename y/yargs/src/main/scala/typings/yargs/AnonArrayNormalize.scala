package typings.yargs

import typings.yargs.yargsBooleans.`true`
import typings.yargs.yargsStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArrayNormalize extends js.Object {
  var normalize: `true`
  var `type`: array
}

object AnonArrayNormalize {
  @scala.inline
  def apply(normalize: `true`, `type`: array): AnonArrayNormalize = {
    val __obj = js.Dynamic.literal(normalize = normalize.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArrayNormalize]
  }
}

