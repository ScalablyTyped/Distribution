package typings
package winrtLib.WindowsNs.SecurityNs.CredentialsNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICredentialPickerStatics extends js.Object {
  def pickAsync(options: CredentialPickerOptions): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[CredentialPickerResults] = js.native
  def pickAsync(targetName: java.lang.String, message: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[CredentialPickerResults] = js.native
  def pickAsync(targetName: java.lang.String, message: java.lang.String, caption: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[CredentialPickerResults] = js.native
}

