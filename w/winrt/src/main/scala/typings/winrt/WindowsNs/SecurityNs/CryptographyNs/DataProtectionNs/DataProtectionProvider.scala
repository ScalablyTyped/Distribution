package typings.winrt.WindowsNs.SecurityNs.CryptographyNs.DataProtectionNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncAction
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IBuffer
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IInputStream
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Cryptography.DataProtection.DataProtectionProvider")
@js.native
class DataProtectionProvider () extends IDataProtectionProvider {
  def this(protectionDescriptor: String) = this()
  /* CompleteClass */
  override def protectAsync(data: IBuffer): IAsyncOperation[IBuffer] = js.native
  /* CompleteClass */
  override def protectStreamAsync(src: IInputStream, dest: IOutputStream): IAsyncAction = js.native
  /* CompleteClass */
  override def unprotectAsync(data: IBuffer): IAsyncOperation[IBuffer] = js.native
  /* CompleteClass */
  override def unprotectStreamAsync(src: IInputStream, dest: IOutputStream): IAsyncAction = js.native
}

