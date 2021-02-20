package typings.vegaLite

import typings.std.Partial
import typings.std.ReturnType
import typings.vegaLite.anon.AxisConfigStyle
import typings.vegaLite.anon.ConfigFrom
import typings.vegaLite.channelMod.PositionScaleChannel
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.srcConfigMod.Config
import typings.vegaLite.srcConfigMod.StyleConfigIndex
import typings.vegaTypings.scaleMod.ScaleType
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @JSImport("vega-lite/build/src/compile/axis/config", "getAxisConfig")
  @js.native
  def getAxisConfig(
    property: /* keyof vega-lite.vega-lite/build/src/axis.AxisConfig<vega-typings.vega-typings/types/spec/signal.SignalRef> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 79 */ js.Any,
    styleConfigIndex: StyleConfigIndex[SignalRef],
    style: String
  ): ConfigFrom = js.native
  @JSImport("vega-lite/build/src/compile/axis/config", "getAxisConfig")
  @js.native
  def getAxisConfig(
    property: /* keyof vega-lite.vega-lite/build/src/axis.AxisConfig<vega-typings.vega-typings/types/spec/signal.SignalRef> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 79 */ js.Any,
    styleConfigIndex: StyleConfigIndex[SignalRef],
    style: String,
    axisConfigs: Partial[AxisConfigs]
  ): ConfigFrom = js.native
  @JSImport("vega-lite/build/src/compile/axis/config", "getAxisConfig")
  @js.native
  def getAxisConfig(
    property: /* keyof vega-lite.vega-lite/build/src/axis.AxisConfig<vega-typings.vega-typings/types/spec/signal.SignalRef> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 79 */ js.Any,
    styleConfigIndex: StyleConfigIndex[SignalRef],
    style: js.Array[String]
  ): ConfigFrom = js.native
  @JSImport("vega-lite/build/src/compile/axis/config", "getAxisConfig")
  @js.native
  def getAxisConfig(
    property: /* keyof vega-lite.vega-lite/build/src/axis.AxisConfig<vega-typings.vega-typings/types/spec/signal.SignalRef> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 79 */ js.Any,
    styleConfigIndex: StyleConfigIndex[SignalRef],
    style: js.Array[String],
    axisConfigs: Partial[AxisConfigs]
  ): ConfigFrom = js.native
  
  @JSImport("vega-lite/build/src/compile/axis/config", "getAxisConfigStyle")
  @js.native
  def getAxisConfigStyle(axisConfigTypes: js.Array[String], config: Config[ExprRef | SignalRef]): js.Any = js.native
  
  @JSImport("vega-lite/build/src/compile/axis/config", "getAxisConfigs")
  @js.native
  def getAxisConfigs(
    channel: PositionScaleChannel,
    scaleType: ScaleType,
    orient: String,
    config: Config[ExprRef | SignalRef]
  ): AxisConfigStyle = js.native
  @JSImport("vega-lite/build/src/compile/axis/config", "getAxisConfigs")
  @js.native
  def getAxisConfigs(
    channel: PositionScaleChannel,
    scaleType: ScaleType,
    orient: SignalRef,
    config: Config[ExprRef | SignalRef]
  ): AxisConfigStyle = js.native
  
  type AxisConfigs = ReturnType[
    js.Function4[
      /* channel */ PositionScaleChannel, 
      /* scaleType */ ScaleType, 
      /* orient */ String | SignalRef, 
      /* config */ Config[ExprRef | SignalRef], 
      AxisConfigStyle
    ]
  ]
}
