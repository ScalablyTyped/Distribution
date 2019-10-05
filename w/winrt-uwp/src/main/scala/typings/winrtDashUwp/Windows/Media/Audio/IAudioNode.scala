package typings.winrtDashUwp.Windows.Media.Audio

import typings.winrtDashUwp.Windows.Foundation.Collections.IVector
import typings.winrtDashUwp.Windows.Foundation.IClosable
import typings.winrtDashUwp.Windows.Media.Effects.IAudioEffectDefinition
import typings.winrtDashUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines an audio node. */
trait IAudioNode extends IClosable {
  /** Gets or sets a value indicating if the audio node consumes input. */
  var consumeInput: Boolean
  /** Gets the list of effect definitions for the audio node. */
  var effectDefinitions: IVector[IAudioEffectDefinition]
  /** Gets the encoding properties for the audio node. */
  var encodingProperties: AudioEncodingProperties
  /** Gets or sets the outgoing gain for the audio node. */
  var outgoingGain: Double
  /**
    * Disables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to disable.
    */
  def disableEffectsByDefinition(definition: IAudioEffectDefinition): Unit
  /**
    * Enables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to enable.
    */
  def enableEffectsByDefinition(definition: IAudioEffectDefinition): Unit
  /** Resets the audio node. */
  def reset(): Unit
  /** Starts the audio node. */
  def start(): Unit
  /** Stops the audio node. */
  def stop(): Unit
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
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), consumeInput = consumeInput, disableEffectsByDefinition = js.Any.fromFunction1(disableEffectsByDefinition), effectDefinitions = effectDefinitions, enableEffectsByDefinition = js.Any.fromFunction1(enableEffectsByDefinition), encodingProperties = encodingProperties, outgoingGain = outgoingGain, reset = js.Any.fromFunction0(reset), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[IAudioNode]
  }
}

