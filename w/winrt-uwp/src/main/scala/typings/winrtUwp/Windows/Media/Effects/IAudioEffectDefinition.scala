package typings.winrtUwp.Windows.Media.Effects

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Exposes the methods and properties of an AudioEffectDefinition object. Implement this interface when you create a custom audio effect definition. */
@js.native
trait IAudioEffectDefinition extends StObject {
  
  /** The activatable class ID of the audio effect definition. */
  var activatableClassId: String = js.native
  
  /** The set of properties for configuring an AudioEffectDefinition object. */
  var properties: IPropertySet = js.native
}
object IAudioEffectDefinition {
  
  @scala.inline
  def apply(activatableClassId: String, properties: IPropertySet): IAudioEffectDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAudioEffectDefinition]
  }
  
  @scala.inline
  implicit class IAudioEffectDefinitionMutableBuilder[Self <: IAudioEffectDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivatableClassId(value: String): Self = StObject.set(x, "activatableClassId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: IPropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
