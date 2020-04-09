package typings.webidl2.mod

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
  /** Boolean indicating whether this is a required field. */
  var required: Boolean
  var `type`: field
}

object FieldType {
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    name: String,
    required: Boolean,
    `type`: field,
    default: ValueDescription = null
  ): FieldType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldType]
  }
}

