package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentationQuery extends BaseQueryWithFile {
  /** Specify the location of the expression. */
  var end: scala.Double | Position
  /** Specify the location of the expression. */
  var start: js.UndefOr[scala.Double | Position] = js.undefined
  /** Get the documentation string and URL for a given expression, if any. */
  @JSName("type")
  var type_DocumentationQuery: ternLib.ternLibStrings.documentation
}

