package typings
package winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an audio effect definition. */
@JSGlobal("Windows.Media.Effects.AudioEffectDefinition")
@js.native
class AudioEffectDefinition protected () extends js.Object {
  /**
    * Creates a new AudioEffectDefinition object with the specified activatable class ID.
    * @param activatableClassId The activatable class ID of the audio effect definition.
    */
  def this(activatableClassId: java.lang.String) = this()
  /**
    * Creates a new AudioEffectDefinition object with the specified activatable class ID, configuring the object with the specified settings.
    * @param activatableClassId The activatable class ID of the audio effect definition.
    * @param props Configuration properties for the specified audio effect definition.
    */
  def this(activatableClassId: java.lang.String, props: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet) = this()
  /** The activatable class ID of the audio effect definition. */
  var activatableClassId: java.lang.String = js.native
  /** The set of properties for configuring an AudioEffectDefinition object. */
  var properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet = js.native
}

