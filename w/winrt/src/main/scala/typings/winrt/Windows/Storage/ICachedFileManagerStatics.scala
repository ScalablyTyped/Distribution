package typings.winrt.Windows.Storage

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.Provider.FileUpdateStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICachedFileManagerStatics extends StObject {
  
  def completeUpdatesAsync(file: IStorageFile): IAsyncOperation[FileUpdateStatus]
  
  def deferUpdates(file: IStorageFile): Unit
}
object ICachedFileManagerStatics {
  
  inline def apply(
    completeUpdatesAsync: IStorageFile => IAsyncOperation[FileUpdateStatus],
    deferUpdates: IStorageFile => Unit
  ): ICachedFileManagerStatics = {
    val __obj = js.Dynamic.literal(completeUpdatesAsync = js.Any.fromFunction1(completeUpdatesAsync), deferUpdates = js.Any.fromFunction1(deferUpdates))
    __obj.asInstanceOf[ICachedFileManagerStatics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICachedFileManagerStatics] (val x: Self) extends AnyVal {
    
    inline def setCompleteUpdatesAsync(value: IStorageFile => IAsyncOperation[FileUpdateStatus]): Self = StObject.set(x, "completeUpdatesAsync", js.Any.fromFunction1(value))
    
    inline def setDeferUpdates(value: IStorageFile => Unit): Self = StObject.set(x, "deferUpdates", js.Any.fromFunction1(value))
  }
}
