package typings.wordpressCoreData

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectorsMod {
  
  @JSImport("@wordpress/core-data/selectors", "canUser")
  @js.native
  def canUser_create(action: create, resource: String, id: String): js.UndefOr[Boolean] = js.native
  @JSImport("@wordpress/core-data/selectors", "canUser")
  @js.native
  def canUser_create(action: create, resource: String, id: Double): js.UndefOr[Boolean] = js.native
  @JSImport("@wordpress/core-data/selectors", "canUser")
  @js.native
  def canUser_delete(action: delete, resource: String, id: String): js.UndefOr[Boolean] = js.native
  @JSImport("@wordpress/core-data/selectors", "canUser")
  @js.native
  def canUser_delete(action: delete, resource: String, id: Double): js.UndefOr[Boolean] = js.native
  @JSImport("@wordpress/core-data/selectors", "canUser")
  @js.native
  def canUser_read(action: read, resource: String, id: String): js.UndefOr[Boolean] = js.native
  @JSImport("@wordpress/core-data/selectors", "canUser")
  @js.native
  def canUser_read(action: read, resource: String, id: Double): js.UndefOr[Boolean] = js.native
  @JSImport("@wordpress/core-data/selectors", "canUser")
  @js.native
  def canUser_update(action: update, resource: String, id: String): js.UndefOr[Boolean] = js.native
  @JSImport("@wordpress/core-data/selectors", "canUser")
  @js.native
  def canUser_update(action: update, resource: String, id: Double): js.UndefOr[Boolean] = js.native
  
  @JSImport("@wordpress/core-data/selectors", "getAuthors")
  @js.native
  def getAuthors(): js.Array[User[view]] = js.native
  
  @JSImport("@wordpress/core-data/selectors", "getAutosave")
  @js.native
  def getAutosave(postType: String, postId: Double, authorId: Double): js.UndefOr[Autosave] = js.native
  
  @JSImport("@wordpress/core-data/selectors", "getAutosaves")
  @js.native
  def getAutosaves(postType: String, postId: Double): js.UndefOr[js.Array[Autosave]] = js.native
  
  @JSImport("@wordpress/core-data/selectors", "getCurrentUser")
  @js.native
  def getCurrentUser(): User[view] = js.native
  
  @JSImport("@wordpress/core-data/selectors", "getEmbedPreview")
  @js.native
  def getEmbedPreview(url: String): js.UndefOr[Record[String, _]] = js.native
  
  @JSImport("@wordpress/core-data/selectors", "getEntitiesByKind")
  @js.native
  def getEntitiesByKind(kind: String): js.Array[Entity] = js.native
  
  @JSImport("@wordpress/core-data/selectors", "getEntity")
  @js.native
  def getEntity(kind: String, name: String): js.UndefOr[Entity] = js.native
  
  @JSImport("@wordpress/core-data/selectors", "getEntityRecord")
  @js.native
  def getEntityRecord(kind: String, name: String, key: Double): js.UndefOr[Record[String, _]] = js.native
  
  @JSImport("@wordpress/core-data/selectors", "getEntityRecords")
  @js.native
  def getEntityRecords(kind: String, name: String): js.Array[Record[String, _]] = js.native
  @JSImport("@wordpress/core-data/selectors", "getEntityRecords")
  @js.native
  def getEntityRecords(kind: String, name: String, query: Record[String, _]): js.Array[Record[String, _]] = js.native
  
  @JSImport("@wordpress/core-data/selectors", "getThemeSupports")
  @js.native
  def getThemeSupports(): Partial[Formats] = js.native
  
  @JSImport("@wordpress/core-data/selectors", "getUserQueryResults")
  @js.native
  def getUserQueryResults(queryId: String): js.Array[User[view]] = js.native
  
  @JSImport("@wordpress/core-data/selectors", "hasFetchedAutosaves")
  @js.native
  def hasFetchedAutosaves(postType: String, postId: Double): Boolean = js.native
  
  @JSImport("@wordpress/core-data/selectors", "hasUploadPermissions")
  @js.native
  def hasUploadPermissions(): Boolean = js.native
  
  @JSImport("@wordpress/core-data/selectors", "isPreviewEmbedFallback")
  @js.native
  def isPreviewEmbedFallback(url: String): Boolean = js.native
  
  @JSImport("@wordpress/core-data/selectors", "isRequestingEmbedPreview")
  @js.native
  def isRequestingEmbedPreview(url: String): Boolean = js.native
}
