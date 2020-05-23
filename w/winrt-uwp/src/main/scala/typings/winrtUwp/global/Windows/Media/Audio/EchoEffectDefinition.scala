package typings.winrtUwp.global.Windows.Media.Audio

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an echo effect definition supported by the audio graph. */
@JSGlobal("Windows.Media.Audio.EchoEffectDefinition")
@js.native
class EchoEffectDefinition protected ()
  extends typings.winrtUwp.Windows.Media.Audio.EchoEffectDefinition {
  /**
    * Creates an EchoEffectDefinition object.
    * @param audioGraph The AudioGraph with which the effect will be used. Using effects outside of the audio graph it was created with is not supported.
    */
  def this(audioGraph: typings.winrtUwp.Windows.Media.Audio.AudioGraph) = this()
  /** Gets the activatable class ID for the echo effect definition object. */
  /* CompleteClass */
  override var activatableClassId: String = js.native
  /** Gets or sets the delay supported by the echo effect definition. */
  /* CompleteClass */
  override var delay: Double = js.native
  /** Gets or sets the feedback included in the echo effect definition. */
  /* CompleteClass */
  override var feedback: Double = js.native
  /** Gets or sets the properties supported by the echo effect definition. */
  /* CompleteClass */
  override var properties: IPropertySet = js.native
  /** Gets or sets the wet-dry audio voice mix for the echo effect definition. */
  /* CompleteClass */
  override var wetDryMix: Double = js.native
}

