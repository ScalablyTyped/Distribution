package typings.winrt.Windows.ApplicationModel.DataTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDataTransferManagerStatics extends StObject {
  
  def getForCurrentView(): DataTransferManager
  
  def showShareUI(): Unit
}
object IDataTransferManagerStatics {
  
  inline def apply(getForCurrentView: () => DataTransferManager, showShareUI: () => Unit): IDataTransferManagerStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = js.Any.fromFunction0(getForCurrentView), showShareUI = js.Any.fromFunction0(showShareUI))
    __obj.asInstanceOf[IDataTransferManagerStatics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDataTransferManagerStatics] (val x: Self) extends AnyVal {
    
    inline def setGetForCurrentView(value: () => DataTransferManager): Self = StObject.set(x, "getForCurrentView", js.Any.fromFunction0(value))
    
    inline def setShowShareUI(value: () => Unit): Self = StObject.set(x, "showShareUI", js.Any.fromFunction0(value))
  }
}
