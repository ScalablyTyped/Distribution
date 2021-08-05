package typings.winrt.Windows.Storage.Streams

import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInputStreamReference extends StObject {
  
  def openSequentialReadAsync(): IAsyncOperation[IInputStream]
}
object IInputStreamReference {
  
  inline def apply(openSequentialReadAsync: () => IAsyncOperation[IInputStream]): IInputStreamReference = {
    val __obj = js.Dynamic.literal(openSequentialReadAsync = js.Any.fromFunction0(openSequentialReadAsync))
    __obj.asInstanceOf[IInputStreamReference]
  }
  
  extension [Self <: IInputStreamReference](x: Self) {
    
    inline def setOpenSequentialReadAsync(value: () => IAsyncOperation[IInputStream]): Self = StObject.set(x, "openSequentialReadAsync", js.Any.fromFunction0(value))
  }
}
