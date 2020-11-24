package typings.wechatMiniprogram.DB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWatchOptions extends js.Object {
  
  // server realtime data init & change event
  def onChange(snapshot: ISnapshot): Unit = js.native
  
  // error while connecting / listening
  def onError(error: js.Any): Unit = js.native
}
object IWatchOptions {
  
  @scala.inline
  def apply(onChange: ISnapshot => Unit, onError: js.Any => Unit): IWatchOptions = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), onError = js.Any.fromFunction1(onError))
    __obj.asInstanceOf[IWatchOptions]
  }
  
  @scala.inline
  implicit class IWatchOptionsOps[Self <: IWatchOptions] (val x: Self) extends AnyVal {
    
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
    def setOnChange(value: ISnapshot => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnError(value: js.Any => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
  }
}
