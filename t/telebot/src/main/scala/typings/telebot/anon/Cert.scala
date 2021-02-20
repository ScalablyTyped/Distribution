package typings.telebot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cert extends StObject {
  
  // Optional. Private key for server.
  var cert: js.UndefOr[String] = js.native
  
  // HTTPS url to send updates to.
  var host: js.UndefOr[String] = js.native
  
  // Optional. Use webhook instead of polling.
  var key: js.UndefOr[String] = js.native
  
  // Server port.
  var maxConnections: js.UndefOr[Double] = js.native
  
  // Webhook server host.
  var port: js.UndefOr[Double] = js.native
  
  // Optional. key.
  var url: js.UndefOr[String] = js.native
}
object Cert {
  
  @scala.inline
  def apply(): Cert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cert]
  }
  
  @scala.inline
  implicit class CertMutableBuilder[Self <: Cert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setMaxConnections(value: Double): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConnectionsUndefined: Self = StObject.set(x, "maxConnections", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
