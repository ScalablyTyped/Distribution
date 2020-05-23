package typings.winrtUwp.Windows.Security.Cryptography.DataProtection

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a cryptographic provider that can be used to asynchronously encrypt and decrypt static data or a data stream. */
trait DataProtectionProvider extends js.Object {
  /**
    * Asynchronously protects static data.
    * @param data Data to protect.
    * @return Represents an asynchronous operation.
    */
  def protectAsync(data: IBuffer): IPromiseWithIAsyncOperation[IBuffer]
  /**
    * Asynchronously protects a data stream.
    * @param src Stream to be protected.
    * @param dest Protected stream.
    * @return Represents an asynchronous action.
    */
  def protectStreamAsync(src: IInputStream, dest: IOutputStream): IPromiseWithIAsyncAction
  /**
    * Asynchronously decrypts static data.
    * @param data Data to decrypt.
    * @return Represents an asynchronous operation.
    */
  def unprotectAsync(data: IBuffer): IPromiseWithIAsyncOperation[IBuffer]
  /**
    * Asynchronously decrypts a data stream.
    * @param src Stream to decrypt.
    * @param dest Decrypted stream.
    * @return Represents an asynchronous action.
    */
  def unprotectStreamAsync(src: IInputStream, dest: IOutputStream): IPromiseWithIAsyncAction
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
}

