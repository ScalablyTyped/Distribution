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
  /* private */ class WebcamIterator () extends LazyIterator[Tensor3D] {
    
    def capture(): js.Promise[Tensor3D] = js.native
    
    def cropAndResizeFrame(img: Tensor3D): Tensor3D = js.native
    
    /* private */ var cropBox: js.Any = js.native
    
    /* private */ var cropBoxInd: js.Any = js.native
    
    /* private */ var cropSize: js.Any = js.native
    
    /* private */ var isClosed: js.Any = js.native
    
    /* private */ var needToResize: js.Any = js.native
    
    /* private */ var resize: js.Any = js.native
    
    def start(): js.Promise[Unit] = js.native
    
    def stop(): Unit = js.native
    
    /* private */ var stream: js.Any = js.native
    
    /* protected */ val webcamConfig: WebcamConfig = js.native
    
    /* protected */ val webcamVideoElement: HTMLVideoElement = js.native
  }
  /* static members */
  object WebcamIterator {
    
    @JSImport("@tensorflow/tfjs-data/dist/iterators/webcam_iterator", "WebcamIterator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): js.Promise[WebcamIterator] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Promise[WebcamIterator]]
    inline def create(webcamVideoElement: Unit, webcamConfig: WebcamConfig): js.Promise[WebcamIterator] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(webcamVideoElement.asInstanceOf[js.Any], webcamConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebcamIterator]]
    inline def create(webcamVideoElement: HTMLVideoElement): js.Promise[WebcamIterator] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(webcamVideoElement.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebcamIterator]]
    inline def create(webcamVideoElement: HTMLVideoElement, webcamConfig: WebcamConfig): js.Promise[WebcamIterator] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(webcamVideoElement.asInstanceOf[js.Any], webcamConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebcamIterator]]
  }
}
