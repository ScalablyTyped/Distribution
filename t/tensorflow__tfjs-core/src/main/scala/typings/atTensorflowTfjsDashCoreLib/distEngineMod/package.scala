package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distEngineMod {
  type CustomGradientFunc[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */] = js.Function1[
    /* repeated */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.GradSaveFunc, 
    atTensorflowTfjsDashCoreLib.Anon_Dy[T]
  ]
  type ForwardFunc[T] = js.Function2[
    /* backend */ atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend, 
    /* save */ js.UndefOr[atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.GradSaveFunc], 
    T
  ]
  type ScopeFn[T /* <: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer */] = js.Function0[T]
}
