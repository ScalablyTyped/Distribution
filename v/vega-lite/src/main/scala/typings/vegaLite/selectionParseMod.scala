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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionParseMod {
  
  @JSImport("vega-lite/build/src/compile/selection/parse", "materializeSelections")
  @js.native
  def materializeSelections(model: UnitModel, main: OutputNode): Unit = js.native
  
  @JSImport("vega-lite/build/src/compile/selection/parse", "parseSelectionBinExtent")
  @js.native
  def parseSelectionBinExtent(selCmpt: SelectionComponent[SelectionType], extent: SelectionExtent): String = js.native
  
  @JSImport("vega-lite/build/src/compile/selection/parse", "parseSelectionPredicate")
  @js.native
  def parseSelectionPredicate(model: Model, selections: LogicalComposition[String]): String = js.native
  @JSImport("vega-lite/build/src/compile/selection/parse", "parseSelectionPredicate")
  @js.native
  def parseSelectionPredicate(
    model: Model,
    selections: LogicalComposition[String],
    dfnode: js.UndefOr[scala.Nothing],
    datum: String
  ): String = js.native
  @JSImport("vega-lite/build/src/compile/selection/parse", "parseSelectionPredicate")
  @js.native
  def parseSelectionPredicate(model: Model, selections: LogicalComposition[String], dfnode: DataFlowNode): String = js.native
  @JSImport("vega-lite/build/src/compile/selection/parse", "parseSelectionPredicate")
  @js.native
  def parseSelectionPredicate(model: Model, selections: LogicalComposition[String], dfnode: DataFlowNode, datum: String): String = js.native
  
  @JSImport("vega-lite/build/src/compile/selection/parse", "parseUnitSelection")
  @js.native
  def parseUnitSelection(model: UnitModel, selDefs: Dict[SelectionDef]): Record[String, SelectionComponent[_]] = js.native
}
