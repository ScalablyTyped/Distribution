package typings.vegaLite

import org.scalablytyped.runtime.StringDictionary
import typings.vegaLite.anon.AriaAriaRoleDescription
import typings.vegaLite.anon.AriaRoleDescription
import typings.vegaLite.anon.AxisTranslate
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
import typings.vegaLite.anon.Description
import typings.vegaLite.anon.Filled
import typings.vegaLite.anon.Offset
import typings.vegaLite.anon.PartialRecordVgEncodeChan
import typings.vegaLite.anon.ReactiveGeom
import typings.vegaLite.anon.Signal
import typings.vegaLite.anon.Tooltip
import typings.vegaLite.channelMod.NonPositionScaleChannel
import typings.vegaLite.channeldefMod.ChannelDef
import typings.vegaLite.channeldefMod.Value
import typings.vegaLite.encodeBaseMod.Ignore
import typings.vegaLite.encodingMod.Encoding
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.srcConfigMod.Config
import typings.vegaLite.srcGuideMod.GuideEncodingConditionalValueDef
import typings.vegaLite.srcStackMod.StackProperties
import typings.vegaLite.unitMod.UnitModel
import typings.vegaLite.vegaLiteStrings.arc
import typings.vegaLite.vegaLiteStrings.bar
import typings.vegaLite.vegaLiteStrings.description
import typings.vegaLite.vegaLiteStrings.href
import typings.vegaLite.vegaLiteStrings.image
import typings.vegaLite.vegaLiteStrings.radius
import typings.vegaLite.vegaLiteStrings.rect
import typings.vegaLite.vegaLiteStrings.text
import typings.vegaLite.vegaLiteStrings.theta
import typings.vegaLite.vegaLiteStrings.url
import typings.vegaLite.vegaLiteStrings.x
import typings.vegaLite.vegaLiteStrings.y
import typings.vegaLite.vegaSchemaMod.VgEncodeEntry
import typings.vegaLite.vegaSchemaMod.VgValueRef
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object markEncodeMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def aria(model: UnitModel): AriaRoleDescription | Description | Clip | AriaAriaRoleDescription = ^.asInstanceOf[js.Dynamic].applyDynamic("aria")(model.asInstanceOf[js.Any]).asInstanceOf[AriaRoleDescription | Description | Clip | AriaAriaRoleDescription]
  
  @scala.inline
  def baseEncodeEntry(model: UnitModel, ignore: Ignore): AriaRoleDescription | CornerRadius | Clip | CornerRadiusBottomLeft | CornerRadiusBottomRight | CornerRadiusTopLeft | CornerRadiusTopRight | Cursor = (^.asInstanceOf[js.Dynamic].applyDynamic("baseEncodeEntry")(model.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[AriaRoleDescription | CornerRadius | Clip | CornerRadiusBottomLeft | CornerRadiusBottomRight | CornerRadiusTopLeft | CornerRadiusTopRight | Cursor]
  
  @scala.inline
  def color(model: UnitModel): VgEncodeEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(model.asInstanceOf[js.Any]).asInstanceOf[VgEncodeEntry]
  @scala.inline
  def color(model: UnitModel, opt: Filled): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("color")(model.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  
  @scala.inline
  def defined(model: UnitModel): VgEncodeEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("defined")(model.asInstanceOf[js.Any]).asInstanceOf[VgEncodeEntry]
  
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
  def rectBinPosition(hasFieldDefFieldDef2ChannelBandScaleNameMarkDefSpacingAxisTranslateReverseConfig: AxisTranslate): StringDictionary[js.Array[VgValueRef] | Offset | VgValueRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("rectBinPosition")(hasFieldDefFieldDef2ChannelBandScaleNameMarkDefSpacingAxisTranslateReverseConfig.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Array[VgValueRef] | Offset | VgValueRef]]
  
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
  def tooltipRefForEncoding(encoding: Encoding[String], stack: StackProperties, config: Config[ExprRef | SignalRef]): Signal = (^.asInstanceOf[js.Dynamic].applyDynamic("tooltipRefForEncoding")(encoding.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Signal]
  @scala.inline
  def tooltipRefForEncoding(
    encoding: Encoding[String],
    stack: StackProperties,
    config: Config[ExprRef | SignalRef],
    hasReactiveGeom: ReactiveGeom
  ): Signal = (^.asInstanceOf[js.Dynamic].applyDynamic("tooltipRefForEncoding")(encoding.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], config.asInstanceOf[js.Any], hasReactiveGeom.asInstanceOf[js.Any])).asInstanceOf[Signal]
  
  @scala.inline
  def valueIfDefined(prop: String, value: Value[ExprRef | SignalRef]): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("valueIfDefined")(prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  
  @scala.inline
  def wrapCondition[CD /* <: ChannelDef[String] | GuideEncodingConditionalValueDef */](
    model: UnitModel,
    channelDef: CD,
    vgChannel: String,
    refFn: js.Function1[/* cDef */ CD, VgValueRef]
  ): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapCondition")(model.asInstanceOf[js.Any], channelDef.asInstanceOf[js.Any], vgChannel.asInstanceOf[js.Any], refFn.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
}
