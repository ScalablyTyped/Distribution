package typings.atTensorflowTfjsDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distEngineMod {
  import typings.atTensorflowTfjsDashCore.Anon_Dy
  import typings.atTensorflowTfjsDashCore.distBackendsBackendMod.KernelBackend
  import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
  import typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.GradSaveFunc
  import typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.TensorContainer
  import typings.atTensorflowTfjsDashCore.distTypesMod.Rank

  type CustomGradientFunc[T /* <: Tensor[Rank] */] = js.Function1[/* repeated */ Tensor[Rank] | GradSaveFunc, Anon_Dy[T]]
  type ForwardFunc[T] = js.Function2[/* backend */ KernelBackend, /* save */ js.UndefOr[GradSaveFunc], T]
  type ScopeFn[T /* <: TensorContainer */] = js.Function0[T]
}
