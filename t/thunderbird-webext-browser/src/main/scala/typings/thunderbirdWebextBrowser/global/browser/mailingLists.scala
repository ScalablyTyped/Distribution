package typings.thunderbirdWebextBrowser.global.browser

import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.browser.contacts.ContactNode
import typings.thunderbirdWebextBrowser.browser.mailingLists.CreateProperties
import typings.thunderbirdWebextBrowser.browser.mailingLists.MailingListNode
import typings.thunderbirdWebextBrowser.browser.mailingLists.UpdateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mailingLists {
  
  @JSGlobal("browser.mailingLists")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addMember(id: String, contactId: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("addMember")(id.asInstanceOf[js.Any], contactId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def create(parentId: String, properties: CreateProperties): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(parentId.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  /** Removes the mailing list. */
  inline def delete(id: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("_delete")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def get(id: String): js.Promise[MailingListNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MailingListNode]]
  
  inline def list(parentId: String): js.Promise[js.Array[MailingListNode]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(parentId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[MailingListNode]]]
  
  inline def listMembers(id: String): js.Promise[js.Array[ContactNode]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listMembers")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ContactNode]]]
  
  @JSGlobal("browser.mailingLists.onCreated")
  @js.native
  val onCreated: WebExtEvent[js.Function1[/* node */ MailingListNode, Unit]] = js.native
  
  @JSGlobal("browser.mailingLists.onDeleted")
  @js.native
  val onDeleted: WebExtEvent[js.Function2[/* parentId */ String, /* id */ String, Unit]] = js.native
  
  @JSGlobal("browser.mailingLists.onMemberAdded")
  @js.native
  val onMemberAdded: WebExtEvent[js.Function1[/* node */ ContactNode, Unit]] = js.native
  
  @JSGlobal("browser.mailingLists.onMemberRemoved")
  @js.native
  val onMemberRemoved: WebExtEvent[js.Function2[/* parentId */ String, /* id */ String, Unit]] = js.native
  
  @JSGlobal("browser.mailingLists.onUpdated")
  @js.native
  val onUpdated: WebExtEvent[js.Function1[/* node */ MailingListNode, Unit]] = js.native
  
  inline def removeMember(id: String, contactId: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeMember")(id.asInstanceOf[js.Any], contactId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def update(id: String, properties: UpdateProperties): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(id.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
