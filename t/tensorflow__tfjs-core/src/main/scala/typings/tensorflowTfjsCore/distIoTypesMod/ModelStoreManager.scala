package typings.tensorflowTfjsCore.distIoTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelStoreManager extends StObject {
  
  /**
    * List all models in the model store.
    *
    * @returns A dictionary mapping paths of existing models to their
    *   model artifacts info. Model artifacts info include type of the model's
    *   topology, byte sizes of the topology, weights, etc.
    */
  def listModels(): js.Promise[StringDictionary[ModelArtifactsInfo]]
  
  /**
    * Remove a model specified by `path`.
    *
    * @param path
    * @returns ModelArtifactsInfo of the deleted model (if and only if deletion
    *   is successful).
    * @throws Error if deletion fails, e.g., if no model exists at `path`.
    */
  def removeModel(path: String): js.Promise[ModelArtifactsInfo]
}
object ModelStoreManager {
  
  inline def apply(
    listModels: () => js.Promise[StringDictionary[ModelArtifactsInfo]],
    removeModel: String => js.Promise[ModelArtifactsInfo]
  ): ModelStoreManager = {
    val __obj = js.Dynamic.literal(listModels = js.Any.fromFunction0(listModels), removeModel = js.Any.fromFunction1(removeModel))
    __obj.asInstanceOf[ModelStoreManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelStoreManager] (val x: Self) extends AnyVal {
    
    inline def setListModels(value: () => js.Promise[StringDictionary[ModelArtifactsInfo]]): Self = StObject.set(x, "listModels", js.Any.fromFunction0(value))
    
    inline def setRemoveModel(value: String => js.Promise[ModelArtifactsInfo]): Self = StObject.set(x, "removeModel", js.Any.fromFunction1(value))
  }
}
