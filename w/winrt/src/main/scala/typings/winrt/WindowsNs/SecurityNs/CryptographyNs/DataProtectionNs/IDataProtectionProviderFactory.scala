package typings.winrt.WindowsNs.SecurityNs.CryptographyNs.DataProtectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataProtectionProviderFactory extends js.Object {
  def createOverloadExplicit(protectionDescriptor: String): DataProtectionProvider
}

object IDataProtectionProviderFactory {
  @scala.inline
  def apply(createOverloadExplicit: String => DataProtectionProvider): IDataProtectionProviderFactory = {
    val __obj = js.Dynamic.literal(createOverloadExplicit = js.Any.fromFunction1(createOverloadExplicit))
  
    __obj.asInstanceOf[IDataProtectionProviderFactory]
  }
}

