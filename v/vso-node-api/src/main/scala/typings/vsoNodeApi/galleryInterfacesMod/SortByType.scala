package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SortByType extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "SortByType")
@js.native
object SortByType extends js.Object {
  /**
    * The results will be sorted as per Author defined in the VSix/Metadata. If not defined, publisher name is used This is specifically needed by VS IDE, other (new and old) clients are not encouraged to use this
    */
  @js.native
  sealed trait Author extends SortByType
  
  /**
    * The results will be sorted as per Average ratings of the extensions
    */
  @js.native
  sealed trait AverageRating extends SortByType
  
  /**
    * Results will be sorted by Install Count
    */
  @js.native
  sealed trait InstallCount extends SortByType
  
  /**
    * The results will be sorted as per Last Updated date of the extensions with recently updated at the top
    */
  @js.native
  sealed trait LastUpdatedDate extends SortByType
  
  /**
    * The results will be sorted as per Published date of the extensions
    */
  @js.native
  sealed trait PublishedDate extends SortByType
  
  /**
    * Results will be sorted Alphabetically as per Publisher title
    */
  @js.native
  sealed trait Publisher extends SortByType
  
  /**
    * The results will be sorted as per ReleaseDate of the extensions (date on which the extension first went public)
    */
  @js.native
  sealed trait ReleaseDate extends SortByType
  
  /**
    * The results will be sorted by relevance in case search query is given, if no search query resutls will be provided as is
    */
  @js.native
  sealed trait Relevance extends SortByType
  
  /**
    * Results will be sorted Alphabetically as per the title of the extension
    */
  @js.native
  sealed trait Title extends SortByType
  
  /**
    * The results will be sorted as per Trending Daily Score of the extensions
    */
  @js.native
  sealed trait TrendingDaily extends SortByType
  
  /**
    * The results will be sorted as per Trending monthly Score of the extensions
    */
  @js.native
  sealed trait TrendingMonthly extends SortByType
  
  /**
    * The results will be sorted as per Trending weekly Score of the extensions
    */
  @js.native
  sealed trait TrendingWeekly extends SortByType
  
  /**
    * The results will be sorted as per Weighted Rating of the extension.
    */
  @js.native
  sealed trait WeightedRating extends SortByType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SortByType with Double] = js.native
  /* 11 */ @js.native
  object Author extends TopLevel[Author with Double]
  
  /* 6 */ @js.native
  object AverageRating extends TopLevel[AverageRating with Double]
  
  /* 4 */ @js.native
  object InstallCount extends TopLevel[InstallCount with Double]
  
  /* 1 */ @js.native
  object LastUpdatedDate extends TopLevel[LastUpdatedDate with Double]
  
  /* 5 */ @js.native
  object PublishedDate extends TopLevel[PublishedDate with Double]
  
  /* 3 */ @js.native
  object Publisher
    extends TopLevel[typings.vsoNodeApi.galleryInterfacesMod.SortByType.Publisher with Double]
  
  /* 10 */ @js.native
  object ReleaseDate extends TopLevel[ReleaseDate with Double]
  
  /* 0 */ @js.native
  object Relevance extends TopLevel[Relevance with Double]
  
  /* 2 */ @js.native
  object Title extends TopLevel[Title with Double]
  
  /* 7 */ @js.native
  object TrendingDaily extends TopLevel[TrendingDaily with Double]
  
  /* 9 */ @js.native
  object TrendingMonthly extends TopLevel[TrendingMonthly with Double]
  
  /* 8 */ @js.native
  object TrendingWeekly extends TopLevel[TrendingWeekly with Double]
  
  /* 12 */ @js.native
  object WeightedRating extends TopLevel[WeightedRating with Double]
  
}

