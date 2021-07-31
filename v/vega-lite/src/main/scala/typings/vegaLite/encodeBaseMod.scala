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
import typings.vegaLite.channelMod.NonPositionScaleChannel
import typings.vegaLite.channeldefMod.ChannelDef
import typings.vegaLite.srcGuideMod.GuideEncodingConditionalValueDef
import typings.vegaLite.unitMod.UnitModel
import typings.vegaLite.vegaLiteStrings.arc
import typings.vegaLite.vegaLiteStrings.bar
import typings.vegaLite.vegaLiteStrings.description
import typings.vegaLite.vegaLiteStrings.href
import typings.vegaLite.vegaLiteStrings.ignore
import typings.vegaLite.vegaLiteStrings.image
import typings.vegaLite.vegaLiteStrings.include
import typings.vegaLite.vegaLiteStrings.radius
import typings.vegaLite.vegaLiteStrings.rect
import typings.vegaLite.vegaLiteStrings.text
import typings.vegaLite.vegaLiteStrings.theta
import typings.vegaLite.vegaLiteStrings.url
import typings.vegaLite.vegaLiteStrings.x
import typings.vegaLite.vegaLiteStrings.y
import typings.vegaLite.vegaSchemaMod.VgEncodeEntry
import typings.vegaLite.vegaSchemaMod.VgValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encodeBaseMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def baseEncodeEntry(model: UnitModel, ignore: Ignore): AriaRoleDescription | CornerRadius | Clip | CornerRadiusBottomLeft | CornerRadiusBottomRight | CornerRadiusTopLeft | CornerRadiusTopRight | Cursor = (^.asInstanceOf[js.Dynamic].applyDynamic("baseEncodeEntry")(model.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[AriaRoleDescription | CornerRadius | Clip | CornerRadiusBottomLeft | CornerRadiusBottomRight | CornerRadiusTopLeft | CornerRadiusTopRight | Cursor]
  
  @scala.inline
  def color(model: UnitModel): VgEncodeEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(model.asInstanceOf[js.Any]).asInstanceOf[VgEncodeEntry]
  @scala.inline
  def color(model: UnitModel, opt: Filled): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("color")(model.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  
  @scala.inline
  def nonPosition(channel: NonPositionScaleChannel, model: UnitModel): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("nonPosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  @scala.inline
  def nonPosition(channel: NonPositionScaleChannel, model: UnitModel, opt: DefaultRef): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("nonPosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  
  @scala.inline
  def pointOrRangePosition_x(channel: x, model: UnitModel, hasDefaultPosDefaultPos2Range: DefaultPos2): StringDictionary[VgValueRef | js.Array[VgValueRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointOrRangePosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], hasDefaultPosDefaultPos2Range.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[VgValueRef | js.Array[VgValueRef]]]
  
  @scala.inline
  def pointOrRangePosition_y(channel: y, model: UnitModel, hasDefaultPosDefaultPos2Range: DefaultPos2): StringDictionary[VgValueRef | js.Array[VgValueRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointOrRangePosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], hasDefaultPosDefaultPos2Range.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[VgValueRef | js.Array[VgValueRef]]]
  
  @scala.inline
  def pointPosition_radius(channel: radius, model: UnitModel, hasDefaultPosVgChannelIsMidPoint: DefaultPos): StringDictionary[VgValueRef | js.Array[VgValueRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointPosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], hasDefaultPosVgChannelIsMidPoint.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[VgValueRef | js.Array[VgValueRef]]]
  
  @scala.inline
  def pointPosition_theta(channel: theta, model: UnitModel, hasDefaultPosVgChannelIsMidPoint: DefaultPos): StringDictionary[VgValueRef | js.Array[VgValueRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointPosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], hasDefaultPosVgChannelIsMidPoint.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[VgValueRef | js.Array[VgValueRef]]]
  
  @scala.inline
  def pointPosition_x(channel: x, model: UnitModel, hasDefaultPosVgChannelIsMidPoint: DefaultPos): StringDictionary[VgValueRef | js.Array[VgValueRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointPosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], hasDefaultPosVgChannelIsMidPoint.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[VgValueRef | js.Array[VgValueRef]]]
  
  @scala.inline
  def pointPosition_y(channel: y, model: UnitModel, hasDefaultPosVgChannelIsMidPoint: DefaultPos): StringDictionary[VgValueRef | js.Array[VgValueRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointPosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], hasDefaultPosVgChannelIsMidPoint.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[VgValueRef | js.Array[VgValueRef]]]
  
  @scala.inline
  def rangePosition_radius(channel: radius, model: UnitModel, hasDefaultPosDefaultPos2: DefaultPosDefaultPos2): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("rangePosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], hasDefaultPosDefaultPos2.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  
  @scala.inline
  def rangePosition_theta(channel: theta, model: UnitModel, hasDefaultPosDefaultPos2: DefaultPosDefaultPos2): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("rangePosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], hasDefaultPosDefaultPos2.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  
  @scala.inline
  def rangePosition_x(channel: x, model: UnitModel, hasDefaultPosDefaultPos2: DefaultPosDefaultPos2): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("rangePosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], hasDefaultPosDefaultPos2.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  
  @scala.inline
  def rangePosition_y(channel: y, model: UnitModel, hasDefaultPosDefaultPos2: DefaultPosDefaultPos2): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("rangePosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], hasDefaultPosDefaultPos2.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  
  @scala.inline
  def rectPosition(model: UnitModel, channel: radius, mark: arc): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("rectPosition")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], mark.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  @scala.inline
  def rectPosition(model: UnitModel, channel: radius, mark: bar): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("rectPosition")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], mark.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  @scala.inline
  def rectPosition(model: UnitModel, channel: radius, mark: image): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("rectPosition")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], mark.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  @scala.inline
  def rectPosition(model: UnitModel, channel: radius, mark: rect): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("rectPosition")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], mark.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  @scala.inline
  def rectPosition(model: UnitModel, channel: theta, mark: arc): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("rectPosition")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], mark.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  @scala.inline
  def rectPosition(model: UnitModel, channel: theta, mark: bar): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("rectPosition")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], mark.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  @scala.inline
  def rectPosition(model: UnitModel, channel: theta, mark: image): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("rectPosition")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], mark.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  @scala.inline
  def rectPosition(model: UnitModel, channel: theta, mark: rect): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("rectPosition")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], mark.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  @scala.inline
  def rectPosition(model: UnitModel, channel: x, mark: arc): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("rectPosition")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], mark.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  @scala.inline
  def rectPosition(model: UnitModel, channel: x, mark: bar): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("rectPosition")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], mark.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  @scala.inline
  def rectPosition(model: UnitModel, channel: x, mark: image): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("rectPosition")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], mark.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  @scala.inline
  def rectPosition(model: UnitModel, channel: x, mark: rect): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("rectPosition")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], mark.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  @scala.inline
  def rectPosition(model: UnitModel, channel: y, mark: arc): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("rectPosition")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], mark.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  @scala.inline
  def rectPosition(model: UnitModel, channel: y, mark: bar): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("rectPosition")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], mark.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  @scala.inline
  def rectPosition(model: UnitModel, channel: y, mark: image): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("rectPosition")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], mark.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  @scala.inline
  def rectPosition(model: UnitModel, channel: y, mark: rect): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("rectPosition")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], mark.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  
  @scala.inline
  def text(model: UnitModel): PartialRecordVgEncodeChan = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(model.asInstanceOf[js.Any]).asInstanceOf[PartialRecordVgEncodeChan]
  
  @scala.inline
  def text_description(model: UnitModel, channel: description): PartialRecordVgEncodeChan = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[PartialRecordVgEncodeChan]
  
  @scala.inline
  def text_href(model: UnitModel, channel: href): PartialRecordVgEncodeChan = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[PartialRecordVgEncodeChan]
  
  @scala.inline
  def text_text(model: UnitModel, channel: text): PartialRecordVgEncodeChan = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[PartialRecordVgEncodeChan]
  
  @scala.inline
  def text_url(model: UnitModel, channel: url): PartialRecordVgEncodeChan = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[PartialRecordVgEncodeChan]
  
  @scala.inline
  def tooltip(model: UnitModel): PartialRecordVgEncodeChan | Tooltip = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(model.asInstanceOf[js.Any]).asInstanceOf[PartialRecordVgEncodeChan | Tooltip]
  @scala.inline
  def tooltip(model: UnitModel, opt: ReactiveGeom): PartialRecordVgEncodeChan | Tooltip = (^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(model.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[PartialRecordVgEncodeChan | Tooltip]
  
  @scala.inline
  def wrapCondition[CD /* <: ChannelDef[String] | GuideEncodingConditionalValueDef */](
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
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class IgnoreMutableBuilder[Self <: Ignore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: ignore | include): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseline(value: ignore | include): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: ignore | include): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrient(value: ignore | include): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: ignore | include): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheta(value: ignore | include): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
    }
  }
}
