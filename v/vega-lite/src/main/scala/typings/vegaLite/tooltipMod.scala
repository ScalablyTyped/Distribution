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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/tooltip", "tooltip")
  @js.native
  def tooltip(model: UnitModel): PartialRecordVgEncodeChan | Tooltip = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/tooltip", "tooltip")
  @js.native
  def tooltip(model: UnitModel, opt: ReactiveGeom): PartialRecordVgEncodeChan | Tooltip = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode/tooltip", "tooltipData")
  @js.native
  def tooltipData(encoding: Encoding[String], stack: StackProperties, config: Config[ExprRef | SignalRef]): js.Object = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/tooltip", "tooltipData")
  @js.native
  def tooltipData(
    encoding: Encoding[String],
    stack: StackProperties,
    config: Config[ExprRef | SignalRef],
    hasReactiveGeom: ReactiveGeom
  ): js.Object = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode/tooltip", "tooltipRefForEncoding")
  @js.native
  def tooltipRefForEncoding(encoding: Encoding[String], stack: StackProperties, config: Config[ExprRef | SignalRef]): Signal = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/tooltip", "tooltipRefForEncoding")
  @js.native
  def tooltipRefForEncoding(
    encoding: Encoding[String],
    stack: StackProperties,
    config: Config[ExprRef | SignalRef],
    hasReactiveGeom: ReactiveGeom
  ): Signal = js.native
}
