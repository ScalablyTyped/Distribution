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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object markEncodeMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode", "aria")
  @js.native
  def aria(model: UnitModel): AriaRoleDescription | Description | Clip | AriaAriaRoleDescription = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode", "baseEncodeEntry")
  @js.native
  def baseEncodeEntry(model: UnitModel, ignore: Ignore): AriaRoleDescription | CornerRadius | Clip | CornerRadiusBottomLeft | CornerRadiusBottomRight | CornerRadiusTopLeft | CornerRadiusTopRight | Cursor = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode", "color")
  @js.native
  def color(model: UnitModel): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "color")
  @js.native
  def color(model: UnitModel, opt: Filled): VgEncodeEntry = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode", "defined")
  @js.native
  def defined(model: UnitModel): VgEncodeEntry = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode", "nonPosition")
  @js.native
  def nonPosition(channel: NonPositionScaleChannel, model: UnitModel): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "nonPosition")
  @js.native
  def nonPosition(channel: NonPositionScaleChannel, model: UnitModel, opt: DefaultRef): VgEncodeEntry = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode", "pointOrRangePosition")
  @js.native
  def pointOrRangePosition_x(channel: x, model: UnitModel, hasDefaultPosDefaultPos2Range: DefaultPos2): StringDictionary[VgValueRef | js.Array[VgValueRef]] = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "pointOrRangePosition")
  @js.native
  def pointOrRangePosition_y(channel: y, model: UnitModel, hasDefaultPosDefaultPos2Range: DefaultPos2): StringDictionary[VgValueRef | js.Array[VgValueRef]] = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode", "pointPosition")
  @js.native
  def pointPosition_radius(channel: radius, model: UnitModel, hasDefaultPosVgChannelIsMidPoint: DefaultPos): StringDictionary[VgValueRef | js.Array[VgValueRef]] = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "pointPosition")
  @js.native
  def pointPosition_theta(channel: theta, model: UnitModel, hasDefaultPosVgChannelIsMidPoint: DefaultPos): StringDictionary[VgValueRef | js.Array[VgValueRef]] = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "pointPosition")
  @js.native
  def pointPosition_x(channel: x, model: UnitModel, hasDefaultPosVgChannelIsMidPoint: DefaultPos): StringDictionary[VgValueRef | js.Array[VgValueRef]] = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "pointPosition")
  @js.native
  def pointPosition_y(channel: y, model: UnitModel, hasDefaultPosVgChannelIsMidPoint: DefaultPos): StringDictionary[VgValueRef | js.Array[VgValueRef]] = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode", "rangePosition")
  @js.native
  def rangePosition_radius(channel: radius, model: UnitModel, hasDefaultPosDefaultPos2: DefaultPosDefaultPos2): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rangePosition")
  @js.native
  def rangePosition_theta(channel: theta, model: UnitModel, hasDefaultPosDefaultPos2: DefaultPosDefaultPos2): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rangePosition")
  @js.native
  def rangePosition_x(channel: x, model: UnitModel, hasDefaultPosDefaultPos2: DefaultPosDefaultPos2): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rangePosition")
  @js.native
  def rangePosition_y(channel: y, model: UnitModel, hasDefaultPosDefaultPos2: DefaultPosDefaultPos2): VgEncodeEntry = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectBinPosition")
  @js.native
  def rectBinPosition(hasFieldDefFieldDef2ChannelBandScaleNameMarkDefSpacingAxisTranslateReverseConfig: AxisTranslate): StringDictionary[js.Array[VgValueRef] | Offset | VgValueRef] = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: radius, mark: arc): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: radius, mark: bar): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: radius, mark: image): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: radius, mark: rect): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: theta, mark: arc): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: theta, mark: bar): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: theta, mark: image): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: theta, mark: rect): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: x, mark: arc): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: x, mark: bar): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: x, mark: image): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: x, mark: rect): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: y, mark: arc): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: y, mark: bar): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: y, mark: image): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: y, mark: rect): VgEncodeEntry = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode", "text")
  @js.native
  def text(model: UnitModel): PartialRecordVgEncodeChan = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "text")
  @js.native
  def text_description(model: UnitModel, channel: description): PartialRecordVgEncodeChan = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "text")
  @js.native
  def text_href(model: UnitModel, channel: href): PartialRecordVgEncodeChan = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "text")
  @js.native
  def text_text(model: UnitModel, channel: text): PartialRecordVgEncodeChan = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "text")
  @js.native
  def text_url(model: UnitModel, channel: url): PartialRecordVgEncodeChan = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode", "tooltip")
  @js.native
  def tooltip(model: UnitModel): PartialRecordVgEncodeChan | Tooltip = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "tooltip")
  @js.native
  def tooltip(model: UnitModel, opt: ReactiveGeom): PartialRecordVgEncodeChan | Tooltip = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode", "tooltipRefForEncoding")
  @js.native
  def tooltipRefForEncoding(encoding: Encoding[String], stack: StackProperties, config: Config[ExprRef | SignalRef]): Signal = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "tooltipRefForEncoding")
  @js.native
  def tooltipRefForEncoding(
    encoding: Encoding[String],
    stack: StackProperties,
    config: Config[ExprRef | SignalRef],
    hasReactiveGeom: ReactiveGeom
  ): Signal = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode", "valueIfDefined")
  @js.native
  def valueIfDefined(prop: String, value: Value[ExprRef | SignalRef]): VgEncodeEntry = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode", "wrapCondition")
  @js.native
  def wrapCondition[CD /* <: ChannelDef[String] | GuideEncodingConditionalValueDef */](
    model: UnitModel,
    channelDef: CD,
    vgChannel: String,
    refFn: js.Function1[/* cDef */ CD, VgValueRef]
  ): VgEncodeEntry = js.native
}
