package typings.thunderbirdWebextBrowser.global.browser

import typings.std.File
import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.browser.contacts.ContactNode
import typings.thunderbirdWebextBrowser.browser.contacts.ContactProperties
import typings.thunderbirdWebextBrowser.browser.contacts.PropertyChange
import typings.thunderbirdWebextBrowser.browser.contacts.QueryInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contacts {
  
  @JSGlobal("browser.contacts")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(parentId: String, id: String, properties: ContactProperties): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(parentId.asInstanceOf[js.Any], id.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def create(parentId: String, properties: ContactProperties): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(parentId.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  /**
    * Removes a contact from the address book. The contact is also removed
    * from any mailing lists it is a member of.
    */
  inline def delete(id: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("_delete")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def get(id: String): js.Promise[ContactNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ContactNode]]
  
  inline def getPhoto(id: String): js.Promise[File] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPhoto")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[File]]
  
  inline def list(parentId: String): js.Promise[js.Array[ContactNode]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(parentId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ContactNode]]]
  
  @JSGlobal("browser.contacts.onCreated")
  @js.native
  val onCreated: WebExtEvent[js.Function1[/* node */ ContactNode, Unit]] = js.native
  
  @JSGlobal("browser.contacts.onDeleted")
  @js.native
  val onDeleted: WebExtEvent[js.Function2[/* parentId */ String, /* id */ String, Unit]] = js.native
  
  @JSGlobal("browser.contacts.onUpdated")
  @js.native
  val onUpdated: WebExtEvent[
    js.Function2[/* node */ ContactNode, /* changedProperties */ PropertyChange, Unit]
  ] = js.native
  
  inline def quickSearch(parentId: String, queryInfo: String): js.Promise[js.Array[ContactNode]] = (^.asInstanceOf[js.Dynamic].applyDynamic("quickSearch")(parentId.asInstanceOf[js.Any], queryInfo.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ContactNode]]]
  inline def quickSearch(parentId: String, queryInfo: QueryInfo): js.Promise[js.Array[ContactNode]] = (^.asInstanceOf[js.Dynamic].applyDynamic("quickSearch")(parentId.asInstanceOf[js.Any], queryInfo.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ContactNode]]]
  inline def quickSearch(queryInfo: String): js.Promise[js.Array[ContactNode]] = ^.asInstanceOf[js.Dynamic].applyDynamic("quickSearch")(queryInfo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ContactNode]]]
  inline def quickSearch(queryInfo: QueryInfo): js.Promise[js.Array[ContactNode]] = ^.asInstanceOf[js.Dynamic].applyDynamic("quickSearch")(queryInfo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ContactNode]]]
  
  inline def setPhoto(id: String, file: File): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("setPhoto")(id.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def update(id: String, properties: ContactProperties): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(id.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
