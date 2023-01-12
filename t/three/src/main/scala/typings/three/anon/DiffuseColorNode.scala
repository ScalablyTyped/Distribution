package typings.three.anon

import typings.three.examplesJsmNodesCoreNodeMod.default
import typings.three.examplesJsmNodesLightingLightingContextNodeMod.LightingModelNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiffuseColorNode extends StObject {
  
  var diffuseColorNode: default
  
  var lightingModelNode: LightingModelNode
  
  var lightsNode: js.UndefOr[default] = js.undefined
}
object DiffuseColorNode {
  
  inline def apply(diffuseColorNode: default, lightingModelNode: LightingModelNode): DiffuseColorNode = {
    val __obj = js.Dynamic.literal(diffuseColorNode = diffuseColorNode.asInstanceOf[js.Any], lightingModelNode = lightingModelNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffuseColorNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiffuseColorNode] (val x: Self) extends AnyVal {
    
    inline def setDiffuseColorNode(value: default): Self = StObject.set(x, "diffuseColorNode", value.asInstanceOf[js.Any])
    
    inline def setLightingModelNode(value: LightingModelNode): Self = StObject.set(x, "lightingModelNode", value.asInstanceOf[js.Any])
    
    inline def setLightsNode(value: default): Self = StObject.set(x, "lightsNode", value.asInstanceOf[js.Any])
    
    inline def setLightsNodeUndefined: Self = StObject.set(x, "lightsNode", js.undefined)
  }
}
