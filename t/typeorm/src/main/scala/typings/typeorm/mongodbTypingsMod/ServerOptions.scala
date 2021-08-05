package typings.typeorm.mongodbTypingsMod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerOptions extends StObject {
  
  /**
    * Ensure we check server identify during SSL, set to false to disable checking. Only works for Node 0.12.x or higher. You can pass in a boolean or your own checkServerIdentity override function.
    */
  var checkServerIdentity: js.UndefOr[Boolean | js.Function] = js.undefined
  
  /**
    * Number of connections in the connection pool for each server instance, set to 5 as default for legacy reasons.
    */
  var poolSize: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Server will wait # milliseconds between retries.
    */
  var reconnectInterval: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Server attempt to reconnect #times.
    */
  var reconnectTries: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Socket options.
    */
  var socketOptions: js.UndefOr[SocketOptions] = js.undefined
  
  /**
    * Use ssl connection (needs to have a mongod server with ssl support).
    */
  var ssl: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Array of valid certificates either as Buffers or Strings (needs to have a mongod server with ssl support, 2.4 or higher).
    */
  var sslCA: js.UndefOr[js.Array[Buffer | String]] = js.undefined
  
  /**
    * String or buffer containing the certificate we wish to present (needs to have a mongod server with ssl support, 2.4 or higher).
    */
  var sslCert: js.UndefOr[Buffer | String] = js.undefined
  
  /**
    * String or buffer containing the certificate private key we wish to present (needs to have a mongod server with ssl support, 2.4 or higher).
    */
  var sslKey: js.UndefOr[Buffer | String] = js.undefined
  
  /**
    * String or buffer containing the certificate password (needs to have a mongod server with ssl support, 2.4 or higher).
    */
  var sslPass: js.UndefOr[Buffer | String] = js.undefined
  
  /**
    * Validate mongod server certificate against ca (needs to have a mongod server with ssl support, 2.4 or higher).
    */
  var sslValidate: js.UndefOr[js.Object] = js.undefined
}
object ServerOptions {
  
  inline def apply(): ServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions]
  }
  
  extension [Self <: ServerOptions](x: Self) {
    
    inline def setCheckServerIdentity(value: Boolean | js.Function): Self = StObject.set(x, "checkServerIdentity", value.asInstanceOf[js.Any])
    
    inline def setCheckServerIdentityUndefined: Self = StObject.set(x, "checkServerIdentity", js.undefined)
    
    inline def setPoolSize(value: scala.Double): Self = StObject.set(x, "poolSize", value.asInstanceOf[js.Any])
    
    inline def setPoolSizeUndefined: Self = StObject.set(x, "poolSize", js.undefined)
    
    inline def setReconnectInterval(value: scala.Double): Self = StObject.set(x, "reconnectInterval", value.asInstanceOf[js.Any])
    
    inline def setReconnectIntervalUndefined: Self = StObject.set(x, "reconnectInterval", js.undefined)
    
    inline def setReconnectTries(value: scala.Double): Self = StObject.set(x, "reconnectTries", value.asInstanceOf[js.Any])
    
    inline def setReconnectTriesUndefined: Self = StObject.set(x, "reconnectTries", js.undefined)
    
    inline def setSocketOptions(value: SocketOptions): Self = StObject.set(x, "socketOptions", value.asInstanceOf[js.Any])
    
    inline def setSocketOptionsUndefined: Self = StObject.set(x, "socketOptions", js.undefined)
    
    inline def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    inline def setSslCA(value: js.Array[Buffer | String]): Self = StObject.set(x, "sslCA", value.asInstanceOf[js.Any])
    
    inline def setSslCAUndefined: Self = StObject.set(x, "sslCA", js.undefined)
    
    inline def setSslCAVarargs(value: (Buffer | String)*): Self = StObject.set(x, "sslCA", js.Array(value :_*))
    
    inline def setSslCert(value: Buffer | String): Self = StObject.set(x, "sslCert", value.asInstanceOf[js.Any])
    
    inline def setSslCertUndefined: Self = StObject.set(x, "sslCert", js.undefined)
    
    inline def setSslKey(value: Buffer | String): Self = StObject.set(x, "sslKey", value.asInstanceOf[js.Any])
    
    inline def setSslKeyUndefined: Self = StObject.set(x, "sslKey", js.undefined)
    
    inline def setSslPass(value: Buffer | String): Self = StObject.set(x, "sslPass", value.asInstanceOf[js.Any])
    
    inline def setSslPassUndefined: Self = StObject.set(x, "sslPass", js.undefined)
    
    inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    
    inline def setSslValidate(value: js.Object): Self = StObject.set(x, "sslValidate", value.asInstanceOf[js.Any])
    
    inline def setSslValidateUndefined: Self = StObject.set(x, "sslValidate", js.undefined)
  }
}
