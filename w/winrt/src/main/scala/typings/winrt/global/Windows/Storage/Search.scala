package typings.winrt.global.Windows.Storage

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions
import typings.winrt.Windows.Storage.FileProperties.ThumbnailMode
import typings.winrt.Windows.Storage.FileProperties.ThumbnailOptions
import typings.winrt.Windows.Storage.Search.CommonFileQuery
import typings.winrt.Windows.Storage.Search.CommonFolderQuery
import typings.winrt.Windows.Storage.Search.DateStackOption
import typings.winrt.Windows.Storage.Search.FolderDepth
import typings.winrt.Windows.Storage.Search.IndexerOption
import typings.winrt.Windows.Storage.Search.SortEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Search")
@js.native
object Search extends js.Object {
  @js.native
  class QueryOptions ()
    extends typings.winrt.Windows.Storage.Search.QueryOptions {
    def this(query: CommonFolderQuery) = this()
    def this(query: CommonFileQuery, fileTypeFilter: IIterable[String]) = this()
    /* CompleteClass */
    override var applicationSearchFilter: String = js.native
    /* CompleteClass */
    override var dateStackOption: DateStackOption = js.native
    /* CompleteClass */
    override var fileTypeFilter: IVector[String] = js.native
    /* CompleteClass */
    override var folderDepth: FolderDepth = js.native
    /* CompleteClass */
    override var groupPropertyName: String = js.native
    /* CompleteClass */
    override var indexerOption: IndexerOption = js.native
    /* CompleteClass */
    override var language: String = js.native
    /* CompleteClass */
    override var sortOrder: IVector[SortEntry] = js.native
    /* CompleteClass */
    override var userSearchFilter: String = js.native
    /* CompleteClass */
    override def loadFromString(value: String): Unit = js.native
    /* CompleteClass */
    override def saveToString(): String = js.native
    /* CompleteClass */
    override def setPropertyPrefetch(options: PropertyPrefetchOptions, propertiesToRetrieve: IIterable[String]): Unit = js.native
    /* CompleteClass */
    override def setThumbnailPrefetch(mode: ThumbnailMode, requestedSize: Double, options: ThumbnailOptions): Unit = js.native
  }
  
  @js.native
  class SortEntryVector ()
    extends typings.winrt.Windows.Storage.Search.SortEntryVector {
    /* CompleteClass */
    override def first(): IIterator[SortEntry] = js.native
  }
  
  @js.native
  class StorageFileQueryResult ()
    extends typings.winrt.Windows.Storage.Search.StorageFileQueryResult {
    /* CompleteClass */
    override var folder: typings.winrt.Windows.Storage.StorageFolder = js.native
    /* CompleteClass */
    override var oncontentschanged: js.Any = js.native
    /* CompleteClass */
    override var onoptionschanged: js.Any = js.native
    /* CompleteClass */
    override def applyNewQueryOptions(newQueryOptions: typings.winrt.Windows.Storage.Search.QueryOptions): Unit = js.native
    /* CompleteClass */
    override def findStartIndexAsync(value: js.Any): IAsyncOperation[Double] = js.native
    /* CompleteClass */
    override def getCurrentQueryOptions(): typings.winrt.Windows.Storage.Search.QueryOptions = js.native
    /* CompleteClass */
    override def getItemCountAsync(): IAsyncOperation[Double] = js.native
  }
  
  @js.native
  class StorageFolderQueryResult ()
    extends typings.winrt.Windows.Storage.Search.StorageFolderQueryResult {
    /* CompleteClass */
    override var folder: typings.winrt.Windows.Storage.StorageFolder = js.native
    /* CompleteClass */
    override var oncontentschanged: js.Any = js.native
    /* CompleteClass */
    override var onoptionschanged: js.Any = js.native
    /* CompleteClass */
    override def applyNewQueryOptions(newQueryOptions: typings.winrt.Windows.Storage.Search.QueryOptions): Unit = js.native
    /* CompleteClass */
    override def findStartIndexAsync(value: js.Any): IAsyncOperation[Double] = js.native
    /* CompleteClass */
    override def getCurrentQueryOptions(): typings.winrt.Windows.Storage.Search.QueryOptions = js.native
    /* CompleteClass */
    override def getItemCountAsync(): IAsyncOperation[Double] = js.native
  }
  
  @js.native
  class StorageItemQueryResult ()
    extends typings.winrt.Windows.Storage.Search.StorageItemQueryResult {
    /* CompleteClass */
    override var folder: typings.winrt.Windows.Storage.StorageFolder = js.native
    /* CompleteClass */
    override var oncontentschanged: js.Any = js.native
    /* CompleteClass */
    override var onoptionschanged: js.Any = js.native
    /* CompleteClass */
    override def applyNewQueryOptions(newQueryOptions: typings.winrt.Windows.Storage.Search.QueryOptions): Unit = js.native
    /* CompleteClass */
    override def findStartIndexAsync(value: js.Any): IAsyncOperation[Double] = js.native
    /* CompleteClass */
    override def getCurrentQueryOptions(): typings.winrt.Windows.Storage.Search.QueryOptions = js.native
    /* CompleteClass */
    override def getItemCountAsync(): IAsyncOperation[Double] = js.native
  }
  
  @js.native
  object CommonFileQuery extends js.Object {
    /* 0 */ val defaultQuery: typings.winrt.Windows.Storage.Search.CommonFileQuery.defaultQuery with Double = js.native
    /* 5 */ val orderByDate: typings.winrt.Windows.Storage.Search.CommonFileQuery.orderByDate with Double = js.native
    /* 3 */ val orderByMusicProperties: typings.winrt.Windows.Storage.Search.CommonFileQuery.orderByMusicProperties with Double = js.native
    /* 1 */ val orderByName: typings.winrt.Windows.Storage.Search.CommonFileQuery.orderByName with Double = js.native
    /* 4 */ val orderBySearchRank: typings.winrt.Windows.Storage.Search.CommonFileQuery.orderBySearchRank with Double = js.native
    /* 2 */ val orderByTitle: typings.winrt.Windows.Storage.Search.CommonFileQuery.orderByTitle with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Search.CommonFileQuery with Double] = js.native
  }
  
  @js.native
  object CommonFolderQuery extends js.Object {
    /* 0 */ val defaultQuery: typings.winrt.Windows.Storage.Search.CommonFolderQuery.defaultQuery with Double = js.native
    /* 4 */ val groupByAlbum: typings.winrt.Windows.Storage.Search.CommonFolderQuery.groupByAlbum with Double = js.native
    /* 5 */ val groupByAlbumArtist: typings.winrt.Windows.Storage.Search.CommonFolderQuery.groupByAlbumArtist with Double = js.native
    /* 3 */ val groupByArtist: typings.winrt.Windows.Storage.Search.CommonFolderQuery.groupByArtist with Double = js.native
    /* 11 */ val groupByAuthor: typings.winrt.Windows.Storage.Search.CommonFolderQuery.groupByAuthor with Double = js.native
    /* 6 */ val groupByComposer: typings.winrt.Windows.Storage.Search.CommonFolderQuery.groupByComposer with Double = js.native
    /* 7 */ val groupByGenre: typings.winrt.Windows.Storage.Search.CommonFolderQuery.groupByGenre with Double = js.native
    /* 2 */ val groupByMonth: typings.winrt.Windows.Storage.Search.CommonFolderQuery.groupByMonth with Double = js.native
    /* 8 */ val groupByPublishedYear: typings.winrt.Windows.Storage.Search.CommonFolderQuery.groupByPublishedYear with Double = js.native
    /* 9 */ val groupByRating: typings.winrt.Windows.Storage.Search.CommonFolderQuery.groupByRating with Double = js.native
    /* 10 */ val groupByTag: typings.winrt.Windows.Storage.Search.CommonFolderQuery.groupByTag with Double = js.native
    /* 12 */ val groupByType: typings.winrt.Windows.Storage.Search.CommonFolderQuery.groupByType with Double = js.native
    /* 1 */ val groupByYear: typings.winrt.Windows.Storage.Search.CommonFolderQuery.groupByYear with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Search.CommonFolderQuery with Double] = js.native
  }
  
  @js.native
  object DateStackOption extends js.Object {
    /* 2 */ val month: typings.winrt.Windows.Storage.Search.DateStackOption.month with Double = js.native
    /* 0 */ val none: typings.winrt.Windows.Storage.Search.DateStackOption.none with Double = js.native
    /* 1 */ val year: typings.winrt.Windows.Storage.Search.DateStackOption.year with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Search.DateStackOption with Double] = js.native
  }
  
  @js.native
  object FolderDepth extends js.Object {
    /* 1 */ val deep: typings.winrt.Windows.Storage.Search.FolderDepth.deep with Double = js.native
    /* 0 */ val shallow: typings.winrt.Windows.Storage.Search.FolderDepth.shallow with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Search.FolderDepth with Double] = js.native
  }
  
  @js.native
  object IndexedState extends js.Object {
    /* 3 */ val fullyIndexed: typings.winrt.Windows.Storage.Search.IndexedState.fullyIndexed with Double = js.native
    /* 1 */ val notIndexed: typings.winrt.Windows.Storage.Search.IndexedState.notIndexed with Double = js.native
    /* 2 */ val partiallyIndexed: typings.winrt.Windows.Storage.Search.IndexedState.partiallyIndexed with Double = js.native
    /* 0 */ val unknown: typings.winrt.Windows.Storage.Search.IndexedState.unknown with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Search.IndexedState with Double] = js.native
  }
  
  @js.native
  object IndexerOption extends js.Object {
    /* 2 */ val doNotUseIndexer: typings.winrt.Windows.Storage.Search.IndexerOption.doNotUseIndexer with Double = js.native
    /* 1 */ val onlyUseIndexer: typings.winrt.Windows.Storage.Search.IndexerOption.onlyUseIndexer with Double = js.native
    /* 0 */ val useIndexerWhenAvailable: typings.winrt.Windows.Storage.Search.IndexerOption.useIndexerWhenAvailable with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Search.IndexerOption with Double] = js.native
  }
  
}

