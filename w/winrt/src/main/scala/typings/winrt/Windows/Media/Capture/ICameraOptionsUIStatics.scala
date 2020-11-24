package typings.winrt.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICameraOptionsUIStatics extends js.Object {
  
  def show(mediaCapture: MediaCapture): Unit = js.native
}
object ICameraOptionsUIStatics {
  
  @scala.inline
  def apply(show: MediaCapture => Unit): ICameraOptionsUIStatics = {
    val __obj = js.Dynamic.literal(show = js.Any.fromFunction1(show))
    __obj.asInstanceOf[ICameraOptionsUIStatics]
  }
  
  @scala.inline
  implicit class ICameraOptionsUIStaticsOps[Self <: ICameraOptionsUIStatics] (val x: Self) extends AnyVal {
    
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
    def setShow(value: MediaCapture => Unit): Self = this.set("show", js.Any.fromFunction1(value))
  }
}
