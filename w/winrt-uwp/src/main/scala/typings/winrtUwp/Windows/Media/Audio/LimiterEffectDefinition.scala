package typings.winrtUwp.Windows.Media.Audio

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a limiter effect definition supported by the audio graph. */
@JSGlobal("Windows.Media.Audio.LimiterEffectDefinition")
@js.native
class LimiterEffectDefinition protected () extends js.Object {
  /**
    * Initializes a new instance of the LimiterEffectDefinition class.
    * @param audioGraph The AudioGraph with which the effect will be used. Using effects outside of the audio graph it was created with is not supported.
    */
  def this(audioGraph: AudioGraph) = this()
  /** Gets the activatable class ID for the limiter effect definition object. */
  var activatableClassId: String = js.native
  /** Gets or sets the loudness included in the limiter effect definition. */
  var loudness: Double = js.native
  /** Gets the properties supported by the limiter effect definition. */
  var properties: IPropertySet = js.native
  /** Gets or sets the release included in the limiter effect definition. */
  var release: Double = js.native
}

