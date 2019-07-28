package typings.webgme

import typings.webgme.webgmeStrings.memory
import typings.webgme.webgmeStrings.redis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnableManager extends js.Object {
  /**
    * If true will start a webhook-manager from the server.
    *  config.webhooks.enable = true;
    */
  var enable: Boolean
  /**
    * Type of webhook-manager for detecting events, can be 'memory', 'redis'. 
    * Memory runs in the server process, 
    * whereas redis is running in a sub-process. 
    * Redis requires the socket.io adapter to be of type redis. 
    * (It is also possible to run the redis manager separately from the webgme server.)
    *   config.webhooks.manager = 'memory';
    */
  var manager: memory | redis
}

object Anon_EnableManager {
  @scala.inline
  def apply(enable: Boolean, manager: memory | redis): Anon_EnableManager = {
    val __obj = js.Dynamic.literal(enable = enable, manager = manager.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EnableManager]
  }
}

