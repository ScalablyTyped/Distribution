package typings.thunderbirdWebextBrowser.global.messenger

import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.messenger.identities.MailIdentity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identities {
  
  @JSGlobal("messenger.identities")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(accountId: String, details: MailIdentity): js.Promise[MailIdentity] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(accountId.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MailIdentity]]
  
  /**
    * Attempts to delete the requested identity. Default identities cannot
    * be deleted.
    */
  inline def delete(identityId: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("_delete")(identityId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def get(identityId: String): js.Promise[MailIdentity] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(identityId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MailIdentity]]
  
  inline def getDefault(accountId: String): js.Promise[MailIdentity] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")(accountId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MailIdentity]]
  
  inline def list(): js.Promise[js.Array[MailIdentity]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[js.Array[MailIdentity]]]
  inline def list(accountId: String): js.Promise[js.Array[MailIdentity]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(accountId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[MailIdentity]]]
  
  @JSGlobal("messenger.identities.onCreated")
  @js.native
  val onCreated: WebExtEvent[js.Function2[/* identityId */ String, /* identity */ MailIdentity, Unit]] = js.native
  
  @JSGlobal("messenger.identities.onDeleted")
  @js.native
  val onDeleted: WebExtEvent[js.Function1[/* identityId */ String, Unit]] = js.native
  
  @JSGlobal("messenger.identities.onUpdated")
  @js.native
  val onUpdated: WebExtEvent[js.Function2[/* identityId */ String, /* changedValues */ MailIdentity, Unit]] = js.native
  
  inline def setDefault(accountId: String, identityId: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDefault")(accountId.asInstanceOf[js.Any], identityId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def update(identityId: String, details: MailIdentity): js.Promise[MailIdentity] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(identityId.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MailIdentity]]
}
