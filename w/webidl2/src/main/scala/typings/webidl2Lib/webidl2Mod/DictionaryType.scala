package typings
package webidl2Lib.webidl2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictionaryType extends IDLRootType {
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttributes]
  /** A string indicating which dictionary is being inherited from, null otherwise. */
  var inheritance: java.lang.String | scala.Null
  /** An array of members (see below). */
  var members: js.Array[DictionaryMemberType]
  /** The dictionary name. */
  var name: java.lang.String
  /** Boolean indicating whether it's a partial dictionary. */
  var partial: scala.Boolean
  var `type`: webidl2Lib.webidl2LibStrings.dictionary
}

object DictionaryType {
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttributes],
    members: js.Array[DictionaryMemberType],
    name: java.lang.String,
    partial: scala.Boolean,
    `type`: webidl2Lib.webidl2LibStrings.dictionary,
    inheritance: java.lang.String = null
  ): DictionaryType = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("extAttrs")(extAttrs)
    __obj.updateDynamic("members")(members)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("partial")(partial)
    if (inheritance != null) __obj.updateDynamic("inheritance")(inheritance)
    __obj.asInstanceOf[DictionaryType]
  }
}

