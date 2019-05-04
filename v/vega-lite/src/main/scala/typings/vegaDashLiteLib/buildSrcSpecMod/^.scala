package typings
package vegaDashLiteLib.buildSrcSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/spec", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fieldDefs(spec: GenericSpec[_, _]): js.Array[vegaDashLiteLib.buildSrcFielddefMod.FieldDef[_]] = js.native
  def isConcatSpec(spec: BaseSpec): scala.Boolean = js.native
  def isFacetSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec.GenericFacetSpec<any, any> */ scala.Boolean = js.native
  def isHConcatSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec.GenericHConcatSpec<any, any> */ scala.Boolean = js.native
  def isLayerSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec.GenericLayerSpec<any> */ scala.Boolean = js.native
  def isRepeatSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec.GenericRepeatSpec<any, any> */ scala.Boolean = js.native
  def isStacked(spec: TopLevel[FacetedCompositeUnitSpec]): scala.Boolean = js.native
  def isStacked(spec: TopLevel[FacetedCompositeUnitSpec], config: vegaDashLiteLib.buildSrcConfigMod.Config): scala.Boolean = js.native
  def isUnitSpec(spec: BaseSpec): scala.Boolean = js.native
  def isVConcatSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec.GenericVConcatSpec<any, any> */ scala.Boolean = js.native
  def normalize(
    spec: (GenericSpec[CompositeUnitSpec, ExtendedLayerSpec]) | TopLevelSpec,
    config: vegaDashLiteLib.buildSrcConfigMod.Config
  ): NormalizedSpec = js.native
  def normalize(spec: FacetedCompositeUnitSpec, config: vegaDashLiteLib.buildSrcConfigMod.Config): NormalizedSpec = js.native
}

