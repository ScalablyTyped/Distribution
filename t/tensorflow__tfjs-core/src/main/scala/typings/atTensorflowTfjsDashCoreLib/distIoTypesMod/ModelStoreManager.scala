package typings
package atTensorflowTfjsDashCoreLib.distIoTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelStoreManager extends js.Object {
  /**
    * List all models in the model store.
    *
    * @returns A dictionary mapping paths of existing models to their
    *   model artifacts info. Model artifacts info include type of the model's
    *   topology, byte sizes of the topology, weights, etc.
    */
  def listModels(): js.Promise[org.scalablytyped.runtime.StringDictionary[ModelArtifactsInfo]]
  /**
    * Remove a model specified by `path`.
    *
    * @param path
    * @returns ModelArtifactsInfo of the deleted model (if and only if deletion
    *   is successful).
    * @throws Error if deletion fails, e.g., if no model exists at `path`.
    */
  def removeModel(path: java.lang.String): js.Promise[ModelArtifactsInfo]
}

object ModelStoreManager {
  @scala.inline
  def apply(
    listModels: () => js.Promise[org.scalablytyped.runtime.StringDictionary[ModelArtifactsInfo]],
    removeModel: java.lang.String => js.Promise[ModelArtifactsInfo]
  ): ModelStoreManager = {
    val __obj = js.Dynamic.literal(listModels = js.Any.fromFunction0(listModels), removeModel = js.Any.fromFunction1(removeModel))
  
    __obj.asInstanceOf[ModelStoreManager]
  }
}

