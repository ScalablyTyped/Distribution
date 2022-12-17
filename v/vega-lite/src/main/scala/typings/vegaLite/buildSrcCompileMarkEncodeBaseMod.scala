package typings.vegaLite

import org.scalablytyped.runtime.StringDictionary
import typings.vegaLite.anon.AriaRoleDescription
import typings.vegaLite.anon.Clip
import typings.vegaLite.anon.CornerRadius
import typings.vegaLite.anon.CornerRadiusBottomLeft
import typings.vegaLite.anon.CornerRadiusBottomRight
import typings.vegaLite.anon.CornerRadiusTopLeft
import typings.vegaLite.anon.CornerRadiusTopRight
import typings.vegaLite.anon.Cursor
import typings.vegaLite.anon.DefaultPos
import typings.vegaLite.anon.DefaultPos2
import typings.vegaLite.anon.DefaultPosDefaultPos2
import typings.vegaLite.anon.DefaultRef
import typings.vegaLite.anon.Filled
import typings.vegaLite.anon.PartialRecordVgEncodeChan
import typings.vegaLite.anon.ReactiveGeom
import typings.vegaLite.anon.Tooltip
import typings.vegaLite.buildSrcChannelMod.NonPositionScaleChannel
import typings.vegaLite.buildSrcChanneldefMod.ChannelDef
import typings.vegaLite.buildSrcCompileUnitMod.UnitModel
import typings.vegaLite.buildSrcGuideMod.GuideEncodingConditionalValueDef
import typings.vegaLite.buildSrcVegaDotschemaMod.VgEncodeEntry
import typings.vegaLite.buildSrcVegaDotschemaMod.VgValueRef
import typings.vegaLite.vegaLiteStrings.description
import typings.vegaLite.vegaLiteStrings.href
import typings.vegaLite.vegaLiteStrings.ignore
import typings.vegaLite.vegaLiteStrings.include
import typings.vegaLite.vegaLiteStrings.radius
import typings.vegaLite.vegaLiteStrings.theta
import typings.vegaLite.vegaLiteStrings.url
import typings.vegaLite.vegaLiteStrings.x
import typings.vegaLite.vegaLiteStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileMarkEncodeBaseMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def baseEncodeEntry(model: UnitModel, ignore: Ignore): AriaRoleDescription | CornerRadius | Clip | CornerRadiusBottomLeft | CornerRadiusBottomRight | CornerRadiusTopLeft | CornerRadiusTopRight | Cursor = (^.asInstanceOf[js.Dynamic].applyDynamic("baseEncodeEntry")(model.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[AriaRoleDescription | CornerRadius | Clip | CornerRadiusBottomLeft | CornerRadiusBottomRight | CornerRadiusTopLeft | CornerRadiusTopRight | Cursor]
  
  inline def color(model: UnitModel): VgEncodeEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(model.asInstanceOf[js.Any]).asInstanceOf[VgEncodeEntry]
  inline def color(model: UnitModel, opt: Filled): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("color")(model.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  
  inline def nonPosition(channel: NonPositionScaleChannel, model: UnitModel): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("nonPosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  inline def nonPosition(channel: NonPositionScaleChannel, model: UnitModel, opt: DefaultRef): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("nonPosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  
  inline def pointOrRangePosition(channel: x | y, model: UnitModel, param2: DefaultPos2): StringDictionary[VgValueRef | js.Array[VgValueRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointOrRangePosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[VgValueRef | js.Array[VgValueRef]]]
  
  inline def pointPosition(channel: x | y | theta | radius, model: UnitModel, param2: DefaultPos): StringDictionary[VgValueRef | js.Array[VgValueRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointPosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[VgValueRef | js.Array[VgValueRef]]]
  
  inline def rangePosition(channel: x | y | theta | radius, model: UnitModel, param2: DefaultPosDefaultPos2): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("rangePosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  
  inline def rectPosition(model: UnitModel, channel: x | y | theta | radius): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("rectPosition")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  
  inline def text(model: UnitModel): PartialRecordVgEncodeChan = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(model.asInstanceOf[js.Any]).asInstanceOf[PartialRecordVgEncodeChan]
  inline def text(model: UnitModel, channel: typings.vegaLite.vegaLiteStrings.text | href | url | description): PartialRecordVgEncodeChan = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[PartialRecordVgEncodeChan]
  
  inline def tooltip(model: UnitModel): PartialRecordVgEncodeChan | Tooltip = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(model.asInstanceOf[js.Any]).asInstanceOf[PartialRecordVgEncodeChan | Tooltip]
  inline def tooltip(model: UnitModel, opt: ReactiveGeom): PartialRecordVgEncodeChan | Tooltip = (^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(model.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[PartialRecordVgEncodeChan | Tooltip]
  
  inline def wrapCondition[CD /* <: ChannelDef[String] | GuideEncodingConditionalValueDef */](
    model: UnitModel,
    channelDef: CD,
    vgChannel: String,
    refFn: js.Function1[/* cDef */ CD, VgValueRef]
  ): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapCondition")(model.asInstanceOf[js.Any], channelDef.asInstanceOf[js.Any], vgChannel.asInstanceOf[js.Any], refFn.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  
  /* Inlined std.Record<'color' | 'size' | 'orient' | 'align' | 'baseline' | 'theta', 'ignore' | 'include'> */
  trait Ignore extends StObject {
    
    var align: ignore | include
    
    var baseline: ignore | include
    
    var color: ignore | include
    
    var orient: ignore | include
    
    var size: ignore | include
    
    var theta: ignore | include
  }
  object Ignore {
    
    inline def apply(
      align: ignore | include,
      baseline: ignore | include,
      color: ignore | include,
      orient: ignore | include,
      size: ignore | include,
      theta: ignore | include
    ): Ignore = {
      val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], baseline = baseline.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], orient = orient.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], theta = theta.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ignore]
    }
    
    extension [Self <: Ignore](x: Self) {
      
      inline def setAlign(value: ignore | include): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setBaseline(value: ignore | include): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
      
      inline def setColor(value: ignore | include): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setOrient(value: ignore | include): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      inline def setSize(value: ignore | include): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTheta(value: ignore | include): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
    }
  }
}
