package typings.webidl2.mod

import typings.webidl2.webidl2Booleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleTypeDescription extends IDLTypeDescription {
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttribute] = js.native
  /** String indicating the generic type (e.g. "Promise", "sequence"). null otherwise. */
  var generic: String | Null = js.native
  /**
    * In most cases, this will just be a string with the type name.
    * If the type is a union, then this contains an array of the types it unites.
    * If it is a generic type, it contains the IDL type description for the type in the sequence,
    * the eventual value of the promise, etc.
    */
  var idlType: String = js.native
  /** Boolean indicating whether this is nullable or not. */
  var nullable: Boolean = js.native
  /** Boolean indicating if it is a sequence. Same as generic === "sequence" */
  var sequence: Boolean = js.native
  /** String indicating where this type is used. Can be null if not applicable. */
  var `type`: String | Null = js.native
  /** Boolean indicating whether this is a union type or not. */
  var union: `false` = js.native
}

object SingleTypeDescription {
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: String,
    nullable: Boolean,
    sequence: Boolean,
    union: `false`
  ): SingleTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], union = union.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleTypeDescription]
  }
  @scala.inline
  implicit class SingleTypeDescriptionOps[Self <: SingleTypeDescription] (val x: Self) extends AnyVal {
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
    def setIdlType(value: String): Self = this.set("idlType", value.asInstanceOf[js.Any])
    @scala.inline
    def setNullable(value: Boolean): Self = this.set("nullable", value.asInstanceOf[js.Any])
    @scala.inline
    def setSequence(value: Boolean): Self = this.set("sequence", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnion(value: `false`): Self = this.set("union", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeneric(value: String): Self = this.set("generic", value.asInstanceOf[js.Any])
    @scala.inline
    def setGenericNull: Self = this.set("generic", null)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
  }
  
}

