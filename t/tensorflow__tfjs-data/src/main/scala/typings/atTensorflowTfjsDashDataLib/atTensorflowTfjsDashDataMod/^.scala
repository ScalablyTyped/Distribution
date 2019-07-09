package typings
package atTensorflowTfjsDashDataLib.atTensorflowTfjsDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version_data: atTensorflowTfjsDashDataLib.atTensorflowTfjsDashDataLibStrings.`1DOT2DOT2` = js.native
  def array[T /* <: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer */](items: js.Array[T]): atTensorflowTfjsDashDataLib.distDatasetMod.Dataset[T] = js.native
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
  def zip[O /* <: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer */](datasets: atTensorflowTfjsDashDataLib.distTypesMod.DatasetContainer): atTensorflowTfjsDashDataLib.distDatasetMod.Dataset[O] = js.native
}

