package typings.twilioSync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uriMod {
  
  @JSImport("twilio-sync/lib/utils/uri", "UriBuilder")
  @js.native
  class UriBuilder protected () extends StObject {
    def this(base: String) = this()
    
    var args: js.Array[String] = js.native
    
    var base: String = js.native
    
    def build(): String = js.native
    
    def pathSegment(name: String): UriBuilder = js.native
    
    var paths: js.Array[String] = js.native
    
    def queryParam(name: String, value: js.Any): UriBuilder = js.native
  }
}
