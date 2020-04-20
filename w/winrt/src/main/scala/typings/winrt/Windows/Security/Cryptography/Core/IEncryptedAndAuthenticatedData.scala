package typings.winrt.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEncryptedAndAuthenticatedData extends js.Object {
  var authenticationTag: IBuffer
  var encryptedData: IBuffer
}

object IEncryptedAndAuthenticatedData {
  @scala.inline
  def apply(authenticationTag: IBuffer, encryptedData: IBuffer): IEncryptedAndAuthenticatedData = {
    val __obj = js.Dynamic.literal(authenticationTag = authenticationTag.asInstanceOf[js.Any], encryptedData = encryptedData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEncryptedAndAuthenticatedData]
  }
}

