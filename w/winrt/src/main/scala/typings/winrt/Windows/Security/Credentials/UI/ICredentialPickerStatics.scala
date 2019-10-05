package typings.winrt.Windows.Security.Credentials.UI

import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICredentialPickerStatics extends js.Object {
  def pickAsync(options: CredentialPickerOptions): IAsyncOperation[CredentialPickerResults] = js.native
  def pickAsync(targetName: String, message: String): IAsyncOperation[CredentialPickerResults] = js.native
  def pickAsync(targetName: String, message: String, caption: String): IAsyncOperation[CredentialPickerResults] = js.native
}

