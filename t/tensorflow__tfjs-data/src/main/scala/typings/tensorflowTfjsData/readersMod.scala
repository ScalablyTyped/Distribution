package typings.tensorflowTfjsData

import typings.std.HTMLVideoElement
import typings.std.Iterator
import typings.std.IteratorResult
import typings.std.RequestInfo
import typings.tensorflowTfjsCore.tensorTypesMod.TensorContainer
import typings.tensorflowTfjsData.csvDatasetMod.CSVDataset
import typings.tensorflowTfjsData.datasetMod.Dataset
import typings.tensorflowTfjsData.microphoneIteratorMod.MicrophoneIterator
import typings.tensorflowTfjsData.typesMod.CSVConfig
import typings.tensorflowTfjsData.typesMod.MicrophoneConfig
import typings.tensorflowTfjsData.typesMod.WebcamConfig
import typings.tensorflowTfjsData.webcamIteratorMod.WebcamIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readersMod {
  
  @JSImport("@tensorflow/tfjs-data/dist/readers", "csv")
  @js.native
  def csv(source: RequestInfo): CSVDataset = js.native
  @JSImport("@tensorflow/tfjs-data/dist/readers", "csv")
  @js.native
  def csv(source: RequestInfo, csvConfig: CSVConfig): CSVDataset = js.native
  
  @JSImport("@tensorflow/tfjs-data/dist/readers", "func")
  @js.native
  def func[T /* <: TensorContainer */](f: js.Function0[(IteratorResult[T, _]) | (js.Promise[IteratorResult[T, _]])]): Dataset[T] = js.native
  
  @JSImport("@tensorflow/tfjs-data/dist/readers", "generator")
  @js.native
  def generator[T /* <: TensorContainer */](
    generator: js.Function0[
      (Iterator[T, _, js.UndefOr[scala.Nothing]]) | (js.Promise[Iterator[T, _, js.UndefOr[scala.Nothing]]])
    ]
  ): Dataset[T] = js.native
  
  @JSImport("@tensorflow/tfjs-data/dist/readers", "microphone")
  @js.native
  def microphone(): js.Promise[MicrophoneIterator] = js.native
  @JSImport("@tensorflow/tfjs-data/dist/readers", "microphone")
  @js.native
  def microphone(microphoneConfig: MicrophoneConfig): js.Promise[MicrophoneIterator] = js.native
  
  @JSImport("@tensorflow/tfjs-data/dist/readers", "webcam")
  @js.native
  def webcam(): js.Promise[WebcamIterator] = js.native
  @JSImport("@tensorflow/tfjs-data/dist/readers", "webcam")
  @js.native
  def webcam(webcamVideoElement: js.UndefOr[scala.Nothing], webcamConfig: WebcamConfig): js.Promise[WebcamIterator] = js.native
  @JSImport("@tensorflow/tfjs-data/dist/readers", "webcam")
  @js.native
  def webcam(webcamVideoElement: HTMLVideoElement): js.Promise[WebcamIterator] = js.native
  @JSImport("@tensorflow/tfjs-data/dist/readers", "webcam")
  @js.native
  def webcam(webcamVideoElement: HTMLVideoElement, webcamConfig: WebcamConfig): js.Promise[WebcamIterator] = js.native
}
