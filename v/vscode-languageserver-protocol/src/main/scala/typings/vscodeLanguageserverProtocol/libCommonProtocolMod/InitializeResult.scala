package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StringDictionary
import typings.vscodeLanguageserverProtocol.anon.Name
import typings.vscodeLanguageserverTypes.mod.LSPAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitializeResult[T]
  extends StObject
     with /**
  * Custom initialization results.
  */
/* custom */ StringDictionary[js.UndefOr[LSPAny | ServerCapabilities[T]]] {
  
  /**
    * The capabilities the language server provides.
    */
  var capabilities: ServerCapabilities[T]
  
  /**
    * Information about the server.
    *
    * @since 3.15.0
    */
  var serverInfo: js.UndefOr[Name] = js.undefined
}
object InitializeResult {
  
  inline def apply[T](capabilities: ServerCapabilities[T]): InitializeResult[T] = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializeResult[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InitializeResult[?], T] (val x: Self & InitializeResult[T]) extends AnyVal {
    
    inline def setCapabilities(value: ServerCapabilities[T]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setServerInfo(value: Name): Self = StObject.set(x, "serverInfo", value.asInstanceOf[js.Any])
    
    inline def setServerInfoUndefined: Self = StObject.set(x, "serverInfo", js.undefined)
  }
}
