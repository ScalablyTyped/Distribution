package typings.three.anon

import typings.three.examplesJsmNodesNodesMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Base extends StObject {
  
  var base: Node
  
  var blendNode: Node
}
object Base {
  
  inline def apply(base: Node, blendNode: Node): Base = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], blendNode = blendNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Base] (val x: Self) extends AnyVal {
    
    inline def setBase(value: Node): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBlendNode(value: Node): Self = StObject.set(x, "blendNode", value.asInstanceOf[js.Any])
  }
}
