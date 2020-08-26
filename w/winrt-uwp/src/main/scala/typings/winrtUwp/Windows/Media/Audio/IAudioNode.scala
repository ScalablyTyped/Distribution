package typings.winrtUwp.Windows.Media.Audio

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.IClosable
import typings.winrtUwp.Windows.Media.Effects.IAudioEffectDefinition
import typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines an audio node. */
@js.native
trait IAudioNode extends IClosable {
  /** Gets or sets a value indicating if the audio node consumes input. */
  var consumeInput: Boolean = js.native
  /** Gets the list of effect definitions for the audio node. */
  var effectDefinitions: IVector[IAudioEffectDefinition] = js.native
  /** Gets the encoding properties for the audio node. */
  var encodingProperties: AudioEncodingProperties = js.native
  /** Gets or sets the outgoing gain for the audio node. */
  var outgoingGain: Double = js.native
  /**
    * Disables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to disable.
    */
  def disableEffectsByDefinition(definition: IAudioEffectDefinition): Unit = js.native
  /**
    * Enables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to enable.
    */
  def enableEffectsByDefinition(definition: IAudioEffectDefinition): Unit = js.native
  /** Resets the audio node. */
  def reset(): Unit = js.native
  /** Starts the audio node. */
  def start(): Unit = js.native
  /** Stops the audio node. */
  def stop(): Unit = js.native
}

object IAudioNode {
  @scala.inline
  def apply(
    close: () => Unit,
    consumeInput: Boolean,
    disableEffectsByDefinition: IAudioEffectDefinition => Unit,
    effectDefinitions: IVector[IAudioEffectDefinition],
    enableEffectsByDefinition: IAudioEffectDefinition => Unit,
    encodingProperties: AudioEncodingProperties,
    outgoingGain: Double,
    reset: () => Unit,
    start: () => Unit,
    stop: () => Unit
  ): IAudioNode = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), consumeInput = consumeInput.asInstanceOf[js.Any], disableEffectsByDefinition = js.Any.fromFunction1(disableEffectsByDefinition), effectDefinitions = effectDefinitions.asInstanceOf[js.Any], enableEffectsByDefinition = js.Any.fromFunction1(enableEffectsByDefinition), encodingProperties = encodingProperties.asInstanceOf[js.Any], outgoingGain = outgoingGain.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[IAudioNode]
  }
  @scala.inline
  implicit class IAudioNodeOps[Self <: IAudioNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConsumeInput(value: Boolean): Self = this.set("consumeInput", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableEffectsByDefinition(value: IAudioEffectDefinition => Unit): Self = this.set("disableEffectsByDefinition", js.Any.fromFunction1(value))
    @scala.inline
    def setEffectDefinitions(value: IVector[IAudioEffectDefinition]): Self = this.set("effectDefinitions", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableEffectsByDefinition(value: IAudioEffectDefinition => Unit): Self = this.set("enableEffectsByDefinition", js.Any.fromFunction1(value))
    @scala.inline
    def setEncodingProperties(value: AudioEncodingProperties): Self = this.set("encodingProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutgoingGain(value: Double): Self = this.set("outgoingGain", value.asInstanceOf[js.Any])
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    @scala.inline
    def setStart(value: () => Unit): Self = this.set("start", js.Any.fromFunction0(value))
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
  }
  
}

