package typings.tocktimer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TockOptions extends js.Object {
  
  /**
    * Callback function executed on each tick
    */
  def callback(): Unit = js.native
  
  /**
    * Callback function executed when the timer is complete
    */
  def complete(): Unit = js.native
  
  /**
    * Defaults to false. If true, the clock will count down from a given time, otherwise it will count up from 0:00.
    */
  var countdown: js.UndefOr[Boolean] = js.native
  
  /**
    * Defaults to 10 milliseconds. How often, in milliseconds, that the clock will tick.
    */
  var interval: js.UndefOr[Double] = js.native
}
object TockOptions {
  
  @scala.inline
  def apply(callback: () => Unit, complete: () => Unit): TockOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[TockOptions]
  }
  
  @scala.inline
  implicit class TockOptionsOps[Self <: TockOptions] (val x: Self) extends AnyVal {
    
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
    def setCallback(value: () => Unit): Self = this.set("callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCountdown(value: Boolean): Self = this.set("countdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountdown: Self = this.set("countdown", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
  }
}
