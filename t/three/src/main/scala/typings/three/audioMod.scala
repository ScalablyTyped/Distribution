package typings.three

import typings.std.AudioBuffer
import typings.std.AudioBufferSourceNode
import typings.std.AudioContext
import typings.std.AudioNode
import typings.std.GainNode
import typings.std.HTMLMediaElement
import typings.std.MediaStream
import typings.three.audioListenerMod.AudioListener
import typings.three.eventDispatcherMod.Event
import typings.three.object3DMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object audioMod {
  
  @JSImport("three/src/audio/Audio", "Audio")
  @js.native
  open class Audio[NodeType /* <: AudioNode */] protected () extends Object3D[Event] {
    def this(listener: AudioListener) = this()
    
    /**
      * @default false
      */
    var autoplay: Boolean = js.native
    
    var buffer: Null | AudioBuffer = js.native
    
    def connect(): this.type = js.native
    
    var context: AudioContext = js.native
    
    /**
      * @default 0
      */
    var detune: Double = js.native
    
    def disconnect(): this.type = js.native
    
    /**
      * @default undefined
      */
    var duration: js.UndefOr[Double] = js.native
    
    /**
      * @default []
      */
    var filters: js.Array[AudioNode] = js.native
    
    var gain: GainNode = js.native
    
    def getDetune(): Double = js.native
    
    def getFilter(): AudioNode = js.native
    
    def getFilters(): js.Array[AudioNode] = js.native
    
    def getLoop(): Boolean = js.native
    
    def getOutput(): NodeType = js.native
    
    def getPlaybackRate(): Double = js.native
    
    def getVolume(): Double = js.native
    
    /**
      * @default true
      */
    var hasPlaybackControl: Boolean = js.native
    
    /**
      * @default false
      */
    var isPlaying: Boolean = js.native
    
    var listener: AudioListener = js.native
    
    /**
      * @deprecated Use {@link AudioLoader} instead.
      */
    def load(file: String): Audio[GainNode] = js.native
    
    /**
      * @default false
      */
    var loop: Boolean = js.native
    
    /**
      * @default 0
      */
    var loopEnd: Double = js.native
    
    /**
      * @default 0
      */
    var loopStart: Double = js.native
    
    /**
      * @default 0
      */
    var offset: Double = js.native
    
    def onEnded(): Unit = js.native
    
    def pause(): this.type = js.native
    
    def play(): this.type = js.native
    def play(delay: Double): this.type = js.native
    
    /**
      * @default 1
      */
    var playbackRate: Double = js.native
    
    def setBuffer(audioBuffer: AudioBuffer): this.type = js.native
    
    def setDetune(value: Double): this.type = js.native
    
    def setFilter(filter: AudioNode): this.type = js.native
    
    def setFilters(value: js.Array[AudioNode]): this.type = js.native
    
    def setLoop(value: Boolean): this.type = js.native
    
    def setLoopEnd(value: Double): this.type = js.native
    
    def setLoopStart(value: Double): this.type = js.native
    
    def setMediaElementSource(mediaElement: HTMLMediaElement): this.type = js.native
    
    def setMediaStreamSource(mediaStream: MediaStream): this.type = js.native
    
    def setNodeSource(audioNode: AudioBufferSourceNode): this.type = js.native
    
    def setPlaybackRate(value: Double): this.type = js.native
    
    def setVolume(value: Double): this.type = js.native
    
    var source: Null | AudioBufferSourceNode = js.native
    
    /**
      * @default 'empty'
      */
    var sourceType: String = js.native
    
    def stop(): this.type = js.native
    
    @JSName("type")
    var type_Audio: typings.three.threeStrings.Audio = js.native
  }
}
