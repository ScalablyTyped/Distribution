package typings.winrt.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptedAndAuthenticatedData
  extends StObject
     with IEncryptedAndAuthenticatedData
object EncryptedAndAuthenticatedData {
  
  @scala.inline
  def apply(authenticationTag: IBuffer, encryptedData: IBuffer): EncryptedAndAuthenticatedData = {
    val __obj = js.Dynamic.literal(authenticationTag = authenticationTag.asInstanceOf[js.Any], encryptedData = encryptedData.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedAndAuthenticatedData]
  }
}
