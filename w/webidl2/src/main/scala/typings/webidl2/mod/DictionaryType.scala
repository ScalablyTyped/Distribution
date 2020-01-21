package typings.webidl2.mod

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
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (inheritance != null) __obj.updateDynamic("inheritance")(inheritance.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictionaryType]
  }
}

