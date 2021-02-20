package typings.tensorflowTfjsCore

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageData
import typings.std.Uint8ClampedArray
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTypesMod.PixelData
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/browser", "fromPixels")
  @js.native
  val fromPixels: js.Function2[
    /* pixels */ PixelData | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement, 
    /* numChannels */ js.UndefOr[Double], 
    Tensor3D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/browser", "toPixels")
  @js.native
  def toPixels(img: Tensor2D | Tensor3D | TensorLike): js.Promise[Uint8ClampedArray] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/browser", "toPixels")
  @js.native
  def toPixels(img: Tensor2D | Tensor3D | TensorLike, canvas: HTMLCanvasElement): js.Promise[Uint8ClampedArray] = js.native
}
