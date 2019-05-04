package typings
package vegaDashLiteLib.buildSrcPredicateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/predicate", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def expression(
    model: vegaDashLiteLib.buildSrcCompileModelMod.Model,
    filterOp: vegaDashLiteLib.buildSrcLogicalMod.LogicalOperand[Predicate]
  ): java.lang.String = js.native
  def expression(
    model: vegaDashLiteLib.buildSrcCompileModelMod.Model,
    filterOp: vegaDashLiteLib.buildSrcLogicalMod.LogicalOperand[Predicate],
    node: vegaDashLiteLib.buildSrcCompileDataDataflowMod.DataFlowNode
  ): java.lang.String = js.native
  def fieldFilterExpression(predicate: FieldPredicate): java.lang.String = js.native
  def fieldFilterExpression(predicate: FieldPredicate, useInRange: scala.Boolean): java.lang.String = js.native
  def isFieldEqualPredicate(predicate: js.Any): /* is vega-lite.vega-lite/build/src/predicate.FieldEqualPredicate */ scala.Boolean = js.native
  def isFieldGTEPredicate(predicate: js.Any): /* is vega-lite.vega-lite/build/src/predicate.FieldGTEPredicate */ scala.Boolean = js.native
  def isFieldGTPredicate(predicate: js.Any): /* is vega-lite.vega-lite/build/src/predicate.FieldGTPredicate */ scala.Boolean = js.native
  def isFieldLTEPredicate(predicate: js.Any): /* is vega-lite.vega-lite/build/src/predicate.FieldLTEPredicate */ scala.Boolean = js.native
  def isFieldLTPredicate(predicate: js.Any): /* is vega-lite.vega-lite/build/src/predicate.FieldLTPredicate */ scala.Boolean = js.native
  def isFieldOneOfPredicate(predicate: js.Any): /* is vega-lite.vega-lite/build/src/predicate.FieldOneOfPredicate */ scala.Boolean = js.native
  def isFieldPredicate(predicate: Predicate): scala.Boolean = js.native
  def isFieldRangePredicate(predicate: js.Any): /* is vega-lite.vega-lite/build/src/predicate.FieldRangePredicate */ scala.Boolean = js.native
  def isSelectionPredicate(predicate: vegaDashLiteLib.buildSrcLogicalMod.LogicalOperand[Predicate]): /* is vega-lite.vega-lite/build/src/predicate.SelectionPredicate */ scala.Boolean = js.native
  def normalizePredicate(f: Predicate): Predicate = js.native
}

