package typings.vegaDashLite.buildSrcPredicateMod

import typings.vegaDashLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typings.vegaDashLite.buildSrcCompileModelMod.Model
import typings.vegaDashLite.buildSrcLogicalMod.LogicalOperand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/predicate", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def expression(model: Model, filterOp: LogicalOperand[Predicate]): String = js.native
  def expression(model: Model, filterOp: LogicalOperand[Predicate], node: DataFlowNode): String = js.native
  def fieldFilterExpression(predicate: FieldPredicate): String = js.native
  def fieldFilterExpression(predicate: FieldPredicate, useInRange: Boolean): String = js.native
  def isFieldEqualPredicate(predicate: js.Any): /* is vega-lite.vega-lite/build/src/predicate.FieldEqualPredicate */ Boolean = js.native
  def isFieldGTEPredicate(predicate: js.Any): /* is vega-lite.vega-lite/build/src/predicate.FieldGTEPredicate */ Boolean = js.native
  def isFieldGTPredicate(predicate: js.Any): /* is vega-lite.vega-lite/build/src/predicate.FieldGTPredicate */ Boolean = js.native
  def isFieldLTEPredicate(predicate: js.Any): /* is vega-lite.vega-lite/build/src/predicate.FieldLTEPredicate */ Boolean = js.native
  def isFieldLTPredicate(predicate: js.Any): /* is vega-lite.vega-lite/build/src/predicate.FieldLTPredicate */ Boolean = js.native
  def isFieldOneOfPredicate(predicate: js.Any): /* is vega-lite.vega-lite/build/src/predicate.FieldOneOfPredicate */ Boolean = js.native
  def isFieldPredicate(predicate: Predicate): Boolean = js.native
  def isFieldRangePredicate(predicate: js.Any): /* is vega-lite.vega-lite/build/src/predicate.FieldRangePredicate */ Boolean = js.native
  def isSelectionPredicate(predicate: LogicalOperand[Predicate]): /* is vega-lite.vega-lite/build/src/predicate.SelectionPredicate */ Boolean = js.native
  def normalizePredicate(f: Predicate): Predicate = js.native
}

