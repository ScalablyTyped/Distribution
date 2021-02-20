package typings.winrt.global.Windows.Storage

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Storage.Search.CommonFileQuery
import typings.winrt.Windows.Storage.Search.CommonFolderQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Search {
  
  @JSGlobal("Windows.Storage.Search.CommonFileQuery")
  @js.native
  object CommonFileQuery extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Search.CommonFileQuery with Double] = js.native
    
    /* 0 */ val defaultQuery: typings.winrt.Windows.Storage.Search.CommonFileQuery.defaultQuery with Double = js.native
    
    /* 5 */ val orderByDate: typings.winrt.Windows.Storage.Search.CommonFileQuery.orderByDate with Double = js.native
    
    /* 3 */ val orderByMusicProperties: typings.winrt.Windows.Storage.Search.CommonFileQuery.orderByMusicProperties with Double = js.native
    
    /* 1 */ val orderByName: typings.winrt.Windows.Storage.Search.CommonFileQuery.orderByName with Double = js.native
    
    /* 4 */ val orderBySearchRank: typings.winrt.Windows.Storage.Search.CommonFileQuery.orderBySearchRank with Double = js.native
    
    /* 2 */ val orderByTitle: typings.winrt.Windows.Storage.Search.CommonFileQuery.orderByTitle with Double = js.native
  }
  
  @JSGlobal("Windows.Storage.Search.CommonFolderQuery")
  @js.native
  object CommonFolderQuery extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Search.CommonFolderQuery with Double] = js.native
    
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
  }
  
  @JSGlobal("Windows.Storage.Search.DateStackOption")
  @js.native
  object DateStackOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Search.DateStackOption with Double] = js.native
    
    /* 2 */ val month: typings.winrt.Windows.Storage.Search.DateStackOption.month with Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Storage.Search.DateStackOption.none with Double = js.native
    
    /* 1 */ val year: typings.winrt.Windows.Storage.Search.DateStackOption.year with Double = js.native
  }
  
  @JSGlobal("Windows.Storage.Search.FolderDepth")
  @js.native
  object FolderDepth extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Search.FolderDepth with Double] = js.native
    
    /* 1 */ val deep: typings.winrt.Windows.Storage.Search.FolderDepth.deep with Double = js.native
    
    /* 0 */ val shallow: typings.winrt.Windows.Storage.Search.FolderDepth.shallow with Double = js.native
  }
  
  @JSGlobal("Windows.Storage.Search.IndexedState")
  @js.native
  object IndexedState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Search.IndexedState with Double] = js.native
    
    /* 3 */ val fullyIndexed: typings.winrt.Windows.Storage.Search.IndexedState.fullyIndexed with Double = js.native
    
    /* 1 */ val notIndexed: typings.winrt.Windows.Storage.Search.IndexedState.notIndexed with Double = js.native
    
    /* 2 */ val partiallyIndexed: typings.winrt.Windows.Storage.Search.IndexedState.partiallyIndexed with Double = js.native
    
    /* 0 */ val unknown: typings.winrt.Windows.Storage.Search.IndexedState.unknown with Double = js.native
  }
  
  @JSGlobal("Windows.Storage.Search.IndexerOption")
  @js.native
  object IndexerOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Search.IndexerOption with Double] = js.native
    
    /* 2 */ val doNotUseIndexer: typings.winrt.Windows.Storage.Search.IndexerOption.doNotUseIndexer with Double = js.native
    
    /* 1 */ val onlyUseIndexer: typings.winrt.Windows.Storage.Search.IndexerOption.onlyUseIndexer with Double = js.native
    
    /* 0 */ val useIndexerWhenAvailable: typings.winrt.Windows.Storage.Search.IndexerOption.useIndexerWhenAvailable with Double = js.native
  }
  
  @JSGlobal("Windows.Storage.Search.QueryOptions")
  @js.native
  class QueryOptions ()
    extends typings.winrt.Windows.Storage.Search.QueryOptions {
    def this(query: CommonFolderQuery) = this()
    def this(query: CommonFileQuery, fileTypeFilter: IIterable[String]) = this()
  }
  
  @JSGlobal("Windows.Storage.Search.SortEntryVector")
  @js.native
  class SortEntryVector ()
    extends typings.winrt.Windows.Storage.Search.SortEntryVector
  
  @JSGlobal("Windows.Storage.Search.StorageFileQueryResult")
  @js.native
  class StorageFileQueryResult ()
    extends typings.winrt.Windows.Storage.Search.StorageFileQueryResult
  
  @JSGlobal("Windows.Storage.Search.StorageFolderQueryResult")
  @js.native
  class StorageFolderQueryResult ()
    extends typings.winrt.Windows.Storage.Search.StorageFolderQueryResult
  
  @JSGlobal("Windows.Storage.Search.StorageItemQueryResult")
  @js.native
  class StorageItemQueryResult ()
    extends typings.winrt.Windows.Storage.Search.StorageItemQueryResult
}
