package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.anon.AllDims
import typings.tensorflowTfjsCore.anon.ExpandDims
import typings.tensorflowTfjsCore.anon.Path
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBackendsEinsumUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/einsum_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkEinsumDimSizes(nDims: Double, idDims: js.Array[js.Array[Double]], tensors: js.Array[Tensor[Rank]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEinsumDimSizes")(nDims.asInstanceOf[js.Any], idDims.asInstanceOf[js.Any], tensors.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def decodeEinsumEquation(equation: String, numTensors: Double): AllDims = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeEinsumEquation")(equation.asInstanceOf[js.Any], numTensors.asInstanceOf[js.Any])).asInstanceOf[AllDims]
  
  inline def getEinsumComputePath(summedDims: js.Array[Double], idDims: js.Array[js.Array[Double]]): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("getEinsumComputePath")(summedDims.asInstanceOf[js.Any], idDims.asInstanceOf[js.Any])).asInstanceOf[Path]
  
  inline def getEinsumPermutation(nDims: Double, idDims: js.Array[Double]): ExpandDims = (^.asInstanceOf[js.Dynamic].applyDynamic("getEinsumPermutation")(nDims.asInstanceOf[js.Any], idDims.asInstanceOf[js.Any])).asInstanceOf[ExpandDims]
  
  inline def isIdentityPermutation(perm: js.Array[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentityPermutation")(perm.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
