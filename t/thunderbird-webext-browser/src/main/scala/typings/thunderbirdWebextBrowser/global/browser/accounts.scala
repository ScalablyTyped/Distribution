package typings.thunderbirdWebextBrowser.global.browser

import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.browser.accounts.MailAccount
import typings.thunderbirdWebextBrowser.browser.accounts.OnUpdatedChangedValues
import typings.thunderbirdWebextBrowser.browser.identities.MailIdentity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accounts {
  
  @JSGlobal("browser.accounts")
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(accountId: String): js.Promise[MailAccount] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(accountId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MailAccount]]
  inline def get(accountId: String, includeFolders: Boolean): js.Promise[MailAccount] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(accountId.asInstanceOf[js.Any], includeFolders.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MailAccount]]
  
  inline def getDefault(): js.Promise[MailAccount] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[js.Promise[MailAccount]]
  inline def getDefault(includeFolders: Boolean): js.Promise[MailAccount] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")(includeFolders.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MailAccount]]
  
  inline def getDefaultIdentity(accountId: String): js.Promise[MailIdentity] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultIdentity")(accountId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MailIdentity]]
  
  inline def list(): js.Promise[js.Array[MailAccount]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[js.Array[MailAccount]]]
  inline def list(includeFolders: Boolean): js.Promise[js.Array[MailAccount]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(includeFolders.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[MailAccount]]]
  
  @JSGlobal("browser.accounts.onCreated")
  @js.native
  val onCreated: WebExtEvent[js.Function2[/* id */ String, /* account */ MailAccount, Unit]] = js.native
  
  @JSGlobal("browser.accounts.onDeleted")
  @js.native
  val onDeleted: WebExtEvent[js.Function1[/* id */ String, Unit]] = js.native
  
  @JSGlobal("browser.accounts.onUpdated")
  @js.native
  val onUpdated: WebExtEvent[js.Function2[/* id */ String, /* changedValues */ OnUpdatedChangedValues, Unit]] = js.native
  
  inline def setDefaultIdentity(accountId: String, identityId: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultIdentity")(accountId.asInstanceOf[js.Any], identityId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
