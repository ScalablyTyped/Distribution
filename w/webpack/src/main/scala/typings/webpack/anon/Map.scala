package typings.webpack.anon

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Map extends StObject {
  
  var map: js.Object
  
  var source: String | Buffer
}
object Map {
  
  inline def apply(map: js.Object, source: String | Buffer): Map = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Map]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Map] (val x: Self) extends AnyVal {
    
    inline def setMap(value: js.Object): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String | Buffer): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
