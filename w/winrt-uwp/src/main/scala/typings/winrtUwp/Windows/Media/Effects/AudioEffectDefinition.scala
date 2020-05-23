package typings.winrtUwp.Windows.Media.Effects

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an audio effect definition. */
trait AudioEffectDefinition extends js.Object {
  /** The activatable class ID of the audio effect definition. */
  var activatableClassId: String
  /** The set of properties for configuring an AudioEffectDefinition object. */
  var properties: IPropertySet
}

object AudioEffectDefinition {
  @scala.inline
  def apply(activatableClassId: String, properties: IPropertySet): AudioEffectDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioEffectDefinition]
  }
}

