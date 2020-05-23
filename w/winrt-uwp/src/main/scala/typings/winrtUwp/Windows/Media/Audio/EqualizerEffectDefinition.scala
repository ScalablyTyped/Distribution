package typings.winrtUwp.Windows.Media.Audio

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an equalizer effect definition supported by the audio graph. */
trait EqualizerEffectDefinition extends js.Object {
  /** Gets the activatable class ID for the equalizer effect definition object. */
  var activatableClassId: String
  /** Gets the bands included in the equalizer effect definition. */
  var bands: IVectorView[EqualizerBand]
  /** Gets the properties supported by the equalizer effect definition. */
  var properties: IPropertySet
}

object EqualizerEffectDefinition {
  @scala.inline
  def apply(activatableClassId: String, bands: IVectorView[EqualizerBand], properties: IPropertySet): EqualizerEffectDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], bands = bands.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[EqualizerEffectDefinition]
  }
}

