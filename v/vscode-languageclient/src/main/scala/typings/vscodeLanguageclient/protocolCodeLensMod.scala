package typings.vscodeLanguageclient

import typings.vscode.mod.CodeLens
import typings.vscode.mod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolCodeLensMod {
  
  @JSImport("vscode-languageclient/lib/protocolCodeLens", JSImport.Default)
  @js.native
  class default protected () extends ProtocolCodeLens {
    def this(range: Range) = this()
  }
  
  @js.native
  trait ProtocolCodeLens extends CodeLens {
    
    var data: js.Any = js.native
  }
}
