package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the definition of a scene analysis video effect. */
@js.native
trait SceneAnalysisEffectDefinition extends js.Object {
  
  /** Gets a string containing the activatable class ID of the scene analysis effect definition. */
  var activatableClassId: String = js.native
  
  /** Gets the set of properties for configuring the SceneAnalysisEffectDefinition object. */
  var properties: IPropertySet = js.native
}
object SceneAnalysisEffectDefinition {
  
  @scala.inline
  def apply(activatableClassId: String, properties: IPropertySet): SceneAnalysisEffectDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneAnalysisEffectDefinition]
  }
  
  @scala.inline
  implicit class SceneAnalysisEffectDefinitionOps[Self <: SceneAnalysisEffectDefinition] (val x: Self) extends AnyVal {
    
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
    def setProperties(value: IPropertySet): Self = this.set("properties", value.asInstanceOf[js.Any])
  }
}
