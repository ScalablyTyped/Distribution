package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Scalar
import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTypesMod.ScalarLike
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringSplitMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/string/string_split", "stringSplit")
  @js.native
  val stringSplit: js.Function3[
    /* input */ Tensor1D | TensorLike, 
    /* delimiter */ Scalar | ScalarLike, 
    /* skipEmpty */ js.UndefOr[Boolean], 
    NamedTensorMap
  ] = js.native
}
