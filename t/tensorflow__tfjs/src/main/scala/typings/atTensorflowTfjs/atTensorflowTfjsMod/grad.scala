package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "grad")
@js.native
object grad extends js.Object {
  /**
    * Provided `f(x)`, returns another function `g(x, dy?)`, which gives the
    * gradient of `f(x)` with respect to `x`.
    *
    * If `dy` is provided, the gradient of `f(x).mul(dy).sum()` with respect to
    * `x` is computed instead. `f(x)` must take a single tensor `x` and return a
    * single tensor `y`. If `f()` takes multiple inputs, use `tf.grads` instead.
    *
    * ```js
    * // f(x) = x ^ 2
    * const f = x => x.square();
    * // f'(x) = 2x
    * const g = tf.grad(f);
    *
    * const x = tf.tensor1d([2, 3]);
    * g(x).print();
    * ```
    *
    * ```js
    * // f(x) = x ^ 3
    * const f = x => x.pow(tf.scalar(3, 'int32'));
    * // f'(x) = 3x ^ 2
    * const g = tf.grad(f);
    * // f''(x) = 6x
    * const gg = tf.grad(g);
    *
    * const x = tf.tensor1d([2, 3]);
    * gg(x).print();
    * ```
    *
    * @param f The function f(x), to compute gradient for.
    */
  /** @doc {heading: 'Training', subheading: 'Gradients'} */
  def apply(
    f: js.Function1[
      /* x */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank], 
      typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
    ]
  ): js.Function2[
    /* x */ TensorLike | typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank], 
    /* dy */ js.UndefOr[TensorLike | typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]], 
    typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
  ] = js.native
}

