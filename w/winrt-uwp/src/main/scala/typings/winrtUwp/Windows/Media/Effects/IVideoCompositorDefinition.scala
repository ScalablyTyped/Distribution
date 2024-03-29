package typings.winrtUwp.Windows.Media.Effects

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The interface defining a custom video compositor definition. */
trait IVideoCompositorDefinition extends StObject {
  
  /** Gets the activatable class ID of the video compositor. */
  var activatableClassId: String
  
  /** Gets the set of properties for configuring the video compositor object. */
  var properties: IPropertySet
}
object IVideoCompositorDefinition {
  
  inline def apply(activatableClassId: String, properties: IPropertySet): IVideoCompositorDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVideoCompositorDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IVideoCompositorDefinition] (val x: Self) extends AnyVal {
    
    inline def setActivatableClassId(value: String): Self = StObject.set(x, "activatableClassId", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: IPropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
