package typings.vegaDashLite.buildSrcCompileLayerMod

import typings.vegaDashLite.buildSrcCompileModelMod.Model
import typings.vegaDashLite.buildSrcCompileRepeaterMod.RepeaterValue
import typings.vegaDashLite.buildSrcConfigMod.Config
import typings.vegaDashLite.buildSrcSpecMod.LayoutSizeMixins
import typings.vegaDashLite.buildSrcSpecMod.NormalizedLayerSpec
import typings.vegaDashLite.vegaDashLiteStrings.layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/layer", "LayerModel")
@js.native
class LayerModel protected () extends Model {
  def this(
    spec: NormalizedLayerSpec,
    parent: Model,
    parentGivenName: String,
    parentGivenSize: LayoutSizeMixins,
    repeater: RepeaterValue,
    config: Config,
    fit: Boolean
  ) = this()
  @JSName("type")
  val type_LayerModel: layer = js.native
}

