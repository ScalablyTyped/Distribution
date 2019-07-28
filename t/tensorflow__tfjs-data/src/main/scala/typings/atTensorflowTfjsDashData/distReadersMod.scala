package typings.atTensorflowTfjsDashData

import typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.TensorContainer
import typings.atTensorflowTfjsDashData.distDatasetMod.Dataset
import typings.atTensorflowTfjsDashData.distDatasetsCsvUnderscoreDatasetMod.CSVDataset
import typings.atTensorflowTfjsDashData.distIteratorsMicrophoneUnderscoreIteratorMod.MicrophoneIterator
import typings.atTensorflowTfjsDashData.distIteratorsWebcamUnderscoreIteratorMod.WebcamIterator
import typings.atTensorflowTfjsDashData.distTypesMod.CSVConfig
import typings.atTensorflowTfjsDashData.distTypesMod.MicrophoneConfig
import typings.atTensorflowTfjsDashData.distTypesMod.WebcamConfig
import typings.std.HTMLVideoElement
import typings.std.Iterator
import typings.std.IteratorResult
import typings.std.RequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/readers", JSImport.Namespace)
@js.native
object distReadersMod extends js.Object {
  def csv(source: RequestInfo): CSVDataset = js.native
  def csv(source: RequestInfo, csvConfig: CSVConfig): CSVDataset = js.native
  def func[T /* <: TensorContainer */](f: js.Function0[IteratorResult[T] | js.Promise[IteratorResult[T]]]): Dataset[T] = js.native
  def generator[T /* <: TensorContainer */](generator: js.Function0[Iterator[T] | js.Promise[Iterator[T]]]): Dataset[T] = js.native
  def microphone(): js.Promise[MicrophoneIterator] = js.native
  def microphone(microphoneConfig: MicrophoneConfig): js.Promise[MicrophoneIterator] = js.native
  def webcam(): js.Promise[WebcamIterator] = js.native
  def webcam(webcamVideoElement: HTMLVideoElement): js.Promise[WebcamIterator] = js.native
  def webcam(webcamVideoElement: HTMLVideoElement, webcamConfig: WebcamConfig): js.Promise[WebcamIterator] = js.native
}

