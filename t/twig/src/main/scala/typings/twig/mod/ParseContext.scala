package typings.twig.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseContext
  extends StObject
     with ExtendableParseContext {
  
  var filename: String
  
  var loop: js.UndefOr[ParseLoopContext] = js.undefined
  
  var partials: Record[String, Any]
  
  var path: String
}
object ParseContext {
  
  inline def apply(filename: String, partials: Record[String, Any], path: String): ParseContext = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], partials = partials.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseContext]
  }
  
  extension [Self <: ParseContext](x: Self) {
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setLoop(value: ParseLoopContext): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setPartials(value: Record[String, Any]): Self = StObject.set(x, "partials", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
