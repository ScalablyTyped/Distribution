package typings.vegaDashLite.buildSrcCompileHeaderMod

import typings.vegaDashLite.Anon_Align
import typings.vegaDashLite.Anon_AlignAnonValue
import typings.vegaDashLite.Anon_Axes
import typings.vegaDashLite.Anon_AxesEncode
import typings.vegaDashLite.Anon_AxesEncodeName
import typings.vegaDashLite.Anon_AxesEncodeNameRole
import typings.vegaDashLite.Anon_AxesFrom
import typings.vegaDashLite.Anon_AxesFromName
import typings.vegaDashLite.Anon_AxesName
import typings.vegaDashLite.Anon_AxesNameRole
import typings.vegaDashLite.Anon_Baseline
import typings.vegaDashLite.Anon_EncodeFrom
import typings.vegaDashLite.Anon_EncodeFromName
import typings.vegaDashLite.Anon_EncodeName
import typings.vegaDashLite.Anon_EncodeNameRole
import typings.vegaDashLite.Anon_From
import typings.vegaDashLite.Anon_FromName
import typings.vegaDashLite.Anon_Name
import typings.vegaDashLite.Anon_NameRole
import typings.vegaDashLite.Anon_NameRoleType
import typings.vegaDashLite.buildSrcCompileModelMod.Model
import typings.vegaDashLite.buildSrcConfigMod.Config
import typings.vegaDashLite.buildSrcFacetMod.FacetFieldDef
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.AxisOrient
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgMarkGroup
import typings.vegaDashLite.vegaDashLiteStrings.footer
import typings.vegaDashLite.vegaDashLiteStrings.header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/header", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val HEADER_CHANNELS: js.Array[HeaderChannel] = js.native
  val HEADER_TYPES: js.Array[HeaderType] = js.native
  def getHeaderGroup(
    model: Model,
    channel: HeaderChannel,
    headerType: HeaderType,
    layoutHeader: LayoutHeaderComponent,
    headerCmpt: HeaderComponent
  ): Anon_Axes | Anon_EncodeFrom | Anon_AxesFrom | Anon_From | Anon_AxesEncode | Anon_EncodeFromName | Anon_AxesFromName | Anon_FromName | Anon_AxesEncodeName | Anon_EncodeName | Anon_AxesName | Anon_NameRole | Anon_AxesEncodeNameRole | Anon_EncodeNameRole | Anon_AxesNameRole | Anon_NameRoleType = js.native
  def getHeaderGroups(model: Model, channel: HeaderChannel): js.Array[VgMarkGroup] = js.native
  def getHeaderProperties(
    config: Config,
    facetFieldDef: FacetFieldDef[String],
    properties: js.Array[String],
    propertiesMap: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in 'titleAnchor' | 'titleAngle' | 'titleBaseline' | 'titleColor' | 'titleFont' | 'titleFontSize' | 'titleFontWeight' | 'titleLimit' | 'labelAngle' | 'labelColor' | 'labelFont' | 'labelFontSize' | 'labelLimit' ]: 'anchor' | 'angle' | 'baseline' | 'color' | 'font' | 'fontSize' | 'fontWeight' | 'limit' | 'offset' | 'orient'}
    */ typings.vegaDashLite.vegaDashLiteStrings.getHeaderProperties with js.Any
  ): js.Object = js.native
  def getHeaderType(orient: AxisOrient): header | footer = js.native
  def getTitleGroup(model: Model, channel: HeaderChannel): Anon_Name = js.native
  def labelAlign(angle: Double): Anon_Align | Anon_AlignAnonValue = js.native
  def labelBaseline(angle: Double): Anon_Baseline = js.native
}

