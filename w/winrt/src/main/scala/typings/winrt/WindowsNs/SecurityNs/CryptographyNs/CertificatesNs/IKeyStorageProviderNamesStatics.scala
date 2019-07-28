package typings.winrt.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyStorageProviderNamesStatics extends js.Object {
  var platformKeyStorageProvider: String
  var smartcardKeyStorageProvider: String
  var softwareKeyStorageProvider: String
}

object IKeyStorageProviderNamesStatics {
  @scala.inline
  def apply(
    platformKeyStorageProvider: String,
    smartcardKeyStorageProvider: String,
    softwareKeyStorageProvider: String
  ): IKeyStorageProviderNamesStatics = {
    val __obj = js.Dynamic.literal(platformKeyStorageProvider = platformKeyStorageProvider, smartcardKeyStorageProvider = smartcardKeyStorageProvider, softwareKeyStorageProvider = softwareKeyStorageProvider)
  
    __obj.asInstanceOf[IKeyStorageProviderNamesStatics]
  }
}

