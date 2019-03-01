package typings
package uuidDash1345Lib.uuidDash1345Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UUID extends js.Object {
  var variant: java.lang.String
  var version: java.lang.String
  def toBuffer(): nodeLib.Buffer
}

object UUID {
  @scala.inline
  def apply(
    toBuffer: js.Function0[nodeLib.Buffer],
    toString: js.Function0[java.lang.String],
    variant: java.lang.String,
    version: java.lang.String
  ): UUID = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toBuffer")(toBuffer)
    __obj.updateDynamic("toString")(toString)
    __obj.updateDynamic("variant")(variant)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[UUID]
  }
}

