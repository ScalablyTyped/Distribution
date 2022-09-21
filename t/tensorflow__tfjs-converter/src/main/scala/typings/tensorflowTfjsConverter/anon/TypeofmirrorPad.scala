package typings.tensorflowTfjsConverter.anon

import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.reflect
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.symmetric
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofmirrorPad extends StObject {
  
  def apply[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](x: T | TensorLike, paddings: js.Array[js.Tuple2[Double, Double]], mode: reflect | symmetric): T = js.native
}
