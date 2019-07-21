package typings
package atTensorflowTfjsDashCoreLib.distBackendsBackendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TensorStorage extends js.Object {
  def disposeData(dataId: atTensorflowTfjsDashCoreLib.distTensorMod.DataId): scala.Unit = js.native
  def fromPixels(pixels: atTensorflowTfjsDashCoreLib.distTypesMod.PixelData, numChannels: scala.Double): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D = js.native
  def fromPixels(pixels: stdLib.HTMLCanvasElement, numChannels: scala.Double): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D = js.native
  def fromPixels(pixels: stdLib.HTMLImageElement, numChannels: scala.Double): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D = js.native
  def fromPixels(pixels: stdLib.HTMLVideoElement, numChannels: scala.Double): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D = js.native
  def fromPixels(pixels: stdLib.ImageData, numChannels: scala.Double): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D = js.native
  def memory(): atTensorflowTfjsDashCoreLib.Anon_Unreliable = js.native
  def read(dataId: atTensorflowTfjsDashCoreLib.distTensorMod.DataId): js.Promise[atTensorflowTfjsDashCoreLib.distTypesMod.BackendValues] = js.native
  def readSync(dataId: atTensorflowTfjsDashCoreLib.distTensorMod.DataId): atTensorflowTfjsDashCoreLib.distTypesMod.BackendValues = js.native
  def register(
    dataId: atTensorflowTfjsDashCoreLib.distTensorMod.DataId,
    shape: js.Array[scala.Double],
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): scala.Unit = js.native
  def write(
    dataId: atTensorflowTfjsDashCoreLib.distTensorMod.DataId,
    values: atTensorflowTfjsDashCoreLib.distTypesMod.BackendValues
  ): scala.Unit = js.native
}

