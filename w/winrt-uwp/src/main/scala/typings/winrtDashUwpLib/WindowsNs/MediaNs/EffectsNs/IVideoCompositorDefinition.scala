package typings
package winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The interface defining a custom video compositor definition. */
trait IVideoCompositorDefinition extends js.Object {
  /** Gets the activatable class ID of the video compositor. */
  var activatableClassId: java.lang.String
  /** Gets the set of properties for configuring the video compositor object. */
  var properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
}

object IVideoCompositorDefinition {
  @scala.inline
  def apply(
    activatableClassId: java.lang.String,
    properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
  ): IVideoCompositorDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activatableClassId")(activatableClassId)
    __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[IVideoCompositorDefinition]
  }
}

