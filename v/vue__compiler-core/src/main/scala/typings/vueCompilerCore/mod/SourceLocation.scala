package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceLocation extends StObject {
  
  var end: Position2
  
  var source: String
  
  var start: Position2
}
object SourceLocation {
  
  inline def apply(end: Position2, source: String, start: Position2): SourceLocation = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceLocation]
  }
  
  extension [Self <: SourceLocation](x: Self) {
    
    inline def setEnd(value: Position2): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Position2): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
