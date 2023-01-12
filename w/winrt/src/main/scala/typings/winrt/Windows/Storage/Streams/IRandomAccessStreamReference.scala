package typings.winrt.Windows.Storage.Streams

import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRandomAccessStreamReference extends StObject {
  
  def openReadAsync(): IAsyncOperation[IRandomAccessStreamWithContentType]
}
object IRandomAccessStreamReference {
  
  inline def apply(openReadAsync: () => IAsyncOperation[IRandomAccessStreamWithContentType]): IRandomAccessStreamReference = {
    val __obj = js.Dynamic.literal(openReadAsync = js.Any.fromFunction0(openReadAsync))
    __obj.asInstanceOf[IRandomAccessStreamReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRandomAccessStreamReference] (val x: Self) extends AnyVal {
    
    inline def setOpenReadAsync(value: () => IAsyncOperation[IRandomAccessStreamWithContentType]): Self = StObject.set(x, "openReadAsync", js.Any.fromFunction0(value))
  }
}
