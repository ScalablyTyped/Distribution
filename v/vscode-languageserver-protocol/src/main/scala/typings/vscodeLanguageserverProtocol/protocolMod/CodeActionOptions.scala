package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.CodeActionKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeActionOptions
  extends StObject
     with WorkDoneProgressOptions {
  
  /**
    * CodeActionKinds that this server may return.
    *
    * The list of kinds may be generic, such as `CodeActionKind.Refactor`, or the server
    * may list out every specific kind they provide.
    */
  var codeActionKinds: js.UndefOr[js.Array[CodeActionKind]] = js.undefined
}
object CodeActionOptions {
  
  @scala.inline
  def apply(): CodeActionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeActionOptions]
  }
  
  @scala.inline
  implicit class CodeActionOptionsMutableBuilder[Self <: CodeActionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeActionKinds(value: js.Array[CodeActionKind]): Self = StObject.set(x, "codeActionKinds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeActionKindsUndefined: Self = StObject.set(x, "codeActionKinds", js.undefined)
    
    @scala.inline
    def setCodeActionKindsVarargs(value: CodeActionKind*): Self = StObject.set(x, "codeActionKinds", js.Array(value :_*))
  }
}
