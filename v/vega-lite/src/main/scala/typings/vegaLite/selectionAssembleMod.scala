package typings.vegaLite

import typings.vegaLite.compileFacetMod.FacetModel
import typings.vegaLite.layerMod.LayerModel
import typings.vegaLite.modelMod.Model
import typings.vegaLite.srcSelectionMod.SelectionExtent
import typings.vegaLite.srcSelectionMod.SelectionInit
import typings.vegaLite.srcSelectionMod.SelectionInitInterval
import typings.vegaLite.unitMod.UnitModel
import typings.vegaLite.vegaSchemaMod.VgData
import typings.vegaTypings.signalMod.Signal
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionAssembleMod {
  
  @JSImport("vega-lite/build/src/compile/selection/assemble", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def assembleFacetSignals(model: FacetModel, signals: js.Array[Signal]): js.Array[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleFacetSignals")(model.asInstanceOf[js.Any], signals.asInstanceOf[js.Any])).asInstanceOf[js.Array[Signal]]
  
  @scala.inline
  def assembleInit(init: js.Array[SelectionInit | js.Array[SelectionInit] | SelectionInitInterval]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleInit")(init.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def assembleInit(init: js.Array[SelectionInit | js.Array[SelectionInit] | SelectionInitInterval], isExpr: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleInit")(init.asInstanceOf[js.Any], isExpr.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def assembleInit(
    init: js.Array[SelectionInit | js.Array[SelectionInit] | SelectionInitInterval],
    isExpr: Boolean,
    wrap: js.Function1[/* str */ String | Double, String | Double]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleInit")(init.asInstanceOf[js.Any], isExpr.asInstanceOf[js.Any], wrap.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def assembleInit(
    init: js.Array[SelectionInit | js.Array[SelectionInit] | SelectionInitInterval],
    isExpr: Unit,
    wrap: js.Function1[/* str */ String | Double, String | Double]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleInit")(init.asInstanceOf[js.Any], isExpr.asInstanceOf[js.Any], wrap.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def assembleInit(init: SelectionInit): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleInit")(init.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def assembleInit(init: SelectionInit, isExpr: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleInit")(init.asInstanceOf[js.Any], isExpr.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def assembleInit(
    init: SelectionInit,
    isExpr: Boolean,
    wrap: js.Function1[/* str */ String | Double, String | Double]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleInit")(init.asInstanceOf[js.Any], isExpr.asInstanceOf[js.Any], wrap.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def assembleInit(init: SelectionInit, isExpr: Unit, wrap: js.Function1[/* str */ String | Double, String | Double]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleInit")(init.asInstanceOf[js.Any], isExpr.asInstanceOf[js.Any], wrap.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def assembleLayerSelectionMarks(model: LayerModel, marks: js.Array[js.Any]): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleLayerSelectionMarks")(model.asInstanceOf[js.Any], marks.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def assembleSelectionScaleDomain(model: Model, extent: SelectionExtent): SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleSelectionScaleDomain")(model.asInstanceOf[js.Any], extent.asInstanceOf[js.Any])).asInstanceOf[SignalRef]
  
  @scala.inline
  def assembleTopLevelSignals(model: UnitModel, signals: js.Array[Signal]): js.Array[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleTopLevelSignals")(model.asInstanceOf[js.Any], signals.asInstanceOf[js.Any])).asInstanceOf[js.Array[Signal]]
  
  @scala.inline
  def assembleUnitSelectionData(model: UnitModel, data: js.Array[VgData]): js.Array[VgData] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleUnitSelectionData")(model.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Array[VgData]]
  
  @scala.inline
  def assembleUnitSelectionMarks(model: UnitModel, marks: js.Array[js.Any]): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleUnitSelectionMarks")(model.asInstanceOf[js.Any], marks.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def assembleUnitSelectionSignals(model: UnitModel, signals: js.Array[Signal]): js.Array[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleUnitSelectionSignals")(model.asInstanceOf[js.Any], signals.asInstanceOf[js.Any])).asInstanceOf[js.Array[Signal]]
}
