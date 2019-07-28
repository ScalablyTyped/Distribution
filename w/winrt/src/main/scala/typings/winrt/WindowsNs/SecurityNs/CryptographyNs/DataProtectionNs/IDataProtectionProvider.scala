package typings.winrt.WindowsNs.SecurityNs.CryptographyNs.DataProtectionNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncAction
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IBuffer
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IInputStream
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataProtectionProvider extends js.Object {
  def protectAsync(data: IBuffer): IAsyncOperation[IBuffer]
  def protectStreamAsync(src: IInputStream, dest: IOutputStream): IAsyncAction
  def unprotectAsync(data: IBuffer): IAsyncOperation[IBuffer]
  def unprotectStreamAsync(src: IInputStream, dest: IOutputStream): IAsyncAction
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
}

