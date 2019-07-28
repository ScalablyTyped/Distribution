package typings.vegaDashLite.buildSrcPredicateMod

import typings.vegaDashLite.buildSrcLogicalMod.LogicalOperand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionPredicate extends _Predicate {
  /**
    * Filter using a selection name.
    */
  var selection: LogicalOperand[String]
}

object SelectionPredicate {
  @scala.inline
  def apply(selection: LogicalOperand[String]): SelectionPredicate = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SelectionPredicate]
  }
}

