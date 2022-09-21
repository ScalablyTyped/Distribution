package typings.tensorflowTfjsConverter.anon

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofcast extends StObject {
  
  def apply[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](x: T | TensorLike, dtype: DataType): T = js.native
}
