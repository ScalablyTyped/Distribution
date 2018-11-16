package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.DataProtectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Cryptography.DataProtection.DataProtectionProvider")
@js.native
class DataProtectionProvider () extends IDataProtectionProvider {
  def this(protectionDescriptor: java.lang.String) = this()
  /* CompleteClass */
  override def protectAsync(data: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer] = js.native
  /* CompleteClass */
  override def protectStreamAsync(
    src: winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream,
    dest: winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  /* CompleteClass */
  override def unprotectAsync(data: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer] = js.native
  /* CompleteClass */
  override def unprotectStreamAsync(
    src: winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream,
    dest: winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
}

