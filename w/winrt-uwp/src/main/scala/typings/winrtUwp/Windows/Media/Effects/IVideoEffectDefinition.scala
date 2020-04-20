package typings.winrtUwp.Windows.Media.Effects

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Exposes the methods and properties of a VideoEffectDefinition object. Implement this interface when you create a custom video effect definition. */
trait IVideoEffectDefinition extends js.Object {
  /** The activatable class ID of the video effect definition. */
  var activatableClassId: String
  /** The set of properties for configuring the VideoEffectDefinition object. */
  var properties: IPropertySet
}

object IVideoEffectDefinition {
  @scala.inline
  def apply(activatableClassId: String, properties: IPropertySet): IVideoEffectDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVideoEffectDefinition]
  }
}

