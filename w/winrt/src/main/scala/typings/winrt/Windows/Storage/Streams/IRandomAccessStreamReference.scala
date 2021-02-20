package typings.winrt.Windows.Storage.Streams

import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRandomAccessStreamReference extends StObject {
  
  def openReadAsync(): IAsyncOperation[IRandomAccessStreamWithContentType] = js.native
}
object IRandomAccessStreamReference {
  
  @scala.inline
  def apply(openReadAsync: () => IAsyncOperation[IRandomAccessStreamWithContentType]): IRandomAccessStreamReference = {
    val __obj = js.Dynamic.literal(openReadAsync = js.Any.fromFunction0(openReadAsync))
    __obj.asInstanceOf[IRandomAccessStreamReference]
  }
  
  @scala.inline
  implicit class IRandomAccessStreamReferenceMutableBuilder[Self <: IRandomAccessStreamReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpenReadAsync(value: () => IAsyncOperation[IRandomAccessStreamWithContentType]): Self = StObject.set(x, "openReadAsync", js.Any.fromFunction0(value))
  }
}
