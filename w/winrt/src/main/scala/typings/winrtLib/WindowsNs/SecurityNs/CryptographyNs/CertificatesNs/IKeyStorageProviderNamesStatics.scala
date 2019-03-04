package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyStorageProviderNamesStatics extends js.Object {
  var platformKeyStorageProvider: java.lang.String
  var smartcardKeyStorageProvider: java.lang.String
  var softwareKeyStorageProvider: java.lang.String
}

object IKeyStorageProviderNamesStatics {
  @scala.inline
  def apply(
    platformKeyStorageProvider: java.lang.String,
    smartcardKeyStorageProvider: java.lang.String,
    softwareKeyStorageProvider: java.lang.String
  ): IKeyStorageProviderNamesStatics = {
    val __obj = js.Dynamic.literal(platformKeyStorageProvider = platformKeyStorageProvider, smartcardKeyStorageProvider = smartcardKeyStorageProvider, softwareKeyStorageProvider = softwareKeyStorageProvider)
  
    __obj.asInstanceOf[IKeyStorageProviderNamesStatics]
  }
}

