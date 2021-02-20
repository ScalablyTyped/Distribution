package typings.vegaLite

import typings.vegaLite.anon.AlignString
import typings.vegaLite.anon.AlignUndefined
import typings.vegaLite.anon.Axes
import typings.vegaLite.anon.BaselineUndefined
import typings.vegaLite.anon.Dx
import typings.vegaLite.anon.Dy
import typings.vegaLite.anon.Encode
import typings.vegaLite.anon.Font
import typings.vegaLite.anon.FontSize
import typings.vegaLite.anon.FontStyle
import typings.vegaLite.anon.From
import typings.vegaLite.anon.Name
import typings.vegaLite.anon.PartialRecordkeyofCoreHea
import typings.vegaLite.anon.PartialVgTitle
import typings.vegaLite.anon.`1`
import typings.vegaLite.anon.`2`
import typings.vegaLite.channelMod.FacetChannel
import typings.vegaLite.headerComponentMod.HeaderChannel
import typings.vegaLite.headerComponentMod.HeaderComponent
import typings.vegaLite.headerComponentMod.HeaderType
import typings.vegaLite.headerComponentMod.LayoutHeaderComponent
import typings.vegaLite.headerComponentMod.LayoutHeaderComponentIndex
import typings.vegaLite.modelMod.Model
import typings.vegaLite.specFacetMod.FacetFieldDef
import typings.vegaLite.srcConfigMod.Config
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
import typings.vegaLite.vegaLiteStrings.orient
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
import typings.vegaLite.vegaSchemaMod.RowCol
import typings.vegaLite.vegaSchemaMod.VgMarkGroup
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.titleMod.TitleAnchor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerAssembleMod {
  
  @JSImport("vega-lite/build/src/compile/header/assemble", "assembleHeaderGroup")
  @js.native
  def assembleHeaderGroup(
    model: Model,
    channel: HeaderChannel,
    headerType: HeaderType,
    layoutHeader: LayoutHeaderComponent,
    headerComponent: HeaderComponent
  ): Axes | From = js.native
  
  @JSImport("vega-lite/build/src/compile/header/assemble", "assembleHeaderGroups")
  @js.native
  def assembleHeaderGroups(model: Model, channel: HeaderChannel): js.Array[VgMarkGroup] = js.native
  
  @JSImport("vega-lite/build/src/compile/header/assemble", "assembleHeaderProperties")
  @js.native
  def assembleHeaderProperties(
    config: Config[SignalRef],
    facetFieldDef: FacetFieldDef[String, SignalRef],
    channel: FacetChannel,
    properties: js.Array[
      /* keyof vega-lite.vega-lite/build/src/header.CoreHeader<vega-typings.vega-typings/types/spec/signal.SignalRef> */ titleAnchor | titleAlign | titleAngle | titleBaseline | titleColor | titleFont | titleFontSize | titleFontStyle | titleFontWeight | titleLimit | titleLineHeight | titleOrient | titlePadding | labels | labelAlign | labelBaseline | labelAnchor | labelExpr | labelAngle | labelColor | labelFont | labelFontSize | labelFontStyle | labelFontWeight | labelLimit | labelLineHeight | labelOrient | labelPadding | orient | format | formatType
    ],
    propertiesMap: PartialRecordkeyofCoreHea
  ): PartialVgTitle = js.native
  
  @JSImport("vega-lite/build/src/compile/header/assemble", "assembleLabelTitle")
  @js.native
  def assembleLabelTitle(facetFieldDef: FacetFieldDef[String, SignalRef], channel: FacetChannel, config: Config[SignalRef]): Dx | Dy | Encode | Font | FontSize | FontStyle = js.native
  
  @JSImport("vega-lite/build/src/compile/header/assemble", "assembleLayoutTitleBand")
  @js.native
  def assembleLayoutTitleBand(headerComponentIndex: LayoutHeaderComponentIndex, config: Config[SignalRef]): RowCol[Double] = js.native
  
  @JSImport("vega-lite/build/src/compile/header/assemble", "assembleTitleGroup")
  @js.native
  def assembleTitleGroup(model: Model, channel: FacetChannel): Name = js.native
  
  @JSImport("vega-lite/build/src/compile/header/assemble", "defaultHeaderGuideAlign")
  @js.native
  def defaultHeaderGuideAlign(headerChannel: HeaderChannel, angle: Double): AlignString | `1` | AlignUndefined = js.native
  @JSImport("vega-lite/build/src/compile/header/assemble", "defaultHeaderGuideAlign")
  @js.native
  def defaultHeaderGuideAlign(headerChannel: HeaderChannel, angle: Double, anchor: TitleAnchor): AlignString | `1` | AlignUndefined = js.native
  
  @JSImport("vega-lite/build/src/compile/header/assemble", "defaultHeaderGuideBaseline")
  @js.native
  def defaultHeaderGuideBaseline(angle: Double, channel: FacetChannel): `2` | BaselineUndefined = js.native
  
  @JSImport("vega-lite/build/src/compile/header/assemble", "getLayoutTitleBand")
  @js.native
  def getLayoutTitleBand(titleAnchor: TitleAnchor, headerChannel: HeaderChannel): js.Any = js.native
}
