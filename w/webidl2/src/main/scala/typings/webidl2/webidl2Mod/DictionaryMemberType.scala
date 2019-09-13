package typings.webidl2.webidl2Mod

import typings.webidl2.webidl2Strings.field
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictionaryMemberType extends FieldType {
  /** Boolean indicating whether this is a required field. */
  var required: Boolean
}

object DictionaryMemberType {
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    name: String,
    required: Boolean,
    `type`: field,
    default: ValueDescription = null
  ): DictionaryMemberType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs, idlType = idlType, name = name, required = required)
    __obj.updateDynamic("type")(`type`)
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[DictionaryMemberType]
  }
}

