package typings.tryghostContentApi.mod

import typings.tryghostContentApi.tryghostContentApiStrings.canary
import typings.tryghostContentApi.tryghostContentApiStrings.v2
import typings.tryghostContentApi.tryghostContentApiStrings.v3
import typings.tryghostContentApi.tryghostContentApiStrings.v4
import typings.tryghostContentApi.tryghostContentApiStrings.v5Dot0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GhostContentAPIOptions extends StObject {
  
  /** @default "ghost" */
  var ghostPath: js.UndefOr[String] = js.undefined
  
  /** @deprecated since version v2 */
  var host: js.UndefOr[String] = js.undefined
  
  var key: String
  
  var url: String
  
  /**
    * Version of GhostContentAPI
    *
    * Supported Versions: 'v2', 'v3', 'v4', 'v5.0', 'canary'
    */
  var version: v2 | v3 | v4 | v5Dot0 | canary
}
object GhostContentAPIOptions {
  
  inline def apply(key: String, url: String, version: v2 | v3 | v4 | v5Dot0 | canary): GhostContentAPIOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GhostContentAPIOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GhostContentAPIOptions] (val x: Self) extends AnyVal {
    
    inline def setGhostPath(value: String): Self = StObject.set(x, "ghostPath", value.asInstanceOf[js.Any])
    
    inline def setGhostPathUndefined: Self = StObject.set(x, "ghostPath", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: v2 | v3 | v4 | v5Dot0 | canary): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
