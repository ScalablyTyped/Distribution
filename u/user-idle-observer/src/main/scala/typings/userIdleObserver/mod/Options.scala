package typings.userIdleObserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * observer options
  */
@js.native
trait Options extends js.Object {
  
  /**
    * callback that will triger after opts.idleTime of user's IDLE
    * @default console.log
    */
  var cb: js.UndefOr[Callback] = js.native
  
  /**
    * fire callback on user inactivity time in ms
    * @default 3_000
    */
  var idleTime: js.UndefOr[Double] = js.native
  
  /**
    * @default ["mousemove", "mousedown", "keydown", "scroll", "touchstart", "resize", "visibilitychange"]
    */
  var listeners: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 97 */ js.Any
    ]
  ] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setCb(value: /* time */ Double => Unit): Self = this.set("cb", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCb: Self = this.set("cb", js.undefined)
    
    @scala.inline
    def setIdleTime(value: Double): Self = this.set("idleTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdleTime: Self = this.set("idleTime", js.undefined)
    
    @scala.inline
    def setListenersVarargs(value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 97 */ js.Any)*): Self = this.set("listeners", js.Array(value :_*))
    
    @scala.inline
    def setListeners(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 97 */ js.Any
        ]
    ): Self = this.set("listeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListeners: Self = this.set("listeners", js.undefined)
  }
}
