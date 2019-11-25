package typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod

import typings.atTensorflowTfjsDashCore.Anon_GradsValue
import typings.atTensorflowTfjsDashCore.distTensorMod.Scalar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "variableGrads")
@js.native
object variableGrads extends js.Object {
  /**
    * Computes and returns the gradient of f(x) with respect to the list of
    * trainable variables provided by `varList`. If no list is provided, it
    * defaults to all trainable variables.
    *
    * ```js
    * const a = tf.variable(tf.tensor1d([3, 4]));
    * const b = tf.variable(tf.tensor1d([5, 6]));
    * const x = tf.tensor1d([1, 2]);
    *
    * // f(a, b) = a * x ^ 2 + b * x
    * const f = () => a.mul(x.square()).add(b.mul(x)).sum();
    * // df/da = x ^ 2, df/db = x
    * const {value, grads} = tf.variableGrads(f);
    *
    * Object.keys(grads).forEach(varName => grads[varName].print());
    * ```
    *
    * @param f The function to execute. f() should return a scalar.
    * @param varList The list of variables to compute the gradients with respect
    *     to. Defaults to all trainable variables.
    * @returns An object with the following keys and values:
    *   - `value`: The value of the function `f`.
    *   - `grads`: A map from the names of the variables to the gradients.
    *     If the `varList` argument is provided explicitly and contains a subset of
    *     non-trainable variables, this map in the return value will contain keys
    *     that map the names of the non-trainable variables to `null`.
    */
  /** @doc {heading: 'Training', subheading: 'Gradients'} */
  def apply(f: js.Function0[Scalar]): Anon_GradsValue = js.native
  def apply(
    f: js.Function0[Scalar],
    varList: js.Array[
      typings.atTensorflowTfjsDashCore.distTensorMod.Variable[typings.atTensorflowTfjsDashCore.distTypesMod.Rank]
    ]
  ): Anon_GradsValue = js.native
}

