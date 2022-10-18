package typings.vscodeLanguageclient

import typings.vscode.mod.CodeAction
import typings.vscodeLanguageserverTypes.mod.LSPAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonProtocolCodeActionMod {
  
  @JSImport("vscode-languageclient/lib/common/protocolCodeAction", JSImport.Default)
  @js.native
  open class default protected () extends ProtocolCodeAction {
    def this(title: String) = this()
    def this(title: String, data: LSPAny) = this()
  }
  
  @js.native
  trait ProtocolCodeAction extends CodeAction {
    
    val data: js.UndefOr[LSPAny] = js.native
  }
}
