package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank.R4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageTestUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/image_test_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTestImageAsTensor4d(): Tensor[R4] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTestImageAsTensor4d")().asInstanceOf[Tensor[R4]]
}
