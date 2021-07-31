package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/types_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getExactlyOneShape(shapes: js.Array[Shape] | Shape): Shape = ^.asInstanceOf[js.Dynamic].applyDynamic("getExactlyOneShape")(shapes.asInstanceOf[js.Any]).asInstanceOf[Shape]
  
  @scala.inline
  def getExactlyOneTensor(xs: js.Array[Tensor[Rank]]): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("getExactlyOneTensor")(xs.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
  @scala.inline
  def getExactlyOneTensor(xs: Tensor[Rank]): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("getExactlyOneTensor")(xs.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
  
  @scala.inline
  def isArrayOfShapes(x: js.Array[Shape] | Shape): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayOfShapes")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def normalizeShapeList(x: js.Array[Shape] | Shape): js.Array[Shape] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeShapeList")(x.asInstanceOf[js.Any]).asInstanceOf[js.Array[Shape]]
}
