package typings.webgme.GmeCommon

import typings.webgme.webgmeStrings.float
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefFloatObject extends DefObject {
  var enum: js.UndefOr[js.Array[Double]] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var `type`: float
}

object DefFloatObject {
  @scala.inline
  def apply(`type`: float, enum: js.Array[Double] = null, max: Int | Double = null, min: Int | Double = null): DefFloatObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (enum != null) __obj.updateDynamic("enum")(enum)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefFloatObject]
  }
}

