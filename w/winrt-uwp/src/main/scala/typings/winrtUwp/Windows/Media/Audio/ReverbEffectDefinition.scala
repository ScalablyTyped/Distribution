package typings.winrtUwp.Windows.Media.Audio

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a reverberation effect definition supported by the audio graph. */
trait ReverbEffectDefinition extends js.Object {
  /** Gets the activatable class ID for the reverberation effect definition object. */
  var activatableClassId: String
  /** Gets or sets the decay time supported by the reverberation effect definition. */
  var decayTime: Double
  /** Gets or sets the density included in the reverberation effect definition. */
  var density: Double
  /** Gets or sets a value indicating if the reverberation effect disables late fields. */
  var disableLateField: Boolean
  /** Gets or sets the early diffusion value for the reverberation effect definition. */
  var earlyDiffusion: Double
  /** Gets or sets the high equalization cutoff included in the reverberation effect definition. */
  var highEQCutoff: Double
  /** Gets or sets the high equalization gain included in the reverberation effect definition. */
  var highEQGain: Double
  /** Gets or sets the late diffusion included in the reverberation effect definition. */
  var lateDiffusion: Double
  /** Gets or sets the low equalization cutoff included in the reverberation effect definition. */
  var lowEQCutoff: Double
  /** Gets or sets the low equalization gain included in the reverberation effect definition. */
  var lowEQGain: Double
  /** Gets or sets the position left included in the reverberation effect definition. */
  var positionLeft: Double
  /** Gets or sets the matrix position left included in the reverberation effect definition. */
  var positionMatrixLeft: Double
  /** Gets or sets the matrix position right included in the reverberation effect definition. */
  var positionMatrixRight: Double
  /** Gets or sets the position right included in the reverberation effect definition. */
  var positionRight: Double
  /** Gets the properties supported by the reverberation effect definition. */
  var properties: IPropertySet
  /** Gets or sets the rear delay included in the reverberation effect definition. */
  var rearDelay: Double
  /** Gets or sets the reflections delay included in the reverberation effect definition. */
  var reflectionsDelay: Double
  /** Gets or sets the reflections gain included in the reverberation effect definition. */
  var reflectionsGain: Double
  /** Gets or sets the reverberation delay included in the reverberation effect definition. */
  var reverbDelay: Double
  /** Gets or sets the reverberation gain included in the reverberation effect definition. */
  var reverbGain: Double
  /** Gets or sets the room filter frequency included in the reverberation effect definition. */
  var roomFilterFreq: Double
  /** Gets or sets the room filter high frequency included in the reverberation effect definition. */
  var roomFilterHF: Double
  /** Gets or sets the main room filter included in the reverberation effect definition. */
  var roomFilterMain: Double
  /** Gets or sets the room size included in the reverberation effect definition. */
  var roomSize: Double
  /** Gets or sets the wet-dry audio voice mix for the reverberation effect definition. */
  var wetDryMix: Double
}

object ReverbEffectDefinition {
  @scala.inline
  def apply(
    activatableClassId: String,
    decayTime: Double,
    density: Double,
    disableLateField: Boolean,
    earlyDiffusion: Double,
    highEQCutoff: Double,
    highEQGain: Double,
    lateDiffusion: Double,
    lowEQCutoff: Double,
    lowEQGain: Double,
    positionLeft: Double,
    positionMatrixLeft: Double,
    positionMatrixRight: Double,
    positionRight: Double,
    properties: IPropertySet,
    rearDelay: Double,
    reflectionsDelay: Double,
    reflectionsGain: Double,
    reverbDelay: Double,
    reverbGain: Double,
    roomFilterFreq: Double,
    roomFilterHF: Double,
    roomFilterMain: Double,
    roomSize: Double,
    wetDryMix: Double
  ): ReverbEffectDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], decayTime = decayTime.asInstanceOf[js.Any], density = density.asInstanceOf[js.Any], disableLateField = disableLateField.asInstanceOf[js.Any], earlyDiffusion = earlyDiffusion.asInstanceOf[js.Any], highEQCutoff = highEQCutoff.asInstanceOf[js.Any], highEQGain = highEQGain.asInstanceOf[js.Any], lateDiffusion = lateDiffusion.asInstanceOf[js.Any], lowEQCutoff = lowEQCutoff.asInstanceOf[js.Any], lowEQGain = lowEQGain.asInstanceOf[js.Any], positionLeft = positionLeft.asInstanceOf[js.Any], positionMatrixLeft = positionMatrixLeft.asInstanceOf[js.Any], positionMatrixRight = positionMatrixRight.asInstanceOf[js.Any], positionRight = positionRight.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], rearDelay = rearDelay.asInstanceOf[js.Any], reflectionsDelay = reflectionsDelay.asInstanceOf[js.Any], reflectionsGain = reflectionsGain.asInstanceOf[js.Any], reverbDelay = reverbDelay.asInstanceOf[js.Any], reverbGain = reverbGain.asInstanceOf[js.Any], roomFilterFreq = roomFilterFreq.asInstanceOf[js.Any], roomFilterHF = roomFilterHF.asInstanceOf[js.Any], roomFilterMain = roomFilterMain.asInstanceOf[js.Any], roomSize = roomSize.asInstanceOf[js.Any], wetDryMix = wetDryMix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReverbEffectDefinition]
  }
}

