package typings
package atTensorflowTfjsDashCoreLib.distOptimizersOptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/optimizers/optimizer", "Optimizer")
@js.native
abstract class Optimizer ()
  extends atTensorflowTfjsDashCoreLib.distSerializationMod.Serializable {
  /**
    * The number of iterations that this optimizer instance has been invoked for.
    */
  val iterations: scala.Double = js.native
  var iterations_ : scala.Double = js.native
  /**
    * Updates variables by using the computed gradients.
    *
    * @param variableGradients A mapping of variable name to its gradient value.
    */
  def applyGradients(variableGradients: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap): scala.Unit = js.native
  def applyGradients(variableGradients: js.Array[atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensor]): scala.Unit = js.native
  /**
    * Executes f() and computes the gradient of the scalar output of f() with
    * respect to the list of trainable variables provided by `varList`. If no
    * list is provided, it defaults to all trainable variables.
    *
    * @param f The function to execute and whose output to use for computing
    * gradients with respect to variables.
    * @param varList An optional list of variables to compute gradients with
    * respect to. If specified, only the trainable variables in varList will have
    * gradients computed with respect to. Defaults to all trainable variables.
    */
  def computeGradients(f: js.Function0[atTensorflowTfjsDashCoreLib.distTensorMod.Scalar]): atTensorflowTfjsDashCoreLib.Anon_GradsValue = js.native
  def computeGradients(
    f: js.Function0[atTensorflowTfjsDashCoreLib.distTensorMod.Scalar],
    varList: js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Variable[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): atTensorflowTfjsDashCoreLib.Anon_GradsValue = js.native
  /**
    * Dispose the variables (if any) owned by this optimizer instance.
    */
  def dispose(): scala.Unit = js.native
  /**
    * Extract the first element of the weight values and set it
    * as the iterations counter variable of this instance of optimizer.
    *
    * @param weightValues
    * @returns Weight values with the first element consumed and excluded.
    */
  /* protected */ def extractIterations(weightValues: js.Array[atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensor]): js.Promise[js.Array[atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensor]] = js.native
  def getWeights(): js.Promise[js.Array[atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensor]] = js.native
  /* protected */ def incrementIterations(): scala.Unit = js.native
  /**
    * Executes `f()` and minimizes the scalar output of `f()` by computing
    * gradients of y with respect to the list of trainable variables provided by
    * `varList`. If no list is provided, it defaults to all trainable variables.
    *
    * @param f The function to execute and whose output to minimize.
    * @param returnCost Whether to return the scalar cost value produced by
    * executing `f()`.
    * @param varList An optional list of variables to update. If specified, only
    * the trainable variables in varList will be updated by minimize. Defaults to
    * all trainable variables.
    */
  /** @doc {heading: 'Training', subheading: 'Optimizers'} */
  def minimize(f: js.Function0[atTensorflowTfjsDashCoreLib.distTensorMod.Scalar]): atTensorflowTfjsDashCoreLib.distTensorMod.Scalar | scala.Null = js.native
  def minimize(f: js.Function0[atTensorflowTfjsDashCoreLib.distTensorMod.Scalar], returnCost: scala.Boolean): atTensorflowTfjsDashCoreLib.distTensorMod.Scalar | scala.Null = js.native
  def minimize(
    f: js.Function0[atTensorflowTfjsDashCoreLib.distTensorMod.Scalar],
    returnCost: scala.Boolean,
    varList: js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Variable[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Scalar | scala.Null = js.native
  def saveIterations(): js.Promise[atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensor] = js.native
  def setWeights(weightValues: js.Array[atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensor]): js.Promise[scala.Unit] = js.native
}

