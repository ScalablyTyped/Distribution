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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @JSImport("vega-lite/build/src/compile/axis/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getAxisConfig(
    property: /* keyof vega-lite.vega-lite/build/src/axis.AxisConfig<vega-typings.vega-typings/types/spec/signal.SignalRef> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 79 */ js.Any,
    styleConfigIndex: StyleConfigIndex[SignalRef],
    style: String
  ): ConfigFrom = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisConfig")(property.asInstanceOf[js.Any], styleConfigIndex.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[ConfigFrom]
  @scala.inline
  def getAxisConfig(
    property: /* keyof vega-lite.vega-lite/build/src/axis.AxisConfig<vega-typings.vega-typings/types/spec/signal.SignalRef> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 79 */ js.Any,
    styleConfigIndex: StyleConfigIndex[SignalRef],
    style: String,
    axisConfigs: Partial[AxisConfigs]
  ): ConfigFrom = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisConfig")(property.asInstanceOf[js.Any], styleConfigIndex.asInstanceOf[js.Any], style.asInstanceOf[js.Any], axisConfigs.asInstanceOf[js.Any])).asInstanceOf[ConfigFrom]
  @scala.inline
  def getAxisConfig(
    property: /* keyof vega-lite.vega-lite/build/src/axis.AxisConfig<vega-typings.vega-typings/types/spec/signal.SignalRef> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 79 */ js.Any,
    styleConfigIndex: StyleConfigIndex[SignalRef],
    style: js.Array[String]
  ): ConfigFrom = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisConfig")(property.asInstanceOf[js.Any], styleConfigIndex.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[ConfigFrom]
  @scala.inline
  def getAxisConfig(
    property: /* keyof vega-lite.vega-lite/build/src/axis.AxisConfig<vega-typings.vega-typings/types/spec/signal.SignalRef> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 79 */ js.Any,
    styleConfigIndex: StyleConfigIndex[SignalRef],
    style: js.Array[String],
    axisConfigs: Partial[AxisConfigs]
  ): ConfigFrom = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisConfig")(property.asInstanceOf[js.Any], styleConfigIndex.asInstanceOf[js.Any], style.asInstanceOf[js.Any], axisConfigs.asInstanceOf[js.Any])).asInstanceOf[ConfigFrom]
  
  @scala.inline
  def getAxisConfigStyle(axisConfigTypes: js.Array[String], config: Config[ExprRef | SignalRef]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisConfigStyle")(axisConfigTypes.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def getAxisConfigs(
    channel: PositionScaleChannel,
    scaleType: ScaleType,
    orient: String,
    config: Config[ExprRef | SignalRef]
  ): AxisConfigStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisConfigs")(channel.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], orient.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[AxisConfigStyle]
  @scala.inline
  def getAxisConfigs(
    channel: PositionScaleChannel,
    scaleType: ScaleType,
    orient: SignalRef,
    config: Config[ExprRef | SignalRef]
  ): AxisConfigStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisConfigs")(channel.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], orient.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[AxisConfigStyle]
  
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
