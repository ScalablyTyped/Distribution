package typings.winrt.Windows.ApplicationModel.DataTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClipboardStatics extends StObject {
  
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
  implicit class IClipboardStaticsMutableBuilder[Self <: IClipboardStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContent(value: () => DataPackageView): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOncontentchanged(value: js.Any): Self = StObject.set(x, "oncontentchanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetContent(value: DataPackage => Unit): Self = StObject.set(x, "setContent", js.Any.fromFunction1(value))
  }
}
