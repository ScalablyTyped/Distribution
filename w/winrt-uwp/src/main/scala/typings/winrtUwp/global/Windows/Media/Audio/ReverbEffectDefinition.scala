package typings.winrtUwp.global.Windows.Media.Audio

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a reverberation effect definition supported by the audio graph. */
@JSGlobal("Windows.Media.Audio.ReverbEffectDefinition")
@js.native
class ReverbEffectDefinition protected ()
  extends typings.winrtUwp.Windows.Media.Audio.ReverbEffectDefinition {
  /**
    * Initializes a new instance of the ReverbffectDefinition class.
    * @param audioGraph The AudioGraph with which the effect will be used. Using effects outside of the audio graph it was created with is not supported.
    */
  def this(audioGraph: typings.winrtUwp.Windows.Media.Audio.AudioGraph) = this()
  /** Gets the activatable class ID for the reverberation effect definition object. */
  /* CompleteClass */
  override var activatableClassId: String = js.native
  /** Gets or sets the decay time supported by the reverberation effect definition. */
  /* CompleteClass */
  override var decayTime: Double = js.native
  /** Gets or sets the density included in the reverberation effect definition. */
  /* CompleteClass */
  override var density: Double = js.native
  /** Gets or sets a value indicating if the reverberation effect disables late fields. */
  /* CompleteClass */
  override var disableLateField: Boolean = js.native
  /** Gets or sets the early diffusion value for the reverberation effect definition. */
  /* CompleteClass */
  override var earlyDiffusion: Double = js.native
  /** Gets or sets the high equalization cutoff included in the reverberation effect definition. */
  /* CompleteClass */
  override var highEQCutoff: Double = js.native
  /** Gets or sets the high equalization gain included in the reverberation effect definition. */
  /* CompleteClass */
  override var highEQGain: Double = js.native
  /** Gets or sets the late diffusion included in the reverberation effect definition. */
  /* CompleteClass */
  override var lateDiffusion: Double = js.native
  /** Gets or sets the low equalization cutoff included in the reverberation effect definition. */
  /* CompleteClass */
  override var lowEQCutoff: Double = js.native
  /** Gets or sets the low equalization gain included in the reverberation effect definition. */
  /* CompleteClass */
  override var lowEQGain: Double = js.native
  /** Gets or sets the position left included in the reverberation effect definition. */
  /* CompleteClass */
  override var positionLeft: Double = js.native
  /** Gets or sets the matrix position left included in the reverberation effect definition. */
  /* CompleteClass */
  override var positionMatrixLeft: Double = js.native
  /** Gets or sets the matrix position right included in the reverberation effect definition. */
  /* CompleteClass */
  override var positionMatrixRight: Double = js.native
  /** Gets or sets the position right included in the reverberation effect definition. */
  /* CompleteClass */
  override var positionRight: Double = js.native
  /** Gets the properties supported by the reverberation effect definition. */
  /* CompleteClass */
  override var properties: IPropertySet = js.native
  /** Gets or sets the rear delay included in the reverberation effect definition. */
  /* CompleteClass */
  override var rearDelay: Double = js.native
  /** Gets or sets the reflections delay included in the reverberation effect definition. */
  /* CompleteClass */
  override var reflectionsDelay: Double = js.native
  /** Gets or sets the reflections gain included in the reverberation effect definition. */
  /* CompleteClass */
  override var reflectionsGain: Double = js.native
  /** Gets or sets the reverberation delay included in the reverberation effect definition. */
  /* CompleteClass */
  override var reverbDelay: Double = js.native
  /** Gets or sets the reverberation gain included in the reverberation effect definition. */
  /* CompleteClass */
  override var reverbGain: Double = js.native
  /** Gets or sets the room filter frequency included in the reverberation effect definition. */
  /* CompleteClass */
  override var roomFilterFreq: Double = js.native
  /** Gets or sets the room filter high frequency included in the reverberation effect definition. */
  /* CompleteClass */
  override var roomFilterHF: Double = js.native
  /** Gets or sets the main room filter included in the reverberation effect definition. */
  /* CompleteClass */
  override var roomFilterMain: Double = js.native
  /** Gets or sets the room size included in the reverberation effect definition. */
  /* CompleteClass */
  override var roomSize: Double = js.native
  /** Gets or sets the wet-dry audio voice mix for the reverberation effect definition. */
  /* CompleteClass */
  override var wetDryMix: Double = js.native
}

