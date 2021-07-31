package typings.tensorflowTfjsData

import typings.std.HTMLVideoElement
import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsData.lazyIteratorMod.LazyIterator
import typings.tensorflowTfjsData.typesMod.WebcamConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webcamIteratorMod {
  
  @JSImport("@tensorflow/tfjs-data/dist/iterators/webcam_iterator", "WebcamIterator")
  @js.native
  class WebcamIterator protected () extends LazyIterator[Tensor3D] {
    
    def capture(): js.Promise[Tensor3D] = js.native
    
    def cropAndResizeFrame(img: Tensor3D): Tensor3D = js.native
    
    var cropBox: js.Any = js.native
    
    var cropBoxInd: js.Any = js.native
    
    var cropSize: js.Any = js.native
    
    var isClosed: js.Any = js.native
    
    var needToResize: js.Any = js.native
    
    var resize: js.Any = js.native
    
    def start(): js.Promise[Unit] = js.native
    
    def stop(): Unit = js.native
    
    var stream: js.Any = js.native
    
    val webcamConfig: WebcamConfig = js.native
    
    val webcamVideoElement: HTMLVideoElement = js.native
  }
  /* static members */
  object WebcamIterator {
    
    @JSImport("@tensorflow/tfjs-data/dist/iterators/webcam_iterator", "WebcamIterator")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(): js.Promise[WebcamIterator] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Promise[WebcamIterator]]
    @scala.inline
    def create(webcamVideoElement: Unit, webcamConfig: WebcamConfig): js.Promise[WebcamIterator] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(webcamVideoElement.asInstanceOf[js.Any], webcamConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebcamIterator]]
    @scala.inline
    def create(webcamVideoElement: HTMLVideoElement): js.Promise[WebcamIterator] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(webcamVideoElement.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebcamIterator]]
    @scala.inline
    def create(webcamVideoElement: HTMLVideoElement, webcamConfig: WebcamConfig): js.Promise[WebcamIterator] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(webcamVideoElement.asInstanceOf[js.Any], webcamConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebcamIterator]]
  }
}
