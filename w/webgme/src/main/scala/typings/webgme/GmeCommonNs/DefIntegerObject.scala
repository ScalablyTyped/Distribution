package typings.webgme.GmeCommonNs

import typings.webgme.webgmeStrings.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefIntegerObject extends DefObject {
  var enum: js.UndefOr[js.Array[Double]] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var `type`: integer
}

object DefIntegerObject {
  @scala.inline
  def apply(`type`: integer, enum: js.Array[Double] = null, max: Int | Double = null, min: Int | Double = null): DefIntegerObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (enum != null) __obj.updateDynamic("enum")(enum)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefIntegerObject]
  }
}

