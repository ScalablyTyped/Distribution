package typings.winrtUwp.Windows.Media.Audio

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a limiter effect definition supported by the audio graph. */
@js.native
trait LimiterEffectDefinition extends js.Object {
  
  /** Gets the activatable class ID for the limiter effect definition object. */
  var activatableClassId: String = js.native
  
  /** Gets or sets the loudness included in the limiter effect definition. */
  var loudness: Double = js.native
  
  /** Gets the properties supported by the limiter effect definition. */
  var properties: IPropertySet = js.native
  
  /** Gets or sets the release included in the limiter effect definition. */
  var release: Double = js.native
}
object LimiterEffectDefinition {
  
  @scala.inline
  def apply(activatableClassId: String, loudness: Double, properties: IPropertySet, release: Double): LimiterEffectDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], loudness = loudness.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimiterEffectDefinition]
  }
  
  @scala.inline
  implicit class LimiterEffectDefinitionOps[Self <: LimiterEffectDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActivatableClassId(value: String): Self = this.set("activatableClassId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoudness(value: Double): Self = this.set("loudness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: IPropertySet): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease(value: Double): Self = this.set("release", value.asInstanceOf[js.Any])
  }
}
