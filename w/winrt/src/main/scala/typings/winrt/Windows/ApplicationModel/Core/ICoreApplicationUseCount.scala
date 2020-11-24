package typings.winrt.Windows.ApplicationModel.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICoreApplicationUseCount extends js.Object {
  
  def decrementApplicationUseCount(): Unit = js.native
  
  def incrementApplicationUseCount(): Unit = js.native
}
object ICoreApplicationUseCount {
  
  @scala.inline
  def apply(decrementApplicationUseCount: () => Unit, incrementApplicationUseCount: () => Unit): ICoreApplicationUseCount = {
    val __obj = js.Dynamic.literal(decrementApplicationUseCount = js.Any.fromFunction0(decrementApplicationUseCount), incrementApplicationUseCount = js.Any.fromFunction0(incrementApplicationUseCount))
    __obj.asInstanceOf[ICoreApplicationUseCount]
  }
  
  @scala.inline
  implicit class ICoreApplicationUseCountOps[Self <: ICoreApplicationUseCount] (val x: Self) extends AnyVal {
    
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
    def setDecrementApplicationUseCount(value: () => Unit): Self = this.set("decrementApplicationUseCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIncrementApplicationUseCount(value: () => Unit): Self = this.set("incrementApplicationUseCount", js.Any.fromFunction0(value))
  }
}
