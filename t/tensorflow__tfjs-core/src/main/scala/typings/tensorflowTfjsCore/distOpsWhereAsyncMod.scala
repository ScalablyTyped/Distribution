package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsWhereAsyncMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/where_async", "whereAsync")
  @js.native
  val whereAsync: js.Function1[/* condition */ Tensor[Rank] | TensorLike, js.Promise[Tensor2D]] = js.native
}
