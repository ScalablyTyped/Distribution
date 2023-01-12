package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntryOnly extends StObject {
  
  /**
  		 * Context of requests in the manifest file (defaults to the webpack context).
  		 */
  var context: js.UndefOr[String] = js.undefined
  
  var entryOnly: Boolean
  
  /**
  		 * If true, manifest json file (output) will be formatted.
  		 */
  var format: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Name of the exposed dll function (external name, use value of 'output.library').
  		 */
  var name: js.UndefOr[String] = js.undefined
  
  /**
  		 * Absolute path to the manifest json file (output).
  		 */
  var path: String
  
  /**
  		 * Type of the dll bundle (external type, use value of 'output.libraryTarget').
  		 */
  var `type`: js.UndefOr[String] = js.undefined
}
object EntryOnly {
  
  inline def apply(entryOnly: Boolean, path: String): EntryOnly = {
    val __obj = js.Dynamic.literal(entryOnly = entryOnly.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryOnly]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntryOnly] (val x: Self) extends AnyVal {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setEntryOnly(value: Boolean): Self = StObject.set(x, "entryOnly", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: Boolean): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
