package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DidChangeWatchedFilesClientCapabilities extends StObject {
  
  /**
    * Did change watched files notification supports dynamic registration. Please note
    * that the current protocol doesn't support static configuration for file changes
    * from the server side.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
}
object DidChangeWatchedFilesClientCapabilities {
  
  @scala.inline
  def apply(): DidChangeWatchedFilesClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DidChangeWatchedFilesClientCapabilities]
  }
  
  @scala.inline
  implicit class DidChangeWatchedFilesClientCapabilitiesMutableBuilder[Self <: DidChangeWatchedFilesClientCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
  }
}
