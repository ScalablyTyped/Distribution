package typings.winrt.Windows.Security.Cryptography.DataProtection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataProtectionProviderFactory extends js.Object {
  def createOverloadExplicit(protectionDescriptor: String): DataProtectionProvider = js.native
}

object IDataProtectionProviderFactory {
  @scala.inline
  def apply(createOverloadExplicit: String => DataProtectionProvider): IDataProtectionProviderFactory = {
    val __obj = js.Dynamic.literal(createOverloadExplicit = js.Any.fromFunction1(createOverloadExplicit))
    __obj.asInstanceOf[IDataProtectionProviderFactory]
  }
  @scala.inline
  implicit class IDataProtectionProviderFactoryOps[Self <: IDataProtectionProviderFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateOverloadExplicit(value: String => DataProtectionProvider): Self = this.set("createOverloadExplicit", js.Any.fromFunction1(value))
  }
  
}

