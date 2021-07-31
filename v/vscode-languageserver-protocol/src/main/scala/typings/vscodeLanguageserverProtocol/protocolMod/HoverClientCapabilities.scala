package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.MarkupKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoverClientCapabilities extends StObject {
  
  /**
    * Client supports the follow content formats for the content
    * property. The order describes the preferred format of the client.
    */
  var contentFormat: js.UndefOr[js.Array[MarkupKind]] = js.undefined
  
  /**
    * Whether hover supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
}
object HoverClientCapabilities {
  
  @scala.inline
  def apply(): HoverClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoverClientCapabilities]
  }
  
  @scala.inline
  implicit class HoverClientCapabilitiesMutableBuilder[Self <: HoverClientCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentFormat(value: js.Array[MarkupKind]): Self = StObject.set(x, "contentFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentFormatUndefined: Self = StObject.set(x, "contentFormat", js.undefined)
    
    @scala.inline
    def setContentFormatVarargs(value: MarkupKind*): Self = StObject.set(x, "contentFormat", js.Array(value :_*))
    
    @scala.inline
    def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
  }
}
