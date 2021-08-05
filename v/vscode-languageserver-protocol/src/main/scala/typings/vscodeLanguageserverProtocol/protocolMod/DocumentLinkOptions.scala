package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentLinkOptions
  extends StObject
     with WorkDoneProgressOptions {
  
  /**
    * Document links have a resolve provider as well.
    */
  var resolveProvider: js.UndefOr[Boolean] = js.undefined
}
object DocumentLinkOptions {
  
  inline def apply(): DocumentLinkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentLinkOptions]
  }
  
  extension [Self <: DocumentLinkOptions](x: Self) {
    
    inline def setResolveProvider(value: Boolean): Self = StObject.set(x, "resolveProvider", value.asInstanceOf[js.Any])
    
    inline def setResolveProviderUndefined: Self = StObject.set(x, "resolveProvider", js.undefined)
  }
}
