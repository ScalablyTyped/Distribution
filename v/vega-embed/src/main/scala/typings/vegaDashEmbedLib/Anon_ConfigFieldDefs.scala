package typings
package vegaDashEmbedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ConfigFieldDefs extends js.Object {
  def fieldDefs(spec: vegaDashLiteLib.buildSrcSpecMod.GenericSpec[_, _]): js.Array[vegaDashLiteLib.buildSrcFielddefMod.FieldDef[_]] = js.native
  def isConcatSpec(spec: vegaDashLiteLib.buildSrcSpecMod.BaseSpec): scala.Boolean = js.native
  def isFacetSpec(spec: vegaDashLiteLib.buildSrcSpecMod.BaseSpec): /* is vega-lite.vega-lite/build/src/spec.GenericFacetSpec<any, any> */ scala.Boolean = js.native
  def isHConcatSpec(spec: vegaDashLiteLib.buildSrcSpecMod.BaseSpec): /* is vega-lite.vega-lite/build/src/spec.GenericHConcatSpec<any, any> */ scala.Boolean = js.native
  def isLayerSpec(spec: vegaDashLiteLib.buildSrcSpecMod.BaseSpec): /* is vega-lite.vega-lite/build/src/spec.GenericLayerSpec<any> */ scala.Boolean = js.native
  def isRepeatSpec(spec: vegaDashLiteLib.buildSrcSpecMod.BaseSpec): /* is vega-lite.vega-lite/build/src/spec.GenericRepeatSpec<any, any> */ scala.Boolean = js.native
  def isStacked(
    spec: vegaDashLiteLib.buildSrcSpecMod.TopLevel[vegaDashLiteLib.buildSrcSpecMod.FacetedCompositeUnitSpec]
  ): scala.Boolean = js.native
  def isStacked(
    spec: vegaDashLiteLib.buildSrcSpecMod.TopLevel[vegaDashLiteLib.buildSrcSpecMod.FacetedCompositeUnitSpec],
    config: vegaDashLiteLib.buildSrcConfigMod.Config
  ): scala.Boolean = js.native
  def isUnitSpec(spec: vegaDashLiteLib.buildSrcSpecMod.BaseSpec): scala.Boolean = js.native
  def isVConcatSpec(spec: vegaDashLiteLib.buildSrcSpecMod.BaseSpec): /* is vega-lite.vega-lite/build/src/spec.GenericVConcatSpec<any, any> */ scala.Boolean = js.native
  def normalize(
    spec: (vegaDashLiteLib.buildSrcSpecMod.GenericSpec[
      vegaDashLiteLib.buildSrcSpecMod.CompositeUnitSpec, 
      vegaDashLiteLib.buildSrcSpecMod.ExtendedLayerSpec
    ]) | vegaDashLiteLib.buildSrcSpecMod.TopLevelSpec,
    config: vegaDashLiteLib.buildSrcConfigMod.Config
  ): vegaDashLiteLib.buildSrcSpecMod.NormalizedSpec = js.native
  def normalize(
    spec: vegaDashLiteLib.buildSrcSpecMod.FacetedCompositeUnitSpec,
    config: vegaDashLiteLib.buildSrcConfigMod.Config
  ): vegaDashLiteLib.buildSrcSpecMod.NormalizedSpec = js.native
}

