package typings.winrtUwp.Windows.Security.Cryptography.DataProtection

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a cryptographic provider that can be used to asynchronously encrypt and decrypt static data or a data stream. */
@js.native
trait DataProtectionProvider extends js.Object {
  
  /**
    * Asynchronously protects static data.
    * @param data Data to protect.
    * @return Represents an asynchronous operation.
    */
  def protectAsync(data: IBuffer): IPromiseWithIAsyncOperation[IBuffer] = js.native
  
  /**
    * Asynchronously protects a data stream.
    * @param src Stream to be protected.
    * @param dest Protected stream.
    * @return Represents an asynchronous action.
    */
  def protectStreamAsync(src: IInputStream, dest: IOutputStream): IPromiseWithIAsyncAction = js.native
  
  /**
    * Asynchronously decrypts static data.
    * @param data Data to decrypt.
    * @return Represents an asynchronous operation.
    */
  def unprotectAsync(data: IBuffer): IPromiseWithIAsyncOperation[IBuffer] = js.native
  
  /**
    * Asynchronously decrypts a data stream.
    * @param src Stream to decrypt.
    * @param dest Decrypted stream.
    * @return Represents an asynchronous action.
    */
  def unprotectStreamAsync(src: IInputStream, dest: IOutputStream): IPromiseWithIAsyncAction = js.native
}
object DataProtectionProvider {
  
  @scala.inline
  def apply(
    protectAsync: IBuffer => IPromiseWithIAsyncOperation[IBuffer],
    protectStreamAsync: (IInputStream, IOutputStream) => IPromiseWithIAsyncAction,
    unprotectAsync: IBuffer => IPromiseWithIAsyncOperation[IBuffer],
    unprotectStreamAsync: (IInputStream, IOutputStream) => IPromiseWithIAsyncAction
  ): DataProtectionProvider = {
    val __obj = js.Dynamic.literal(protectAsync = js.Any.fromFunction1(protectAsync), protectStreamAsync = js.Any.fromFunction2(protectStreamAsync), unprotectAsync = js.Any.fromFunction1(unprotectAsync), unprotectStreamAsync = js.Any.fromFunction2(unprotectStreamAsync))
    __obj.asInstanceOf[DataProtectionProvider]
  }
  
  @scala.inline
  implicit class DataProtectionProviderOps[Self <: DataProtectionProvider] (val x: Self) extends AnyVal {
    
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
    def setProtectAsync(value: IBuffer => IPromiseWithIAsyncOperation[IBuffer]): Self = this.set("protectAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProtectStreamAsync(value: (IInputStream, IOutputStream) => IPromiseWithIAsyncAction): Self = this.set("protectStreamAsync", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnprotectAsync(value: IBuffer => IPromiseWithIAsyncOperation[IBuffer]): Self = this.set("unprotectAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnprotectStreamAsync(value: (IInputStream, IOutputStream) => IPromiseWithIAsyncAction): Self = this.set("unprotectStreamAsync", js.Any.fromFunction2(value))
  }
}
