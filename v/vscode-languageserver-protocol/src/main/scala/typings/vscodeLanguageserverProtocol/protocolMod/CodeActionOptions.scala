package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.CodeActionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeActionOptions extends WorkDoneProgressOptions {
  
  /**
    * CodeActionKinds that this server may return.
    *
    * The list of kinds may be generic, such as `CodeActionKind.Refactor`, or the server
    * may list out every specific kind they provide.
    */
  var codeActionKinds: js.UndefOr[js.Array[CodeActionKind]] = js.native
}
object CodeActionOptions {
  
  @scala.inline
  def apply(): CodeActionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeActionOptions]
  }
  
  @scala.inline
  implicit class CodeActionOptionsOps[Self <: CodeActionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCodeActionKindsVarargs(value: CodeActionKind*): Self = this.set("codeActionKinds", js.Array(value :_*))
    
    @scala.inline
    def setCodeActionKinds(value: js.Array[CodeActionKind]): Self = this.set("codeActionKinds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeActionKinds: Self = this.set("codeActionKinds", js.undefined)
  }
}
