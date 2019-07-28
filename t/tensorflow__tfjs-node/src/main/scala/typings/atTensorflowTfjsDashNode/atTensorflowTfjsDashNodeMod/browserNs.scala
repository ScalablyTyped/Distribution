package typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor2D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typings.atTensorflowTfjsDashCore.distTypesMod.PixelData
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageData
import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "browser")
@js.native
object browserNs extends js.Object {
  val fromPixels: js.Function2[
    /* pixels */ PixelData | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement, 
    /* numChannels */ js.UndefOr[Double], 
    Tensor3D
  ] = js.native
  def toPixels(img: Tensor2D | Tensor3D | TensorLike): js.Promise[Uint8ClampedArray] = js.native
  def toPixels(img: Tensor2D | Tensor3D | TensorLike, canvas: HTMLCanvasElement): js.Promise[Uint8ClampedArray] = js.native
}

