package typings.tensorflowTfjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object engineMod {
  
  type CustomGradientFunc[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */] = js.Function1[
    /* repeated */ typings.tensorflowTfjsCore.distTensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] | typings.tensorflowTfjsCore.tensorTypesMod.GradSaveFunc, 
    typings.tensorflowTfjsCore.anon.GradFunc[T]
  ]
  
  type ForwardFunc[T] = js.Function2[
    /* backend */ typings.tensorflowTfjsCore.backendMod.KernelBackend, 
    /* save */ js.UndefOr[typings.tensorflowTfjsCore.tensorTypesMod.GradSaveFunc], 
    T
  ]
  
  type ScopeFn[T /* <: typings.tensorflowTfjsCore.tensorTypesMod.TensorContainer */] = js.Function0[T]
}
