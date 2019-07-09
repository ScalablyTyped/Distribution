package typings
package atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "browser")
@js.native
object browserNs extends js.Object {
  val fromPixels: js.Function2[
    /* pixels */ atTensorflowTfjsDashCoreLib.distTypesMod.PixelData | stdLib.ImageData | stdLib.HTMLImageElement | stdLib.HTMLCanvasElement | stdLib.HTMLVideoElement, 
    /* numChannels */ js.UndefOr[scala.Double], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D
  ] = js.native
  def toPixels(
    img: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): js.Promise[stdLib.Uint8ClampedArray] = js.native
  def toPixels(
    img: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    canvas: stdLib.HTMLCanvasElement
  ): js.Promise[stdLib.Uint8ClampedArray] = js.native
}

