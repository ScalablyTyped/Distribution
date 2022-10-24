package typings.vegaLite

import org.scalablytyped.runtime.StringDictionary
import typings.vegaLite.anon.DefaultPosVgChannel
import typings.vegaLite.anon.MidPointParamschannelxyra
import typings.vegaLite.anon.Model
import typings.vegaLite.buildSrcCompileUnitMod.UnitModel
import typings.vegaLite.buildSrcVegaDotschemaMod.VgValueRef
import typings.vegaLite.vegaLiteStrings.radius
import typings.vegaLite.vegaLiteStrings.theta
import typings.vegaLite.vegaLiteStrings.x
import typings.vegaLite.vegaLiteStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileMarkEncodePositionPointMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/position-point", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pointPosition(channel: x | y | theta | radius, model: UnitModel, param2: DefaultPosVgChannel): StringDictionary[VgValueRef | js.Array[VgValueRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointPosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[VgValueRef | js.Array[VgValueRef]]]
  
  inline def pointPositionDefaultRef(param0: Model): js.Function0[VgValueRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("pointPositionDefaultRef")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Function0[VgValueRef]]
  
  inline def positionRef(params: MidPointParamschannelxyra): VgValueRef | js.Array[VgValueRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("positionRef")(params.asInstanceOf[js.Any]).asInstanceOf[VgValueRef | js.Array[VgValueRef]]
}
