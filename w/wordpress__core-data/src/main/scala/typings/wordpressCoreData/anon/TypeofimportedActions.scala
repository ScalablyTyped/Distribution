package typings.wordpressCoreData.anon

import typings.std.IterableIterator
import typings.std.Record
import typings.wordpressCoreData.mod.Autosave
import typings.wordpressCoreData.mod.Entity
import typings.wordpressCoreData.schemaMod.Schema.User
import typings.wordpressCoreData.wordpressCoreDataStrings.view
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedActions extends StObject {
  
  def addEntities(entities: js.Array[Entity]): Unit = js.native
  
  def receiveAutosaves(postId: Double, autosaves: js.Array[Autosave]): Unit = js.native
  def receiveAutosaves(postId: Double, autosaves: Autosave): Unit = js.native
  
  @JSName("receiveCurrentUser")
  def receiveCurrentUser_view(currentUser: User[view]): Unit = js.native
  
  def receiveEmbedPreview(url: String, preview: Record[String, Any]): Unit = js.native
  
  def receiveEntityRecords(kind: String, name: String, records: js.Array[Record[String, Any]]): Unit = js.native
  def receiveEntityRecords(
    kind: String,
    name: String,
    records: js.Array[Record[String, Any]],
    query: Unit,
    invalidateCache: Boolean
  ): Unit = js.native
  def receiveEntityRecords(kind: String, name: String, records: js.Array[Record[String, Any]], query: Record[String, Any]): Unit = js.native
  def receiveEntityRecords(
    kind: String,
    name: String,
    records: js.Array[Record[String, Any]],
    query: Record[String, Any],
    invalidateCache: Boolean
  ): Unit = js.native
  def receiveEntityRecords(kind: String, name: String, records: Record[String, Any]): Unit = js.native
  def receiveEntityRecords(kind: String, name: String, records: Record[String, Any], query: Unit, invalidateCache: Boolean): Unit = js.native
  def receiveEntityRecords(kind: String, name: String, records: Record[String, Any], query: Record[String, Any]): Unit = js.native
  def receiveEntityRecords(
    kind: String,
    name: String,
    records: Record[String, Any],
    query: Record[String, Any],
    invalidateCache: Boolean
  ): Unit = js.native
  
  def receiveThemeSupports(themeSupports: Formats): Unit = js.native
  
  def receiveUploadPermissions(hasUploadPermissions: Boolean): Unit = js.native
  
  def receiveUserPermission(key: String, isAllowed: Boolean): Unit = js.native
  
  @JSName("receiveUserQuery")
  def receiveUserQuery_view(queryID: String, users: js.Array[User[view]]): Unit = js.native
  @JSName("receiveUserQuery")
  def receiveUserQuery_view(queryID: String, users: User[view]): Unit = js.native
  
  def saveEntityRecord(kind: String, name: String, record: Record[String, Any]): IterableIterator[Unit] = js.native
}
