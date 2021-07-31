package typings.vegaLite

import typings.vegaLite.dataflowMod.DataFlowNode
import typings.vegaLite.logicalMod.LogicalComposition
import typings.vegaLite.modelMod.Model
import typings.vegaLite.srcPredicateMod.Predicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object predicateMod {
  
  @JSImport("vega-lite/build/src/compile/predicate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def expression(model: Model, filterOp: LogicalComposition[Predicate]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("expression")(model.asInstanceOf[js.Any], filterOp.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def expression(model: Model, filterOp: LogicalComposition[Predicate], node: DataFlowNode): String = (^.asInstanceOf[js.Dynamic].applyDynamic("expression")(model.asInstanceOf[js.Any], filterOp.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[String]
}
