package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/types_utils", "getExactlyOneShape")
  @js.native
  def getExactlyOneShape(shapes: js.Array[Shape] | Shape): Shape = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/types_utils", "getExactlyOneTensor")
  @js.native
  def getExactlyOneTensor(xs: js.Array[Tensor[Rank]]): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/utils/types_utils", "getExactlyOneTensor")
  @js.native
  def getExactlyOneTensor(xs: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/types_utils", "isArrayOfShapes")
  @js.native
  def isArrayOfShapes(x: js.Array[Shape] | Shape): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/types_utils", "normalizeShapeList")
  @js.native
  def normalizeShapeList(x: js.Array[Shape] | Shape): js.Array[Shape] = js.native
}
