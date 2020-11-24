package typings.winrt.Windows.Web.Syndication

import typings.winrt.Windows.Security.Credentials.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISyndicationClientFactory extends js.Object {
  
  def createSyndicationClient(serverCredential: PasswordCredential): SyndicationClient = js.native
}
object ISyndicationClientFactory {
  
  @scala.inline
  def apply(createSyndicationClient: PasswordCredential => SyndicationClient): ISyndicationClientFactory = {
    val __obj = js.Dynamic.literal(createSyndicationClient = js.Any.fromFunction1(createSyndicationClient))
    __obj.asInstanceOf[ISyndicationClientFactory]
  }
  
  @scala.inline
  implicit class ISyndicationClientFactoryOps[Self <: ISyndicationClientFactory] (val x: Self) extends AnyVal {
    
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
    def setCreateSyndicationClient(value: PasswordCredential => SyndicationClient): Self = this.set("createSyndicationClient", js.Any.fromFunction1(value))
  }
}
