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
  
}

