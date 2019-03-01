package typings
package winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Exposes the methods and properties of a VideoEffectDefinition object. Implement this interface when you create a custom video effect definition. */
trait IVideoEffectDefinition extends js.Object {
  /** The activatable class ID of the video effect definition. */
  var activatableClassId: java.lang.String
  /** The set of properties for configuring the VideoEffectDefinition object. */
  var properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
}

object IVideoEffectDefinition {
  @scala.inline
  def apply(
    activatableClassId: java.lang.String,
    properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
  ): IVideoEffectDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activatableClassId")(activatableClassId)
    __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[IVideoEffectDefinition]
  }
}

