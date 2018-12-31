package typings
package winrtDashUwpLib.WindowsNs.MediaNs.AudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a reverberation effect definition supported by the audio graph. */
@JSGlobal("Windows.Media.Audio.ReverbEffectDefinition")
@js.native
class ReverbEffectDefinition protected () extends js.Object {
  /**
    * Initializes a new instance of the ReverbffectDefinition class.
    * @param audioGraph The AudioGraph with which the effect will be used. Using effects outside of the audio graph it was created with is not supported.
    */
  def this(audioGraph: AudioGraph) = this()
  /** Gets the activatable class ID for the reverberation effect definition object. */
  var activatableClassId: java.lang.String = js.native
  /** Gets or sets the decay time supported by the reverberation effect definition. */
  var decayTime: scala.Double = js.native
  /** Gets or sets the density included in the reverberation effect definition. */
  var density: scala.Double = js.native
  /** Gets or sets a value indicating if the reverberation effect disables late fields. */
  var disableLateField: scala.Boolean = js.native
  /** Gets or sets the early diffusion value for the reverberation effect definition. */
  var earlyDiffusion: scala.Double = js.native
  /** Gets or sets the high equalization cutoff included in the reverberation effect definition. */
  var highEQCutoff: scala.Double = js.native
  /** Gets or sets the high equalization gain included in the reverberation effect definition. */
  var highEQGain: scala.Double = js.native
  /** Gets or sets the late diffusion included in the reverberation effect definition. */
  var lateDiffusion: scala.Double = js.native
  /** Gets or sets the low equalization cutoff included in the reverberation effect definition. */
  var lowEQCutoff: scala.Double = js.native
  /** Gets or sets the low equalization gain included in the reverberation effect definition. */
  var lowEQGain: scala.Double = js.native
  /** Gets or sets the position left included in the reverberation effect definition. */
  var positionLeft: scala.Double = js.native
  /** Gets or sets the matrix position left included in the reverberation effect definition. */
  var positionMatrixLeft: scala.Double = js.native
  /** Gets or sets the matrix position right included in the reverberation effect definition. */
  var positionMatrixRight: scala.Double = js.native
  /** Gets or sets the position right included in the reverberation effect definition. */
  var positionRight: scala.Double = js.native
  /** Gets the properties supported by the reverberation effect definition. */
  var properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet = js.native
  /** Gets or sets the rear delay included in the reverberation effect definition. */
  var rearDelay: scala.Double = js.native
  /** Gets or sets the reflections delay included in the reverberation effect definition. */
  var reflectionsDelay: scala.Double = js.native
  /** Gets or sets the reflections gain included in the reverberation effect definition. */
  var reflectionsGain: scala.Double = js.native
  /** Gets or sets the reverberation delay included in the reverberation effect definition. */
  var reverbDelay: scala.Double = js.native
  /** Gets or sets the reverberation gain included in the reverberation effect definition. */
  var reverbGain: scala.Double = js.native
  /** Gets or sets the room filter frequency included in the reverberation effect definition. */
  var roomFilterFreq: scala.Double = js.native
  /** Gets or sets the room filter high frequency included in the reverberation effect definition. */
  var roomFilterHF: scala.Double = js.native
  /** Gets or sets the main room filter included in the reverberation effect definition. */
  var roomFilterMain: scala.Double = js.native
  /** Gets or sets the room size included in the reverberation effect definition. */
  var roomSize: scala.Double = js.native
  /** Gets or sets the wet-dry audio voice mix for the reverberation effect definition. */
  var wetDryMix: scala.Double = js.native
}

