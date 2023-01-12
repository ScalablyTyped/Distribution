package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParsedIdentifier extends StObject {
  
  var directory: Boolean
  
  var file: Boolean
  
  var fragment: String
  
  var internal: Boolean
  
  var module: Boolean
  
  var query: String
  
  var request: String
}
object ParsedIdentifier {
  
  inline def apply(
    directory: Boolean,
    file: Boolean,
    fragment: String,
    internal: Boolean,
    module: Boolean,
    query: String,
    request: String
  ): ParsedIdentifier = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParsedIdentifier] (val x: Self) extends AnyVal {
    
    inline def setDirectory(value: Boolean): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    inline def setFile(value: Boolean): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    inline def setInternal(value: Boolean): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
    
    inline def setModule(value: Boolean): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
