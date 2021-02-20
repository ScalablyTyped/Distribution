package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeLensOptions extends WorkDoneProgressOptions {
  
  /**
    * Code lens has a resolve provider as well.
    */
  var resolveProvider: js.UndefOr[Boolean] = js.native
}
object CodeLensOptions {
  
  @scala.inline
  def apply(): CodeLensOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeLensOptions]
  }
  
  @scala.inline
  implicit class CodeLensOptionsMutableBuilder[Self <: CodeLensOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolveProvider(value: Boolean): Self = StObject.set(x, "resolveProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveProviderUndefined: Self = StObject.set(x, "resolveProvider", js.undefined)
  }
}
