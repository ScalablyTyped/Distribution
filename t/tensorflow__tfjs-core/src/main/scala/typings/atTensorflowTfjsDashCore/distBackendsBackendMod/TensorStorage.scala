package typings.atTensorflowTfjsDashCore.distBackendsBackendMod

import typings.atTensorflowTfjsDashCore.Anon_Unreliable
import typings.atTensorflowTfjsDashCore.distTensorMod.DataId
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typings.atTensorflowTfjsDashCore.distTypesMod.BackendValues
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashCore.distTypesMod.PixelData
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TensorStorage extends js.Object {
  def disposeData(dataId: DataId): Unit = js.native
  def fromPixels(pixels: PixelData, numChannels: Double): Tensor3D = js.native
  def fromPixels(pixels: HTMLCanvasElement, numChannels: Double): Tensor3D = js.native
  def fromPixels(pixels: HTMLImageElement, numChannels: Double): Tensor3D = js.native
  def fromPixels(pixels: HTMLVideoElement, numChannels: Double): Tensor3D = js.native
  def fromPixels(pixels: ImageData, numChannels: Double): Tensor3D = js.native
  def memory(): Anon_Unreliable = js.native
  def read(dataId: DataId): js.Promise[BackendValues] = js.native
  def readSync(dataId: DataId): BackendValues = js.native
  def register(dataId: DataId, shape: js.Array[Double], dtype: DataType): Unit = js.native
  def write(dataId: DataId, values: BackendValues): Unit = js.native
}

