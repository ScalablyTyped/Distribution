package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Library extends StObject {
  
  var node: js.Array[Attr | Input | Name | Op | AttrInput]
  
  var versions: Producer
}
object Library {
  
  inline def apply(node: js.Array[Attr | Input | Name | Op | AttrInput], versions: Producer): Library = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Library]
  }
  
  extension [Self <: Library](x: Self) {
    
    inline def setNode(value: js.Array[Attr | Input | Name | Op | AttrInput]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeVarargs(value: (Attr | Input | Name | Op | AttrInput)*): Self = StObject.set(x, "node", js.Array(value*))
    
    inline def setVersions(value: Producer): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
  }
}
