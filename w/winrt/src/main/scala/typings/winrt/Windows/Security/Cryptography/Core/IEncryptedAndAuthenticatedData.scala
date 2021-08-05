package typings.winrt.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEncryptedAndAuthenticatedData extends StObject {
  
  var authenticationTag: IBuffer
  
  var encryptedData: IBuffer
}
object IEncryptedAndAuthenticatedData {
  
  inline def apply(authenticationTag: IBuffer, encryptedData: IBuffer): IEncryptedAndAuthenticatedData = {
    val __obj = js.Dynamic.literal(authenticationTag = authenticationTag.asInstanceOf[js.Any], encryptedData = encryptedData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEncryptedAndAuthenticatedData]
  }
  
  extension [Self <: IEncryptedAndAuthenticatedData](x: Self) {
    
    inline def setAuthenticationTag(value: IBuffer): Self = StObject.set(x, "authenticationTag", value.asInstanceOf[js.Any])
    
    inline def setEncryptedData(value: IBuffer): Self = StObject.set(x, "encryptedData", value.asInstanceOf[js.Any])
  }
}
