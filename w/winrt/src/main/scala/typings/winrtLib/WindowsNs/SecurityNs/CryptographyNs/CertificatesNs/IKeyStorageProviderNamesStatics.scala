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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("platformKeyStorageProvider")(platformKeyStorageProvider)
    __obj.updateDynamic("smartcardKeyStorageProvider")(smartcardKeyStorageProvider)
    __obj.updateDynamic("softwareKeyStorageProvider")(softwareKeyStorageProvider)
    __obj.asInstanceOf[IKeyStorageProviderNamesStatics]
  }
}

