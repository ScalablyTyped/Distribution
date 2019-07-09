package typings
package atTensorflowTfjsDashDataLib.distIteratorsWebcamUnderscoreIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/iterators/webcam_iterator", "WebcamIterator")
@js.native
class WebcamIterator protected ()
  extends atTensorflowTfjsDashDataLib.distIteratorsLazyUnderscoreIteratorMod.LazyIterator[atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D] {
  var cropBox: js.Any = js.native
  var cropBoxInd: js.Any = js.native
  var cropSize: js.Any = js.native
  var isClosed: js.Any = js.native
  var needToResize: js.Any = js.native
  var resize: js.Any = js.native
  var stream: js.Any = js.native
  val webcamConfig: atTensorflowTfjsDashDataLib.distTypesMod.WebcamConfig = js.native
  val webcamVideoElement: stdLib.HTMLVideoElement = js.native
  def capture(): js.Promise[atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D] = js.native
  def cropAndResizeFrame(img: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D = js.native
  def start(): js.Promise[scala.Unit] = js.native
  def stop(): scala.Unit = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-data/dist/iterators/webcam_iterator", "WebcamIterator")
@js.native
object WebcamIterator extends js.Object {
  def create(): js.Promise[
    atTensorflowTfjsDashDataLib.distIteratorsWebcamUnderscoreIteratorMod.WebcamIterator
  ] = js.native
  def create(webcamVideoElement: stdLib.HTMLVideoElement): js.Promise[
    atTensorflowTfjsDashDataLib.distIteratorsWebcamUnderscoreIteratorMod.WebcamIterator
  ] = js.native
  def create(
    webcamVideoElement: stdLib.HTMLVideoElement,
    webcamConfig: atTensorflowTfjsDashDataLib.distTypesMod.WebcamConfig
  ): js.Promise[
    atTensorflowTfjsDashDataLib.distIteratorsWebcamUnderscoreIteratorMod.WebcamIterator
  ] = js.native
}

