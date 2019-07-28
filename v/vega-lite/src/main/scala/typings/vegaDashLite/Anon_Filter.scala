package typings.vegaDashLite

import typings.vegaDashLite.buildSrcLogicalMod.LogicalOperand
import typings.vegaDashLite.buildSrcPredicateMod.Predicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filter extends js.Object {
  var filter: LogicalOperand[Predicate]
}

object Anon_Filter {
  @scala.inline
  def apply(filter: LogicalOperand[Predicate]): Anon_Filter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Filter]
  }
}

