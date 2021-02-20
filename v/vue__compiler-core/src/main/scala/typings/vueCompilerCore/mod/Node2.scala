package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node2 extends StObject {
  
  var loc: SourceLocation = js.native
  
  var `type`: NodeTypes = js.native
}
object Node2 {
  
  @scala.inline
  def apply(loc: SourceLocation, `type`: NodeTypes): Node2 = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node2]
  }
  
  @scala.inline
  implicit class Node2MutableBuilder[Self <: Node2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: NodeTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
