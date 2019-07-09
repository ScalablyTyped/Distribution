package typings
package atTensorflowTfjsDashDataLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/readers", JSImport.Namespace)
@js.native
object distReadersMod extends js.Object {
  def csv(source: stdLib.RequestInfo): atTensorflowTfjsDashDataLib.distDatasetsCsvUnderscoreDatasetMod.CSVDataset = js.native
  def csv(source: stdLib.RequestInfo, csvConfig: atTensorflowTfjsDashDataLib.distTypesMod.CSVConfig): atTensorflowTfjsDashDataLib.distDatasetsCsvUnderscoreDatasetMod.CSVDataset = js.native
  def func[T /* <: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer */](f: js.Function0[stdLib.IteratorResult[T] | js.Promise[stdLib.IteratorResult[T]]]): atTensorflowTfjsDashDataLib.distDatasetMod.Dataset[T] = js.native
  def generator[T /* <: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer */](generator: js.Function0[stdLib.Iterator[T] | js.Promise[stdLib.Iterator[T]]]): atTensorflowTfjsDashDataLib.distDatasetMod.Dataset[T] = js.native
  def microphone(): js.Promise[
    atTensorflowTfjsDashDataLib.distIteratorsMicrophoneUnderscoreIteratorMod.MicrophoneIterator
  ] = js.native
  def microphone(microphoneConfig: atTensorflowTfjsDashDataLib.distTypesMod.MicrophoneConfig): js.Promise[
    atTensorflowTfjsDashDataLib.distIteratorsMicrophoneUnderscoreIteratorMod.MicrophoneIterator
  ] = js.native
  def webcam(): js.Promise[
    atTensorflowTfjsDashDataLib.distIteratorsWebcamUnderscoreIteratorMod.WebcamIterator
  ] = js.native
  def webcam(webcamVideoElement: stdLib.HTMLVideoElement): js.Promise[
    atTensorflowTfjsDashDataLib.distIteratorsWebcamUnderscoreIteratorMod.WebcamIterator
  ] = js.native
  def webcam(
    webcamVideoElement: stdLib.HTMLVideoElement,
    webcamConfig: atTensorflowTfjsDashDataLib.distTypesMod.WebcamConfig
  ): js.Promise[
    atTensorflowTfjsDashDataLib.distIteratorsWebcamUnderscoreIteratorMod.WebcamIterator
  ] = js.native
}

