package typings
package winrtLib.WindowsNs.StorageNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CommonFolderQuery extends js.Object

@JSGlobal("Windows.Storage.Search.CommonFolderQuery")
@js.native
object CommonFolderQuery extends js.Object {
  @js.native
  sealed trait defaultQuery
    extends winrtLib.WindowsNs.StorageNs.SearchNs.CommonFolderQuery
  
  @js.native
  sealed trait groupByAlbum
    extends winrtLib.WindowsNs.StorageNs.SearchNs.CommonFolderQuery
  
  @js.native
  sealed trait groupByAlbumArtist
    extends winrtLib.WindowsNs.StorageNs.SearchNs.CommonFolderQuery
  
  @js.native
  sealed trait groupByArtist
    extends winrtLib.WindowsNs.StorageNs.SearchNs.CommonFolderQuery
  
  @js.native
  sealed trait groupByAuthor
    extends winrtLib.WindowsNs.StorageNs.SearchNs.CommonFolderQuery
  
  @js.native
  sealed trait groupByComposer
    extends winrtLib.WindowsNs.StorageNs.SearchNs.CommonFolderQuery
  
  @js.native
  sealed trait groupByGenre
    extends winrtLib.WindowsNs.StorageNs.SearchNs.CommonFolderQuery
  
  @js.native
  sealed trait groupByMonth
    extends winrtLib.WindowsNs.StorageNs.SearchNs.CommonFolderQuery
  
  @js.native
  sealed trait groupByPublishedYear
    extends winrtLib.WindowsNs.StorageNs.SearchNs.CommonFolderQuery
  
  @js.native
  sealed trait groupByRating
    extends winrtLib.WindowsNs.StorageNs.SearchNs.CommonFolderQuery
  
  @js.native
  sealed trait groupByTag
    extends winrtLib.WindowsNs.StorageNs.SearchNs.CommonFolderQuery
  
  @js.native
  sealed trait groupByType
    extends winrtLib.WindowsNs.StorageNs.SearchNs.CommonFolderQuery
  
  @js.native
  sealed trait groupByYear
    extends winrtLib.WindowsNs.StorageNs.SearchNs.CommonFolderQuery
  
  /* 0 */ val defaultQuery: defaultQuery with scala.Double = js.native
  /* 4 */ val groupByAlbum: groupByAlbum with scala.Double = js.native
  /* 5 */ val groupByAlbumArtist: groupByAlbumArtist with scala.Double = js.native
  /* 3 */ val groupByArtist: groupByArtist with scala.Double = js.native
  /* 11 */ val groupByAuthor: groupByAuthor with scala.Double = js.native
  /* 6 */ val groupByComposer: groupByComposer with scala.Double = js.native
  /* 7 */ val groupByGenre: groupByGenre with scala.Double = js.native
  /* 2 */ val groupByMonth: groupByMonth with scala.Double = js.native
  /* 8 */ val groupByPublishedYear: groupByPublishedYear with scala.Double = js.native
  /* 9 */ val groupByRating: groupByRating with scala.Double = js.native
  /* 10 */ val groupByTag: groupByTag with scala.Double = js.native
  /* 12 */ val groupByType: groupByType with scala.Double = js.native
  /* 1 */ val groupByYear: groupByYear with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.StorageNs.SearchNs.CommonFolderQuery with scala.Double] = js.native
}

