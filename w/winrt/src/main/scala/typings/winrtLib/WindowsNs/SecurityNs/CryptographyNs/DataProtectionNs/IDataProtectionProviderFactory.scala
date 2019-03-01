package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.DataProtectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataProtectionProviderFactory extends js.Object {
  def createOverloadExplicit(protectionDescriptor: java.lang.String): DataProtectionProvider
}

object IDataProtectionProviderFactory {
  @scala.inline
  def apply(createOverloadExplicit: js.Function1[java.lang.String, DataProtectionProvider]): IDataProtectionProviderFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createOverloadExplicit")(createOverloadExplicit)
    __obj.asInstanceOf[IDataProtectionProviderFactory]
  }
}

