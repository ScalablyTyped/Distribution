package typings
package winrtLib.WindowsNs.SecurityNs.CredentialsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPasswordVault extends js.Object {
  def add(credential: PasswordCredential): scala.Unit
  def findAllByResource(resource: java.lang.String): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PasswordCredential]
  def findAllByUserName(userName: java.lang.String): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PasswordCredential]
  def remove(credential: PasswordCredential): scala.Unit
  def retrieve(resource: java.lang.String, userName: java.lang.String): PasswordCredential
  def retrieveAll(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PasswordCredential]
}

object IPasswordVault {
  @scala.inline
  def apply(
    add: js.Function1[PasswordCredential, scala.Unit],
    findAllByResource: js.Function1[
      java.lang.String, 
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PasswordCredential]
    ],
    findAllByUserName: js.Function1[
      java.lang.String, 
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PasswordCredential]
    ],
    remove: js.Function1[PasswordCredential, scala.Unit],
    retrieve: js.Function2[java.lang.String, java.lang.String, PasswordCredential],
    retrieveAll: js.Function0[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PasswordCredential]]
  ): IPasswordVault = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("findAllByResource")(findAllByResource)
    __obj.updateDynamic("findAllByUserName")(findAllByUserName)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("retrieve")(retrieve)
    __obj.updateDynamic("retrieveAll")(retrieveAll)
    __obj.asInstanceOf[IPasswordVault]
  }
}

