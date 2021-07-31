package typings.winrt.Windows.Storage.Streams

import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RandomAccessStreamReference
  extends StObject
     with IRandomAccessStreamReference
object RandomAccessStreamReference {
  
  @scala.inline
  def apply(openReadAsync: () => IAsyncOperation[IRandomAccessStreamWithContentType]): RandomAccessStreamReference = {
    val __obj = js.Dynamic.literal(openReadAsync = js.Any.fromFunction0(openReadAsync))
    __obj.asInstanceOf[RandomAccessStreamReference]
  }
}
