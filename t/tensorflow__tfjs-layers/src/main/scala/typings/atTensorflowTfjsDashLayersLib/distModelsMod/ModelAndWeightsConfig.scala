package typings
package atTensorflowTfjsDashLayersLib.distModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelAndWeightsConfig extends js.Object {
  /**
    * A JSON object or JSON string containing the model config.
    *
    * This can be either of the following two formats:
    *   - A model archiecture-only config,  i.e., a format consistent with the
    *     return value of`keras.Model.to_json()`.
    *   - A full model config, containing not only model architecture, but also
    *     training options and state, i.e., a format consistent with the return
    *     value of `keras.models.save_model()`.
    */
  var modelTopology: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatTypesMod.PyJsonDict
  /**
    * Path to prepend to the paths in `weightManifest` before fetching.
    *
    * The path may optionally end in a slash ('/').
    */
  var pathPrefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A weights manifest in TensorFlow.js format.
    */
  var weightsManifest: js.UndefOr[atTensorflowTfjsDashCoreLib.distIoTypesMod.WeightsManifestConfig] = js.undefined
}

object ModelAndWeightsConfig {
  @scala.inline
  def apply(
    modelTopology: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatTypesMod.PyJsonDict,
    pathPrefix: java.lang.String = null,
    weightsManifest: atTensorflowTfjsDashCoreLib.distIoTypesMod.WeightsManifestConfig = null
  ): ModelAndWeightsConfig = {
    val __obj = js.Dynamic.literal(modelTopology = modelTopology)
    if (pathPrefix != null) __obj.updateDynamic("pathPrefix")(pathPrefix)
    if (weightsManifest != null) __obj.updateDynamic("weightsManifest")(weightsManifest)
    __obj.asInstanceOf[ModelAndWeightsConfig]
  }
}

