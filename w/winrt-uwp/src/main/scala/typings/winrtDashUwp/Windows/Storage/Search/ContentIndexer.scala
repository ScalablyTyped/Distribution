package typings.winrtDashUwp.Windows.Storage.Search

import typings.winrtDashUwp.Windows.Foundation.Collections.IIterable
import typings.winrtDashUwp.Windows.Foundation.Collections.IMapView
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables Windows Store apps to place content properties in the system index. */
@JSGlobal("Windows.Storage.Search.ContentIndexer")
@js.native
abstract class ContentIndexer () extends js.Object {
  /** Gets the version of the ContentIndexer . */
  var revision: Double = js.native
  /**
    * Adds app-defined items with properties and content to the system index.
    * @param indexableContent The content properties to index.
    */
  def addAsync(indexableContent: IIndexableContent): js.Any = js.native
  /**
    * Builds a query with the specified search filter and identifies which properties to retrieve.
    * @param searchFilter The AQS filter to apply.
    * @param propertiesToRetrieve The properties to retrieve, specified by their Windows canonical property names.
    * @return The query.
    */
  def createQuery(searchFilter: String, propertiesToRetrieve: IIterable[String]): ContentIndexerQuery = js.native
   /* unmapped return type */ /**
    * Builds a query with the specified search filter, sort order, and identifies which properties to retrieve.
    * @param searchFilter The AQS filter.
    * @param propertiesToRetrieve The properties to retrieve, specified by their Windows canonical property names.
    * @param sortOrder The sort order for the filtered results.
    * @return The query.
    */
  def createQuery(searchFilter: String, propertiesToRetrieve: IIterable[String], sortOrder: IIterable[SortEntry]): ContentIndexerQuery = js.native
  /**
    * Builds a query with the specified search filter, sort order, filter language, and identifies which properties to retrieve.
    * @param searchFilter The AQS filter to apply.
    * @param propertiesToRetrieve The properties to retrieve, specified by their Windows canonical property names.
    * @param sortOrder The sort order for the filtered results.
    * @param searchFilterLanguage The language that's used to parse AQS, specified as a BCP-47 language tag.
    * @return The query.
    */
  def createQuery(
    searchFilter: String,
    propertiesToRetrieve: IIterable[String],
    sortOrder: IIterable[SortEntry],
    searchFilterLanguage: String
  ): ContentIndexerQuery = js.native
  /**
    * Removes all app-defined items from the ContentIndexer .
    */
  def deleteAllAsync(): js.Any = js.native
   /* unmapped return type */ /**
    * Removes the specified app-defined item from the ContentIndexer .
    * @param contentId The identifier of the item to remove.
    */
  def deleteAsync(contentId: String): js.Any = js.native
   /* unmapped return type */ /**
    * Removes the specified app-defined items from the ContentIndexer .
    * @param contentIds The identifier of the item to remove.
    */
  def deleteMultipleAsync(contentIds: IIterable[String]): js.Any = js.native
   /* unmapped return type */ /**
    * Gets content properties based on the given content identifier.
    * @param contentId The identifier for the content properties.
    * @param propertiesToRetrieve The retrieved properties, based on contentId.
    * @return When this method completes, it returns the retrieved properties as a map of key-value pairs.
    */
  def retrievePropertiesAsync(contentId: String, propertiesToRetrieve: IIterable[String]): IPromiseWithIAsyncOperation[IMapView[_, _]] = js.native
  /**
    * Updates app content and properties in the ContentIndexer .
    * @param indexableContent The content properties to update.
    */
  def updateAsync(indexableContent: IIndexableContent): js.Any = js.native
}

/* static members */
@JSGlobal("Windows.Storage.Search.ContentIndexer")
@js.native
object ContentIndexer extends js.Object {
  /**
    * Gets an existing per-app index or creates a new one, if necessary.
    * @return The index.
    */
  def getIndexer(): ContentIndexer = js.native
  /**
    * Gets the per-app index with the specified name or creates a new one, if necessary.
    * @param indexName The index name.
    * @return The index.
    */
  def getIndexer(indexName: String): ContentIndexer = js.native
}

