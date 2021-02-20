package typings.vegaLite

import typings.vegaLite.channelMod.FacetChannel
import typings.vegaLite.headerComponentMod.HeaderChannel
import typings.vegaLite.headerMod.Header
import typings.vegaLite.srcConfigMod.Config
import typings.vegaLite.utilMod.Dict
import typings.vegaLite.vegaLiteStrings.format
import typings.vegaLite.vegaLiteStrings.formatType
import typings.vegaLite.vegaLiteStrings.labelAlign
import typings.vegaLite.vegaLiteStrings.labelAnchor
import typings.vegaLite.vegaLiteStrings.labelAngle
import typings.vegaLite.vegaLiteStrings.labelBaseline
import typings.vegaLite.vegaLiteStrings.labelColor
import typings.vegaLite.vegaLiteStrings.labelExpr
import typings.vegaLite.vegaLiteStrings.labelFont
import typings.vegaLite.vegaLiteStrings.labelFontSize
import typings.vegaLite.vegaLiteStrings.labelFontStyle
import typings.vegaLite.vegaLiteStrings.labelFontWeight
import typings.vegaLite.vegaLiteStrings.labelLimit
import typings.vegaLite.vegaLiteStrings.labelLineHeight
import typings.vegaLite.vegaLiteStrings.labelOrient
import typings.vegaLite.vegaLiteStrings.labelPadding
import typings.vegaLite.vegaLiteStrings.labels
import typings.vegaLite.vegaLiteStrings.number
import typings.vegaLite.vegaLiteStrings.orient
import typings.vegaLite.vegaLiteStrings.time
import typings.vegaLite.vegaLiteStrings.title
import typings.vegaLite.vegaLiteStrings.titleAlign
import typings.vegaLite.vegaLiteStrings.titleAnchor
import typings.vegaLite.vegaLiteStrings.titleAngle
import typings.vegaLite.vegaLiteStrings.titleBaseline
import typings.vegaLite.vegaLiteStrings.titleColor
import typings.vegaLite.vegaLiteStrings.titleFont
import typings.vegaLite.vegaLiteStrings.titleFontSize
import typings.vegaLite.vegaLiteStrings.titleFontStyle
import typings.vegaLite.vegaLiteStrings.titleFontWeight
import typings.vegaLite.vegaLiteStrings.titleLimit
import typings.vegaLite.vegaLiteStrings.titleLineHeight
import typings.vegaLite.vegaLiteStrings.titleOrient
import typings.vegaLite.vegaLiteStrings.titlePadding
import typings.vegaTypings.colorMod.Color
import typings.vegaTypings.encodeMod.Align
import typings.vegaTypings.encodeMod.FontStyle
import typings.vegaTypings.encodeMod.FontWeight
import typings.vegaTypings.encodeMod.Orient
import typings.vegaTypings.encodeMod.Text
import typings.vegaTypings.encodeMod.TextBaseline
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.titleMod.TitleAnchor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerCommonMod {
  
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderChannel")
  @js.native
  def getHeaderChannel(channel: FacetChannel, orient: Orient): HeaderChannel = js.native
  
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperties")
  @js.native
  def getHeaderProperties(
    properties: js.Array[
      /* keyof vega-lite.vega-lite/build/src/header.Header<vega-typings.vega-typings/types/spec/signal.SignalRef> */ titleAnchor | titleAlign | titleAngle | titleBaseline | titleColor | titleFont | titleFontSize | titleFontStyle | titleFontWeight | titleLimit | titleLineHeight | titleOrient | titlePadding | labels | labelAlign | labelBaseline | labelAnchor | labelExpr | labelAngle | labelColor | labelFont | labelFontSize | labelFontStyle | labelFontWeight | labelLimit | labelLineHeight | labelOrient | labelPadding | orient | format | formatType | title
    ],
    header: Header[SignalRef],
    config: Config[SignalRef],
    channel: FacetChannel
  ): Header[SignalRef] = js.native
  
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_format(prop: format, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[String | Dict[_]] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_formatType(prop: formatType, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[number | time | String] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_labelAlign(prop: labelAlign, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Align | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_labelAnchor(prop: labelAnchor, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[TitleAnchor] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_labelAngle(prop: labelAngle, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_labelBaseline(prop: labelBaseline, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[TextBaseline | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_labelColor(prop: labelColor, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Color | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_labelExpr(prop: labelExpr, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[String] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_labelFont(prop: labelFont, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[String | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_labelFontSize(prop: labelFontSize, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_labelFontStyle(prop: labelFontStyle, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[FontStyle | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_labelFontWeight(prop: labelFontWeight, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[FontWeight | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_labelLimit(prop: labelLimit, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_labelLineHeight(prop: labelLineHeight, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_labelOrient(prop: labelOrient, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Orient] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_labelPadding(prop: labelPadding, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_labels(prop: labels, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Boolean] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_orient(prop: orient, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Orient] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_title(prop: title, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Text | Null | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_titleAlign(prop: titleAlign, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Align | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_titleAnchor(prop: titleAnchor, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[TitleAnchor] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_titleAngle(prop: titleAngle, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_titleBaseline(prop: titleBaseline, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[TextBaseline | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_titleColor(prop: titleColor, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Color | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_titleFont(prop: titleFont, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[String | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_titleFontSize(prop: titleFontSize, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_titleFontStyle(prop: titleFontStyle, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[FontStyle | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_titleFontWeight(prop: titleFontWeight, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[FontWeight | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_titleLimit(prop: titleLimit, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_titleLineHeight(prop: titleLineHeight, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_titleOrient(prop: titleOrient, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Orient] = js.native
  @JSImport("vega-lite/build/src/compile/header/common", "getHeaderProperty")
  @js.native
  def getHeaderProperty_titlePadding(prop: titlePadding, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double | SignalRef] = js.native
}
