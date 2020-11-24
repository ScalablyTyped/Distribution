package typings.winrtUwp.Windows.Storage.Pickers.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used by an app that provides a save location to indicate asynchronously that the app is finished responding to a targetfilerequested event. */
@js.native
trait TargetFileRequestDeferral extends js.Object {
  
  /** Signals that the app providing the save location finished responding to a targetfilerequested event. */
  def complete(): Unit = js.native
}
object TargetFileRequestDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): TargetFileRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[TargetFileRequestDeferral]
  }
  
  @scala.inline
  implicit class TargetFileRequestDeferralOps[Self <: TargetFileRequestDeferral] (val x: Self) extends AnyVal {
    
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
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
  }
}
