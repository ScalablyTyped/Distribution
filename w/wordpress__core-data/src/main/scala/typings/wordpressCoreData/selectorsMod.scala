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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectorsMod {
  
  @JSImport("@wordpress/core-data/selectors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def canUser_create(action: create, resource: String, id: String): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("canUser")(action.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  inline def canUser_create(action: create, resource: String, id: Double): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("canUser")(action.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def canUser_delete(action: delete, resource: String, id: String): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("canUser")(action.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  inline def canUser_delete(action: delete, resource: String, id: Double): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("canUser")(action.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def canUser_read(action: read, resource: String, id: String): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("canUser")(action.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  inline def canUser_read(action: read, resource: String, id: Double): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("canUser")(action.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def canUser_update(action: update, resource: String, id: String): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("canUser")(action.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  inline def canUser_update(action: update, resource: String, id: Double): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("canUser")(action.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def getAuthors(): js.Array[User[view]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthors")().asInstanceOf[js.Array[User[view]]]
  
  inline def getAutosave(postType: String, postId: Double, authorId: Double): js.UndefOr[Autosave] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutosave")(postType.asInstanceOf[js.Any], postId.asInstanceOf[js.Any], authorId.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Autosave]]
  
  inline def getAutosaves(postType: String, postId: Double): js.UndefOr[js.Array[Autosave]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutosaves")(postType.asInstanceOf[js.Any], postId.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[Autosave]]]
  
  inline def getCurrentUser(): User[view] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentUser")().asInstanceOf[User[view]]
  
  inline def getEmbedPreview(url: String): js.UndefOr[Record[String, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEmbedPreview")(url.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Record[String, js.Any]]]
  
  inline def getEntitiesByKind(kind: String): js.Array[Entity] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEntitiesByKind")(kind.asInstanceOf[js.Any]).asInstanceOf[js.Array[Entity]]
  
  inline def getEntity(kind: String, name: String): js.UndefOr[Entity] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEntity")(kind.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Entity]]
  
  inline def getEntityRecord(kind: String, name: String, key: Double): js.UndefOr[Record[String, js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEntityRecord")(kind.asInstanceOf[js.Any], name.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Record[String, js.Any]]]
  
  inline def getEntityRecords(kind: String, name: String): js.Array[Record[String, js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEntityRecords")(kind.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[Record[String, js.Any]]]
  inline def getEntityRecords(kind: String, name: String, query: Record[String, js.Any]): js.Array[Record[String, js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEntityRecords")(kind.asInstanceOf[js.Any], name.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Array[Record[String, js.Any]]]
  
  inline def getThemeSupports(): Partial[Formats] = ^.asInstanceOf[js.Dynamic].applyDynamic("getThemeSupports")().asInstanceOf[Partial[Formats]]
  
  inline def getUserQueryResults(queryId: String): js.Array[User[view]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserQueryResults")(queryId.asInstanceOf[js.Any]).asInstanceOf[js.Array[User[view]]]
  
  inline def hasFetchedAutosaves(postType: String, postId: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasFetchedAutosaves")(postType.asInstanceOf[js.Any], postId.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hasUploadPermissions(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasUploadPermissions")().asInstanceOf[Boolean]
  
  inline def isPreviewEmbedFallback(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPreviewEmbedFallback")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRequestingEmbedPreview(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRequestingEmbedPreview")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
