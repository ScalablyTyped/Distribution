package typings.webextensionPolyfill.manifestMod.Manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestBaseDeveloperType extends StObject {
  
  /**
    * Optional.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optional.
    */
  var url: js.UndefOr[String] = js.undefined
}
object ManifestBaseDeveloperType {
  
  inline def apply(): ManifestBaseDeveloperType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManifestBaseDeveloperType]
  }
  
  extension [Self <: ManifestBaseDeveloperType](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
