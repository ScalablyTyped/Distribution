package typings.winrtUwp.global.Windows.Media.Audio

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an equalizer effect definition supported by the audio graph. */
@JSGlobal("Windows.Media.Audio.EqualizerEffectDefinition")
@js.native
class EqualizerEffectDefinition protected ()
  extends typings.winrtUwp.Windows.Media.Audio.EqualizerEffectDefinition {
  /**
    * Initializes a new instance of the EqualizerEffectDefinition class.
    * @param audioGraph The AudioGraph with which the effect will be used. Using effects outside of the audio graph it was created with is not supported.
    */
  def this(audioGraph: typings.winrtUwp.Windows.Media.Audio.AudioGraph) = this()
  /** Gets the activatable class ID for the equalizer effect definition object. */
  /* CompleteClass */
  override var activatableClassId: String = js.native
  /** Gets the bands included in the equalizer effect definition. */
  /* CompleteClass */
  override var bands: IVectorView[typings.winrtUwp.Windows.Media.Audio.EqualizerBand] = js.native
  /** Gets the properties supported by the equalizer effect definition. */
  /* CompleteClass */
  override var properties: IPropertySet = js.native
}

