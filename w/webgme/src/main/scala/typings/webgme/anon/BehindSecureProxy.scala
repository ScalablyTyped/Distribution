package typings.webgme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BehindSecureProxy extends js.Object {
  
  /**
    * Indicate if the webgme server is behind a secure proxy 
    * (needed for adding correct OG Metadata in index.html).
    *   config.server.behindSecureProxy = false
    */
  var behindSecureProxy: Boolean = js.native
  
  /**
    * Array of regular expressions that will hinder access to files via the '/extlib/' route. 
    * Requests to files matching any of the provided pattern will result in 403.
    *   config.server.extlibExcludes = ['.\.pem$', 'config\/config\..*\.js$']
    */
  var extlibExcludes: js.Array[String] = js.native
  
  /**
    * Optional handle object passed to server.listen 
    * (aligning port must still be given).
    *   config.server.handle = null;
    */
  var handle: Null | Fd = js.native
  
  /**
    * Transports and options for the server (winston) logger. 
    *   config.server.log = see config
    */
  var log: js.Any = js.native
  
  /**
    * Maximum number of child process spawned for workers.
    *   config.server.maxWorkers = 10;
    */
  var maxWorkers: Double = js.native
  
  /**
    * Port the server is hosted from.
    *   config.server.port = 8888;
    */
  var port: Double = js.native
  
  /**
    * If greater than -1 will set the timeout property of the http-server. 
    * (This can be used to enable large, > 1Gb, file uploads.)
    *  config.server.timeout = -1;
    */
  var timeout: Double = js.native
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
    val __obj = js.Dynamic.literal(behindSecureProxy = behindSecureProxy.asInstanceOf[js.Any], extlibExcludes = extlibExcludes.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], maxWorkers = maxWorkers.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[BehindSecureProxy]
  }
  
  @scala.inline
  implicit class BehindSecureProxyOps[Self <: BehindSecureProxy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBehindSecureProxy(value: Boolean): Self = this.set("behindSecureProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtlibExcludesVarargs(value: String*): Self = this.set("extlibExcludes", js.Array(value :_*))
    
    @scala.inline
    def setExtlibExcludes(value: js.Array[String]): Self = this.set("extlibExcludes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog(value: js.Any): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWorkers(value: Double): Self = this.set("maxWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandle(value: Fd): Self = this.set("handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleNull: Self = this.set("handle", null)
  }
}
