package typings.three

import typings.std.AudioBuffer
import typings.std.AudioBufferSourceNode
import typings.std.AudioContext
import typings.std.AudioNode
import typings.std.GainNode
import typings.std.HTMLMediaElement
import typings.std.MediaStream
import typings.three.srcAudioAudioListenerMod.AudioListener
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAudioAudioMod {
  
  @JSImport("three/src/audio/Audio", "Audio")
  @js.native
  open class Audio[NodeType /* <: AudioNode */] protected () extends Object3D[Event] {
    /**
      * Create a new instance of {@link Audio}
      * @param listener (required) {@link AudioListener | AudioListener} instance.
      */
    def this(listener: AudioListener) = this()
    
    /**
      * Whether to start playback automatically.
      * @defaultValue `false`
      */
    var autoplay: Boolean = js.native
    
    var buffer: AudioBuffer | Null = js.native
    
    /**
      * Connect to the {@link THREE.Audio.source | Audio.source}
      * @remarks This is used internally on initialisation and when setting / removing filters.
      */
    def connect(): this.type = js.native
    
    /**
      * The {@link https://developer.mozilla.org/en-US/docs/Web/API/AudioContext | AudioContext} of the {@link AudioListener | listener} given in the constructor.
      */
    var context: AudioContext = js.native
    
    /**
      * Modify pitch, measured in cents. +/- 100 is a semitone. +/- 1200 is an octave.
      * @defaultValue `0`
      */
    var detune: Double = js.native
    
    /**
      * Disconnect from the {@link THREE.Audio.source | Audio.source}
      * @remarks This is used internally when setting / removing filters.
      */
    def disconnect(): this.type = js.native
    
    /**
      * Overrides the duration of the audio. Same as the {@link Audio.duration | duration} parameter of
      * {@link https://developer.mozilla.org/en-US/docs/Web/API/AudioBufferSourceNode/start | AudioBufferSourceNode.start()}.
      * @defaultValue `undefined` _to play the whole buffer_.
      */
    var duration: js.UndefOr[Double] = js.native
    
    /**
      * Represents an array of {@link https://developer.mozilla.org/en-US/docs/Web/API/AudioNode | AudioNodes}.
      * Can be used to apply a variety of low-order filters to create more complex sound effects.
      * In most cases, the array contains instances of {@link https://developer.mozilla.org/en-US/docs/Web/API/BiquadFilterNode | BiquadFilterNodes}.
      * Filters are set via {@link THREE.Audio.setFilter | Audio.setFilter} or {@link THREE.Audio.setFilters | Audio.setFilters}.
      * @defaultValue `[]`
      */
    var filters: js.Array[AudioNode] = js.native
    
    /**
      * A {@link https://developer.mozilla.org/en-US/docs/Web/API/GainNode | GainNode} created using
      * {@link https://developer.mozilla.org/en-US/docs/Web/API/AudioContext/createGain | AudioContext.createGain}().
      */
    var gain: GainNode = js.native
    
    /**
      * Returns the detuning of oscillation in cents.
      */
    def getDetune(): Double = js.native
    
    /**
      * Returns the first element of the {@link Audio.filters | filters} array.
      */
    def getFilter(): AudioNode = js.native
    
    /**
      * Returns the {@link Audio.filters | filters} array.
      */
    def getFilters(): js.Array[AudioNode] = js.native
    
    /**
      * Return the value of {@link https://developer.mozilla.org/en-US/docs/Web/API/AudioBufferSourceNode/loop | source.loop} (whether playback should loop).
      */
    def getLoop(): Boolean = js.native
    
    /**
      * Return the {@link Audio.gain | gainNode}.
      */
    def getOutput(): NodeType = js.native
    
    /**
      * Return the value of {@link Audio.playbackRate | playbackRate}.
      */
    def getPlaybackRate(): Double = js.native
    
    /**
      * Return the current volume.
      */
    def getVolume(): Double = js.native
    
    /**
      * Whether playback can be controlled using the {@link Audio.play | play}(), {@link Audio.pause | pause}() etc. methods.
      * @defaultValue `true`
      */
    var hasPlaybackControl: Boolean = js.native
    
    /**
      * Whether the {@link Audio} is currently playing.
      * @defaultValue `false`
      */
    var isPlaying: Boolean = js.native
    
    /**
      * A reference to the listener object of this audio.
      */
    var listener: AudioListener = js.native
    
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
      * An offset to the time within the {@link Audio} buffer that playback should begin.
      * Same as the {@link Audio.offset | offset} parameter of {@link https://developer.mozilla.org/en-US/docs/Web/API/AudioBufferSourceNode/start | AudioBufferSourceNode.start()}.
      * @defaultValue `0`
      */
    var offset: Double = js.native
    
    /**
      * Called automatically when playback finished.
      */
    def onEnded(): Unit = js.native
    
    /**
      * If {@link Audio.hasPlaybackControl | hasPlaybackControl} is true, pauses playback.
      */
    def pause(): this.type = js.native
    
    /**
      * If {@link Audio.hasPlaybackControl | hasPlaybackControl} is true, starts playback.
      */
    def play(): this.type = js.native
    def play(delay: Double): this.type = js.native
    
    /**
      * Speed of playback.
      * @defaultValue `1`
      */
    var playbackRate: Double = js.native
    
    /**
      * Setup the {@link Audio.source | source} to the audioBuffer, and sets {@link Audio.sourceType | sourceType} to 'buffer'.
      * @remarks If {@link Audio.autoplay | autoplay}, also starts playback.
      */
    def setBuffer(audioBuffer: AudioBuffer): this.type = js.native
    
    /**
      * Defines the detuning of oscillation in cents.
      * @param value Expects a `Float`
      */
    def setDetune(value: Double): this.type = js.native
    
    /**
      * Applies a single filter node to the audio.
      */
    def setFilter(filter: AudioNode): this.type = js.native
    
    /**
      * Applies an array of filter nodes to the audio.
      * @param value Arrays of filters.
      */
    def setFilters(value: js.Array[AudioNode]): this.type = js.native
    
    /**
      * Set {@link https://developer.mozilla.org/en-US/docs/Web/API/AudioBufferSourceNode/loop | source.loop} to `value` (whether playback should loop).
      * @param value
      */
    def setLoop(value: Boolean): this.type = js.native
    
    /**
      * Set {@link https://developer.mozilla.org/en-US/docs/Web/API/AudioBufferSourceNode/loopEnd | source.loopEnd} to `value`.
      * @param value Expects a `Float`
      */
    def setLoopEnd(value: Double): this.type = js.native
    
    /**
      * Set {@link https://developer.mozilla.org/en-US/docs/Web/API/AudioBufferSourceNode/loopStart | source.loopStart} to `value`.
      * @param value Expects a `Float`
      */
    def setLoopStart(value: Double): this.type = js.native
    
    /**
      * Applies the given object of type {@link https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement | HTMLMediaElement} as the source of this audio.
      * @remarks Also sets {@link Audio.hasPlaybackControl | hasPlaybackControl} to false.
      */
    def setMediaElementSource(mediaElement: HTMLMediaElement): this.type = js.native
    
    /**
      * Applies the given object of type {@link https://developer.mozilla.org/en-US/docs/Web/API/MediaStream | MediaStream} as the source of this audio.
      * @remarks Also sets {@link Audio.hasPlaybackControl | hasPlaybackControl} to false.
      */
    def setMediaStreamSource(mediaStream: MediaStream): this.type = js.native
    
    /**
      * Setup the {@link Audio.source | source} to the audioBuffer, and sets {@link Audio.sourceType | sourceType} to 'audioNode'.
      * @remarks Also sets {@link Audio.hasPlaybackControl | hasPlaybackControl} to false.
      */
    def setNodeSource(audioNode: AudioBufferSourceNode): this.type = js.native
    
    /**
      * If {@link Audio.hasPlaybackControl | hasPlaybackControl} is enabled, set the {@link Audio.playbackRate | playbackRate} to `value`.
      * @param value Expects a `Float`
      */
    def setPlaybackRate(value: Double): this.type = js.native
    
    /**
      * Set the volume.
      * @param value Expects a `Float`
      */
    def setVolume(value: Double): this.type = js.native
    
    /**
      * An {@link https://developer.mozilla.org/en-US/docs/Web/API/AudioBufferSourceNode | AudioBufferSourceNode} created using
      * {@link https://developer.mozilla.org/en-US/docs/Web/API/AudioContext/createBufferSource | AudioContext.createBufferSource()}.
      */
    var source: AudioBufferSourceNode | Null = js.native
    
    /**
      * Type of the {@link Audio} source.
      * @defaultValue 'empty'.
      */
    var sourceType: String = js.native
    
    /**
      * If {@link Audio.hasPlaybackControl | hasPlaybackControl} is enabled, stops playback.
      */
    def stop(): this.type = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `Audio`
      */
    @JSName("type")
    val type_Audio: String | typings.three.threeStrings.Audio = js.native
  }
}
