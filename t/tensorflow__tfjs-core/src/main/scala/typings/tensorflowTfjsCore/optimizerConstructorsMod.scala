package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.adadeltaOptimizerMod.AdadeltaOptimizer
import typings.tensorflowTfjsCore.adagradOptimizerMod.AdagradOptimizer
import typings.tensorflowTfjsCore.adamOptimizerMod.AdamOptimizer
import typings.tensorflowTfjsCore.adamaxOptimizerMod.AdamaxOptimizer
import typings.tensorflowTfjsCore.momentumOptimizerMod.MomentumOptimizer
import typings.tensorflowTfjsCore.rmspropOptimizerMod.RMSPropOptimizer
import typings.tensorflowTfjsCore.sgdOptimizerMod.SGDOptimizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optimizerConstructorsMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/optimizers/optimizer_constructors", "OptimizerConstructors")
  @js.native
  open class OptimizerConstructors () extends StObject
  /* static members */
  object OptimizerConstructors {
    
    @JSImport("@tensorflow/tfjs-core/dist/optimizers/optimizer_constructors", "OptimizerConstructors")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Constructs a `tf.AdadeltaOptimizer` that uses the Adadelta algorithm.
      * See [https://arxiv.org/abs/1212.5701](https://arxiv.org/abs/1212.5701)
      *
      * @param learningRate The learning rate to use for the Adadelta gradient
      * descent algorithm.
      * @param rho The learning rate decay over each update.
      * @param epsilon A constant epsilon used to better condition the grad
      * update.
      *
      * @doc {heading: 'Training', subheading: 'Optimizers', namespace: 'train'}
      */
    inline def adadelta(): AdadeltaOptimizer = ^.asInstanceOf[js.Dynamic].applyDynamic("adadelta")().asInstanceOf[AdadeltaOptimizer]
    inline def adadelta(learningRate: Double): AdadeltaOptimizer = ^.asInstanceOf[js.Dynamic].applyDynamic("adadelta")(learningRate.asInstanceOf[js.Any]).asInstanceOf[AdadeltaOptimizer]
    inline def adadelta(learningRate: Double, rho: Double): AdadeltaOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adadelta")(learningRate.asInstanceOf[js.Any], rho.asInstanceOf[js.Any])).asInstanceOf[AdadeltaOptimizer]
    inline def adadelta(learningRate: Double, rho: Double, epsilon: Double): AdadeltaOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adadelta")(learningRate.asInstanceOf[js.Any], rho.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[AdadeltaOptimizer]
    inline def adadelta(learningRate: Double, rho: Unit, epsilon: Double): AdadeltaOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adadelta")(learningRate.asInstanceOf[js.Any], rho.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[AdadeltaOptimizer]
    inline def adadelta(learningRate: Unit, rho: Double): AdadeltaOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adadelta")(learningRate.asInstanceOf[js.Any], rho.asInstanceOf[js.Any])).asInstanceOf[AdadeltaOptimizer]
    inline def adadelta(learningRate: Unit, rho: Double, epsilon: Double): AdadeltaOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adadelta")(learningRate.asInstanceOf[js.Any], rho.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[AdadeltaOptimizer]
    inline def adadelta(learningRate: Unit, rho: Unit, epsilon: Double): AdadeltaOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adadelta")(learningRate.asInstanceOf[js.Any], rho.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[AdadeltaOptimizer]
    
    /**
      * Constructs a `tf.AdagradOptimizer` that uses the Adagrad algorithm.
      * See
      * [http://www.jmlr.org/papers/volume12/duchi11a/duchi11a.pdf](
      * http://www.jmlr.org/papers/volume12/duchi11a/duchi11a.pdf)
      * or
      * [http://ruder.io/optimizing-gradient-descent/index.html#adagrad](
      * http://ruder.io/optimizing-gradient-descent/index.html#adagrad)
      *
      * @param learningRate The learning rate to use for the Adagrad gradient
      * descent algorithm.
      * @param initialAccumulatorValue Starting value for the accumulators, must be
      * positive.
      *
      * @doc {heading: 'Training', subheading: 'Optimizers', namespace: 'train'}
      */
    inline def adagrad(learningRate: Double): AdagradOptimizer = ^.asInstanceOf[js.Dynamic].applyDynamic("adagrad")(learningRate.asInstanceOf[js.Any]).asInstanceOf[AdagradOptimizer]
    inline def adagrad(learningRate: Double, initialAccumulatorValue: Double): AdagradOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adagrad")(learningRate.asInstanceOf[js.Any], initialAccumulatorValue.asInstanceOf[js.Any])).asInstanceOf[AdagradOptimizer]
    
    /**
      * Constructs a `tf.AdamOptimizer` that uses the Adam algorithm.
      * See [https://arxiv.org/abs/1412.6980](https://arxiv.org/abs/1412.6980)
      *
      * @param learningRate The learning rate to use for the Adam gradient
      * descent algorithm.
      * @param beta1 The exponential decay rate for the 1st moment estimates.
      * @param beta2 The exponential decay rate for the 2nd moment estimates.
      * @param epsilon A small constant for numerical stability.
      *
      * @doc {heading: 'Training', subheading: 'Optimizers', namespace: 'train'}
      */
    inline def adam(): AdamOptimizer = ^.asInstanceOf[js.Dynamic].applyDynamic("adam")().asInstanceOf[AdamOptimizer]
    inline def adam(learningRate: Double): AdamOptimizer = ^.asInstanceOf[js.Dynamic].applyDynamic("adam")(learningRate.asInstanceOf[js.Any]).asInstanceOf[AdamOptimizer]
    inline def adam(learningRate: Double, beta1: Double): AdamOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adam")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any])).asInstanceOf[AdamOptimizer]
    inline def adam(learningRate: Double, beta1: Double, beta2: Double): AdamOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adam")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any])).asInstanceOf[AdamOptimizer]
    inline def adam(learningRate: Double, beta1: Double, beta2: Double, epsilon: Double): AdamOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adam")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[AdamOptimizer]
    inline def adam(learningRate: Double, beta1: Double, beta2: Unit, epsilon: Double): AdamOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adam")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[AdamOptimizer]
    inline def adam(learningRate: Double, beta1: Unit, beta2: Double): AdamOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adam")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any])).asInstanceOf[AdamOptimizer]
    inline def adam(learningRate: Double, beta1: Unit, beta2: Double, epsilon: Double): AdamOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adam")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[AdamOptimizer]
    inline def adam(learningRate: Double, beta1: Unit, beta2: Unit, epsilon: Double): AdamOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adam")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[AdamOptimizer]
    inline def adam(learningRate: Unit, beta1: Double): AdamOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adam")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any])).asInstanceOf[AdamOptimizer]
    inline def adam(learningRate: Unit, beta1: Double, beta2: Double): AdamOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adam")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any])).asInstanceOf[AdamOptimizer]
    inline def adam(learningRate: Unit, beta1: Double, beta2: Double, epsilon: Double): AdamOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adam")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[AdamOptimizer]
    inline def adam(learningRate: Unit, beta1: Double, beta2: Unit, epsilon: Double): AdamOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adam")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[AdamOptimizer]
    inline def adam(learningRate: Unit, beta1: Unit, beta2: Double): AdamOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adam")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any])).asInstanceOf[AdamOptimizer]
    inline def adam(learningRate: Unit, beta1: Unit, beta2: Double, epsilon: Double): AdamOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adam")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[AdamOptimizer]
    inline def adam(learningRate: Unit, beta1: Unit, beta2: Unit, epsilon: Double): AdamOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adam")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[AdamOptimizer]
    
    /**
      * Constructs a `tf.AdamaxOptimizer` that uses the Adamax algorithm.
      * See [https://arxiv.org/abs/1412.6980](https://arxiv.org/abs/1412.6980)
      *
      * @param learningRate The learning rate to use for the Adamax gradient
      * descent algorithm.
      * @param beta1 The exponential decay rate for the 1st moment estimates.
      * @param beta2 The exponential decay rate for the 2nd moment estimates.
      * @param epsilon A small constant for numerical stability.
      * @param decay The learning rate decay over each update.
      *
      * @doc {heading: 'Training', subheading: 'Optimizers', namespace: 'train'}
      */
    inline def adamax(): AdamaxOptimizer = ^.asInstanceOf[js.Dynamic].applyDynamic("adamax")().asInstanceOf[AdamaxOptimizer]
    inline def adamax(learningRate: Double): AdamaxOptimizer = ^.asInstanceOf[js.Dynamic].applyDynamic("adamax")(learningRate.asInstanceOf[js.Any]).asInstanceOf[AdamaxOptimizer]
    inline def adamax(learningRate: Double, beta1: Double): AdamaxOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adamax")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any])).asInstanceOf[AdamaxOptimizer]
    inline def adamax(learningRate: Double, beta1: Double, beta2: Double): AdamaxOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adamax")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any])).asInstanceOf[AdamaxOptimizer]
    inline def adamax(learningRate: Double, beta1: Double, beta2: Double, epsilon: Double): AdamaxOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adamax")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[AdamaxOptimizer]
    inline def adamax(learningRate: Double, beta1: Double, beta2: Double, epsilon: Double, decay: Double): AdamaxOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adamax")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], decay.asInstanceOf[js.Any])).asInstanceOf[AdamaxOptimizer]
    inline def adamax(learningRate: Double, beta1: Double, beta2: Double, epsilon: Unit, decay: Double): AdamaxOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adamax")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], decay.asInstanceOf[js.Any])).asInstanceOf[AdamaxOptimizer]
    inline def adamax(learningRate: Double, beta1: Double, beta2: Unit, epsilon: Double): AdamaxOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adamax")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[AdamaxOptimizer]
    inline def adamax(learningRate: Double, beta1: Double, beta2: Unit, epsilon: Double, decay: Double): AdamaxOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adamax")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], decay.asInstanceOf[js.Any])).asInstanceOf[AdamaxOptimizer]
    inline def adamax(learningRate: Double, beta1: Double, beta2: Unit, epsilon: Unit, decay: Double): AdamaxOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adamax")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], decay.asInstanceOf[js.Any])).asInstanceOf[AdamaxOptimizer]
    inline def adamax(learningRate: Double, beta1: Unit, beta2: Double): AdamaxOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adamax")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any])).asInstanceOf[AdamaxOptimizer]
    inline def adamax(learningRate: Double, beta1: Unit, beta2: Double, epsilon: Double): AdamaxOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adamax")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[AdamaxOptimizer]
    inline def adamax(learningRate: Double, beta1: Unit, beta2: Double, epsilon: Double, decay: Double): AdamaxOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adamax")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], decay.asInstanceOf[js.Any])).asInstanceOf[AdamaxOptimizer]
    inline def adamax(learningRate: Double, beta1: Unit, beta2: Double, epsilon: Unit, decay: Double): AdamaxOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adamax")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], decay.asInstanceOf[js.Any])).asInstanceOf[AdamaxOptimizer]
    inline def adamax(learningRate: Double, beta1: Unit, beta2: Unit, epsilon: Double): AdamaxOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adamax")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[AdamaxOptimizer]
    inline def adamax(learningRate: Double, beta1: Unit, beta2: Unit, epsilon: Double, decay: Double): AdamaxOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adamax")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], decay.asInstanceOf[js.Any])).asInstanceOf[AdamaxOptimizer]
    inline def adamax(learningRate: Double, beta1: Unit, beta2: Unit, epsilon: Unit, decay: Double): AdamaxOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adamax")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], decay.asInstanceOf[js.Any])).asInstanceOf[AdamaxOptimizer]
    inline def adamax(learningRate: Unit, beta1: Double): AdamaxOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adamax")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any])).asInstanceOf[AdamaxOptimizer]
    inline def adamax(learningRate: Unit, beta1: Double, beta2: Double): AdamaxOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adamax")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any])).asInstanceOf[AdamaxOptimizer]
    inline def adamax(learningRate: Unit, beta1: Double, beta2: Double, epsilon: Double): AdamaxOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adamax")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[AdamaxOptimizer]
    inline def adamax(learningRate: Unit, beta1: Double, beta2: Double, epsilon: Double, decay: Double): AdamaxOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adamax")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], decay.asInstanceOf[js.Any])).asInstanceOf[AdamaxOptimizer]
    inline def adamax(learningRate: Unit, beta1: Double, beta2: Double, epsilon: Unit, decay: Double): AdamaxOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adamax")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], decay.asInstanceOf[js.Any])).asInstanceOf[AdamaxOptimizer]
    inline def adamax(learningRate: Unit, beta1: Double, beta2: Unit, epsilon: Double): AdamaxOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adamax")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[AdamaxOptimizer]
    inline def adamax(learningRate: Unit, beta1: Double, beta2: Unit, epsilon: Double, decay: Double): AdamaxOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adamax")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], decay.asInstanceOf[js.Any])).asInstanceOf[AdamaxOptimizer]
    inline def adamax(learningRate: Unit, beta1: Double, beta2: Unit, epsilon: Unit, decay: Double): AdamaxOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adamax")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], decay.asInstanceOf[js.Any])).asInstanceOf[AdamaxOptimizer]
    inline def adamax(learningRate: Unit, beta1: Unit, beta2: Double): AdamaxOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adamax")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any])).asInstanceOf[AdamaxOptimizer]
    inline def adamax(learningRate: Unit, beta1: Unit, beta2: Double, epsilon: Double): AdamaxOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adamax")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[AdamaxOptimizer]
    inline def adamax(learningRate: Unit, beta1: Unit, beta2: Double, epsilon: Double, decay: Double): AdamaxOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adamax")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], decay.asInstanceOf[js.Any])).asInstanceOf[AdamaxOptimizer]
    inline def adamax(learningRate: Unit, beta1: Unit, beta2: Double, epsilon: Unit, decay: Double): AdamaxOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adamax")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], decay.asInstanceOf[js.Any])).asInstanceOf[AdamaxOptimizer]
    inline def adamax(learningRate: Unit, beta1: Unit, beta2: Unit, epsilon: Double): AdamaxOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adamax")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[AdamaxOptimizer]
    inline def adamax(learningRate: Unit, beta1: Unit, beta2: Unit, epsilon: Double, decay: Double): AdamaxOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adamax")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], decay.asInstanceOf[js.Any])).asInstanceOf[AdamaxOptimizer]
    inline def adamax(learningRate: Unit, beta1: Unit, beta2: Unit, epsilon: Unit, decay: Double): AdamaxOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("adamax")(learningRate.asInstanceOf[js.Any], beta1.asInstanceOf[js.Any], beta2.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], decay.asInstanceOf[js.Any])).asInstanceOf[AdamaxOptimizer]
    
    /**
      * Constructs a `tf.MomentumOptimizer` that uses momentum gradient
      * descent.
      *
      * See
      * [http://proceedings.mlr.press/v28/sutskever13.pdf](
      * http://proceedings.mlr.press/v28/sutskever13.pdf)
      *
      * @param learningRate The learning rate to use for the Momentum gradient
      * descent algorithm.
      * @param momentum The momentum to use for the momentum gradient descent
      * algorithm.
      *
      * @doc {heading: 'Training', subheading: 'Optimizers', namespace: 'train'}
      */
    inline def momentum(learningRate: Double, momentum: Double): MomentumOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("momentum")(learningRate.asInstanceOf[js.Any], momentum.asInstanceOf[js.Any])).asInstanceOf[MomentumOptimizer]
    inline def momentum(learningRate: Double, momentum: Double, useNesterov: Boolean): MomentumOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("momentum")(learningRate.asInstanceOf[js.Any], momentum.asInstanceOf[js.Any], useNesterov.asInstanceOf[js.Any])).asInstanceOf[MomentumOptimizer]
    
    /**
      * Constructs a `tf.RMSPropOptimizer` that uses RMSProp gradient
      * descent. This implementation uses plain momentum and is not centered
      * version of RMSProp.
      *
      * See
      * [http://www.cs.toronto.edu/~tijmen/csc321/slides/lecture_slides_lec6.pdf](
      * http://www.cs.toronto.edu/~tijmen/csc321/slides/lecture_slides_lec6.pdf)
      *
      * @param learningRate The learning rate to use for the RMSProp gradient
      * descent algorithm.
      * @param decay The discounting factor for the history/coming gradient.
      * @param momentum The momentum to use for the RMSProp gradient descent
      * algorithm.
      * @param epsilon Small value to avoid zero denominator.
      * @param centered If true, gradients are normalized by the estimated
      * variance of the gradient.
      *
      * @doc {heading: 'Training', subheading: 'Optimizers', namespace: 'train'}
      */
    inline def rmsprop(learningRate: Double): RMSPropOptimizer = ^.asInstanceOf[js.Dynamic].applyDynamic("rmsprop")(learningRate.asInstanceOf[js.Any]).asInstanceOf[RMSPropOptimizer]
    inline def rmsprop(learningRate: Double, decay: Double): RMSPropOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("rmsprop")(learningRate.asInstanceOf[js.Any], decay.asInstanceOf[js.Any])).asInstanceOf[RMSPropOptimizer]
    inline def rmsprop(learningRate: Double, decay: Double, momentum: Double): RMSPropOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("rmsprop")(learningRate.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], momentum.asInstanceOf[js.Any])).asInstanceOf[RMSPropOptimizer]
    inline def rmsprop(learningRate: Double, decay: Double, momentum: Double, epsilon: Double): RMSPropOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("rmsprop")(learningRate.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], momentum.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[RMSPropOptimizer]
    inline def rmsprop(learningRate: Double, decay: Double, momentum: Double, epsilon: Double, centered: Boolean): RMSPropOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("rmsprop")(learningRate.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], momentum.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], centered.asInstanceOf[js.Any])).asInstanceOf[RMSPropOptimizer]
    inline def rmsprop(learningRate: Double, decay: Double, momentum: Double, epsilon: Unit, centered: Boolean): RMSPropOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("rmsprop")(learningRate.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], momentum.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], centered.asInstanceOf[js.Any])).asInstanceOf[RMSPropOptimizer]
    inline def rmsprop(learningRate: Double, decay: Double, momentum: Unit, epsilon: Double): RMSPropOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("rmsprop")(learningRate.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], momentum.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[RMSPropOptimizer]
    inline def rmsprop(learningRate: Double, decay: Double, momentum: Unit, epsilon: Double, centered: Boolean): RMSPropOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("rmsprop")(learningRate.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], momentum.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], centered.asInstanceOf[js.Any])).asInstanceOf[RMSPropOptimizer]
    inline def rmsprop(learningRate: Double, decay: Double, momentum: Unit, epsilon: Unit, centered: Boolean): RMSPropOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("rmsprop")(learningRate.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], momentum.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], centered.asInstanceOf[js.Any])).asInstanceOf[RMSPropOptimizer]
    inline def rmsprop(learningRate: Double, decay: Unit, momentum: Double): RMSPropOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("rmsprop")(learningRate.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], momentum.asInstanceOf[js.Any])).asInstanceOf[RMSPropOptimizer]
    inline def rmsprop(learningRate: Double, decay: Unit, momentum: Double, epsilon: Double): RMSPropOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("rmsprop")(learningRate.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], momentum.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[RMSPropOptimizer]
    inline def rmsprop(learningRate: Double, decay: Unit, momentum: Double, epsilon: Double, centered: Boolean): RMSPropOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("rmsprop")(learningRate.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], momentum.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], centered.asInstanceOf[js.Any])).asInstanceOf[RMSPropOptimizer]
    inline def rmsprop(learningRate: Double, decay: Unit, momentum: Double, epsilon: Unit, centered: Boolean): RMSPropOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("rmsprop")(learningRate.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], momentum.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], centered.asInstanceOf[js.Any])).asInstanceOf[RMSPropOptimizer]
    inline def rmsprop(learningRate: Double, decay: Unit, momentum: Unit, epsilon: Double): RMSPropOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("rmsprop")(learningRate.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], momentum.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[RMSPropOptimizer]
    inline def rmsprop(learningRate: Double, decay: Unit, momentum: Unit, epsilon: Double, centered: Boolean): RMSPropOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("rmsprop")(learningRate.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], momentum.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], centered.asInstanceOf[js.Any])).asInstanceOf[RMSPropOptimizer]
    inline def rmsprop(learningRate: Double, decay: Unit, momentum: Unit, epsilon: Unit, centered: Boolean): RMSPropOptimizer = (^.asInstanceOf[js.Dynamic].applyDynamic("rmsprop")(learningRate.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], momentum.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], centered.asInstanceOf[js.Any])).asInstanceOf[RMSPropOptimizer]
    
    /**
      * Constructs a `tf.SGDOptimizer` that uses stochastic gradient descent.
      *
      * ```js
      * // Fit a quadratic function by learning the coefficients a, b, c.
      * const xs = tf.tensor1d([0, 1, 2, 3]);
      * const ys = tf.tensor1d([1.1, 5.9, 16.8, 33.9]);
      *
      * const a = tf.scalar(Math.random()).variable();
      * const b = tf.scalar(Math.random()).variable();
      * const c = tf.scalar(Math.random()).variable();
      *
      * // y = a * x^2 + b * x + c.
      * const f = x => a.mul(x.square()).add(b.mul(x)).add(c);
      * const loss = (pred, label) => pred.sub(label).square().mean();
      *
      * const learningRate = 0.01;
      * const optimizer = tf.train.sgd(learningRate);
      *
      * // Train the model.
      * for (let i = 0; i < 10; i++) {
      *   optimizer.minimize(() => loss(f(xs), ys));
      * }
      *
      * // Make predictions.
      * console.log(
      *     `a: ${a.dataSync()}, b: ${b.dataSync()}, c: ${c.dataSync()}`);
      * const preds = f(xs).dataSync();
      * preds.forEach((pred, i) => {
      *   console.log(`x: ${i}, pred: ${pred}`);
      * });
      * ```
      *
      * @param learningRate The learning rate to use for the SGD algorithm.
      *
      * @doc {heading: 'Training', subheading: 'Optimizers', namespace: 'train'}
      */
    inline def sgd(learningRate: Double): SGDOptimizer = ^.asInstanceOf[js.Dynamic].applyDynamic("sgd")(learningRate.asInstanceOf[js.Any]).asInstanceOf[SGDOptimizer]
  }
}
