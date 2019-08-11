package typings.atWordpressCoreDashData

import typings.atWordpressApiDashFetch.Anon_Formats
import typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs.User
import typings.atWordpressCoreDashData.atWordpressCoreDashDataMod.Autosave
import typings.atWordpressCoreDashData.atWordpressCoreDashDataMod.Entity
import typings.atWordpressCoreDashData.atWordpressCoreDashDataStrings.view
import typings.std.IterableIterator
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofimported_actions extends js.Object {
  def addEntities(entities: js.Array[Entity]): Unit = js.native
  def receiveAutosaves(postId: Double, autosaves: js.Array[Autosave]): Unit = js.native
  def receiveAutosaves(postId: Double, autosaves: Autosave): Unit = js.native
  @JSName("receiveCurrentUser")
  def receiveCurrentUser_view(currentUser: User[view]): Unit = js.native
  def receiveEmbedPreview(url: String, preview: Record[String, _]): Unit = js.native
  def receiveEntityRecords(kind: String, name: String, records: js.Array[Record[String, _]]): Unit = js.native
  def receiveEntityRecords(kind: String, name: String, records: js.Array[Record[String, _]], query: Record[String, _]): Unit = js.native
  def receiveEntityRecords(
    kind: String,
    name: String,
    records: js.Array[Record[String, _]],
    query: Record[String, _],
    invalidateCache: Boolean
  ): Unit = js.native
  def receiveEntityRecords(kind: String, name: String, records: Record[String, _]): Unit = js.native
  def receiveEntityRecords(kind: String, name: String, records: Record[String, _], query: Record[String, _]): Unit = js.native
  def receiveEntityRecords(
    kind: String,
    name: String,
    records: Record[String, _],
    query: Record[String, _],
    invalidateCache: Boolean
  ): Unit = js.native
  def receiveThemeSupports(themeSupports: Anon_Formats): Unit = js.native
  def receiveUploadPermissions(hasUploadPermissions: Boolean): Unit = js.native
  def receiveUserPermission(key: String, isAllowed: Boolean): Unit = js.native
  @JSName("receiveUserQuery")
  def receiveUserQuery_view(queryID: String, users: js.Array[User[view]]): Unit = js.native
  @JSName("receiveUserQuery")
  def receiveUserQuery_view(queryID: String, users: User[view]): Unit = js.native
  def saveEntityRecord(kind: String, name: String, record: Record[String, _]): IterableIterator[Unit] = js.native
}

