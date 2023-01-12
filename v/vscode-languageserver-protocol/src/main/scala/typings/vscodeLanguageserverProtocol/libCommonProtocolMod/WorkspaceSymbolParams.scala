package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceSymbolParams
  extends StObject
     with WorkDoneProgressParams
     with PartialResultParams {
  
  /**
    * A query string to filter symbols by. Clients may send an empty
    * string here to request all symbols.
    */
  var query: String
}
object WorkspaceSymbolParams {
  
  inline def apply(query: String): WorkspaceSymbolParams = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceSymbolParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkspaceSymbolParams] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
