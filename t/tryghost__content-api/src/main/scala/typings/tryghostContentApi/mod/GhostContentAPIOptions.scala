package typings.tryghostContentApi.mod

import typings.tryghostContentApi.tryghostContentApiStrings.canary
import typings.tryghostContentApi.tryghostContentApiStrings.v2
import typings.tryghostContentApi.tryghostContentApiStrings.v3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GhostContentAPIOptions extends StObject {
  
  /** @default "ghost" */
  var ghostPath: js.UndefOr[String] = js.native
  
  /** @deprecated since version v2 */
  var host: js.UndefOr[String] = js.native
  
  var key: String = js.native
  
  var url: String = js.native
  
  /**
    * Version of GhostContentAPI
    *
    * Supported Versions: 'v2', 'v3', 'canary'
    */
  var version: v2 | v3 | canary = js.native
}
object GhostContentAPIOptions {
  
  @scala.inline
  def apply(key: String, url: String, version: v2 | v3 | canary): GhostContentAPIOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GhostContentAPIOptions]
  }
  
  @scala.inline
  implicit class GhostContentAPIOptionsMutableBuilder[Self <: GhostContentAPIOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGhostPath(value: String): Self = StObject.set(x, "ghostPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGhostPathUndefined: Self = StObject.set(x, "ghostPath", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: v2 | v3 | canary): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
