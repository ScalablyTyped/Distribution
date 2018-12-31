package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefinitionQuery extends BaseQuery {
  /** Specify the location of the expression. */
  var end: scala.Double | Position
  /** may hold either a filename, or a string in the form "#N", where N should be an integer referring to one of the files included in the request */
  var file: java.lang.String
  /** Specify the location of the expression. */
  var start: js.UndefOr[scala.Double | Position] = js.undefined
  /**
    * Asks for the definition of something. This will try, for a variable or property,
    * to return the point at which it was defined. If that fails, or the chosen
    * expression is not an identifier or property reference, it will try to return
    * the definition site of the type the expression has. If no type is found, or the
    * type is not an object or function (other types don’t store their definition site),
    * it will fail to return useful information.
    */
  @JSName("type")
  var type_DefinitionQuery: ternLib.ternLibStrings.definition
}

