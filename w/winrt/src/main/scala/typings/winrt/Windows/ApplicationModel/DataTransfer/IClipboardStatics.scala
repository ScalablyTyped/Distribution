package typings.winrt.Windows.ApplicationModel.DataTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClipboardStatics extends StObject {
  
  def clear(): Unit
  
  def flush(): Unit
  
  def getContent(): DataPackageView
  
  var oncontentchanged: Any
  
  def setContent(content: DataPackage): Unit
}
object IClipboardStatics {
  
  inline def apply(
    clear: () => Unit,
    flush: () => Unit,
    getContent: () => DataPackageView,
    oncontentchanged: Any,
    setContent: DataPackage => Unit
  ): IClipboardStatics = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), flush = js.Any.fromFunction0(flush), getContent = js.Any.fromFunction0(getContent), oncontentchanged = oncontentchanged.asInstanceOf[js.Any], setContent = js.Any.fromFunction1(setContent))
    __obj.asInstanceOf[IClipboardStatics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IClipboardStatics] (val x: Self) extends AnyVal {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
    
    inline def setGetContent(value: () => DataPackageView): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
    
    inline def setOncontentchanged(value: Any): Self = StObject.set(x, "oncontentchanged", value.asInstanceOf[js.Any])
    
    inline def setSetContent(value: DataPackage => Unit): Self = StObject.set(x, "setContent", js.Any.fromFunction1(value))
  }
}
