package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node2 extends StObject {
  
  var loc: SourceLocation
  
  var `type`: NodeTypes
}
object Node2 {
  
  inline def apply(loc: SourceLocation, `type`: NodeTypes): Node2 = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node2]
  }
  
  extension [Self <: Node2](x: Self) {
    
    inline def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setType(value: NodeTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
