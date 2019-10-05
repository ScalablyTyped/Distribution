package typings.winrt.Windows.Web.Syndication

import typings.winrt.Windows.Security.Credentials.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationClientFactory extends js.Object {
  def createSyndicationClient(serverCredential: PasswordCredential): SyndicationClient
}

object ISyndicationClientFactory {
  @scala.inline
  def apply(createSyndicationClient: PasswordCredential => SyndicationClient): ISyndicationClientFactory = {
    val __obj = js.Dynamic.literal(createSyndicationClient = js.Any.fromFunction1(createSyndicationClient))
  
    __obj.asInstanceOf[ISyndicationClientFactory]
  }
}

