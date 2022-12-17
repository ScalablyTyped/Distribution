package typings.vegaLite

import org.scalablytyped.runtime.StringDictionary
import typings.vegaLite.anon.DefaultPos2
import typings.vegaLite.anon.DefaultPosDefaultPos2
import typings.vegaLite.anon.MidPointParamschannelx2y2
import typings.vegaLite.buildSrcCompileUnitMod.UnitModel
import typings.vegaLite.buildSrcVegaDotschemaMod.VgEncodeEntry
import typings.vegaLite.buildSrcVegaDotschemaMod.VgValueRef
import typings.vegaLite.vegaLiteStrings.radius
import typings.vegaLite.vegaLiteStrings.theta
import typings.vegaLite.vegaLiteStrings.x
import typings.vegaLite.vegaLiteStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileMarkEncodePositionRangeMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/position-range", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pointOrRangePosition(channel: x | y, model: UnitModel, param2: DefaultPos2): StringDictionary[VgValueRef | js.Array[VgValueRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointOrRangePosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[VgValueRef | js.Array[VgValueRef]]]
  
  inline def position2Ref(param0: MidPointParamschannelx2y2): VgValueRef | js.Array[VgValueRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("position2Ref")(param0.asInstanceOf[js.Any]).asInstanceOf[VgValueRef | js.Array[VgValueRef]]
  
  inline def rangePosition(channel: x | y | theta | radius, model: UnitModel, param2: DefaultPosDefaultPos2): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("rangePosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
}
