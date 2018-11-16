package typings
package winrtLib.WindowsNs.SecurityNs.CredentialsNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Credentials.UI.CredentialPicker")
@js.native
class CredentialPicker () extends js.Object

@JSGlobal("Windows.Security.Credentials.UI.CredentialPicker")
@js.native
object CredentialPicker extends js.Object {
  def pickAsync(options: winrtLib.WindowsNs.SecurityNs.CredentialsNs.UINs.CredentialPickerOptions): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.SecurityNs.CredentialsNs.UINs.CredentialPickerResults] = js.native
  def pickAsync(targetName: java.lang.String, message: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.SecurityNs.CredentialsNs.UINs.CredentialPickerResults] = js.native
  def pickAsync(targetName: java.lang.String, message: java.lang.String, caption: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.SecurityNs.CredentialsNs.UINs.CredentialPickerResults] = js.native
}

