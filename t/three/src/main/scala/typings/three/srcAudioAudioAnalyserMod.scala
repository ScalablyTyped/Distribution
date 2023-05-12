package typings.three

import typings.std.AnalyserNode
import typings.std.AudioNode
import typings.three.srcAudioAudioMod.Audio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAudioAudioAnalyserMod {
  
  @JSImport("three/src/audio/AudioAnalyser", "AudioAnalyser")
  @js.native
  open class AudioAnalyser protected () extends StObject {
    /**
      * Create a new {@link {@link AudioAnalyser} | AudioAnalyser}.
      * @param audio
      * @param fftSize See {@link https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/fftSize | AnalyserNode.fftSize }. Expects a `unsigned integer`. Default `2048`.
      */
    def this(audio: Audio[AudioNode]) = this()
    def this(audio: Audio[AudioNode], fftSize: Double) = this()
    
    /**
      * An {@link https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode | AnalyserNode} used to analyze audio.
      */
    var analyser: AnalyserNode = js.native
    
    /**
      * A Uint8Array with size determined by {@link https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/frequencyBinCount | analyser.frequencyBinCount} used to hold analysis data.
      */
    var data: js.typedarray.Uint8Array = js.native
    
    /**
      * Get the average of the frequencies returned by the {@link AudioAnalyser.getFrequencyData | getFrequencyData} method.
      */
    def getAverageFrequency(): Double = js.native
    
    /**
      * Uses the Web Audio's {@link https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/getByteFrequencyData | getByteFrequencyData} method
      */
    def getFrequencyData(): js.typedarray.Uint8Array = js.native
  }
}
