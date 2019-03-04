package typings
package webidl2Lib.webidl2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictionaryMemberType extends FieldType {
  /** Boolean indicating whether this is a required field. */
  var required: scala.Boolean
}

object DictionaryMemberType {
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttributes],
    idlType: IDLTypeDescription,
    name: java.lang.String,
    required: scala.Boolean,
    `type`: webidl2Lib.webidl2LibStrings.field,
    default: ValueDescription = null
  ): DictionaryMemberType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs, idlType = idlType, name = name, required = required)
    __obj.updateDynamic("type")(`type`)
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[DictionaryMemberType]
  }
}

