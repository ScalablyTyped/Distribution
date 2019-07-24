package typings
package atWordpressCoreDashDataLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/core-data/actions", JSImport.Namespace)
@js.native
object actionsMod extends js.Object {
  def addEntities(entities: js.Array[atWordpressCoreDashDataLib.atWordpressCoreDashDataMod.Entity]): scala.Unit = js.native
  def receiveAutosaves(postId: scala.Double, autosaves: atWordpressCoreDashDataLib.atWordpressCoreDashDataMod.Autosave): scala.Unit = js.native
  def receiveAutosaves(
    postId: scala.Double,
    autosaves: js.Array[atWordpressCoreDashDataLib.atWordpressCoreDashDataMod.Autosave]
  ): scala.Unit = js.native
  @JSName("receiveCurrentUser")
  def receiveCurrentUser_view(
    currentUser: atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.User[atWordpressCoreDashDataLib.atWordpressCoreDashDataLibStrings.view]
  ): scala.Unit = js.native
  def receiveEmbedPreview(url: java.lang.String, preview: stdLib.Record[java.lang.String, _]): scala.Unit = js.native
  def receiveEntityRecords(
    kind: java.lang.String,
    name: java.lang.String,
    records: js.Array[stdLib.Record[java.lang.String, _]]
  ): scala.Unit = js.native
  def receiveEntityRecords(
    kind: java.lang.String,
    name: java.lang.String,
    records: js.Array[stdLib.Record[java.lang.String, _]],
    query: stdLib.Record[java.lang.String, _]
  ): scala.Unit = js.native
  def receiveEntityRecords(
    kind: java.lang.String,
    name: java.lang.String,
    records: js.Array[stdLib.Record[java.lang.String, _]],
    query: stdLib.Record[java.lang.String, _],
    invalidateCache: scala.Boolean
  ): scala.Unit = js.native
  def receiveEntityRecords(kind: java.lang.String, name: java.lang.String, records: stdLib.Record[java.lang.String, _]): scala.Unit = js.native
  def receiveEntityRecords(
    kind: java.lang.String,
    name: java.lang.String,
    records: stdLib.Record[java.lang.String, _],
    query: stdLib.Record[java.lang.String, _]
  ): scala.Unit = js.native
  def receiveEntityRecords(
    kind: java.lang.String,
    name: java.lang.String,
    records: stdLib.Record[java.lang.String, _],
    query: stdLib.Record[java.lang.String, _],
    invalidateCache: scala.Boolean
  ): scala.Unit = js.native
  def receiveThemeSupports(themeSupports: atWordpressApiDashFetchLib.Anon_Formats): scala.Unit = js.native
  def receiveUploadPermissions(hasUploadPermissions: scala.Boolean): scala.Unit = js.native
  def receiveUserPermission(key: java.lang.String, isAllowed: scala.Boolean): scala.Unit = js.native
  @JSName("receiveUserQuery")
  def receiveUserQuery_view(
    queryID: java.lang.String,
    users: atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.User[atWordpressCoreDashDataLib.atWordpressCoreDashDataLibStrings.view]
  ): scala.Unit = js.native
  @JSName("receiveUserQuery")
  def receiveUserQuery_view(
    queryID: java.lang.String,
    users: js.Array[
      atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.User[atWordpressCoreDashDataLib.atWordpressCoreDashDataLibStrings.view]
    ]
  ): scala.Unit = js.native
  def saveEntityRecord(kind: java.lang.String, name: java.lang.String, record: stdLib.Record[java.lang.String, _]): stdLib.IterableIterator[scala.Unit] = js.native
}

