package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropoutUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/dropout_util", "getNoiseShape")
  @js.native
  def getNoiseShape(x: Tensor[Rank]): js.Array[Double] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/dropout_util", "getNoiseShape")
  @js.native
  def getNoiseShape(x: Tensor[Rank], noiseShape: js.Array[Double]): js.Array[Double] = js.native
}
