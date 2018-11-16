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
  
  val defaultQuery: defaultQuery with java.lang.String = js.native
  val groupByAlbum: groupByAlbum with java.lang.String = js.native
  val groupByAlbumArtist: groupByAlbumArtist with java.lang.String = js.native
  val groupByArtist: groupByArtist with java.lang.String = js.native
  val groupByAuthor: groupByAuthor with java.lang.String = js.native
  val groupByComposer: groupByComposer with java.lang.String = js.native
  val groupByGenre: groupByGenre with java.lang.String = js.native
  val groupByMonth: groupByMonth with java.lang.String = js.native
  val groupByPublishedYear: groupByPublishedYear with java.lang.String = js.native
  val groupByRating: groupByRating with java.lang.String = js.native
  val groupByTag: groupByTag with java.lang.String = js.native
  val groupByType: groupByType with java.lang.String = js.native
  val groupByYear: groupByYear with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.StorageNs.SearchNs.CommonFolderQuery with java.lang.String] = js.native
}

