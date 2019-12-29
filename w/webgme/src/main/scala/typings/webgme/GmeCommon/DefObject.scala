package typings.webgme.GmeCommon

import typings.webgme.webgmeStrings.asset
import typings.webgme.webgmeStrings.boolean
import typings.webgme.webgmeStrings.float
import typings.webgme.webgmeStrings.integer
import typings.webgme.webgmeStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.webgme.GmeCommon.DefStringObject
  - typings.webgme.GmeCommon.DefIntegerObject
  - typings.webgme.GmeCommon.DefFloatObject
  - typings.webgme.GmeCommon.DefBoolObject
  - typings.webgme.GmeCommon.DefAssetObject
*/
trait DefObject extends js.Object

object DefObject {
  @scala.inline
  def DefBoolObject(`type`: boolean): DefObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefObject]
  }
  @scala.inline
  def DefStringObject(`type`: string, enum: js.Array[String] = null, regex: String = null): DefObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefObject]
  }
  @scala.inline
  def DefAssetObject(`type`: asset): DefObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefObject]
  }
  @scala.inline
  def DefFloatObject(`type`: float, enum: js.Array[Double] = null, max: Int | Double = null, min: Int | Double = null): DefObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefObject]
  }
  @scala.inline
  def DefIntegerObject(`type`: integer, enum: js.Array[Double] = null, max: Int | Double = null, min: Int | Double = null): DefObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefObject]
  }
}

