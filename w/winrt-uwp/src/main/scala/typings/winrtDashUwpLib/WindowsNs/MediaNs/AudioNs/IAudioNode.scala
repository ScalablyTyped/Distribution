package typings
package winrtDashUwpLib.WindowsNs.MediaNs.AudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines an audio node. */
trait IAudioNode
  extends winrtDashUwpLib.WindowsNs.FoundationNs.IClosable {
  /** Gets or sets a value indicating if the audio node consumes input. */
  var consumeInput: scala.Boolean
  /** Gets the list of effect definitions for the audio node. */
  var effectDefinitions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.IAudioEffectDefinition]
  /** Gets the encoding properties for the audio node. */
  var encodingProperties: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingProperties
  /** Gets or sets the outgoing gain for the audio node. */
  var outgoingGain: scala.Double
  /**
    * Disables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to disable.
    */
  def disableEffectsByDefinition(definition: winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.IAudioEffectDefinition): scala.Unit
  /**
    * Enables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to enable.
    */
  def enableEffectsByDefinition(definition: winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.IAudioEffectDefinition): scala.Unit
  /** Resets the audio node. */
  def reset(): scala.Unit
  /** Starts the audio node. */
  def start(): scala.Unit
  /** Stops the audio node. */
  def stop(): scala.Unit
}

object IAudioNode {
  @scala.inline
  def apply(
    close: js.Function0[scala.Unit],
    consumeInput: scala.Boolean,
    disableEffectsByDefinition: js.Function1[winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.IAudioEffectDefinition, scala.Unit],
    effectDefinitions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.IAudioEffectDefinition],
    enableEffectsByDefinition: js.Function1[winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.IAudioEffectDefinition, scala.Unit],
    encodingProperties: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingProperties,
    outgoingGain: scala.Double,
    reset: js.Function0[scala.Unit],
    start: js.Function0[scala.Unit],
    stop: js.Function0[scala.Unit]
  ): IAudioNode = {
    val __obj = js.Dynamic.literal(close = close, consumeInput = consumeInput, disableEffectsByDefinition = disableEffectsByDefinition, effectDefinitions = effectDefinitions, enableEffectsByDefinition = enableEffectsByDefinition, encodingProperties = encodingProperties, outgoingGain = outgoingGain, reset = reset, start = start, stop = stop)
  
    __obj.asInstanceOf[IAudioNode]
  }
}

