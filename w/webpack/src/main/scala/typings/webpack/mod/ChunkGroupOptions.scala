package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChunkGroupOptions
  extends StObject
     with RawChunkGroupOptions {
  
  var name: js.UndefOr[String] = js.undefined
}
object ChunkGroupOptions {
  
  inline def apply(): ChunkGroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChunkGroupOptions]
  }
  
  extension [Self <: ChunkGroupOptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
