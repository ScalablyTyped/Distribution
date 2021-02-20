package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StringDictionary
import typings.vscodeLanguageserverProtocol.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitializeResult[T]
  extends /**
  * Custom initialization results.
  */
/* custom */ StringDictionary[js.Any] {
  
  /**
    * The capabilities the language server provides.
    */
  var capabilities: ServerCapabilities[T] = js.native
  
  /**
    * Information about the server.
    *
    * @since 3.15.0
    */
  var serverInfo: js.UndefOr[Name] = js.native
}
object InitializeResult {
  
  @scala.inline
  def apply[T](capabilities: ServerCapabilities[T]): InitializeResult[T] = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializeResult[T]]
  }
  
  @scala.inline
  implicit class InitializeResultMutableBuilder[Self <: InitializeResult[_], T] (val x: Self with InitializeResult[T]) extends AnyVal {
    
    @scala.inline
    def setCapabilities(value: ServerCapabilities[T]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerInfo(value: Name): Self = StObject.set(x, "serverInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerInfoUndefined: Self = StObject.set(x, "serverInfo", js.undefined)
  }
}
