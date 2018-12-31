package typings
package winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Exposes the methods and properties of an AudioEffectDefinition object. Implement this interface when you create a custom audio effect definition. */
trait IAudioEffectDefinition extends js.Object {
  /** The activatable class ID of the audio effect definition. */
  var activatableClassId: java.lang.String
  /** The set of properties for configuring an AudioEffectDefinition object. */
  var properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
}

