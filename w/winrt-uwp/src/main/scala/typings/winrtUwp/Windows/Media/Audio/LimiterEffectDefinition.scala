package typings.winrtUwp.Windows.Media.Audio

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a limiter effect definition supported by the audio graph. */
trait LimiterEffectDefinition extends js.Object {
  /** Gets the activatable class ID for the limiter effect definition object. */
  var activatableClassId: String
  /** Gets or sets the loudness included in the limiter effect definition. */
  var loudness: Double
  /** Gets the properties supported by the limiter effect definition. */
  var properties: IPropertySet
  /** Gets or sets the release included in the limiter effect definition. */
  var release: Double
}

object LimiterEffectDefinition {
  @scala.inline
  def apply(activatableClassId: String, loudness: Double, properties: IPropertySet, release: Double): LimiterEffectDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], loudness = loudness.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimiterEffectDefinition]
  }
}

