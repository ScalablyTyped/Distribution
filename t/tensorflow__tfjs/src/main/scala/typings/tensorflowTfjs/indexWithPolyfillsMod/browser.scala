package typings.tensorflowTfjs.indexWithPolyfillsMod

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageBitmap
import typings.std.ImageData
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTypesMod.PixelData
import typings.tensorflowTfjsCore.distTypesMod.Rank.R3
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
    /* pixels */ PixelData | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | ImageBitmap, 
    /* numChannels */ js.UndefOr[Double], 
    Tensor3D
  ] = js.native
  
  inline def fromPixelsAsync(pixels: HTMLCanvasElement): js.Promise[Tensor[R3]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPixelsAsync")(pixels.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tensor[R3]]]
  inline def fromPixelsAsync(pixels: HTMLCanvasElement, numChannels: Double): js.Promise[Tensor[R3]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPixelsAsync")(pixels.asInstanceOf[js.Any], numChannels.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor[R3]]]
  inline def fromPixelsAsync(pixels: HTMLImageElement): js.Promise[Tensor[R3]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPixelsAsync")(pixels.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tensor[R3]]]
  inline def fromPixelsAsync(pixels: HTMLImageElement, numChannels: Double): js.Promise[Tensor[R3]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPixelsAsync")(pixels.asInstanceOf[js.Any], numChannels.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor[R3]]]
  inline def fromPixelsAsync(pixels: HTMLVideoElement): js.Promise[Tensor[R3]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPixelsAsync")(pixels.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tensor[R3]]]
  inline def fromPixelsAsync(pixels: HTMLVideoElement, numChannels: Double): js.Promise[Tensor[R3]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPixelsAsync")(pixels.asInstanceOf[js.Any], numChannels.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor[R3]]]
  inline def fromPixelsAsync(pixels: ImageBitmap): js.Promise[Tensor[R3]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPixelsAsync")(pixels.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tensor[R3]]]
  inline def fromPixelsAsync(pixels: ImageBitmap, numChannels: Double): js.Promise[Tensor[R3]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPixelsAsync")(pixels.asInstanceOf[js.Any], numChannels.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor[R3]]]
  inline def fromPixelsAsync(pixels: ImageData): js.Promise[Tensor[R3]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPixelsAsync")(pixels.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tensor[R3]]]
  inline def fromPixelsAsync(pixels: ImageData, numChannels: Double): js.Promise[Tensor[R3]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPixelsAsync")(pixels.asInstanceOf[js.Any], numChannels.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor[R3]]]
  inline def fromPixelsAsync(pixels: PixelData): js.Promise[Tensor[R3]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPixelsAsync")(pixels.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tensor[R3]]]
  inline def fromPixelsAsync(pixels: PixelData, numChannels: Double): js.Promise[Tensor[R3]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPixelsAsync")(pixels.asInstanceOf[js.Any], numChannels.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor[R3]]]
  
  inline def toPixels(img: Tensor2D | Tensor3D): js.Promise[js.typedarray.Uint8ClampedArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("toPixels")(img.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8ClampedArray]]
  inline def toPixels(img: Tensor2D | Tensor3D, canvas: HTMLCanvasElement): js.Promise[js.typedarray.Uint8ClampedArray] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPixels")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8ClampedArray]]
  inline def toPixels(img: TensorLike): js.Promise[js.typedarray.Uint8ClampedArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("toPixels")(img.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8ClampedArray]]
  inline def toPixels(img: TensorLike, canvas: HTMLCanvasElement): js.Promise[js.typedarray.Uint8ClampedArray] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPixels")(img.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8ClampedArray]]
}
