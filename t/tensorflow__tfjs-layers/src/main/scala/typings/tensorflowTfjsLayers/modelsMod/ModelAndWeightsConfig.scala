package typings.tensorflowTfjsLayers.modelsMod

import typings.tensorflowTfjsCore.typesMod.WeightsManifestConfig
import typings.tensorflowTfjsLayers.typesMod.PyJsonDict
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
  var modelTopology: PyJsonDict
  /**
    * Path to prepend to the paths in `weightManifest` before fetching.
    *
    * The path may optionally end in a slash ('/').
    */
  var pathPrefix: js.UndefOr[String] = js.undefined
  /**
    * A weights manifest in TensorFlow.js format.
    */
  var weightsManifest: js.UndefOr[WeightsManifestConfig] = js.undefined
}

object ModelAndWeightsConfig {
  @scala.inline
  def apply(
    modelTopology: PyJsonDict,
    pathPrefix: String = null,
    weightsManifest: WeightsManifestConfig = null
  ): ModelAndWeightsConfig = {
    val __obj = js.Dynamic.literal(modelTopology = modelTopology.asInstanceOf[js.Any])
    if (pathPrefix != null) __obj.updateDynamic("pathPrefix")(pathPrefix.asInstanceOf[js.Any])
    if (weightsManifest != null) __obj.updateDynamic("weightsManifest")(weightsManifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelAndWeightsConfig]
  }
}

