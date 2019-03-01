package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.DataProtectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataProtectionProvider extends js.Object {
  def protectAsync(data: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer]
  def protectStreamAsync(
    src: winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream,
    dest: winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction
  def unprotectAsync(data: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer]
  def unprotectStreamAsync(
    src: winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream,
    dest: winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction
}

object IDataProtectionProvider {
  @scala.inline
  def apply(
    protectAsync: js.Function1[
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer]
    ],
    protectStreamAsync: js.Function2[
      winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream, 
      winrtLib.WindowsNs.FoundationNs.IAsyncAction
    ],
    unprotectAsync: js.Function1[
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer]
    ],
    unprotectStreamAsync: js.Function2[
      winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream, 
      winrtLib.WindowsNs.FoundationNs.IAsyncAction
    ]
  ): IDataProtectionProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("protectAsync")(protectAsync)
    __obj.updateDynamic("protectStreamAsync")(protectStreamAsync)
    __obj.updateDynamic("unprotectAsync")(unprotectAsync)
    __obj.updateDynamic("unprotectStreamAsync")(unprotectStreamAsync)
    __obj.asInstanceOf[IDataProtectionProvider]
  }
}

