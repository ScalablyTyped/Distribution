package typings.winrtUwp.Windows.Storage.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CommonFolderQuery extends StObject
/** Specifies how to group files into folders in the query results and determines whether the query is shallow or deep. Query results for deep queries include all files in all of the subfolders of the current folder, grouped into folders according to the specified option. */
@JSGlobal("Windows.Storage.Search.CommonFolderQuery")
@js.native
object CommonFolderQuery extends StObject {
  
  /** A shallow list of the folders in the current folder, similar to the view that File Explorer provides. */
  @js.native
  sealed trait defaultQuery extends CommonFolderQuery
  
  /** Group files into virtual folders by year based on the System.Music.AlbumTitle property of each file. Each folder will contain all (and only) files with identical values for System.Music.AlbumTitle. */
  @js.native
  sealed trait groupByAlbum extends CommonFolderQuery
  
  /** Group files into virtual folders based on the System.Music.AlbumArtist property of each file. Each folder will contain all (and only) files with identical values for System.Music.AlbumArtist. */
  @js.native
  sealed trait groupByAlbumArtist extends CommonFolderQuery
  
  /** Group files into virtual folders based on the System.Music.Artistproperty of each file. Each folder will contain all (and only) files with identical values for System.Music.Artist. */
  @js.native
  sealed trait groupByArtist extends CommonFolderQuery
  
  /** Group files into virtual folders based on the System.Author property of each file. Each folder will represent one author, and contain all files whose System.Author vector contains that author. If a file lists multiple authors, it may appear in more than one of the resulting folders. */
  @js.native
  sealed trait groupByAuthor extends CommonFolderQuery
  
  /** Group files into virtual folders based on the System.Music.Composer property of each file. Each folder will represent one composer, and contain all files whose System.Music.Composer vector contains that composer. If a file lists multiple composers, it may appear in more than one of the resulting folders. */
  @js.native
  sealed trait groupByComposer extends CommonFolderQuery
  
  /** Group files into virtual folders based on the System.Music.Genre property of each file. Each folder will contain all (and only) files with identical values for System.Music.Genre. */
  @js.native
  sealed trait groupByGenre extends CommonFolderQuery
  
  /** Group files into virtual folders by month based on the System.ItemDate property of each file. Each folder will contain all (and only) files that have values for System.ItemDate within the same month. */
  @js.native
  sealed trait groupByMonth extends CommonFolderQuery
  
  /** Group files into virtual folders by year based on the System.Media.Year property of each file. Each folder will contain all (and only) files that have values for System.Media.Year within the same year. */
  @js.native
  sealed trait groupByPublishedYear extends CommonFolderQuery
  
  /** Group files into virtual folders by rating (1 star, 2 stars, and so on) based on the System.Rating property of each file. Each folder will contain all (and only) files with identical values for System.Rating. */
  @js.native
  sealed trait groupByRating extends CommonFolderQuery
  
  /** Group files into virtual folders based on the System.Keywords property of each file. Each folder will represent one tag, and contain all files whose System.Keywords vector contains that tag. If a file lists multiple tags in its System.Keywords vector, it may appear in more than one of the resulting folders. */
  @js.native
  sealed trait groupByTag extends CommonFolderQuery
  
  /** Group files into virtual folders by type (for example, Word documents, text files, and so forth) based on the System.ItemTypeText property of each file. */
  @js.native
  sealed trait groupByType extends CommonFolderQuery
  
  /** Group files into virtual folders by year based on the System.ItemDate property of each file. Each folder will contain all (and only) files that have values for System.ItemDate within the same year. */
  @js.native
  sealed trait groupByYear extends CommonFolderQuery
}
