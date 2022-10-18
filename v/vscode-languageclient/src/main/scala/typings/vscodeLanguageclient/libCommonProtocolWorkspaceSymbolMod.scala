package typings.vscodeLanguageclient

import typings.vscode.mod.Location
import typings.vscode.mod.SymbolInformation
import typings.vscode.mod.SymbolKind
import typings.vscode.mod.Uri
import typings.vscodeLanguageserverTypes.mod.LSPAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonProtocolWorkspaceSymbolMod {
  
  @JSImport("vscode-languageclient/lib/common/protocolWorkspaceSymbol", JSImport.Default)
  @js.native
  open class default protected () extends WorkspaceSymbol {
    def this(name: String, kind: SymbolKind, containerName: String, locationOrUri: Location) = this()
    def this(name: String, kind: SymbolKind, containerName: String, locationOrUri: Uri) = this()
    def this(name: String, kind: SymbolKind, containerName: String, locationOrUri: Location, data: LSPAny) = this()
    def this(name: String, kind: SymbolKind, containerName: String, locationOrUri: Uri, data: LSPAny) = this()
  }
  
  @js.native
  trait WorkspaceSymbol extends SymbolInformation {
    
    var data: js.UndefOr[LSPAny] = js.native
    
    val hasRange: Boolean = js.native
  }
}
