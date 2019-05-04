package typings
package vegaDashLiteLib.buildSrcCompileHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/header", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val HEADER_CHANNELS: js.Array[HeaderChannel] = js.native
  val HEADER_TYPES: js.Array[HeaderType] = js.native
  def getHeaderGroup(
    model: vegaDashLiteLib.buildSrcCompileModelMod.Model,
    channel: HeaderChannel,
    headerType: HeaderType,
    layoutHeader: LayoutHeaderComponent,
    headerCmpt: HeaderComponent
  ): vegaDashLiteLib.Anon_Axes | vegaDashLiteLib.Anon_EncodeFrom | vegaDashLiteLib.Anon_AxesFrom | vegaDashLiteLib.Anon_From | vegaDashLiteLib.Anon_AxesEncode | vegaDashLiteLib.Anon_EncodeFromName | vegaDashLiteLib.Anon_AxesFromName | vegaDashLiteLib.Anon_FromName | vegaDashLiteLib.Anon_AxesEncodeName | vegaDashLiteLib.Anon_EncodeName | vegaDashLiteLib.Anon_AxesName | vegaDashLiteLib.Anon_NameRole | vegaDashLiteLib.Anon_AxesEncodeNameRole | vegaDashLiteLib.Anon_EncodeNameRole | vegaDashLiteLib.Anon_AxesNameRole | vegaDashLiteLib.Anon_NameRoleType = js.native
  def getHeaderGroups(model: vegaDashLiteLib.buildSrcCompileModelMod.Model, channel: HeaderChannel): js.Array[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgMarkGroup] = js.native
  def getHeaderProperties(
    config: vegaDashLiteLib.buildSrcConfigMod.Config,
    facetFieldDef: vegaDashLiteLib.buildSrcFacetMod.FacetFieldDef[java.lang.String],
    properties: js.Array[java.lang.String],
    propertiesMap: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in 'titleAnchor' | 'titleAngle' | 'titleBaseline' | 'titleColor' | 'titleFont' | 'titleFontSize' | 'titleFontWeight' | 'titleLimit' | 'labelAngle' | 'labelColor' | 'labelFont' | 'labelFontSize' | 'labelLimit' ]: 'anchor' | 'angle' | 'baseline' | 'color' | 'font' | 'fontSize' | 'fontWeight' | 'limit' | 'offset' | 'orient'}
    */ vegaDashLiteLib.vegaDashLiteLibStrings.getHeaderProperties with js.Any
  ): js.Object = js.native
  def getHeaderType(orient: vegaDashLiteLib.buildSrcVegaDotSchemaMod.AxisOrient): vegaDashLiteLib.vegaDashLiteLibStrings.header | vegaDashLiteLib.vegaDashLiteLibStrings.footer = js.native
  def getTitleGroup(model: vegaDashLiteLib.buildSrcCompileModelMod.Model, channel: HeaderChannel): vegaDashLiteLib.Anon_Name = js.native
  def labelAlign(angle: scala.Double): vegaDashLiteLib.Anon_Align | vegaDashLiteLib.Anon_AlignAnonValue = js.native
  def labelBaseline(angle: scala.Double): vegaDashLiteLib.Anon_Baseline = js.native
}

