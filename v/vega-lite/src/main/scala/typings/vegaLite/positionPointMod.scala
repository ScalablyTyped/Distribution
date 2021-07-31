package typings.vegaLite

import org.scalablytyped.runtime.StringDictionary
import typings.vegaLite.anon.DefaultPos
import typings.vegaLite.anon.MidPointParamschannelxyra
import typings.vegaLite.anon.Model
import typings.vegaLite.unitMod.UnitModel
import typings.vegaLite.vegaLiteStrings.radius
import typings.vegaLite.vegaLiteStrings.theta
import typings.vegaLite.vegaLiteStrings.x
import typings.vegaLite.vegaLiteStrings.y
import typings.vegaLite.vegaSchemaMod.VgValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object positionPointMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/position-point", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def pointPositionDefaultRef(hasModelDefaultPosChannelScaleNameScale: Model): js.Function0[VgValueRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("pointPositionDefaultRef")(hasModelDefaultPosChannelScaleNameScale.asInstanceOf[js.Any]).asInstanceOf[js.Function0[VgValueRef]]
  
  @scala.inline
  def pointPosition_radius(channel: radius, model: UnitModel, hasDefaultPosVgChannelIsMidPoint: DefaultPos): StringDictionary[VgValueRef | js.Array[VgValueRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointPosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], hasDefaultPosVgChannelIsMidPoint.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[VgValueRef | js.Array[VgValueRef]]]
  
  @scala.inline
  def pointPosition_theta(channel: theta, model: UnitModel, hasDefaultPosVgChannelIsMidPoint: DefaultPos): StringDictionary[VgValueRef | js.Array[VgValueRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointPosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], hasDefaultPosVgChannelIsMidPoint.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[VgValueRef | js.Array[VgValueRef]]]
  
  @scala.inline
  def pointPosition_x(channel: x, model: UnitModel, hasDefaultPosVgChannelIsMidPoint: DefaultPos): StringDictionary[VgValueRef | js.Array[VgValueRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointPosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], hasDefaultPosVgChannelIsMidPoint.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[VgValueRef | js.Array[VgValueRef]]]
  
  @scala.inline
  def pointPosition_y(channel: y, model: UnitModel, hasDefaultPosVgChannelIsMidPoint: DefaultPos): StringDictionary[VgValueRef | js.Array[VgValueRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointPosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], hasDefaultPosVgChannelIsMidPoint.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[VgValueRef | js.Array[VgValueRef]]]
  
  @scala.inline
  def positionRef(params: MidPointParamschannelxyra): VgValueRef | js.Array[VgValueRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("positionRef")(params.asInstanceOf[js.Any]).asInstanceOf[VgValueRef | js.Array[VgValueRef]]
}
