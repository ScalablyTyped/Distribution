package typings.vegaLite

import typings.vegaLite.binMod.BinParams
import typings.vegaLite.channelMod.Channel
import typings.vegaLite.channeldefMod.DatumDef
import typings.vegaLite.channeldefMod.PrimitiveValue
import typings.vegaLite.channeldefMod.TypedFieldDef
import typings.vegaLite.datetimeMod.DateTime
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.scaleMod.Scale
import typings.vegaLite.scaleMod.ScaleType
import typings.vegaLite.srcMarkMod.Mark
import typings.vegaLite.vegaLiteStrings.binned
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeMod {
  
  @JSImport("vega-lite/build/src/compile/scale/type", "scaleType")
  @js.native
  def scaleType(
    specifiedScale: Scale[ExprRef | SignalRef],
    channel: Channel,
    fieldDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef],
    mark: Mark
  ): ScaleType = js.native
  @JSImport("vega-lite/build/src/compile/scale/type", "scaleType")
  @js.native
  def scaleType_binned(
    specifiedScale: Scale[ExprRef | SignalRef],
    channel: Channel,
    fieldDef: TypedFieldDef[String, _, Boolean | BinParams | binned | Null],
    mark: Mark
  ): ScaleType = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.continuous
    - typings.vegaLite.vegaLiteStrings.discrete
    - typings.vegaLite.vegaLiteStrings.flexible
    - js.UndefOr[scala.Nothing]
  */
  type RangeType = js.UndefOr[_RangeType]
  
  trait _RangeType extends StObject
}
