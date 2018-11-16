package typings
package winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs

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
  def this(activatableClassId: java.lang.String) = this()
  /**
                   * Initializes a new instance of the VideoCompositorDefinition class.
                   * @param activatableClassId The activatable class ID of the video compositor.
                   * @param props The set of properties for configuring the video compositor object.
                   */
  def this(activatableClassId: java.lang.String, props: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet) = this()
  /** Gets the activatable class ID of the video compositor. */
  var activatableClassId: java.lang.String = js.native
  /** Gets the set of properties for configuring the video compositor object. */
  var properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet = js.native
}

