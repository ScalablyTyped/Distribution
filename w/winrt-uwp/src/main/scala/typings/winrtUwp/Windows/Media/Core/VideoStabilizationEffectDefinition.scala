package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the definition of a video stabilization effect. */
trait VideoStabilizationEffectDefinition extends StObject {
  
  /** Gets a string containing the activatable class ID of the video stabilization effect definition. */
  var activatableClassId: String
  
  /** Gets the set of properties for configuring the VideoStabilizationEffectDefinition object. */
  var properties: IPropertySet
}
object VideoStabilizationEffectDefinition {
  
  @scala.inline
  def apply(activatableClassId: String, properties: IPropertySet): VideoStabilizationEffectDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoStabilizationEffectDefinition]
  }
  
  @scala.inline
  implicit class VideoStabilizationEffectDefinitionMutableBuilder[Self <: VideoStabilizationEffectDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivatableClassId(value: String): Self = StObject.set(x, "activatableClassId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: IPropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
