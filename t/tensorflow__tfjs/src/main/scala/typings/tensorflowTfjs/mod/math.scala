package typings.tensorflowTfjs.mod

import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object math {
  
  @JSImport("@tensorflow/tfjs", "math.confusionMatrix")
  @js.native
  val confusionMatrix: js.Function3[
    /* labels */ Tensor1D | TensorLike, 
    /* predictions */ Tensor1D | TensorLike, 
    /* numClasses */ Double, 
    Tensor2D
  ] = js.native
}
