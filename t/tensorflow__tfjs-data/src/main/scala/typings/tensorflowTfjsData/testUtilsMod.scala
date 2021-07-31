package typings.tensorflowTfjsData

import typings.std.Float32Array
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testUtilsMod {
  
  @JSImport("@tensorflow/tfjs-data/dist/util/test_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-data/dist/util/test_utils", "FakeAudioContext")
  @js.native
  class FakeAudioContext () extends StObject {
    
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
    
    @scala.inline
    def createInstance(): FakeAudioContext = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[FakeAudioContext]
  }
  
  @JSImport("@tensorflow/tfjs-data/dist/util/test_utils", "FakeAudioMediaStream")
  @js.native
  class FakeAudioMediaStream () extends StObject {
    
    def getTracks(): js.Array[js.Object] = js.native
  }
  
  @scala.inline
  def describeAllEnvs(testName: String, tests: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describeAllEnvs")(testName.asInstanceOf[js.Any], tests.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def describeBrowserEnvs(testName: String, tests: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describeBrowserEnvs")(testName.asInstanceOf[js.Any], tests.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def describeNodeEnvs(testName: String, tests: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describeNodeEnvs")(testName.asInstanceOf[js.Any], tests.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def replaceHTMLVideoElementSource(videoElement: HTMLVideoElement): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceHTMLVideoElementSource")(videoElement.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def setupFakeAudeoStream(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setupFakeAudeoStream")().asInstanceOf[Unit]
  
  @scala.inline
  def setupFakeVideoStream(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setupFakeVideoStream")().asInstanceOf[Unit]
  
  trait FakeAnalyser extends StObject {
    
    def disconnect(): Unit
    
    var fftSize: Double
    
    def getFloatFrequencyData(data: Float32Array): Unit
    
    def getFloatTimeDomainData(data: Float32Array): Unit
    
    var smoothingTimeConstant: Double
    
    var x: js.Any
  }
  object FakeAnalyser {
    
    @scala.inline
    def apply(
      disconnect: () => Unit,
      fftSize: Double,
      getFloatFrequencyData: Float32Array => Unit,
      getFloatTimeDomainData: Float32Array => Unit,
      smoothingTimeConstant: Double,
      x: js.Any
    ): FakeAnalyser = {
      val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), fftSize = fftSize.asInstanceOf[js.Any], getFloatFrequencyData = js.Any.fromFunction1(getFloatFrequencyData), getFloatTimeDomainData = js.Any.fromFunction1(getFloatTimeDomainData), smoothingTimeConstant = smoothingTimeConstant.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
      __obj.asInstanceOf[FakeAnalyser]
    }
    
    @scala.inline
    implicit class FakeAnalyserMutableBuilder[Self <: FakeAnalyser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFftSize(value: Double): Self = StObject.set(x, "fftSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetFloatFrequencyData(value: Float32Array => Unit): Self = StObject.set(x, "getFloatFrequencyData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetFloatTimeDomainData(value: Float32Array => Unit): Self = StObject.set(x, "getFloatTimeDomainData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSmoothingTimeConstant(value: Double): Self = StObject.set(x, "smoothingTimeConstant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: js.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    }
  }
  
  trait FakeMediaStreamAudioSourceNode extends StObject {
    
    def connect(node: js.Object): Unit
  }
  object FakeMediaStreamAudioSourceNode {
    
    @scala.inline
    def apply(connect: js.Object => Unit): FakeMediaStreamAudioSourceNode = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect))
      __obj.asInstanceOf[FakeMediaStreamAudioSourceNode]
    }
    
    @scala.inline
    implicit class FakeMediaStreamAudioSourceNodeMutableBuilder[Self <: FakeMediaStreamAudioSourceNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnect(value: js.Object => Unit): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
    }
  }
}
