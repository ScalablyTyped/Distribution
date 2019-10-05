package typings.winrtDashUwp.Windows.Media.Audio

import typings.winrtDashUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an equalizer effect definition supported by the audio graph. */
@JSGlobal("Windows.Media.Audio.EqualizerEffectDefinition")
@js.native
class EqualizerEffectDefinition protected () extends js.Object {
  /**
    * Initializes a new instance of the EqualizerEffectDefinition class.
    * @param audioGraph The AudioGraph with which the effect will be used. Using effects outside of the audio graph it was created with is not supported.
    */
  def this(audioGraph: AudioGraph) = this()
  /** Gets the activatable class ID for the equalizer effect definition object. */
  var activatableClassId: String = js.native
  /** Gets the bands included in the equalizer effect definition. */
  var bands: IVectorView[EqualizerBand] = js.native
  /** Gets the properties supported by the equalizer effect definition. */
  var properties: IPropertySet = js.native
}

