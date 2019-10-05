package typings.winrtDashUwp.Windows.Media.Effects

import typings.winrtDashUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a video effect definition. */
@JSGlobal("Windows.Media.Effects.VideoEffectDefinition")
@js.native
class VideoEffectDefinition protected () extends js.Object {
  /**
    * Creates a new VideoEffectDefinition object with the specified activatable class ID.
    * @param activatableClassId The activatable class ID of the video effect definition.
    */
  def this(activatableClassId: String) = this()
  /**
    * Creates a new VideoEffectDefinition object with the specified activatable class ID, configuring the object with the specified settings.
    * @param activatableClassId The activatable class ID of the video effect definition.
    * @param props Configuration properties for the specified video effect definition.
    */
  def this(activatableClassId: String, props: IPropertySet) = this()
  /** Gets the activatable class ID of the video effect definition. */
  var activatableClassId: String = js.native
  /** Gets the set of properties for configuring the VideoEffectDefinition object. */
  var properties: IPropertySet = js.native
}

