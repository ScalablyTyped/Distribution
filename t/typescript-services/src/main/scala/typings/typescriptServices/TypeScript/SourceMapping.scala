package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceMapping extends StObject {
  
  var childMappings: js.Array[SourceMapping]
  
  var end: SourceMapPosition
  
  var nameIndex: Double
  
  var start: SourceMapPosition
}
object SourceMapping {
  
  inline def apply(
    childMappings: js.Array[SourceMapping],
    end: SourceMapPosition,
    nameIndex: Double,
    start: SourceMapPosition
  ): SourceMapping = {
    val __obj = js.Dynamic.literal(childMappings = childMappings.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], nameIndex = nameIndex.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMapping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceMapping] (val x: Self) extends AnyVal {
    
    inline def setChildMappings(value: js.Array[SourceMapping]): Self = StObject.set(x, "childMappings", value.asInstanceOf[js.Any])
    
    inline def setChildMappingsVarargs(value: SourceMapping*): Self = StObject.set(x, "childMappings", js.Array(value*))
    
    inline def setEnd(value: SourceMapPosition): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setNameIndex(value: Double): Self = StObject.set(x, "nameIndex", value.asInstanceOf[js.Any])
    
    inline def setStart(value: SourceMapPosition): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
