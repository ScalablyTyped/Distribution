package typings.winrt.Windows.Storage

import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStorageFolderStatics extends StObject {
  
  def getFolderFromPathAsync(path: String): IAsyncOperation[StorageFolder]
}
object IStorageFolderStatics {
  
  @scala.inline
  def apply(getFolderFromPathAsync: String => IAsyncOperation[StorageFolder]): IStorageFolderStatics = {
    val __obj = js.Dynamic.literal(getFolderFromPathAsync = js.Any.fromFunction1(getFolderFromPathAsync))
    __obj.asInstanceOf[IStorageFolderStatics]
  }
  
  @scala.inline
  implicit class IStorageFolderStaticsMutableBuilder[Self <: IStorageFolderStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetFolderFromPathAsync(value: String => IAsyncOperation[StorageFolder]): Self = StObject.set(x, "getFolderFromPathAsync", js.Any.fromFunction1(value))
  }
}
