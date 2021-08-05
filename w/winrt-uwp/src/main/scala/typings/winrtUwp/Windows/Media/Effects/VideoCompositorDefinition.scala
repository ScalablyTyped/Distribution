package typings.winrtUwp.Windows.Media.Effects

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the definition of a custom video compositor. */
trait VideoCompositorDefinition extends StObject {
  
  /** Gets the activatable class ID of the video compositor. */
  var activatableClassId: String
  
  /** Gets the set of properties for configuring the video compositor object. */
  var properties: IPropertySet
}
object VideoCompositorDefinition {
  
  inline def apply(activatableClassId: String, properties: IPropertySet): VideoCompositorDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoCompositorDefinition]
  }
  
  extension [Self <: VideoCompositorDefinition](x: Self) {
    
    inline def setActivatableClassId(value: String): Self = StObject.set(x, "activatableClassId", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: IPropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
