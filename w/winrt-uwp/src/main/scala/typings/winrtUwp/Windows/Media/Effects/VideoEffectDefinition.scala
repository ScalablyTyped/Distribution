package typings.winrtUwp.Windows.Media.Effects

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a video effect definition. */
trait VideoEffectDefinition extends js.Object {
  /** Gets the activatable class ID of the video effect definition. */
  var activatableClassId: String
  /** Gets the set of properties for configuring the VideoEffectDefinition object. */
  var properties: IPropertySet
}

object VideoEffectDefinition {
  @scala.inline
  def apply(activatableClassId: String, properties: IPropertySet): VideoEffectDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoEffectDefinition]
  }
}

