package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.Foundation.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICoreWindowPopupShowingEventArgs extends js.Object {
  
  def setDesiredSize(value: Size): Unit = js.native
}
object ICoreWindowPopupShowingEventArgs {
  
  @scala.inline
  def apply(setDesiredSize: Size => Unit): ICoreWindowPopupShowingEventArgs = {
    val __obj = js.Dynamic.literal(setDesiredSize = js.Any.fromFunction1(setDesiredSize))
    __obj.asInstanceOf[ICoreWindowPopupShowingEventArgs]
  }
  
  @scala.inline
  implicit class ICoreWindowPopupShowingEventArgsOps[Self <: ICoreWindowPopupShowingEventArgs] (val x: Self) extends AnyVal {
    
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
    def setSetDesiredSize(value: Size => Unit): Self = this.set("setDesiredSize", js.Any.fromFunction1(value))
  }
}
