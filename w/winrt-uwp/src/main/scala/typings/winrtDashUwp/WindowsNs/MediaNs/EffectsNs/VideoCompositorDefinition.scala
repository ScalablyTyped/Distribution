package typings.winrtDashUwp.WindowsNs.MediaNs.EffectsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the definition of a custom video compositor. */
@JSGlobal("Windows.Media.Effects.VideoCompositorDefinition")
@js.native
class VideoCompositorDefinition protected () extends js.Object {
  /**
    * Initializes a new instance of the VideoCompositorDefinition class.
    * @param activatableClassId The activatable class ID of the video compositor.
    */
  def this(activatableClassId: String) = this()
  /**
    * Initializes a new instance of the VideoCompositorDefinition class.
    * @param activatableClassId The activatable class ID of the video compositor.
    * @param props The set of properties for configuring the video compositor object.
    */
  def this(activatableClassId: String, props: IPropertySet) = this()
  /** Gets the activatable class ID of the video compositor. */
  var activatableClassId: String = js.native
  /** Gets the set of properties for configuring the video compositor object. */
  var properties: IPropertySet = js.native
}

