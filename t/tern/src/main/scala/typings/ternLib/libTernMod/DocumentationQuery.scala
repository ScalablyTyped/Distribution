package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentationQuery extends BaseQuery {
  /** Specify the location of the expression. */
  var end: scala.Double | Position
  /** may hold either a filename, or a string in the form "#N", where N should be an integer referring to one of the files included in the request */
  var file: java.lang.String
  /** Specify the location of the expression. */
  var start: js.UndefOr[scala.Double | Position] = js.undefined
  /** Get the documentation string and URL for a given expression, if any. */
  @JSName("type")
  var type_DocumentationQuery: ternLib.ternLibStrings.documentation
}

