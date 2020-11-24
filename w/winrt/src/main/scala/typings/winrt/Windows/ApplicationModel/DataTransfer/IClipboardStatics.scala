package typings.winrt.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClipboardStatics extends js.Object {
  
  def clear(): Unit = js.native
  
  def flush(): Unit = js.native
  
  def getContent(): DataPackageView = js.native
  
  var oncontentchanged: js.Any = js.native
  
  def setContent(content: DataPackage): Unit = js.native
}
object IClipboardStatics {
  
  @scala.inline
  def apply(
    clear: () => Unit,
    flush: () => Unit,
    getContent: () => DataPackageView,
    oncontentchanged: js.Any,
    setContent: DataPackage => Unit
  ): IClipboardStatics = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), flush = js.Any.fromFunction0(flush), getContent = js.Any.fromFunction0(getContent), oncontentchanged = oncontentchanged.asInstanceOf[js.Any], setContent = js.Any.fromFunction1(setContent))
    __obj.asInstanceOf[IClipboardStatics]
  }
  
  @scala.inline
  implicit class IClipboardStaticsOps[Self <: IClipboardStatics] (val x: Self) extends AnyVal {
    
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
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFlush(value: () => Unit): Self = this.set("flush", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContent(value: () => DataPackageView): Self = this.set("getContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOncontentchanged(value: js.Any): Self = this.set("oncontentchanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetContent(value: DataPackage => Unit): Self = this.set("setContent", js.Any.fromFunction1(value))
  }
}
