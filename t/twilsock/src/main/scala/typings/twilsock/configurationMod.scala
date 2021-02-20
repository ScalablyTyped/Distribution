package typings.twilsock

import typings.loglevel.mod.LogLevelDesc
import typings.std.Set
import typings.twilsock.initregistrationMod.InitRegistration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configurationMod {
  
  /**
    * Settings container for the Twilsock client library
    */
  @JSImport("twilsock/lib/configuration", "Configuration")
  @js.native
  class Configuration protected () extends StObject {
    /**
      * @param {String} token - authentication token
      * @param {Object} options - options to override defaults
      */
    def this(token: String, activeGrant: String) = this()
    def this(token: String, activeGrant: String, options: js.Any) = this()
    
    var _continuationToken: js.Any = js.native
    
    var _token: js.Any = js.native
    
    val activeGrant: String = js.native
    
    val clientMetadata: js.Any = js.native
    
    var confirmedCapabilities: Set[String] = js.native
    
    def continuationToken: String = js.native
    
    val initRegistrations: js.Array[InitRegistration] = js.native
    
    val logLevel: LogLevelDesc = js.native
    
    val retryPolicy: js.Any = js.native
    
    def token: String = js.native
    
    val tweaks: js.Any = js.native
    
    def updateContinuationToken(continuationToken: String): Unit = js.native
    
    def updateToken(token: String): Unit = js.native
    
    val url: String = js.native
  }
}
