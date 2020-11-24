package typings.winrt.Windows.Security.Cryptography.DataProtection

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.Streams.IBuffer
import typings.winrt.Windows.Storage.Streams.IInputStream
import typings.winrt.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataProtectionProvider extends js.Object {
  
  def protectAsync(data: IBuffer): IAsyncOperation[IBuffer] = js.native
  
  def protectStreamAsync(src: IInputStream, dest: IOutputStream): IAsyncAction = js.native
  
  def unprotectAsync(data: IBuffer): IAsyncOperation[IBuffer] = js.native
  
  def unprotectStreamAsync(src: IInputStream, dest: IOutputStream): IAsyncAction = js.native
}
object IDataProtectionProvider {
  
  @scala.inline
  def apply(
    protectAsync: IBuffer => IAsyncOperation[IBuffer],
    protectStreamAsync: (IInputStream, IOutputStream) => IAsyncAction,
    unprotectAsync: IBuffer => IAsyncOperation[IBuffer],
    unprotectStreamAsync: (IInputStream, IOutputStream) => IAsyncAction
  ): IDataProtectionProvider = {
    val __obj = js.Dynamic.literal(protectAsync = js.Any.fromFunction1(protectAsync), protectStreamAsync = js.Any.fromFunction2(protectStreamAsync), unprotectAsync = js.Any.fromFunction1(unprotectAsync), unprotectStreamAsync = js.Any.fromFunction2(unprotectStreamAsync))
    __obj.asInstanceOf[IDataProtectionProvider]
  }
  
  @scala.inline
  implicit class IDataProtectionProviderOps[Self <: IDataProtectionProvider] (val x: Self) extends AnyVal {
    
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
    def setProtectAsync(value: IBuffer => IAsyncOperation[IBuffer]): Self = this.set("protectAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProtectStreamAsync(value: (IInputStream, IOutputStream) => IAsyncAction): Self = this.set("protectStreamAsync", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnprotectAsync(value: IBuffer => IAsyncOperation[IBuffer]): Self = this.set("unprotectAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnprotectStreamAsync(value: (IInputStream, IOutputStream) => IAsyncAction): Self = this.set("unprotectStreamAsync", js.Any.fromFunction2(value))
  }
}
