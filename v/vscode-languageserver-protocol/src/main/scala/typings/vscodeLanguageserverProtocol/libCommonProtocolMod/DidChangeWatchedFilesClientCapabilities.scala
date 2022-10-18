package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

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
  
  /**
    * Whether the client has support for {@link  RelativePattern relative pattern}
    * or not.
    *
    * @since 3.17.0
    */
  var relativePatternSupport: js.UndefOr[Boolean] = js.undefined
}
object DidChangeWatchedFilesClientCapabilities {
  
  inline def apply(): DidChangeWatchedFilesClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DidChangeWatchedFilesClientCapabilities]
  }
  
  extension [Self <: DidChangeWatchedFilesClientCapabilities](x: Self) {
    
    inline def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    inline def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
    
    inline def setRelativePatternSupport(value: Boolean): Self = StObject.set(x, "relativePatternSupport", value.asInstanceOf[js.Any])
    
    inline def setRelativePatternSupportUndefined: Self = StObject.set(x, "relativePatternSupport", js.undefined)
  }
}
