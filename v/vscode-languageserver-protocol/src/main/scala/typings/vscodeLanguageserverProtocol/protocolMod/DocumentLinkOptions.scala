package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentLinkOptions extends WorkDoneProgressOptions {
  
  /**
    * Document links have a resolve provider as well.
    */
  var resolveProvider: js.UndefOr[Boolean] = js.native
}
object DocumentLinkOptions {
  
  @scala.inline
  def apply(): DocumentLinkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentLinkOptions]
  }
  
  @scala.inline
  implicit class DocumentLinkOptionsMutableBuilder[Self <: DocumentLinkOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolveProvider(value: Boolean): Self = StObject.set(x, "resolveProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveProviderUndefined: Self = StObject.set(x, "resolveProvider", js.undefined)
  }
}
