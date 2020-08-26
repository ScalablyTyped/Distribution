package typings.webgme.anon

import typings.webgme.webgmeStrings.memory
import typings.webgme.webgmeStrings.redis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Manager extends js.Object {
  /**
    * If true will start a webhook-manager from the server.
    *  config.webhooks.enable = true;
    */
  var enable: Boolean = js.native
  /**
    * Type of webhook-manager for detecting events, can be 'memory', 'redis'. 
    * Memory runs in the server process, 
    * whereas redis is running in a sub-process. 
    * Redis requires the socket.io adapter to be of type redis. 
    * (It is also possible to run the redis manager separately from the webgme server.)
    *   config.webhooks.manager = 'memory';
    */
  var manager: memory | redis = js.native
}

object Manager {
  @scala.inline
  def apply(enable: Boolean, manager: memory | redis): Manager = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manager]
  }
  @scala.inline
  implicit class ManagerOps[Self <: Manager] (val x: Self) extends AnyVal {
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
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def setManager(value: memory | redis): Self = this.set("manager", value.asInstanceOf[js.Any])
  }
  
}

