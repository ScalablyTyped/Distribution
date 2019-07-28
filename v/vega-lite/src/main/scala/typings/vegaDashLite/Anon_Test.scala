package typings.vegaDashLite

import typings.vegaDashLite.buildSrcLogicalMod.LogicalOperand
import typings.vegaDashLite.buildSrcPredicateMod.Predicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Test extends js.Object {
  var test: LogicalOperand[Predicate]
}

object Anon_Test {
  @scala.inline
  def apply(test: LogicalOperand[Predicate]): Anon_Test = {
    val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Test]
  }
}

