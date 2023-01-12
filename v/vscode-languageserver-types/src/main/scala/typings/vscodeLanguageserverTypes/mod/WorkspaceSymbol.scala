package typings.vscodeLanguageserverTypes.mod

import typings.vscodeLanguageserverTypes.anon.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceSymbol
  extends StObject
     with BaseSymbolInformation {
  
  /**
    * A data entry field that is preserved on a workspace symbol between a
    * workspace symbol request and a workspace symbol resolve request.
    */
  var data: js.UndefOr[LSPAny] = js.undefined
  
  /**
    * The location of the symbol. Whether a server is allowed to
    * return a location without a range depends on the client
    * capability `workspace.symbol.resolveSupport`.
    *
    * See SymbolInformation#location for more details.
    */
  var location: Location | Uri
}
object WorkspaceSymbol {
  
  inline def apply(kind: SymbolKind, location: Location | Uri, name: String): WorkspaceSymbol = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceSymbol]
  }
  
  @JSImport("vscode-languageserver-types", "WorkspaceSymbol")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a new workspace symbol.
    *
    * @param name The name of the symbol.
    * @param kind The kind of the symbol.
    * @param uri The resource of the location of the symbol.
    * @param range An options range of the location.
    * @returns A WorkspaceSymbol.
    */
  inline def create(name: String, kind: SymbolKind, uri: DocumentUri): WorkspaceSymbol = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], uri.asInstanceOf[js.Any])).asInstanceOf[WorkspaceSymbol]
  inline def create(name: String, kind: SymbolKind, uri: DocumentUri, range: Range): WorkspaceSymbol = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], uri.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[WorkspaceSymbol]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkspaceSymbol] (val x: Self) extends AnyVal {
    
    inline def setData(value: LSPAny): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setLocation(value: Location | Uri): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
  }
}
