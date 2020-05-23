package typings.winrtUwp.Windows.Media.Effects

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the definition of a custom video compositor. */
trait VideoCompositorDefinition extends js.Object {
  /** Gets the activatable class ID of the video compositor. */
  var activatableClassId: String
  /** Gets the set of properties for configuring the video compositor object. */
  var properties: IPropertySet
}

object VideoCompositorDefinition {
  @scala.inline
  def apply(activatableClassId: String, properties: IPropertySet): VideoCompositorDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoCompositorDefinition]
  }
}

