package typings
package webidl2Lib.webidl2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypedefType extends js.Object {
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttributes]
  /** An IDL Type describing what typedef's type. */
  var idlType: IDLTypeDescription
  /** The typedef's name. */
  var name: java.lang.String
  var `type`: webidl2Lib.webidl2LibStrings.typedef
}

