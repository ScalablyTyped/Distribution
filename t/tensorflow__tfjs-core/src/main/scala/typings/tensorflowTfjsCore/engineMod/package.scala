package typings.tensorflowTfjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object engineMod {
  type CustomGradientFunc[T /* <: typings.tensorflowTfjsCore.tensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */] = js.Function1[
    /* repeated */ typings.tensorflowTfjsCore.tensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] | typings.tensorflowTfjsCore.tensorTypesMod.GradSaveFunc, 
    typings.tensorflowTfjsCore.AnonGradFunc[T]
  ]
  type ForwardFunc[T] = js.Function2[
    /* backend */ typings.tensorflowTfjsCore.backendMod.KernelBackend, 
    /* save */ js.UndefOr[typings.tensorflowTfjsCore.tensorTypesMod.GradSaveFunc], 
    T
  ]
  type ScopeFn[T /* <: typings.tensorflowTfjsCore.tensorTypesMod.TensorContainer */] = js.Function0[T]
}
