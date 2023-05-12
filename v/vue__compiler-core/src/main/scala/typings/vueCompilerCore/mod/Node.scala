package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node extends StObject {
  
  var loc: SourceLocation
  
  var `type`: NodeTypes
}
object Node {
  
  inline def apply(loc: SourceLocation, `type`: NodeTypes): Node = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
    
    inline def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setType(value: NodeTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
