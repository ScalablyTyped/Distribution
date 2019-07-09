package typings
package atTensorflowTfjsDashCoreLib.distIoModelUnderscoreManagementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/io/model_management", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Copy a model from one URL to another.
    *
    * This function supports:
    *
    * 1. Copying within a storage medium, e.g.,
    *    `tf.io.copyModel('localstorage://model-1', 'localstorage://model-2')`
    * 2. Copying between two storage mediums, e.g.,
    *    `tf.io.copyModel('localstorage://model-1', 'indexeddb://model-1')`
    *
    * ```js
    * // First create and save a model.
    * const model = tf.sequential();
    * model.add(tf.layers.dense(
    *     {units: 1, inputShape: [10], activation: 'sigmoid'}));
    * await model.save('localstorage://demo/management/model1');
    *
    * // Then list existing models.
    * console.log(JSON.stringify(await tf.io.listModels()));
    *
    * // Copy the model, from Local Storage to IndexedDB.
    * await tf.io.copyModel(
    *     'localstorage://demo/management/model1',
    *     'indexeddb://demo/management/model1');
    *
    * // List models again.
    * console.log(JSON.stringify(await tf.io.listModels()));
    *
    * // Remove both models.
    * await tf.io.removeModel('localstorage://demo/management/model1');
    * await tf.io.removeModel('indexeddb://demo/management/model1');
    * ```
    *
    * @param sourceURL Source URL of copying.
    * @param destURL Destination URL of copying.
    * @returns ModelArtifactsInfo of the copied model (if and only if copying
    *   is successful).
    * @throws Error if copying fails, e.g., if no model exists at `sourceURL`, or
    *   if `oldPath` and `newPath` are identical.
    */
  /**
    * @doc {
    *   heading: 'Models',
    *   subheading: 'Management',
    *   namespace: 'io',
    *   ignoreCI: true
    * }
    */
  def copyModel(sourceURL: java.lang.String, destURL: java.lang.String): js.Promise[atTensorflowTfjsDashCoreLib.distIoTypesMod.ModelArtifactsInfo] = js.native
  /**
    * List all models stored in registered storage mediums.
    *
    * For a web browser environment, the registered mediums are Local Storage and
    * IndexedDB.
    *
    * ```js
    * // First create and save a model.
    * const model = tf.sequential();
    * model.add(tf.layers.dense(
    *     {units: 1, inputShape: [10], activation: 'sigmoid'}));
    * await model.save('localstorage://demo/management/model1');
    *
    * // Then list existing models.
    * console.log(JSON.stringify(await tf.io.listModels()));
    *
    * // Delete the model.
    * await tf.io.removeModel('localstorage://demo/management/model1');
    *
    * // List models again.
    * console.log(JSON.stringify(await tf.io.listModels()));
    * ```
    *
    * @returns A `Promise` of a dictionary mapping URLs of existing models to
    * their model artifacts info. URLs include medium-specific schemes, e.g.,
    *   'indexeddb://my/model/1'. Model artifacts info include type of the
    * model's topology, byte sizes of the topology, weights, etc.
    */
  /**
    * @doc {
    *   heading: 'Models',
    *   subheading: 'Management',
    *   namespace: 'io',
    *   ignoreCI: true
    * }
    */
  def listModels(): js.Promise[
    org.scalablytyped.runtime.StringDictionary[atTensorflowTfjsDashCoreLib.distIoTypesMod.ModelArtifactsInfo]
  ] = js.native
  /**
    * Move a model from one URL to another.
    *
    * This function supports:
    *
    * 1. Moving within a storage medium, e.g.,
    *    `tf.io.moveModel('localstorage://model-1', 'localstorage://model-2')`
    * 2. Moving between two storage mediums, e.g.,
    *    `tf.io.moveModel('localstorage://model-1', 'indexeddb://model-1')`
    *
    * ```js
    * // First create and save a model.
    * const model = tf.sequential();
    * model.add(tf.layers.dense(
    *     {units: 1, inputShape: [10], activation: 'sigmoid'}));
    * await model.save('localstorage://demo/management/model1');
    *
    * // Then list existing models.
    * console.log(JSON.stringify(await tf.io.listModels()));
    *
    * // Move the model, from Local Storage to IndexedDB.
    * await tf.io.moveModel(
    *     'localstorage://demo/management/model1',
    *     'indexeddb://demo/management/model1');
    *
    * // List models again.
    * console.log(JSON.stringify(await tf.io.listModels()));
    *
    * // Remove the moved model.
    * await tf.io.removeModel('indexeddb://demo/management/model1');
    * ```
    *
    * @param sourceURL Source URL of moving.
    * @param destURL Destination URL of moving.
    * @returns ModelArtifactsInfo of the copied model (if and only if copying
    *   is successful).
    * @throws Error if moving fails, e.g., if no model exists at `sourceURL`, or
    *   if `oldPath` and `newPath` are identical.
    */
  /**
    * @doc {
    *   heading: 'Models',
    *   subheading: 'Management',
    *   namespace: 'io',
    *   ignoreCI: true
    * }
    */
  def moveModel(sourceURL: java.lang.String, destURL: java.lang.String): js.Promise[atTensorflowTfjsDashCoreLib.distIoTypesMod.ModelArtifactsInfo] = js.native
  /**
    * Remove a model specified by URL from a reigstered storage medium.
    *
    * ```js
    * // First create and save a model.
    * const model = tf.sequential();
    * model.add(tf.layers.dense(
    *     {units: 1, inputShape: [10], activation: 'sigmoid'}));
    * await model.save('localstorage://demo/management/model1');
    *
    * // Then list existing models.
    * console.log(JSON.stringify(await tf.io.listModels()));
    *
    * // Delete the model.
    * await tf.io.removeModel('localstorage://demo/management/model1');
    *
    * // List models again.
    * console.log(JSON.stringify(await tf.io.listModels()));
    * ```
    *
    * @param url A URL to a stored model, with a scheme prefix, e.g.,
    *   'localstorage://my-model-1', 'indexeddb://my/model/2'.
    * @returns ModelArtifactsInfo of the deleted model (if and only if deletion
    *   is successful).
    * @throws Error if deletion fails, e.g., if no model exists at `path`.
    */
  /**
    * @doc {
    *   heading: 'Models',
    *   subheading: 'Management',
    *   namespace: 'io',
    *   ignoreCI: true
    * }
    */
  def removeModel(url: java.lang.String): js.Promise[atTensorflowTfjsDashCoreLib.distIoTypesMod.ModelArtifactsInfo] = js.native
}

