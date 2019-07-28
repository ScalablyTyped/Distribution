package typings.vegaDashLite.buildSrcSpecMod

import typings.vegaDashLite.buildSrcConfigMod.Config
import typings.vegaDashLite.buildSrcFielddefMod.FieldDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/spec", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fieldDefs(spec: GenericSpec[_, _]): js.Array[FieldDef[_]] = js.native
  def isConcatSpec(spec: BaseSpec): Boolean = js.native
  def isFacetSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec.GenericFacetSpec<any, any> */ Boolean = js.native
  def isHConcatSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec.GenericHConcatSpec<any, any> */ Boolean = js.native
  def isLayerSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec.GenericLayerSpec<any> */ Boolean = js.native
  def isRepeatSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec.GenericRepeatSpec<any, any> */ Boolean = js.native
  def isStacked(spec: TopLevel[FacetedCompositeUnitSpec]): Boolean = js.native
  def isStacked(spec: TopLevel[FacetedCompositeUnitSpec], config: Config): Boolean = js.native
  def isUnitSpec(spec: BaseSpec): Boolean = js.native
  def isVConcatSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec.GenericVConcatSpec<any, any> */ Boolean = js.native
  def normalize(spec: (GenericSpec[CompositeUnitSpec, ExtendedLayerSpec]) | TopLevelSpec, config: Config): NormalizedSpec = js.native
  def normalize(spec: FacetedCompositeUnitSpec, config: Config): NormalizedSpec = js.native
}

