package typings.webidl2.webidl2Mod

import typings.webidl2.webidl2Strings.typedef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypedefType extends IDLRootType {
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttribute]
  /** An IDL Type describing what typedef's type. */
  var idlType: IDLTypeDescription
  /** The typedef's name. */
  var name: String
  var `type`: typedef
}

object TypedefType {
  @scala.inline
  def apply(extAttrs: js.Array[ExtendedAttribute], idlType: IDLTypeDescription, name: String, `type`: typedef): TypedefType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs, idlType = idlType, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TypedefType]
  }
}

