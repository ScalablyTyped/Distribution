package typings.winrt.Windows.Web.AtomPub

import typings.winrt.Windows.Security.Credentials.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAtomPubClientFactory extends js.Object {
  def createAtomPubClientWithCredentials(serverCredential: PasswordCredential): AtomPubClient
}

object IAtomPubClientFactory {
  @scala.inline
  def apply(createAtomPubClientWithCredentials: PasswordCredential => AtomPubClient): IAtomPubClientFactory = {
    val __obj = js.Dynamic.literal(createAtomPubClientWithCredentials = js.Any.fromFunction1(createAtomPubClientWithCredentials))
    __obj.asInstanceOf[IAtomPubClientFactory]
  }
}

