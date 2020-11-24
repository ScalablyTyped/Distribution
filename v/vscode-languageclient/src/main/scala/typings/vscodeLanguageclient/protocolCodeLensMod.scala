package typings.vscodeLanguageclient

import typings.vscode.mod.CodeLens
import typings.vscode.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/protocolCodeLens", JSImport.Namespace)
@js.native
object protocolCodeLensMod extends js.Object {
  
  @js.native
  trait ProtocolCodeLens extends CodeLens {
    
    var data: js.Any = js.native
  }
  
  @js.native
  class default protected () extends ProtocolCodeLens {
    def this(range: Range) = this()
  }
}
