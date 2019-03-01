package typings
package webidl2Lib.webidl2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldType extends js.Object {
  /** A default value, absent if there is none. */
  var default: ValueDescription | scala.Null
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttributes]
  /** An IDL Type describing what field's type. */
  var idlType: IDLTypeDescription
  /** The name of the field. */
  var name: java.lang.String
  var `type`: webidl2Lib.webidl2LibStrings.field
}

object FieldType {
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttributes],
    idlType: IDLTypeDescription,
    name: java.lang.String,
    `type`: webidl2Lib.webidl2LibStrings.field,
    default: ValueDescription = null
  ): FieldType = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("extAttrs")(extAttrs)
    __obj.updateDynamic("idlType")(idlType)
    __obj.updateDynamic("name")(name)
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[FieldType]
  }
}

