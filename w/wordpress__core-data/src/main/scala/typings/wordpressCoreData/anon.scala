package typings.wordpressCoreData

import typings.std.IterableIterator
import typings.std.Partial
import typings.std.Record
import typings.wordpressApiFetch.anon.Formats
import typings.wordpressApiFetch.mod.Schema.User
import typings.wordpressCoreData.mod.Autosave
import typings.wordpressCoreData.mod.Entity
import typings.wordpressCoreData.wordpressCoreDataStrings.create
import typings.wordpressCoreData.wordpressCoreDataStrings.delete
import typings.wordpressCoreData.wordpressCoreDataStrings.read
import typings.wordpressCoreData.wordpressCoreDataStrings.update
import typings.wordpressCoreData.wordpressCoreDataStrings.view
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait TypeofimportedActions extends js.Object {
    def addEntities(entities: js.Array[Entity]): Unit = js.native
    def receiveAutosaves(postId: Double, autosaves: js.Array[Autosave]): Unit = js.native
    def receiveAutosaves(postId: Double, autosaves: Autosave): Unit = js.native
    @JSName("receiveCurrentUser")
    def receiveCurrentUser_view(currentUser: User[view]): Unit = js.native
    def receiveEmbedPreview(url: String, preview: Record[String, _]): Unit = js.native
    def receiveEntityRecords(kind: String, name: String, records: js.Array[Record[String, _]]): Unit = js.native
    def receiveEntityRecords(
      kind: String,
      name: String,
      records: js.Array[Record[String, _]],
      query: js.UndefOr[scala.Nothing],
      invalidateCache: Boolean
    ): Unit = js.native
    def receiveEntityRecords(kind: String, name: String, records: js.Array[Record[String, _]], query: Record[String, _]): Unit = js.native
    def receiveEntityRecords(
      kind: String,
      name: String,
      records: js.Array[Record[String, _]],
      query: Record[String, _],
      invalidateCache: Boolean
    ): Unit = js.native
    def receiveEntityRecords(kind: String, name: String, records: Record[String, _]): Unit = js.native
    def receiveEntityRecords(
      kind: String,
      name: String,
      records: Record[String, _],
      query: js.UndefOr[scala.Nothing],
      invalidateCache: Boolean
    ): Unit = js.native
    def receiveEntityRecords(kind: String, name: String, records: Record[String, _], query: Record[String, _]): Unit = js.native
    def receiveEntityRecords(
      kind: String,
      name: String,
      records: Record[String, _],
      query: Record[String, _],
      invalidateCache: Boolean
    ): Unit = js.native
    def receiveThemeSupports(themeSupports: Formats): Unit = js.native
    def receiveUploadPermissions(hasUploadPermissions: Boolean): Unit = js.native
    def receiveUserPermission(key: String, isAllowed: Boolean): Unit = js.native
    @JSName("receiveUserQuery")
    def receiveUserQuery_view(queryID: String, users: js.Array[User[view]]): Unit = js.native
    @JSName("receiveUserQuery")
    def receiveUserQuery_view(queryID: String, users: User[view]): Unit = js.native
    def saveEntityRecord(kind: String, name: String, record: Record[String, _]): IterableIterator[Unit] = js.native
  }
  
  @js.native
  trait TypeofimportedSelectors extends js.Object {
    @JSName("canUser")
    def canUser_create(action: create, resource: String, id: String): js.UndefOr[Boolean] = js.native
    @JSName("canUser")
    def canUser_create(action: create, resource: String, id: Double): js.UndefOr[Boolean] = js.native
    @JSName("canUser")
    def canUser_delete(action: delete, resource: String, id: String): js.UndefOr[Boolean] = js.native
    @JSName("canUser")
    def canUser_delete(action: delete, resource: String, id: Double): js.UndefOr[Boolean] = js.native
    @JSName("canUser")
    def canUser_read(action: read, resource: String, id: String): js.UndefOr[Boolean] = js.native
    @JSName("canUser")
    def canUser_read(action: read, resource: String, id: Double): js.UndefOr[Boolean] = js.native
    @JSName("canUser")
    def canUser_update(action: update, resource: String, id: String): js.UndefOr[Boolean] = js.native
    @JSName("canUser")
    def canUser_update(action: update, resource: String, id: Double): js.UndefOr[Boolean] = js.native
    def getAuthors(): js.Array[User[view]] = js.native
    def getAutosave(postType: String, postId: Double, authorId: Double): js.UndefOr[Autosave] = js.native
    def getAutosaves(postType: String, postId: Double): js.UndefOr[js.Array[Autosave]] = js.native
    def getCurrentUser(): User[view] = js.native
    def getEmbedPreview(url: String): js.UndefOr[Record[String, _]] = js.native
    def getEntitiesByKind(kind: String): js.Array[Entity] = js.native
    def getEntity(kind: String, name: String): js.UndefOr[Entity] = js.native
    def getEntityRecord(kind: String, name: String, key: Double): js.UndefOr[Record[String, _]] = js.native
    def getEntityRecords(kind: String, name: String): js.Array[Record[String, _]] = js.native
    def getEntityRecords(kind: String, name: String, query: Record[String, _]): js.Array[Record[String, _]] = js.native
    def getThemeSupports(): Partial[Formats] = js.native
    def getUserQueryResults(queryId: String): js.Array[User[view]] = js.native
    def hasFetchedAutosaves(postType: String, postId: Double): Boolean = js.native
    def hasUploadPermissions(): Boolean = js.native
    def isPreviewEmbedFallback(url: String): Boolean = js.native
    def isRequestingEmbedPreview(url: String): Boolean = js.native
  }
  
}

