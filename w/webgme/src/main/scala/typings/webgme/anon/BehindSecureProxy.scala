package typings.webgme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BehindSecureProxy extends StObject {
  
  /**
    * Indicate if the webgme server is behind a secure proxy 
    * (needed for adding correct OG Metadata in index.html).
    *   config.server.behindSecureProxy = false
    */
  var behindSecureProxy: Boolean
  
  /**
    * Array of regular expressions that will hinder access to files via the '/extlib/' route. 
    * Requests to files matching any of the provided pattern will result in 403.
    *   config.server.extlibExcludes = ['.\.pem$', 'config\/config\..*\.js$']
    */
  var extlibExcludes: js.Array[String]
  
  /**
    * Optional handle object passed to server.listen 
    * (aligning port must still be given).
    *   config.server.handle = null;
    */
  var handle: Null | Fd
  
  /**
    * Transports and options for the server (winston) logger. 
    *   config.server.log = see config
    */
  var log: js.Any
  
  /**
    * Maximum number of child process spawned for workers.
    *   config.server.maxWorkers = 10;
    */
  var maxWorkers: Double
  
  /**
    * Port the server is hosted from.
    *   config.server.port = 8888;
    */
  var port: Double
  
  /**
    * If greater than -1 will set the timeout property of the http-server. 
    * (This can be used to enable large, > 1Gb, file uploads.)
    *  config.server.timeout = -1;
    */
  var timeout: Double
}
object BehindSecureProxy {
  
  @scala.inline
  def apply(
    behindSecureProxy: Boolean,
    extlibExcludes: js.Array[String],
    log: js.Any,
    maxWorkers: Double,
    port: Double,
    timeout: Double
  ): BehindSecureProxy = {
    val __obj = js.Dynamic.literal(behindSecureProxy = behindSecureProxy.asInstanceOf[js.Any], extlibExcludes = extlibExcludes.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], maxWorkers = maxWorkers.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], handle = null)
    __obj.asInstanceOf[BehindSecureProxy]
  }
  
  @scala.inline
  implicit class BehindSecureProxyMutableBuilder[Self <: BehindSecureProxy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBehindSecureProxy(value: Boolean): Self = StObject.set(x, "behindSecureProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtlibExcludes(value: js.Array[String]): Self = StObject.set(x, "extlibExcludes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtlibExcludesVarargs(value: String*): Self = StObject.set(x, "extlibExcludes", js.Array(value :_*))
    
    @scala.inline
    def setHandle(value: Fd): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleNull: Self = StObject.set(x, "handle", null)
    
    @scala.inline
    def setLog(value: js.Any): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWorkers(value: Double): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
