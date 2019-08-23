package typings.atTensorflowTfjsDashData.atTensorflowTfjsDashDataMod

import typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.TensorContainer
import typings.atTensorflowTfjsDashData.atTensorflowTfjsDashDataStrings.`1DOT2DOT8`
import typings.atTensorflowTfjsDashData.distIteratorsMicrophoneUnderscoreIteratorMod.MicrophoneIterator
import typings.atTensorflowTfjsDashData.distIteratorsWebcamUnderscoreIteratorMod.WebcamIterator
import typings.atTensorflowTfjsDashData.distTypesMod.CSVConfig
import typings.atTensorflowTfjsDashData.distTypesMod.DatasetContainer
import typings.atTensorflowTfjsDashData.distTypesMod.MicrophoneConfig
import typings.atTensorflowTfjsDashData.distTypesMod.WebcamConfig
import typings.std.HTMLVideoElement
import typings.std.Iterator
import typings.std.IteratorResult
import typings.std.RequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version_data: `1DOT2DOT8` = js.native
  def array[T /* <: TensorContainer */](items: js.Array[T]): typings.atTensorflowTfjsDashData.distDatasetMod.Dataset[T] = js.native
  def csv(source: RequestInfo): typings.atTensorflowTfjsDashData.distDatasetsCsvUnderscoreDatasetMod.CSVDataset = js.native
  def csv(source: RequestInfo, csvConfig: CSVConfig): typings.atTensorflowTfjsDashData.distDatasetsCsvUnderscoreDatasetMod.CSVDataset = js.native
  def func[T /* <: TensorContainer */](f: js.Function0[IteratorResult[T] | js.Promise[IteratorResult[T]]]): typings.atTensorflowTfjsDashData.distDatasetMod.Dataset[T] = js.native
  def generator[T /* <: TensorContainer */](generator: js.Function0[Iterator[T] | js.Promise[Iterator[T]]]): typings.atTensorflowTfjsDashData.distDatasetMod.Dataset[T] = js.native
  def microphone(): js.Promise[MicrophoneIterator] = js.native
  def microphone(microphoneConfig: MicrophoneConfig): js.Promise[MicrophoneIterator] = js.native
  def webcam(): js.Promise[WebcamIterator] = js.native
  def webcam(webcamVideoElement: HTMLVideoElement): js.Promise[WebcamIterator] = js.native
  def webcam(webcamVideoElement: HTMLVideoElement, webcamConfig: WebcamConfig): js.Promise[WebcamIterator] = js.native
  def zip[O /* <: TensorContainer */](datasets: DatasetContainer): typings.atTensorflowTfjsDashData.distDatasetMod.Dataset[O] = js.native
}

