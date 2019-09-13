package typings.webidl2.webidl2Mod

import typings.webidl2.webidl2Strings.dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictionaryType extends IDLRootType {
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttribute]
  /** A string indicating which dictionary is being inherited from, null otherwise. */
  var inheritance: String | Null
  /** An array of members (see below). */
  var members: js.Array[DictionaryMemberType]
  /** The dictionary name. */
  var name: String
  /** Boolean indicating whether it's a partial dictionary. */
  var partial: Boolean
  var `type`: dictionary
}

object DictionaryType {
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    members: js.Array[DictionaryMemberType],
    name: String,
    partial: Boolean,
    `type`: dictionary,
    inheritance: String = null
  ): DictionaryType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs, members = members, name = name, partial = partial)
    __obj.updateDynamic("type")(`type`)
    if (inheritance != null) __obj.updateDynamic("inheritance")(inheritance)
    __obj.asInstanceOf[DictionaryType]
  }
}

