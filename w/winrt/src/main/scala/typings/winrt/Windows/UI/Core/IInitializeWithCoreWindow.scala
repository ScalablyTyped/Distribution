package typings.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInitializeWithCoreWindow extends js.Object {
  
  def initialize(window: CoreWindow): Unit = js.native
}
object IInitializeWithCoreWindow {
  
  @scala.inline
  def apply(initialize: CoreWindow => Unit): IInitializeWithCoreWindow = {
    val __obj = js.Dynamic.literal(initialize = js.Any.fromFunction1(initialize))
    __obj.asInstanceOf[IInitializeWithCoreWindow]
  }
  
  @scala.inline
  implicit class IInitializeWithCoreWindowOps[Self <: IInitializeWithCoreWindow] (val x: Self) extends AnyVal {
    
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
    def setInitialize(value: CoreWindow => Unit): Self = this.set("initialize", js.Any.fromFunction1(value))
  }
}
