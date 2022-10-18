package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distImageTestUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/image_test_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTestImageAsTensor4d(): Tensor4D = ^.asInstanceOf[js.Dynamic].applyDynamic("getTestImageAsTensor4d")().asInstanceOf[Tensor4D]
}
