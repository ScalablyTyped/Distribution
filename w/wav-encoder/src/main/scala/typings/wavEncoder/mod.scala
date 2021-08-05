package typings.wavEncoder

import typings.std.ArrayBuffer
import typings.std.Float32Array
import typings.wavEncoder.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wav-encoder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wav-encoder", "encode")
  @js.native
  def encode: Call = js.native
  inline def encode(audioData: AudioData): js.Promise[ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(audioData.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ArrayBuffer]]
  inline def encode(audioData: AudioData, opts: Options): js.Promise[ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(audioData.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ArrayBuffer]]
  inline def encode_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encode")(x.asInstanceOf[js.Any])
  
  trait AudioData extends StObject {
    
    var channelData: js.Array[Float32Array]
    
    var sampleRate: Double
  }
  object AudioData {
    
    inline def apply(channelData: js.Array[Float32Array], sampleRate: Double): AudioData = {
      val __obj = js.Dynamic.literal(channelData = channelData.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any])
      __obj.asInstanceOf[AudioData]
    }
    
    extension [Self <: AudioData](x: Self) {
      
      inline def setChannelData(value: js.Array[Float32Array]): Self = StObject.set(x, "channelData", value.asInstanceOf[js.Any])
      
      inline def setChannelDataVarargs(value: Float32Array*): Self = StObject.set(x, "channelData", js.Array(value :_*))
      
      inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var bitDepth: Double
    
    var float: Boolean
    
    var symmetric: Boolean
  }
  object Options {
    
    inline def apply(bitDepth: Double, float: Boolean, symmetric: Boolean): Options = {
      val __obj = js.Dynamic.literal(bitDepth = bitDepth.asInstanceOf[js.Any], float = float.asInstanceOf[js.Any], symmetric = symmetric.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBitDepth(value: Double): Self = StObject.set(x, "bitDepth", value.asInstanceOf[js.Any])
      
      inline def setFloat(value: Boolean): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      inline def setSymmetric(value: Boolean): Self = StObject.set(x, "symmetric", value.asInstanceOf[js.Any])
    }
  }
}
