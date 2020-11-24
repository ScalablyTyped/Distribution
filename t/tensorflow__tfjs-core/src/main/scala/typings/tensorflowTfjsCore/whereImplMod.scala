package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/backends/where_impl", JSImport.Namespace)
@js.native
object whereImplMod extends js.Object {
  
  def whereImpl(condShape: js.Array[Double], condVals: TypedArray): Tensor2D = js.native
}
