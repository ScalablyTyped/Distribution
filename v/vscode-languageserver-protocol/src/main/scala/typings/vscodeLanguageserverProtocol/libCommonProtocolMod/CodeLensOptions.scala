package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeLensOptions
  extends StObject
     with WorkDoneProgressOptions {
  
  /**
    * Code lens has a resolve provider as well.
    */
  var resolveProvider: js.UndefOr[Boolean] = js.undefined
}
object CodeLensOptions {
  
  inline def apply(): CodeLensOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeLensOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeLensOptions] (val x: Self) extends AnyVal {
    
    inline def setResolveProvider(value: Boolean): Self = StObject.set(x, "resolveProvider", value.asInstanceOf[js.Any])
    
    inline def setResolveProviderUndefined: Self = StObject.set(x, "resolveProvider", js.undefined)
  }
}
