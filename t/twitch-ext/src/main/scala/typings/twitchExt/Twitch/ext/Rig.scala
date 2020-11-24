package typings.twitchExt.Twitch.ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The developer rig object as available under window.Twitch.ext.rig.
  *
  * @see rig
  */
@js.native
trait Rig extends js.Object {
  
  /**
    * Print a message to the developer rig console.
    *
    * @param message The message to print.
    * @see https://github.com/twitchdev/developer-rig#rig-console
    */
  def log(message: String): Unit = js.native
}
object Rig {
  
  @scala.inline
  def apply(log: String => Unit): Rig = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
    __obj.asInstanceOf[Rig]
  }
  
  @scala.inline
  implicit class RigOps[Self <: Rig] (val x: Self) extends AnyVal {
    
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
    def setLog(value: String => Unit): Self = this.set("log", js.Any.fromFunction1(value))
  }
}
