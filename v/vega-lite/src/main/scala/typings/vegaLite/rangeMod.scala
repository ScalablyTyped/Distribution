package typings.vegaLite

import typings.vegaLite.channelMod.ScaleChannel
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.scaleMod.Domain
import typings.vegaLite.splitMod.Explicit
import typings.vegaLite.srcConfigMod.Config
import typings.vegaLite.unitMod.UnitModel
import typings.vegaLite.vegaLiteStrings.`type`
import typings.vegaLite.vegaLiteStrings.align
import typings.vegaLite.vegaLiteStrings.base
import typings.vegaLite.vegaLiteStrings.bins
import typings.vegaLite.vegaLiteStrings.clamp
import typings.vegaLite.vegaLiteStrings.constant
import typings.vegaLite.vegaLiteStrings.domain
import typings.vegaLite.vegaLiteStrings.domainMax
import typings.vegaLite.vegaLiteStrings.domainMid
import typings.vegaLite.vegaLiteStrings.domainMin
import typings.vegaLite.vegaLiteStrings.exponent
import typings.vegaLite.vegaLiteStrings.interpolate
import typings.vegaLite.vegaLiteStrings.nice
import typings.vegaLite.vegaLiteStrings.padding
import typings.vegaLite.vegaLiteStrings.paddingInner
import typings.vegaLite.vegaLiteStrings.paddingOuter
import typings.vegaLite.vegaLiteStrings.quantile
import typings.vegaLite.vegaLiteStrings.quantize
import typings.vegaLite.vegaLiteStrings.range
import typings.vegaLite.vegaLiteStrings.rangeMax
import typings.vegaLite.vegaLiteStrings.rangeMin
import typings.vegaLite.vegaLiteStrings.reverse
import typings.vegaLite.vegaLiteStrings.round
import typings.vegaLite.vegaLiteStrings.scheme
import typings.vegaLite.vegaLiteStrings.threshold
import typings.vegaLite.vegaLiteStrings.zero
import typings.vegaLite.vegaSchemaMod.VgRange
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeMod {
  
  @JSImport("vega-lite/build/src/compile/scale/range", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/range", "MAX_SIZE_RANGE_STEP_RATIO")
  @js.native
  val MAX_SIZE_RANGE_STEP_RATIO: /* 0.95 */ Double = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/range", "RANGE_PROPERTIES")
  @js.native
  val RANGE_PROPERTIES: js.Array[
    /* keyof vega-lite.vega-lite/build/src/scale.Scale<vega-lite.vega-lite/build/src/expr.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef> */ `type` | domain | domainMid | domainMax | domainMin | reverse | range | rangeMax | rangeMin | scheme | align | bins | round | padding | paddingInner | paddingOuter | clamp | nice | base | exponent | constant | zero | interpolate
  ] = js.native
  
  @scala.inline
  def defaultContinuousToDiscreteCount_quantile(scaleType: quantile, config: Config[ExprRef | SignalRef], domain: Domain, channel: ScaleChannel): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultContinuousToDiscreteCount")(scaleType.asInstanceOf[js.Any], config.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def defaultContinuousToDiscreteCount_quantize(scaleType: quantize, config: Config[ExprRef | SignalRef], domain: Domain, channel: ScaleChannel): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultContinuousToDiscreteCount")(scaleType.asInstanceOf[js.Any], config.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def defaultContinuousToDiscreteCount_threshold(scaleType: threshold, config: Config[ExprRef | SignalRef], domain: Domain, channel: ScaleChannel): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultContinuousToDiscreteCount")(scaleType.asInstanceOf[js.Any], config.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def interpolateRange(rangeMin: Double, rangeMax: Double, cardinality: Double): SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateRange")(rangeMin.asInstanceOf[js.Any], rangeMax.asInstanceOf[js.Any], cardinality.asInstanceOf[js.Any])).asInstanceOf[SignalRef]
  @scala.inline
  def interpolateRange(rangeMin: Double, rangeMax: SignalRef, cardinality: Double): SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateRange")(rangeMin.asInstanceOf[js.Any], rangeMax.asInstanceOf[js.Any], cardinality.asInstanceOf[js.Any])).asInstanceOf[SignalRef]
  @scala.inline
  def interpolateRange(rangeMin: SignalRef, rangeMax: Double, cardinality: Double): SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateRange")(rangeMin.asInstanceOf[js.Any], rangeMax.asInstanceOf[js.Any], cardinality.asInstanceOf[js.Any])).asInstanceOf[SignalRef]
  @scala.inline
  def interpolateRange(rangeMin: SignalRef, rangeMax: SignalRef, cardinality: Double): SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateRange")(rangeMin.asInstanceOf[js.Any], rangeMax.asInstanceOf[js.Any], cardinality.asInstanceOf[js.Any])).asInstanceOf[SignalRef]
  
  @scala.inline
  def parseRangeForChannel(channel: ScaleChannel, model: UnitModel): Explicit[VgRange] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRangeForChannel")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[Explicit[VgRange]]
  
  @scala.inline
  def parseUnitScaleRange(model: UnitModel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUnitScaleRange")(model.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
