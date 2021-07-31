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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeMod {
  
  @JSImport("vega-lite/build/src/compile/scale/type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def scaleType(
    specifiedScale: Scale[ExprRef | SignalRef],
    channel: Channel,
    fieldDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef],
    mark: Mark
  ): ScaleType = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleType")(specifiedScale.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], fieldDef.asInstanceOf[js.Any], mark.asInstanceOf[js.Any])).asInstanceOf[ScaleType]
  
  @scala.inline
  def scaleType_binned(
    specifiedScale: Scale[ExprRef | SignalRef],
    channel: Channel,
    fieldDef: TypedFieldDef[String, js.Any, Boolean | BinParams | binned | Null],
    mark: Mark
  ): ScaleType = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleType")(specifiedScale.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], fieldDef.asInstanceOf[js.Any], mark.asInstanceOf[js.Any])).asInstanceOf[ScaleType]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.continuous
    - typings.vegaLite.vegaLiteStrings.discrete
    - typings.vegaLite.vegaLiteStrings.flexible
    - scala.Unit
  */
  type RangeType = js.UndefOr[_RangeType]
  
  trait _RangeType extends StObject
}
