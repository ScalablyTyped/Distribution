package typings.tensorflowTfjsData

import typings.std.HTMLVideoElement
import typings.tensorflowTfjsCore.distJasmineUtilMod.Constraints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilTestUtilsMod {
  
  @JSImport("@tensorflow/tfjs-data/dist/util/test_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-data/dist/util/test_utils", "FakeAudioContext")
  @js.native
  open class FakeAudioContext () extends StObject {
    
    def close(): Unit = js.native
    
    def createAnalyser(): FakeAnalyser = js.native
    
    def createMediaStreamSource(): FakeMediaStreamAudioSourceNode = js.native
    
    val sampleRate: /* 44100 */ Double = js.native
  }
  /* static members */
  object FakeAudioContext {
    
    @JSImport("@tensorflow/tfjs-data/dist/util/test_utils", "FakeAudioContext")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createInstance(): FakeAudioContext = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[FakeAudioContext]
  }
  
  @JSImport("@tensorflow/tfjs-data/dist/util/test_utils", "FakeAudioMediaStream")
  @js.native
  open class FakeAudioMediaStream () extends StObject {
    
    def getTracks(): js.Array[js.Object] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-data/dist/util/test_utils", "MEDIA_ENVS")
  @js.native
  val MEDIA_ENVS: Constraints = js.native
  
  inline def describeAllEnvs(testName: String, tests: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describeAllEnvs")(testName.asInstanceOf[js.Any], tests.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def describeBrowserEnvs(testName: String, tests: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describeBrowserEnvs")(testName.asInstanceOf[js.Any], tests.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def describeNodeEnvs(testName: String, tests: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describeNodeEnvs")(testName.asInstanceOf[js.Any], tests.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def replaceHTMLVideoElementSource(videoElement: HTMLVideoElement): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceHTMLVideoElementSource")(videoElement.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def setupFakeAudioStream(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setupFakeAudioStream")().asInstanceOf[Unit]
  
  inline def setupFakeVideoStream(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setupFakeVideoStream")().asInstanceOf[Unit]
  
  trait FakeAnalyser extends StObject {
    
    def disconnect(): Unit
    
    var fftSize: Double
    
    def getFloatFrequencyData(data: js.typedarray.Float32Array): Unit
    
    def getFloatTimeDomainData(data: js.typedarray.Float32Array): Unit
    
    var smoothingTimeConstant: Double
    
    /* private */ var x: Any
  }
  object FakeAnalyser {
    
    inline def apply(
      disconnect: () => Unit,
      fftSize: Double,
      getFloatFrequencyData: js.typedarray.Float32Array => Unit,
      getFloatTimeDomainData: js.typedarray.Float32Array => Unit,
      smoothingTimeConstant: Double,
      x: Any
    ): FakeAnalyser = {
      val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), fftSize = fftSize.asInstanceOf[js.Any], getFloatFrequencyData = js.Any.fromFunction1(getFloatFrequencyData), getFloatTimeDomainData = js.Any.fromFunction1(getFloatTimeDomainData), smoothingTimeConstant = smoothingTimeConstant.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
      __obj.asInstanceOf[FakeAnalyser]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FakeAnalyser] (val x: Self) extends AnyVal {
      
      inline def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
      
      inline def setFftSize(value: Double): Self = StObject.set(x, "fftSize", value.asInstanceOf[js.Any])
      
      inline def setGetFloatFrequencyData(value: js.typedarray.Float32Array => Unit): Self = StObject.set(x, "getFloatFrequencyData", js.Any.fromFunction1(value))
      
      inline def setGetFloatTimeDomainData(value: js.typedarray.Float32Array => Unit): Self = StObject.set(x, "getFloatTimeDomainData", js.Any.fromFunction1(value))
      
      inline def setSmoothingTimeConstant(value: Double): Self = StObject.set(x, "smoothingTimeConstant", value.asInstanceOf[js.Any])
      
      inline def setX(value: Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    }
  }
  
  trait FakeMediaStreamAudioSourceNode extends StObject {
    
    def connect(node: js.Object): Unit
  }
  object FakeMediaStreamAudioSourceNode {
    
    inline def apply(connect: js.Object => Unit): FakeMediaStreamAudioSourceNode = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect))
      __obj.asInstanceOf[FakeMediaStreamAudioSourceNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FakeMediaStreamAudioSourceNode] (val x: Self) extends AnyVal {
      
      inline def setConnect(value: js.Object => Unit): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
    }
  }
}
