package typings.webidl2.webidl2Mod

import typings.webidl2.webidl2Strings.field
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldType extends js.Object {
  /** A default value, absent if there is none. */
  var default: ValueDescription | Null
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttribute]
  /** An IDL Type describing what field's type. */
  var idlType: IDLTypeDescription
  /** The name of the field. */
  var name: String
  var `type`: field
}

object FieldType {
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    name: String,
    `type`: field,
    default: ValueDescription = null
  ): FieldType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs, idlType = idlType, name = name)
    __obj.updateDynamic("type")(`type`)
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[FieldType]
  }
}

