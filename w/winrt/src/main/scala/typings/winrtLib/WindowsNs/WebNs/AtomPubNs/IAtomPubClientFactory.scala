package typings
package winrtLib.WindowsNs.WebNs.AtomPubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAtomPubClientFactory extends js.Object {
  def createAtomPubClientWithCredentials(serverCredential: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential): AtomPubClient
}

object IAtomPubClientFactory {
  @scala.inline
  def apply(
    createAtomPubClientWithCredentials: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential => AtomPubClient
  ): IAtomPubClientFactory = {
    val __obj = js.Dynamic.literal(createAtomPubClientWithCredentials = js.Any.fromFunction1(createAtomPubClientWithCredentials))
  
    __obj.asInstanceOf[IAtomPubClientFactory]
  }
}

