package typings.winrtUwp.Windows.Media.Effects

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an audio effect definition. */
trait AudioEffectDefinition extends StObject {
  
  /** The activatable class ID of the audio effect definition. */
  var activatableClassId: String
  
  /** The set of properties for configuring an AudioEffectDefinition object. */
  var properties: IPropertySet
}
object AudioEffectDefinition {
  
  inline def apply(activatableClassId: String, properties: IPropertySet): AudioEffectDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioEffectDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioEffectDefinition] (val x: Self) extends AnyVal {
    
    inline def setActivatableClassId(value: String): Self = StObject.set(x, "activatableClassId", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: IPropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
