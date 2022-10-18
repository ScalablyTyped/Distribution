package typings.three.anon

import typings.three.examplesJsmNodesCoreNodeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutgoingLightNode extends StObject {
  
  var diffuseColorNode: default
  
  var outgoingLightNode: default
}
object OutgoingLightNode {
  
  inline def apply(diffuseColorNode: default, outgoingLightNode: default): OutgoingLightNode = {
    val __obj = js.Dynamic.literal(diffuseColorNode = diffuseColorNode.asInstanceOf[js.Any], outgoingLightNode = outgoingLightNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutgoingLightNode]
  }
  
  extension [Self <: OutgoingLightNode](x: Self) {
    
    inline def setDiffuseColorNode(value: default): Self = StObject.set(x, "diffuseColorNode", value.asInstanceOf[js.Any])
    
    inline def setOutgoingLightNode(value: default): Self = StObject.set(x, "outgoingLightNode", value.asInstanceOf[js.Any])
  }
}
