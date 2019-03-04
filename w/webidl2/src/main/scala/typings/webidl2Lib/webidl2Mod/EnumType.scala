package typings
package webidl2Lib.webidl2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumType extends IDLRootType {
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttributes]
  /** The enum's name. */
  var name: java.lang.String
  var `type`: webidl2Lib.webidl2LibStrings.enum
  /** An array of values (strings). */
  var values: js.Array[webidl2Lib.Anon_String]
}

object EnumType {
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttributes],
    name: java.lang.String,
    `type`: webidl2Lib.webidl2LibStrings.enum,
    values: js.Array[webidl2Lib.Anon_String]
  ): EnumType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs, name = name, values = values)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EnumType]
  }
}

