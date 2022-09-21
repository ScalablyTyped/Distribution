package typings.webpack.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChunkMaps extends StObject {
  
  var contentHash: Record[String | Double, Record[String, String]]
  
  var hash: Record[String | Double, String]
  
  var name: Record[String | Double, String]
}
object ChunkMaps {
  
  inline def apply(
    contentHash: Record[String | Double, Record[String, String]],
    hash: Record[String | Double, String],
    name: Record[String | Double, String]
  ): ChunkMaps = {
    val __obj = js.Dynamic.literal(contentHash = contentHash.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkMaps]
  }
  
  extension [Self <: ChunkMaps](x: Self) {
    
    inline def setContentHash(value: Record[String | Double, Record[String, String]]): Self = StObject.set(x, "contentHash", value.asInstanceOf[js.Any])
    
    inline def setHash(value: Record[String | Double, String]): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setName(value: Record[String | Double, String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
