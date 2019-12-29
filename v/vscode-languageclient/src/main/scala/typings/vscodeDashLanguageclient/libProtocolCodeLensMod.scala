package typings.vscodeDashLanguageclient

import typings.vscode.vscodeMod.CodeLens
import typings.vscode.vscodeMod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/protocolCodeLens", JSImport.Namespace)
@js.native
object libProtocolCodeLensMod extends js.Object {
  @js.native
  trait ProtocolCodeLens extends CodeLens {
    var data: js.Any = js.native
  }
  
  @js.native
  class default protected () extends ProtocolCodeLens {
    def this(range: Range) = this()
  }
  
}

