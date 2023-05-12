package typings.thunderbirdWebextBrowser.global.messenger

import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.messenger.contacts.ContactNode
import typings.thunderbirdWebextBrowser.messenger.mailingLists.CreateProperties
import typings.thunderbirdWebextBrowser.messenger.mailingLists.MailingListNode
import typings.thunderbirdWebextBrowser.messenger.mailingLists.UpdateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mailingLists {
  
  @JSGlobal("messenger.mailingLists")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addMember(id: String, contactId: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("addMember")(id.asInstanceOf[js.Any], contactId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def create(parentId: String, properties: CreateProperties): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(parentId.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  /** Removes the mailing list. */
  inline def delete(id: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("_delete")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def get(id: String): js.Promise[MailingListNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MailingListNode]]
  
  inline def list(parentId: String): js.Promise[js.Array[MailingListNode]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(parentId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[MailingListNode]]]
  
  inline def listMembers(id: String): js.Promise[js.Array[ContactNode]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listMembers")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ContactNode]]]
  
  @JSGlobal("messenger.mailingLists.onCreated")
  @js.native
  val onCreated: WebExtEvent[js.Function1[/* node */ MailingListNode, Unit]] = js.native
  
  @JSGlobal("messenger.mailingLists.onDeleted")
  @js.native
  val onDeleted: WebExtEvent[js.Function2[/* parentId */ String, /* id */ String, Unit]] = js.native
  
  @JSGlobal("messenger.mailingLists.onMemberAdded")
  @js.native
  val onMemberAdded: WebExtEvent[js.Function1[/* node */ ContactNode, Unit]] = js.native
  
  @JSGlobal("messenger.mailingLists.onMemberRemoved")
  @js.native
  val onMemberRemoved: WebExtEvent[js.Function2[/* parentId */ String, /* id */ String, Unit]] = js.native
  
  @JSGlobal("messenger.mailingLists.onUpdated")
  @js.native
  val onUpdated: WebExtEvent[js.Function1[/* node */ MailingListNode, Unit]] = js.native
  
  inline def removeMember(id: String, contactId: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeMember")(id.asInstanceOf[js.Any], contactId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def update(id: String, properties: UpdateProperties): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(id.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
