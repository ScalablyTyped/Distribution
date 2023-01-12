package typings.webpack.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChunkModuleMaps extends StObject {
  
  var hash: Record[String | Double, String]
  
  var id: Record[String | Double, js.Array[String | Double]]
}
object ChunkModuleMaps {
  
  inline def apply(hash: Record[String | Double, String], id: Record[String | Double, js.Array[String | Double]]): ChunkModuleMaps = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkModuleMaps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChunkModuleMaps] (val x: Self) extends AnyVal {
    
    inline def setHash(value: Record[String | Double, String]): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setId(value: Record[String | Double, js.Array[String | Double]]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
