package typings.wavEncoder

import typings.std.ArrayBuffer
import typings.std.Float32Array
import typings.wavEncoder.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wav-encoder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wav-encoder", "encode")
  @js.native
  def encode: Call = js.native
  @JSImport("wav-encoder", "encode")
  @js.native
  def encode(audioData: AudioData): js.Promise[ArrayBuffer] = js.native
  @JSImport("wav-encoder", "encode")
  @js.native
  def encode(audioData: AudioData, opts: Options): js.Promise[ArrayBuffer] = js.native
  @scala.inline
  def encode_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encode")(x.asInstanceOf[js.Any])
  
  @js.native
  trait AudioData extends StObject {
    
    var channelData: js.Array[Float32Array] = js.native
    
    var sampleRate: Double = js.native
  }
  object AudioData {
    
    @scala.inline
    def apply(channelData: js.Array[Float32Array], sampleRate: Double): AudioData = {
      val __obj = js.Dynamic.literal(channelData = channelData.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any])
      __obj.asInstanceOf[AudioData]
    }
    
    @scala.inline
    implicit class AudioDataMutableBuilder[Self <: AudioData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannelData(value: js.Array[Float32Array]): Self = StObject.set(x, "channelData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelDataVarargs(value: Float32Array*): Self = StObject.set(x, "channelData", js.Array(value :_*))
      
      @scala.inline
      def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var bitDepth: Double = js.native
    
    var float: Boolean = js.native
    
    var symmetric: Boolean = js.native
  }
  object Options {
    
    @scala.inline
    def apply(bitDepth: Double, float: Boolean, symmetric: Boolean): Options = {
      val __obj = js.Dynamic.literal(bitDepth = bitDepth.asInstanceOf[js.Any], float = float.asInstanceOf[js.Any], symmetric = symmetric.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBitDepth(value: Double): Self = StObject.set(x, "bitDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloat(value: Boolean): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymmetric(value: Boolean): Self = StObject.set(x, "symmetric", value.asInstanceOf[js.Any])
    }
  }
}
