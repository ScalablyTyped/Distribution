package typings.winrtDashUwp.WindowsNs.MediaNs.EffectsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
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
  def this(activatableClassId: String) = this()
  /**
    * Creates a new AudioEffectDefinition object with the specified activatable class ID, configuring the object with the specified settings.
    * @param activatableClassId The activatable class ID of the audio effect definition.
    * @param props Configuration properties for the specified audio effect definition.
    */
  def this(activatableClassId: String, props: IPropertySet) = this()
  /** The activatable class ID of the audio effect definition. */
  var activatableClassId: String = js.native
  /** The set of properties for configuring an AudioEffectDefinition object. */
  var properties: IPropertySet = js.native
}

