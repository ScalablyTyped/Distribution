package typings.webidl2.mod

import typings.webidl2.webidl2Strings.field
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldType extends js.Object {
  /** A default value, absent if there is none. */
  var default: ValueDescription | Null = js.native
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttribute] = js.native
  /** An IDL Type describing what field's type. */
  var idlType: IDLTypeDescription = js.native
  /** The name of the field. */
  var name: String = js.native
  /** Boolean indicating whether this is a required field. */
  var required: Boolean = js.native
  var `type`: field = js.native
}

object FieldType {
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    name: String,
    required: Boolean,
    `type`: field
  ): FieldType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldType]
  }
  @scala.inline
  implicit class FieldTypeOps[Self <: FieldType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExtAttrsVarargs(value: ExtendedAttribute*): Self = this.set("extAttrs", js.Array(value :_*))
    @scala.inline
    def setExtAttrs(value: js.Array[ExtendedAttribute]): Self = this.set("extAttrs", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdlType(value: IDLTypeDescription): Self = this.set("idlType", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: field): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefault(value: ValueDescription): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultNull: Self = this.set("default", null)
  }
  
}

