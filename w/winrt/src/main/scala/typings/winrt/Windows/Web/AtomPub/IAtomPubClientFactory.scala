package typings.winrt.Windows.Web.AtomPub

import typings.winrt.Windows.Security.Credentials.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAtomPubClientFactory extends js.Object {
  
  def createAtomPubClientWithCredentials(serverCredential: PasswordCredential): AtomPubClient = js.native
}
object IAtomPubClientFactory {
  
  @scala.inline
  def apply(createAtomPubClientWithCredentials: PasswordCredential => AtomPubClient): IAtomPubClientFactory = {
    val __obj = js.Dynamic.literal(createAtomPubClientWithCredentials = js.Any.fromFunction1(createAtomPubClientWithCredentials))
    __obj.asInstanceOf[IAtomPubClientFactory]
  }
  
  @scala.inline
  implicit class IAtomPubClientFactoryOps[Self <: IAtomPubClientFactory] (val x: Self) extends AnyVal {
    
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
    def setCreateAtomPubClientWithCredentials(value: PasswordCredential => AtomPubClient): Self = this.set("createAtomPubClientWithCredentials", js.Any.fromFunction1(value))
  }
}
