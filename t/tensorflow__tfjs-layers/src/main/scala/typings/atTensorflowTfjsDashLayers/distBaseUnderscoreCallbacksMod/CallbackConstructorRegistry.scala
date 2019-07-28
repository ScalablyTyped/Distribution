package typings.atTensorflowTfjsDashLayers.distBaseUnderscoreCallbacksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "CallbackConstructorRegistry")
@js.native
/**
  * Blocks public access to constructor.
  */
class CallbackConstructorRegistry protected () extends js.Object

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", "CallbackConstructorRegistry")
@js.native
object CallbackConstructorRegistry extends js.Object {
  var checkForDuplicate: js.Any = js.native
  var constructors: js.Any = js.native
  /**
    * Clear all registered callback constructors.
    */
  /* protected */ def clear(): Unit = js.native
  /**
    * Create callbacks using the registered callback constructors.
    *
    * Given `verbosityLevel`, all constructors registered at that level or above
    * will be called and the instantiated callbacks will be used.
    *
    * @param verbosityLevel: Level of verbosity.
    */
  def createCallbacks(verbosityLevel: Double): js.Array[BaseCallback] = js.native
  /**
    * Register a tf.LayersModel.fit() callback constructor.
    *
    * The registered callback constructor will be used to instantiate
    * callbacks for every tf.LayersModel.fit() call afterwards.
    *
    * @param verbosityLevel Level of verbosity at which the `callbackConstructor`
    *   is to be reigstered.
    * @param callbackConstructor A no-arg constructor for `tf.Callback`.
    * @throws Error, if the same callbackConstructor has been registered before,
    *   either at the same or a different `verbosityLevel`.
    */
  def registerCallbackConstructor(verbosityLevel: Double, callbackConstructor: BaseCallbackConstructor): Unit = js.native
}

