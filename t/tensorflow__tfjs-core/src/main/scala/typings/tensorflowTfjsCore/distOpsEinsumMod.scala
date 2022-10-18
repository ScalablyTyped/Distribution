package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsEinsumMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/einsum", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/einsum", "einsum")
  @js.native
  val einsum: js.Function2[/* equation */ String, /* repeated */ Tensor[Rank], Tensor[Rank]] = js.native
  
  inline def einsum_(equation: String, tensors: Tensor[Rank]*): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("einsum_")(scala.List(equation.asInstanceOf[js.Any]).`++`(tensors.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Tensor[Rank]]
}
