package typings
package vegaDashLiteLib.buildSrcPredicateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionPredicate extends _Predicate {
  /**
    * Filter using a selection name.
    */
  var selection: vegaDashLiteLib.buildSrcLogicalMod.LogicalOperand[java.lang.String]
}

object SelectionPredicate {
  @scala.inline
  def apply(selection: vegaDashLiteLib.buildSrcLogicalMod.LogicalOperand[java.lang.String]): SelectionPredicate = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SelectionPredicate]
  }
}

