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
  def apply(createOverloadExplicit: java.lang.String => DataProtectionProvider): IDataProtectionProviderFactory = {
    val __obj = js.Dynamic.literal(createOverloadExplicit = js.Any.fromFunction1(createOverloadExplicit))
  
    __obj.asInstanceOf[IDataProtectionProviderFactory]
  }
}

