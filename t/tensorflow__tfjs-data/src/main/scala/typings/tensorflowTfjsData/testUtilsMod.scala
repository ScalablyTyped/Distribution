package typings.tensorflowTfjsData

import typings.std.Float32Array
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testUtilsMod {
  
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
    
    @JSImport("@tensorflow/tfjs-data/dist/util/test_utils", "FakeAudioContext.createInstance")
    @js.native
    def createInstance(): FakeAudioContext = js.native
  }
  
  @JSImport("@tensorflow/tfjs-data/dist/util/test_utils", "FakeAudioMediaStream")
  @js.native
  class FakeAudioMediaStream () extends StObject {
    
    def getTracks(): js.Array[js.Object] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-data/dist/util/test_utils", "describeAllEnvs")
  @js.native
  def describeAllEnvs(testName: String, tests: js.Function0[Unit]): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-data/dist/util/test_utils", "describeBrowserEnvs")
  @js.native
  def describeBrowserEnvs(testName: String, tests: js.Function0[Unit]): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-data/dist/util/test_utils", "describeNodeEnvs")
  @js.native
  def describeNodeEnvs(testName: String, tests: js.Function0[Unit]): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-data/dist/util/test_utils", "replaceHTMLVideoElementSource")
  @js.native
  def replaceHTMLVideoElementSource(videoElement: HTMLVideoElement): js.Promise[Unit] = js.native
  
  @JSImport("@tensorflow/tfjs-data/dist/util/test_utils", "setupFakeAudeoStream")
  @js.native
  def setupFakeAudeoStream(): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-data/dist/util/test_utils", "setupFakeVideoStream")
  @js.native
  def setupFakeVideoStream(): Unit = js.native
  
  @js.native
  trait FakeAnalyser extends StObject {
    
    def disconnect(): Unit = js.native
    
    var fftSize: Double = js.native
    
    def getFloatFrequencyData(data: Float32Array): Unit = js.native
    
    def getFloatTimeDomainData(data: Float32Array): Unit = js.native
    
    var smoothingTimeConstant: Double = js.native
    
    var x: js.Any = js.native
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
  
  @js.native
  trait FakeMediaStreamAudioSourceNode extends StObject {
    
    def connect(node: js.Object): Unit = js.native
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
