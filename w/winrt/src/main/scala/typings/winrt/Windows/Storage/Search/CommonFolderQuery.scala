package typings.winrt.Windows.Storage.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CommonFolderQuery extends js.Object

@JSGlobal("Windows.Storage.Search.CommonFolderQuery")
@js.native
object CommonFolderQuery extends js.Object {
  @js.native
  sealed trait defaultQuery extends CommonFolderQuery
  
  @js.native
  sealed trait groupByAlbum extends CommonFolderQuery
  
  @js.native
  sealed trait groupByAlbumArtist extends CommonFolderQuery
  
  @js.native
  sealed trait groupByArtist extends CommonFolderQuery
  
  @js.native
  sealed trait groupByAuthor extends CommonFolderQuery
  
  @js.native
  sealed trait groupByComposer extends CommonFolderQuery
  
  @js.native
  sealed trait groupByGenre extends CommonFolderQuery
  
  @js.native
  sealed trait groupByMonth extends CommonFolderQuery
  
  @js.native
  sealed trait groupByPublishedYear extends CommonFolderQuery
  
  @js.native
  sealed trait groupByRating extends CommonFolderQuery
  
  @js.native
  sealed trait groupByTag extends CommonFolderQuery
  
  @js.native
  sealed trait groupByType extends CommonFolderQuery
  
  @js.native
  sealed trait groupByYear extends CommonFolderQuery
  
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
  def apply(value: Double): js.UndefOr[CommonFolderQuery with Double] = js.native
}

