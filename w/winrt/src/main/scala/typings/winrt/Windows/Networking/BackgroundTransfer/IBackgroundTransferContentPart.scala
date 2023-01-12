package typings.winrt.Windows.Networking.BackgroundTransfer

import typings.winrt.Windows.Storage.IStorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBackgroundTransferContentPart extends StObject {
  
  def setFile(value: IStorageFile): Unit
  
  def setHeader(headerName: String, headerValue: String): Unit
  
  def setText(value: String): Unit
}
object IBackgroundTransferContentPart {
  
  inline def apply(setFile: IStorageFile => Unit, setHeader: (String, String) => Unit, setText: String => Unit): IBackgroundTransferContentPart = {
    val __obj = js.Dynamic.literal(setFile = js.Any.fromFunction1(setFile), setHeader = js.Any.fromFunction2(setHeader), setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[IBackgroundTransferContentPart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBackgroundTransferContentPart] (val x: Self) extends AnyVal {
    
    inline def setSetFile(value: IStorageFile => Unit): Self = StObject.set(x, "setFile", js.Any.fromFunction1(value))
    
    inline def setSetHeader(value: (String, String) => Unit): Self = StObject.set(x, "setHeader", js.Any.fromFunction2(value))
    
    inline def setSetText(value: String => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
  }
}
