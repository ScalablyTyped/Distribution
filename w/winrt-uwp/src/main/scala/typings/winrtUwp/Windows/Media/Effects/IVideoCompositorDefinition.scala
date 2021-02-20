package typings.winrtUwp.Windows.Media.Effects

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The interface defining a custom video compositor definition. */
@js.native
trait IVideoCompositorDefinition extends StObject {
  
  /** Gets the activatable class ID of the video compositor. */
  var activatableClassId: String = js.native
  
  /** Gets the set of properties for configuring the video compositor object. */
  var properties: IPropertySet = js.native
}
object IVideoCompositorDefinition {
  
  @scala.inline
  def apply(activatableClassId: String, properties: IPropertySet): IVideoCompositorDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVideoCompositorDefinition]
  }
  
  @scala.inline
  implicit class IVideoCompositorDefinitionMutableBuilder[Self <: IVideoCompositorDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivatableClassId(value: String): Self = StObject.set(x, "activatableClassId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: IPropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
