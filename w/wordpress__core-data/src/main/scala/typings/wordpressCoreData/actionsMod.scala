package typings.wordpressCoreData

import typings.std.IterableIterator
import typings.std.Record
import typings.wordpressApiFetch.anon.Formats
import typings.wordpressApiFetch.mod.Schema.User
import typings.wordpressCoreData.mod.Autosave
import typings.wordpressCoreData.mod.Entity
import typings.wordpressCoreData.wordpressCoreDataStrings.view
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsMod {
  
  @JSImport("@wordpress/core-data/actions", "addEntities")
  @js.native
  def addEntities(entities: js.Array[Entity]): Unit = js.native
  
  @JSImport("@wordpress/core-data/actions", "receiveAutosaves")
  @js.native
  def receiveAutosaves(postId: Double, autosaves: js.Array[Autosave]): Unit = js.native
  @JSImport("@wordpress/core-data/actions", "receiveAutosaves")
  @js.native
  def receiveAutosaves(postId: Double, autosaves: Autosave): Unit = js.native
  
  @JSImport("@wordpress/core-data/actions", "receiveCurrentUser")
  @js.native
  def receiveCurrentUser_view(currentUser: User[view]): Unit = js.native
  
  @JSImport("@wordpress/core-data/actions", "receiveEmbedPreview")
  @js.native
  def receiveEmbedPreview(url: String, preview: Record[String, _]): Unit = js.native
  
  @JSImport("@wordpress/core-data/actions", "receiveEntityRecords")
  @js.native
  def receiveEntityRecords(kind: String, name: String, records: js.Array[Record[String, _]]): Unit = js.native
  @JSImport("@wordpress/core-data/actions", "receiveEntityRecords")
  @js.native
  def receiveEntityRecords(
    kind: String,
    name: String,
    records: js.Array[Record[String, _]],
    query: js.UndefOr[scala.Nothing],
    invalidateCache: Boolean
  ): Unit = js.native
  @JSImport("@wordpress/core-data/actions", "receiveEntityRecords")
  @js.native
  def receiveEntityRecords(kind: String, name: String, records: js.Array[Record[String, _]], query: Record[String, _]): Unit = js.native
  @JSImport("@wordpress/core-data/actions", "receiveEntityRecords")
  @js.native
  def receiveEntityRecords(
    kind: String,
    name: String,
    records: js.Array[Record[String, _]],
    query: Record[String, _],
    invalidateCache: Boolean
  ): Unit = js.native
  @JSImport("@wordpress/core-data/actions", "receiveEntityRecords")
  @js.native
  def receiveEntityRecords(kind: String, name: String, records: Record[String, _]): Unit = js.native
  @JSImport("@wordpress/core-data/actions", "receiveEntityRecords")
  @js.native
  def receiveEntityRecords(
    kind: String,
    name: String,
    records: Record[String, _],
    query: js.UndefOr[scala.Nothing],
    invalidateCache: Boolean
  ): Unit = js.native
  @JSImport("@wordpress/core-data/actions", "receiveEntityRecords")
  @js.native
  def receiveEntityRecords(kind: String, name: String, records: Record[String, _], query: Record[String, _]): Unit = js.native
  @JSImport("@wordpress/core-data/actions", "receiveEntityRecords")
  @js.native
  def receiveEntityRecords(
    kind: String,
    name: String,
    records: Record[String, _],
    query: Record[String, _],
    invalidateCache: Boolean
  ): Unit = js.native
  
  @JSImport("@wordpress/core-data/actions", "receiveThemeSupports")
  @js.native
  def receiveThemeSupports(themeSupports: Formats): Unit = js.native
  
  @JSImport("@wordpress/core-data/actions", "receiveUploadPermissions")
  @js.native
  def receiveUploadPermissions(hasUploadPermissions: Boolean): Unit = js.native
  
  @JSImport("@wordpress/core-data/actions", "receiveUserPermission")
  @js.native
  def receiveUserPermission(key: String, isAllowed: Boolean): Unit = js.native
  
  @JSImport("@wordpress/core-data/actions", "receiveUserQuery")
  @js.native
  def receiveUserQuery_view(queryID: String, users: js.Array[User[view]]): Unit = js.native
  @JSImport("@wordpress/core-data/actions", "receiveUserQuery")
  @js.native
  def receiveUserQuery_view(queryID: String, users: User[view]): Unit = js.native
  
  @JSImport("@wordpress/core-data/actions", "saveEntityRecord")
  @js.native
  def saveEntityRecord(kind: String, name: String, record: Record[String, _]): IterableIterator[Unit] = js.native
}
