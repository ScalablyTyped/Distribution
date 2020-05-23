package typings.winrtUwp.Windows.Media.Audio

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an echo effect definition supported by the audio graph. */
trait EchoEffectDefinition extends js.Object {
  /** Gets the activatable class ID for the echo effect definition object. */
  var activatableClassId: String
  /** Gets or sets the delay supported by the echo effect definition. */
  var delay: Double
  /** Gets or sets the feedback included in the echo effect definition. */
  var feedback: Double
  /** Gets or sets the properties supported by the echo effect definition. */
  var properties: IPropertySet
  /** Gets or sets the wet-dry audio voice mix for the echo effect definition. */
  var wetDryMix: Double
}

object EchoEffectDefinition {
  @scala.inline
  def apply(
    activatableClassId: String,
    delay: Double,
    feedback: Double,
    properties: IPropertySet,
    wetDryMix: Double
  ): EchoEffectDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], feedback = feedback.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], wetDryMix = wetDryMix.asInstanceOf[js.Any])
    __obj.asInstanceOf[EchoEffectDefinition]
  }
}

