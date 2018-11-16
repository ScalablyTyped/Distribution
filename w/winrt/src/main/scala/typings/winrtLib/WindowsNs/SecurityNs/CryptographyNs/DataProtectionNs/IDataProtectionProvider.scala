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

