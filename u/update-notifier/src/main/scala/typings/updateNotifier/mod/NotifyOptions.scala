package typings.updateNotifier.mod

import typings.boxen.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotifyOptions extends js.Object {
  
  /**
    * Options object that will be passed to `boxen`
    * See https://github.com/sindresorhus/boxen/blob/master/index.d.ts
    */
  var boxenOptions: js.UndefOr[Options] = js.native
  
  /** Defer showing the notification to after the process has exited */
  var defer: js.UndefOr[Boolean] = js.native
  
  /** Include the -g argument in the default message's npm i recommendation */
  var isGlobal: js.UndefOr[Boolean] = js.native
  
  /** Message that will be shown when an update is available */
  var message: js.UndefOr[String] = js.native
}
object NotifyOptions {
  
  @scala.inline
  def apply(): NotifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifyOptions]
  }
  
  @scala.inline
  implicit class NotifyOptionsOps[Self <: NotifyOptions] (val x: Self) extends AnyVal {
    
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
    def setBoxenOptions(value: Options): Self = this.set("boxenOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxenOptions: Self = this.set("boxenOptions", js.undefined)
    
    @scala.inline
    def setDefer(value: Boolean): Self = this.set("defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefer: Self = this.set("defer", js.undefined)
    
    @scala.inline
    def setIsGlobal(value: Boolean): Self = this.set("isGlobal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsGlobal: Self = this.set("isGlobal", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
