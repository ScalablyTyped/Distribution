package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameQuery extends BaseQueryWithFile {
  /** Specify the location of the variable. */
  var end: scala.Double | Position
  /** The new name of the variable */
  var newName: java.lang.String
  /** Specify the location of the variable. */
  var start: js.UndefOr[scala.Double | Position] = js.undefined
  /** Rename a variable in a scope-aware way. */
  @JSName("type")
  var type_RenameQuery: ternLib.ternLibStrings.rename
}

