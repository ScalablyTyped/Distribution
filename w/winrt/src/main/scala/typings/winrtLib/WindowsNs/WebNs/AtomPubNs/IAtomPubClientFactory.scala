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
    createAtomPubClientWithCredentials: js.Function1[winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential, AtomPubClient]
  ): IAtomPubClientFactory = {
    val __obj = js.Dynamic.literal(createAtomPubClientWithCredentials = createAtomPubClientWithCredentials)
  
    __obj.asInstanceOf[IAtomPubClientFactory]
  }
}

