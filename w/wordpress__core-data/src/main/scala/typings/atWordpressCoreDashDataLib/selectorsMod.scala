package typings
package atWordpressCoreDashDataLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/core-data/selectors", JSImport.Namespace)
@js.native
object selectorsMod extends js.Object {
  @JSName("canUser")
  def canUser_create(
    action: atWordpressCoreDashDataLib.atWordpressCoreDashDataLibStrings.create,
    resource: java.lang.String,
    id: java.lang.String
  ): js.UndefOr[scala.Boolean] = js.native
  @JSName("canUser")
  def canUser_create(
    action: atWordpressCoreDashDataLib.atWordpressCoreDashDataLibStrings.create,
    resource: java.lang.String,
    id: scala.Double
  ): js.UndefOr[scala.Boolean] = js.native
  @JSName("canUser")
  def canUser_delete(
    action: atWordpressCoreDashDataLib.atWordpressCoreDashDataLibStrings.delete,
    resource: java.lang.String,
    id: java.lang.String
  ): js.UndefOr[scala.Boolean] = js.native
  @JSName("canUser")
  def canUser_delete(
    action: atWordpressCoreDashDataLib.atWordpressCoreDashDataLibStrings.delete,
    resource: java.lang.String,
    id: scala.Double
  ): js.UndefOr[scala.Boolean] = js.native
  @JSName("canUser")
  def canUser_read(
    action: atWordpressCoreDashDataLib.atWordpressCoreDashDataLibStrings.read,
    resource: java.lang.String,
    id: java.lang.String
  ): js.UndefOr[scala.Boolean] = js.native
  @JSName("canUser")
  def canUser_read(
    action: atWordpressCoreDashDataLib.atWordpressCoreDashDataLibStrings.read,
    resource: java.lang.String,
    id: scala.Double
  ): js.UndefOr[scala.Boolean] = js.native
  @JSName("canUser")
  def canUser_update(
    action: atWordpressCoreDashDataLib.atWordpressCoreDashDataLibStrings.update,
    resource: java.lang.String,
    id: java.lang.String
  ): js.UndefOr[scala.Boolean] = js.native
  @JSName("canUser")
  def canUser_update(
    action: atWordpressCoreDashDataLib.atWordpressCoreDashDataLibStrings.update,
    resource: java.lang.String,
    id: scala.Double
  ): js.UndefOr[scala.Boolean] = js.native
  def getAuthors(): js.Array[
    atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.User[atWordpressCoreDashDataLib.atWordpressCoreDashDataLibStrings.view]
  ] = js.native
  def getAutosave(postType: java.lang.String, postId: scala.Double, authorId: scala.Double): js.UndefOr[atWordpressCoreDashDataLib.atWordpressCoreDashDataMod.Autosave] = js.native
  def getAutosaves(postType: java.lang.String, postId: scala.Double): js.UndefOr[js.Array[atWordpressCoreDashDataLib.atWordpressCoreDashDataMod.Autosave]] = js.native
  def getCurrentUser(): atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.User[atWordpressCoreDashDataLib.atWordpressCoreDashDataLibStrings.view] = js.native
  def getEmbedPreview(url: java.lang.String): js.UndefOr[stdLib.Record[java.lang.String, _]] = js.native
  def getEntitiesByKind(kind: java.lang.String): js.Array[atWordpressCoreDashDataLib.atWordpressCoreDashDataMod.Entity] = js.native
  def getEntity(kind: java.lang.String, name: java.lang.String): js.UndefOr[atWordpressCoreDashDataLib.atWordpressCoreDashDataMod.Entity] = js.native
  def getEntityRecord(kind: java.lang.String, name: java.lang.String, key: scala.Double): js.UndefOr[stdLib.Record[java.lang.String, _]] = js.native
  def getEntityRecords(kind: java.lang.String, name: java.lang.String): js.Array[stdLib.Record[java.lang.String, _]] = js.native
  def getEntityRecords(kind: java.lang.String, name: java.lang.String, query: stdLib.Record[java.lang.String, _]): js.Array[stdLib.Record[java.lang.String, _]] = js.native
  def getThemeSupports(): stdLib.Partial[atWordpressApiDashFetchLib.Anon_Formats] = js.native
  def getUserQueryResults(queryId: java.lang.String): js.Array[
    atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.User[atWordpressCoreDashDataLib.atWordpressCoreDashDataLibStrings.view]
  ] = js.native
  def hasFetchedAutosaves(postType: java.lang.String, postId: scala.Double): scala.Boolean = js.native
  def hasUploadPermissions(): scala.Boolean = js.native
  def isPreviewEmbedFallback(url: java.lang.String): scala.Boolean = js.native
  def isRequestingEmbedPreview(url: java.lang.String): scala.Boolean = js.native
}

