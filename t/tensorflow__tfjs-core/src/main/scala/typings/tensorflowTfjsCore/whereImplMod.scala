package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object whereImplMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/where_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def whereImpl(condShape: js.Array[Double], condVals: TypedArray): Tensor2D = (^.asInstanceOf[js.Dynamic].applyDynamic("whereImpl")(condShape.asInstanceOf[js.Any], condVals.asInstanceOf[js.Any])).asInstanceOf[Tensor2D]
}
