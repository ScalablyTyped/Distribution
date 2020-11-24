package typings.tensorflowTfjsLayers.modelsMod

import typings.tensorflowTfjsCore.typesMod.WeightsManifestConfig
import typings.tensorflowTfjsCore.typesMod.WeightsManifestGroupConfig
import typings.tensorflowTfjsLayers.typesMod.PyJsonDict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var modelTopology: PyJsonDict = js.native
  
  /**
    * Path to prepend to the paths in `weightManifest` before fetching.
    *
    * The path may optionally end in a slash ('/').
    */
  var pathPrefix: js.UndefOr[String] = js.native
  
  /**
    * A weights manifest in TensorFlow.js format.
    */
  var weightsManifest: js.UndefOr[WeightsManifestConfig] = js.native
}
object ModelAndWeightsConfig {
  
  @scala.inline
  def apply(modelTopology: PyJsonDict): ModelAndWeightsConfig = {
    val __obj = js.Dynamic.literal(modelTopology = modelTopology.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelAndWeightsConfig]
  }
  
  @scala.inline
  implicit class ModelAndWeightsConfigOps[Self <: ModelAndWeightsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setModelTopology(value: PyJsonDict): Self = this.set("modelTopology", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathPrefix(value: String): Self = this.set("pathPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathPrefix: Self = this.set("pathPrefix", js.undefined)
    
    @scala.inline
    def setWeightsManifestVarargs(value: WeightsManifestGroupConfig*): Self = this.set("weightsManifest", js.Array(value :_*))
    
    @scala.inline
    def setWeightsManifest(value: WeightsManifestConfig): Self = this.set("weightsManifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeightsManifest: Self = this.set("weightsManifest", js.undefined)
  }
}
