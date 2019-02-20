package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefsQuery extends BaseQueryWithFile {
  /** Specify the location of the expression. */
  var end: scala.Double | Position
  /** Specify the location of the expression. */
  var start: js.UndefOr[scala.Double | Position] = js.undefined
  /** Used to find all references to a given variable or property. */
  @JSName("type")
  var type_RefsQuery: ternLib.ternLibStrings.refs
}

