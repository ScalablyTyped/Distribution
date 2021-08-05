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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsMod {
  
  @JSImport("@wordpress/core-data/actions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addEntities(entities: js.Array[Entity]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEntities")(entities.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def receiveAutosaves(postId: Double, autosaves: js.Array[Autosave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("receiveAutosaves")(postId.asInstanceOf[js.Any], autosaves.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def receiveAutosaves(postId: Double, autosaves: Autosave): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("receiveAutosaves")(postId.asInstanceOf[js.Any], autosaves.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def receiveCurrentUser_view(currentUser: User[view]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("receiveCurrentUser")(currentUser.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def receiveEmbedPreview(url: String, preview: Record[String, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("receiveEmbedPreview")(url.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def receiveEntityRecords(kind: String, name: String, records: js.Array[Record[String, js.Any]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("receiveEntityRecords")(kind.asInstanceOf[js.Any], name.asInstanceOf[js.Any], records.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def receiveEntityRecords(
    kind: String,
    name: String,
    records: js.Array[Record[String, js.Any]],
    query: Unit,
    invalidateCache: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("receiveEntityRecords")(kind.asInstanceOf[js.Any], name.asInstanceOf[js.Any], records.asInstanceOf[js.Any], query.asInstanceOf[js.Any], invalidateCache.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def receiveEntityRecords(
    kind: String,
    name: String,
    records: js.Array[Record[String, js.Any]],
    query: Record[String, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("receiveEntityRecords")(kind.asInstanceOf[js.Any], name.asInstanceOf[js.Any], records.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def receiveEntityRecords(
    kind: String,
    name: String,
    records: js.Array[Record[String, js.Any]],
    query: Record[String, js.Any],
    invalidateCache: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("receiveEntityRecords")(kind.asInstanceOf[js.Any], name.asInstanceOf[js.Any], records.asInstanceOf[js.Any], query.asInstanceOf[js.Any], invalidateCache.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def receiveEntityRecords(kind: String, name: String, records: Record[String, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("receiveEntityRecords")(kind.asInstanceOf[js.Any], name.asInstanceOf[js.Any], records.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def receiveEntityRecords(kind: String, name: String, records: Record[String, js.Any], query: Unit, invalidateCache: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("receiveEntityRecords")(kind.asInstanceOf[js.Any], name.asInstanceOf[js.Any], records.asInstanceOf[js.Any], query.asInstanceOf[js.Any], invalidateCache.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def receiveEntityRecords(kind: String, name: String, records: Record[String, js.Any], query: Record[String, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("receiveEntityRecords")(kind.asInstanceOf[js.Any], name.asInstanceOf[js.Any], records.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def receiveEntityRecords(
    kind: String,
    name: String,
    records: Record[String, js.Any],
    query: Record[String, js.Any],
    invalidateCache: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("receiveEntityRecords")(kind.asInstanceOf[js.Any], name.asInstanceOf[js.Any], records.asInstanceOf[js.Any], query.asInstanceOf[js.Any], invalidateCache.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def receiveThemeSupports(themeSupports: Formats): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("receiveThemeSupports")(themeSupports.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def receiveUploadPermissions(hasUploadPermissions: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("receiveUploadPermissions")(hasUploadPermissions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def receiveUserPermission(key: String, isAllowed: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("receiveUserPermission")(key.asInstanceOf[js.Any], isAllowed.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def receiveUserQuery_view(queryID: String, users: js.Array[User[view]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("receiveUserQuery")(queryID.asInstanceOf[js.Any], users.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def receiveUserQuery_view(queryID: String, users: User[view]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("receiveUserQuery")(queryID.asInstanceOf[js.Any], users.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def saveEntityRecord(kind: String, name: String, record: Record[String, js.Any]): IterableIterator[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("saveEntityRecord")(kind.asInstanceOf[js.Any], name.asInstanceOf[js.Any], record.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Unit]]
}
