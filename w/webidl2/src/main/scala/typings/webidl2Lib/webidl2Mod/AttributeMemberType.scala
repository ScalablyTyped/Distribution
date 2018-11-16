package typings
package webidl2Lib.webidl2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AttributeMemberType extends js.Object {
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttributes]
  /** An IDL Type for the attribute. */
  var idlType: IDLTypeDescription
  /** True if it's an inherit attribute. */
  var inherit: scala.Boolean
  /** The attribute's name. */
  var name: java.lang.String
  /** True if it's a read-only attribute. */
  var readonly: scala.Boolean
  /** True if it's a static attribute. */
  var static: scala.Boolean
  /** True if it's a stringifier attribute. */
  var stringifier: scala.Boolean
  var `type`: webidl2Lib.webidl2LibStrings.attribute
}

