package typings.vegaLite

import org.scalablytyped.runtime.StringDictionary
import typings.vegaLite.anon.DefaultPos2
import typings.vegaLite.anon.DefaultPosDefaultPos2
import typings.vegaLite.anon.MidPointParamschannelx2y2
import typings.vegaLite.unitMod.UnitModel
import typings.vegaLite.vegaLiteStrings.radius
import typings.vegaLite.vegaLiteStrings.theta
import typings.vegaLite.vegaLiteStrings.x
import typings.vegaLite.vegaLiteStrings.y
import typings.vegaLite.vegaSchemaMod.VgEncodeEntry
import typings.vegaLite.vegaSchemaMod.VgValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object positionRangeMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/position-range", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def pointOrRangePosition_x(channel: x, model: UnitModel, hasDefaultPosDefaultPos2Range: DefaultPos2): StringDictionary[VgValueRef | js.Array[VgValueRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointOrRangePosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], hasDefaultPosDefaultPos2Range.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[VgValueRef | js.Array[VgValueRef]]]
  
  @scala.inline
  def pointOrRangePosition_y(channel: y, model: UnitModel, hasDefaultPosDefaultPos2Range: DefaultPos2): StringDictionary[VgValueRef | js.Array[VgValueRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointOrRangePosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], hasDefaultPosDefaultPos2Range.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[VgValueRef | js.Array[VgValueRef]]]
  
  @scala.inline
  def position2Ref(
    hasChannelChannelDefChannel2DefMarkDefConfigScaleNameScaleStackOffsetDefaultRef: MidPointParamschannelx2y2
  ): VgValueRef | js.Array[VgValueRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("position2Ref")(hasChannelChannelDefChannel2DefMarkDefConfigScaleNameScaleStackOffsetDefaultRef.asInstanceOf[js.Any]).asInstanceOf[VgValueRef | js.Array[VgValueRef]]
  
  @scala.inline
  def rangePosition_radius(channel: radius, model: UnitModel, hasDefaultPosDefaultPos2: DefaultPosDefaultPos2): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("rangePosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], hasDefaultPosDefaultPos2.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  
  @scala.inline
  def rangePosition_theta(channel: theta, model: UnitModel, hasDefaultPosDefaultPos2: DefaultPosDefaultPos2): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("rangePosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], hasDefaultPosDefaultPos2.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  
  @scala.inline
  def rangePosition_x(channel: x, model: UnitModel, hasDefaultPosDefaultPos2: DefaultPosDefaultPos2): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("rangePosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], hasDefaultPosDefaultPos2.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  
  @scala.inline
  def rangePosition_y(channel: y, model: UnitModel, hasDefaultPosDefaultPos2: DefaultPosDefaultPos2): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("rangePosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], hasDefaultPosDefaultPos2.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
}
