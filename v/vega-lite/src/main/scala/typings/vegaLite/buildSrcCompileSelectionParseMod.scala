package typings.vegaLite

import typings.vegaLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typings.vegaLite.buildSrcCompileDataDataflowMod.OutputNode
import typings.vegaLite.buildSrcCompileModelMod.Model
import typings.vegaLite.buildSrcCompileSelectionMod.SelectionComponent
import typings.vegaLite.buildSrcCompileUnitMod.UnitModel
import typings.vegaLite.buildSrcPredicateMod.ParameterPredicate
import typings.vegaLite.buildSrcSelectionMod.ParameterExtent
import typings.vegaLite.buildSrcSelectionMod.SelectionParameter
import typings.vegaLite.buildSrcSelectionMod.SelectionType
import typings.vegaLite.buildSrcUtilMod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileSelectionParseMod {
  
  @JSImport("vega-lite/build/src/compile/selection/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def materializeSelections(model: UnitModel, main: OutputNode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("materializeSelections")(model.asInstanceOf[js.Any], main.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parseSelectionExtent(model: Model, name: String, extent: ParameterExtent): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSelectionExtent")(model.asInstanceOf[js.Any], name.asInstanceOf[js.Any], extent.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def parseSelectionPredicate(model: Model, pred: ParameterPredicate): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSelectionPredicate")(model.asInstanceOf[js.Any], pred.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def parseSelectionPredicate(model: Model, pred: ParameterPredicate, dfnode: Unit, datum: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSelectionPredicate")(model.asInstanceOf[js.Any], pred.asInstanceOf[js.Any], dfnode.asInstanceOf[js.Any], datum.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def parseSelectionPredicate(model: Model, pred: ParameterPredicate, dfnode: DataFlowNode): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSelectionPredicate")(model.asInstanceOf[js.Any], pred.asInstanceOf[js.Any], dfnode.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def parseSelectionPredicate(model: Model, pred: ParameterPredicate, dfnode: DataFlowNode, datum: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSelectionPredicate")(model.asInstanceOf[js.Any], pred.asInstanceOf[js.Any], dfnode.asInstanceOf[js.Any], datum.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def parseUnitSelection(model: UnitModel, selDefs: js.Array[SelectionParameter[SelectionType]]): Dict[SelectionComponent[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseUnitSelection")(model.asInstanceOf[js.Any], selDefs.asInstanceOf[js.Any])).asInstanceOf[Dict[SelectionComponent[Any]]]
}
