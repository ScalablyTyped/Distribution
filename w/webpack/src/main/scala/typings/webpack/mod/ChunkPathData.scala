package typings.webpack.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChunkPathData extends StObject {
  
  var contentHash: js.UndefOr[Record[String, String]] = js.undefined
  
  var contentHashWithLength: js.UndefOr[Record[String, js.Function1[/* length */ Double, String]]] = js.undefined
  
  var hash: String
  
  var hashWithLength: js.UndefOr[js.Function1[/* arg0 */ Double, String]] = js.undefined
  
  var id: String | Double
  
  var name: js.UndefOr[String] = js.undefined
}
object ChunkPathData {
  
  inline def apply(hash: String, id: String | Double): ChunkPathData = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkPathData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChunkPathData] (val x: Self) extends AnyVal {
    
    inline def setContentHash(value: Record[String, String]): Self = StObject.set(x, "contentHash", value.asInstanceOf[js.Any])
    
    inline def setContentHashUndefined: Self = StObject.set(x, "contentHash", js.undefined)
    
    inline def setContentHashWithLength(value: Record[String, js.Function1[/* length */ Double, String]]): Self = StObject.set(x, "contentHashWithLength", value.asInstanceOf[js.Any])
    
    inline def setContentHashWithLengthUndefined: Self = StObject.set(x, "contentHashWithLength", js.undefined)
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashWithLength(value: /* arg0 */ Double => String): Self = StObject.set(x, "hashWithLength", js.Any.fromFunction1(value))
    
    inline def setHashWithLengthUndefined: Self = StObject.set(x, "hashWithLength", js.undefined)
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
