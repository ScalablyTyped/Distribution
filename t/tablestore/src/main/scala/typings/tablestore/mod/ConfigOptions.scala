package typings.tablestore.mod

import typings.tablestore.anon.MaxSockets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  accessKeyId :string,   secretAccessKey :string,   accessKeySecret :string,   stsToken :string,   securityToken :string,   logger :unknown,   endpoint :string,   httpOptions :{  timeout :number,   maxSockets :number},   maxRetries :number,   instancename :string,   computeChecksums :boolean}> */
trait ConfigOptions extends StObject {
  
  var accessKeyId: js.UndefOr[String] = js.undefined
  
  var accessKeySecret: js.UndefOr[String] = js.undefined
  
  var computeChecksums: js.UndefOr[Boolean] = js.undefined
  
  var endpoint: js.UndefOr[String] = js.undefined
  
  var httpOptions: js.UndefOr[MaxSockets] = js.undefined
  
  var instancename: js.UndefOr[String] = js.undefined
  
  var logger: js.UndefOr[Any] = js.undefined
  
  var maxRetries: js.UndefOr[Double] = js.undefined
  
  var secretAccessKey: js.UndefOr[String] = js.undefined
  
  var securityToken: js.UndefOr[String] = js.undefined
  
  var stsToken: js.UndefOr[String] = js.undefined
}
object ConfigOptions {
  
  inline def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions]
  }
  
  extension [Self <: ConfigOptions](x: Self) {
    
    inline def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyIdUndefined: Self = StObject.set(x, "accessKeyId", js.undefined)
    
    inline def setAccessKeySecret(value: String): Self = StObject.set(x, "accessKeySecret", value.asInstanceOf[js.Any])
    
    inline def setAccessKeySecretUndefined: Self = StObject.set(x, "accessKeySecret", js.undefined)
    
    inline def setComputeChecksums(value: Boolean): Self = StObject.set(x, "computeChecksums", value.asInstanceOf[js.Any])
    
    inline def setComputeChecksumsUndefined: Self = StObject.set(x, "computeChecksums", js.undefined)
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setHttpOptions(value: MaxSockets): Self = StObject.set(x, "httpOptions", value.asInstanceOf[js.Any])
    
    inline def setHttpOptionsUndefined: Self = StObject.set(x, "httpOptions", js.undefined)
    
    inline def setInstancename(value: String): Self = StObject.set(x, "instancename", value.asInstanceOf[js.Any])
    
    inline def setInstancenameUndefined: Self = StObject.set(x, "instancename", js.undefined)
    
    inline def setLogger(value: Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    
    inline def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
    
    inline def setSecretAccessKeyUndefined: Self = StObject.set(x, "secretAccessKey", js.undefined)
    
    inline def setSecurityToken(value: String): Self = StObject.set(x, "securityToken", value.asInstanceOf[js.Any])
    
    inline def setSecurityTokenUndefined: Self = StObject.set(x, "securityToken", js.undefined)
    
    inline def setStsToken(value: String): Self = StObject.set(x, "stsToken", value.asInstanceOf[js.Any])
    
    inline def setStsTokenUndefined: Self = StObject.set(x, "stsToken", js.undefined)
  }
}
