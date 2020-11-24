package typings.winrtUwp.Windows.Storage.Streams

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables a Windows Runtime component to provide sequential read access to an encapsulated stream. */
@js.native
trait IInputStreamReference extends js.Object {
  
  /**
    * Opens a stream for sequential read access.
    * @return The asynchronous operation.
    */
  def openSequentialReadAsync(): IPromiseWithIAsyncOperation[IInputStream] = js.native
}
object IInputStreamReference {
  
  @scala.inline
  def apply(openSequentialReadAsync: () => IPromiseWithIAsyncOperation[IInputStream]): IInputStreamReference = {
    val __obj = js.Dynamic.literal(openSequentialReadAsync = js.Any.fromFunction0(openSequentialReadAsync))
    __obj.asInstanceOf[IInputStreamReference]
  }
  
  @scala.inline
  implicit class IInputStreamReferenceOps[Self <: IInputStreamReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOpenSequentialReadAsync(value: () => IPromiseWithIAsyncOperation[IInputStream]): Self = this.set("openSequentialReadAsync", js.Any.fromFunction0(value))
  }
}
