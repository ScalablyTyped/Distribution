package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BehindSecureProxy extends js.Object {
  /**
    * Indicate if the webgme server is behind a secure proxy 
    * (needed for adding correct OG Metadata in index.html).
    *   config.server.behindSecureProxy = false
    */
  var behindSecureProxy: scala.Boolean
  /**
    * Array of regular expressions that will hinder access to files via the '/extlib/' route. 
    * Requests to files matching any of the provided pattern will result in 403.
    *   config.server.extlibExcludes = ['.\.pem$', 'config\/config\..*\.js$']
    */
  var extlibExcludes: js.Array[java.lang.String]
  /**
    * Optional handle object passed to server.listen 
    * (aligning port must still be given).
    *   config.server.handle = null;
    */
  var handle: scala.Null | Anon_Fd
  /**
    * Transports and options for the server (winston) logger. 
    *   config.server.log = see config
    */
  var log: js.Any
  /**
    * Maximum number of child process spawned for workers.
    *   config.server.maxWorkers = 10;
    */
  var maxWorkers: scala.Double
  /**
    * Port the server is hosted from.
    *   config.server.port = 8888;
    */
  var port: scala.Double
  /**
    * If greater than -1 will set the timeout property of the http-server. 
    * (This can be used to enable large, > 1Gb, file uploads.)
    *  config.server.timeout = -1;
    */
  var timeout: scala.Double
}

