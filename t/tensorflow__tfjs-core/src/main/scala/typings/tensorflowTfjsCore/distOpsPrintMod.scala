package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsPrintMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/print", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def print[T /* <: Tensor[Rank] */](x: T): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("print")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def print[T /* <: Tensor[Rank] */](x: T, verbose: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("print")(x.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
