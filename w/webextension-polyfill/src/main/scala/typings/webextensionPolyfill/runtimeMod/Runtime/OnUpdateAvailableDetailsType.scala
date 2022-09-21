package typings.webextensionPolyfill.runtimeMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The manifest details of the available update.
  */
trait OnUpdateAvailableDetailsType extends StObject {
  
  /**
    * The version number of the available update.
    */
  var version: String
}
object OnUpdateAvailableDetailsType {
  
  inline def apply(version: String): OnUpdateAvailableDetailsType = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnUpdateAvailableDetailsType]
  }
  
  extension [Self <: OnUpdateAvailableDetailsType](x: Self) {
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
