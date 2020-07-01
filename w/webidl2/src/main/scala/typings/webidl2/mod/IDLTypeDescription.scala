package typings.webidl2.mod

import typings.webidl2.webidl2Booleans.`false`
import typings.webidl2.webidl2Booleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.webidl2.mod.SingleTypeDescription
  - typings.webidl2.mod.UnionTypeDescription
*/
trait IDLTypeDescription extends js.Object

object IDLTypeDescription {
  @scala.inline
  def SingleTypeDescription(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: String,
    nullable: Boolean,
    sequence: Boolean,
    union: `false`,
    generic: String = null,
    `type`: String = null
  ): IDLTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], union = union.asInstanceOf[js.Any], generic = generic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDLTypeDescription]
  }
  @scala.inline
  def UnionTypeDescription(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Array[IDLTypeDescription],
    nullable: Boolean,
    sequence: Boolean,
    union: `true`,
    generic: String = null,
    `type`: String = null
  ): IDLTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], union = union.asInstanceOf[js.Any], generic = generic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDLTypeDescription]
  }
}

