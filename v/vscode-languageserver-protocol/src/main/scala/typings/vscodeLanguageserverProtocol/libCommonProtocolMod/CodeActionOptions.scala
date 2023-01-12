package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

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
  
  /**
    * The server provides support to resolve additional
    * information for a code action.
    *
    * @since 3.16.0
    */
  var resolveProvider: js.UndefOr[Boolean] = js.undefined
}
object CodeActionOptions {
  
  inline def apply(): CodeActionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeActionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeActionOptions] (val x: Self) extends AnyVal {
    
    inline def setCodeActionKinds(value: js.Array[CodeActionKind]): Self = StObject.set(x, "codeActionKinds", value.asInstanceOf[js.Any])
    
    inline def setCodeActionKindsUndefined: Self = StObject.set(x, "codeActionKinds", js.undefined)
    
    inline def setCodeActionKindsVarargs(value: CodeActionKind*): Self = StObject.set(x, "codeActionKinds", js.Array(value*))
    
    inline def setResolveProvider(value: Boolean): Self = StObject.set(x, "resolveProvider", value.asInstanceOf[js.Any])
    
    inline def setResolveProviderUndefined: Self = StObject.set(x, "resolveProvider", js.undefined)
  }
}
