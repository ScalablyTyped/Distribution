package typings.tensorflowTfjsData

import typings.std.HTMLVideoElement
import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsData.distIteratorsLazyIteratorMod.LazyIterator
import typings.tensorflowTfjsData.distTypesMod.WebcamConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIteratorsWebcamIteratorMod {
  
  @JSImport("@tensorflow/tfjs-data/dist/iterators/webcam_iterator", "WebcamIterator")
  @js.native
  /* private */ open class WebcamIterator () extends LazyIterator[Tensor3D] {
    
    def capture(): js.Promise[Tensor3D] = js.native
    
    def cropAndResizeFrame(img: Tensor3D): Tensor3D = js.native
    
    /* private */ var cropBox: Any = js.native
    
    /* private */ var cropBoxInd: Any = js.native
    
    /* private */ var cropSize: Any = js.native
    
    /* private */ var isClosed: Any = js.native
    
    /* private */ var needToResize: Any = js.native
    
    /* private */ var resize: Any = js.native
    
    def start(): js.Promise[Unit] = js.native
    
    def stop(): Unit = js.native
    
    /* private */ var stream: Any = js.native
    
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
