package typings
package winrtLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationClientFactory extends js.Object {
  def createSyndicationClient(serverCredential: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential): SyndicationClient
}

object ISyndicationClientFactory {
  @scala.inline
  def apply(
    createSyndicationClient: js.Function1[winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential, SyndicationClient]
  ): ISyndicationClientFactory = {
    val __obj = js.Dynamic.literal(createSyndicationClient = createSyndicationClient)
  
    __obj.asInstanceOf[ISyndicationClientFactory]
  }
}

