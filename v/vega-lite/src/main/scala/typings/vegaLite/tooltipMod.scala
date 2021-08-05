package typings.vegaLite

import typings.vegaLite.anon.PartialRecordVgEncodeChan
import typings.vegaLite.anon.ReactiveGeom
import typings.vegaLite.anon.Signal
import typings.vegaLite.anon.Tooltip
import typings.vegaLite.encodingMod.Encoding
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.srcConfigMod.Config
import typings.vegaLite.srcStackMod.StackProperties
import typings.vegaLite.unitMod.UnitModel
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/tooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tooltip(model: UnitModel): PartialRecordVgEncodeChan | Tooltip = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(model.asInstanceOf[js.Any]).asInstanceOf[PartialRecordVgEncodeChan | Tooltip]
  inline def tooltip(model: UnitModel, opt: ReactiveGeom): PartialRecordVgEncodeChan | Tooltip = (^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(model.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[PartialRecordVgEncodeChan | Tooltip]
  
  inline def tooltipData(encoding: Encoding[String], stack: StackProperties, config: Config[ExprRef | SignalRef]): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("tooltipData")(encoding.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def tooltipData(
    encoding: Encoding[String],
    stack: StackProperties,
    config: Config[ExprRef | SignalRef],
    hasReactiveGeom: ReactiveGeom
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("tooltipData")(encoding.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], config.asInstanceOf[js.Any], hasReactiveGeom.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def tooltipRefForEncoding(encoding: Encoding[String], stack: StackProperties, config: Config[ExprRef | SignalRef]): Signal = (^.asInstanceOf[js.Dynamic].applyDynamic("tooltipRefForEncoding")(encoding.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Signal]
  inline def tooltipRefForEncoding(
    encoding: Encoding[String],
    stack: StackProperties,
    config: Config[ExprRef | SignalRef],
    hasReactiveGeom: ReactiveGeom
  ): Signal = (^.asInstanceOf[js.Dynamic].applyDynamic("tooltipRefForEncoding")(encoding.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], config.asInstanceOf[js.Any], hasReactiveGeom.asInstanceOf[js.Any])).asInstanceOf[Signal]
}
