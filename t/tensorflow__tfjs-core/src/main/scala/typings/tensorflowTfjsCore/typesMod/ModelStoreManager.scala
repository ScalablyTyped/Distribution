package typings.tensorflowTfjsCore.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelStoreManager extends js.Object {
  /**
    * List all models in the model store.
    *
    * @returns A dictionary mapping paths of existing models to their
    *   model artifacts info. Model artifacts info include type of the model's
    *   topology, byte sizes of the topology, weights, etc.
    */
  def listModels(): js.Promise[StringDictionary[ModelArtifactsInfo]] = js.native
  /**
    * Remove a model specified by `path`.
    *
    * @param path
    * @returns ModelArtifactsInfo of the deleted model (if and only if deletion
    *   is successful).
    * @throws Error if deletion fails, e.g., if no model exists at `path`.
    */
  def removeModel(path: String): js.Promise[ModelArtifactsInfo] = js.native
}

object ModelStoreManager {
  @scala.inline
  def apply(
    listModels: () => js.Promise[StringDictionary[ModelArtifactsInfo]],
    removeModel: String => js.Promise[ModelArtifactsInfo]
  ): ModelStoreManager = {
    val __obj = js.Dynamic.literal(listModels = js.Any.fromFunction0(listModels), removeModel = js.Any.fromFunction1(removeModel))
    __obj.asInstanceOf[ModelStoreManager]
  }
  @scala.inline
  implicit class ModelStoreManagerOps[Self <: ModelStoreManager] (val x: Self) extends AnyVal {
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
    def setListModels(value: () => js.Promise[StringDictionary[ModelArtifactsInfo]]): Self = this.set("listModels", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveModel(value: String => js.Promise[ModelArtifactsInfo]): Self = this.set("removeModel", js.Any.fromFunction1(value))
  }
  
}

