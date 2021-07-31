package typings.tensorflowTfjs.indexWithPolyfillsMod

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browser {
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "browser")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "browser.fromPixels")
  @js.native
  val fromPixels: js.Function2[
    /* pixels */ PixelData | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement, 
    /* numChannels */ js.UndefOr[Double], 
    Tensor3D
  ] = js.native
  
  @scala.inline
  def toPixels(img: Tensor2D | Tensor3D): js.Promise[Uint8ClampedArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("toPixels")(img.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Uint8ClampedArray]]
  @scala.inline
  def toPixels(img: Tensor2D | Tensor3D, canvas: HTMLCanvasElement): js.Promise[Uint8ClampedArray] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPixels")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Uint8ClampedArray]]
  @scala.inline
  def toPixels(img: TensorLike): js.Promise[Uint8ClampedArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("toPixels")(img.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Uint8ClampedArray]]
  @scala.inline
  def toPixels(img: TensorLike, canvas: HTMLCanvasElement): js.Promise[Uint8ClampedArray] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPixels")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Uint8ClampedArray]]
}
