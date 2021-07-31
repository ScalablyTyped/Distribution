package typings.vegaLite

import typings.std.Record
import typings.vegaLite.dataflowMod.DataFlowNode
import typings.vegaLite.dataflowMod.OutputNode
import typings.vegaLite.logicalMod.LogicalComposition
import typings.vegaLite.modelMod.Model
import typings.vegaLite.selectionMod.SelectionComponent
import typings.vegaLite.srcSelectionMod.SelectionDef
import typings.vegaLite.srcSelectionMod.SelectionExtent
import typings.vegaLite.srcSelectionMod.SelectionType
import typings.vegaLite.unitMod.UnitModel
import typings.vegaLite.utilMod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionParseMod {
  
  @JSImport("vega-lite/build/src/compile/selection/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def materializeSelections(model: UnitModel, main: OutputNode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("materializeSelections")(model.asInstanceOf[js.Any], main.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def parseSelectionBinExtent(selCmpt: SelectionComponent[SelectionType], extent: SelectionExtent): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSelectionBinExtent")(selCmpt.asInstanceOf[js.Any], extent.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def parseSelectionPredicate(model: Model, selections: LogicalComposition[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSelectionPredicate")(model.asInstanceOf[js.Any], selections.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def parseSelectionPredicate(model: Model, selections: LogicalComposition[String], dfnode: Unit, datum: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSelectionPredicate")(model.asInstanceOf[js.Any], selections.asInstanceOf[js.Any], dfnode.asInstanceOf[js.Any], datum.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def parseSelectionPredicate(model: Model, selections: LogicalComposition[String], dfnode: DataFlowNode): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSelectionPredicate")(model.asInstanceOf[js.Any], selections.asInstanceOf[js.Any], dfnode.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def parseSelectionPredicate(model: Model, selections: LogicalComposition[String], dfnode: DataFlowNode, datum: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSelectionPredicate")(model.asInstanceOf[js.Any], selections.asInstanceOf[js.Any], dfnode.asInstanceOf[js.Any], datum.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def parseUnitSelection(model: UnitModel, selDefs: Dict[SelectionDef]): Record[String, SelectionComponent[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseUnitSelection")(model.asInstanceOf[js.Any], selDefs.asInstanceOf[js.Any])).asInstanceOf[Record[String, SelectionComponent[js.Any]]]
}
