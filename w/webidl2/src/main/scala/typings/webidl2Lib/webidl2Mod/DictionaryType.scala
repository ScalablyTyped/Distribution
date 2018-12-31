package typings
package webidl2Lib.webidl2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictionaryType extends js.Object {
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

