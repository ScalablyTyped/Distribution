package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the definition of a video stabilization effect. */
trait VideoStabilizationEffectDefinition extends js.Object {
  /** Gets a string containing the activatable class ID of the video stabilization effect definition. */
  var activatableClassId: String
  /** Gets the set of properties for configuring the VideoStabilizationEffectDefinition object. */
  var properties: IPropertySet
}

object VideoStabilizationEffectDefinition {
  @scala.inline
  def apply(activatableClassId: String, properties: IPropertySet): VideoStabilizationEffectDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoStabilizationEffectDefinition]
  }
}

