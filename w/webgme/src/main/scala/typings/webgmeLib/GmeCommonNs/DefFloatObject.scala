package typings
package webgmeLib.GmeCommonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefFloatObject extends DefObject {
  var enum: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var `type`: webgmeLib.webgmeLibStrings.float
}

object DefFloatObject {
  @scala.inline
  def apply(
    `type`: webgmeLib.webgmeLibStrings.float,
    enum: js.Array[scala.Double] = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null
  ): DefFloatObject = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (enum != null) __obj.updateDynamic("enum")(enum)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefFloatObject]
  }
}

