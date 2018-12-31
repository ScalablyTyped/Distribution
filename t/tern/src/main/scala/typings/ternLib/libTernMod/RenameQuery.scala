package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameQuery extends BaseQuery {
  /** Specify the location of the variable. */
  var end: scala.Double | Position
  /** may hold either a filename, or a string in the form "#N", where N should be an integer referring to one of the files included in the request */
  var file: java.lang.String
  /** The new name of the variable */
  var newName: java.lang.String
  /** Specify the location of the variable. */
  var start: js.UndefOr[scala.Double | Position] = js.undefined
  /** Rename a variable in a scope-aware way. */
  @JSName("type")
  var type_RenameQuery: ternLib.ternLibStrings.rename
}

