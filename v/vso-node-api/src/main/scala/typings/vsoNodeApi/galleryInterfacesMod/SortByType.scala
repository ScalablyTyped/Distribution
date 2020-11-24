package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SortByType extends js.Object
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "SortByType")
@js.native
object SortByType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SortByType with Double] = js.native
  
  /**
    * The results will be sorted as per Author defined in the VSix/Metadata. If not defined, publisher name is used This is specifically needed by VS IDE, other (new and old) clients are not encouraged to use this
    */
  @js.native
  sealed trait Author extends SortByType
  /* 11 */ @js.native
  object Author extends TopLevel[Author with Double]
  
  /**
    * The results will be sorted as per Average ratings of the extensions
    */
  @js.native
  sealed trait AverageRating extends SortByType
  /* 6 */ @js.native
  object AverageRating extends TopLevel[AverageRating with Double]
  
  /**
    * Results will be sorted by Install Count
    */
  @js.native
  sealed trait InstallCount extends SortByType
  /* 4 */ @js.native
  object InstallCount extends TopLevel[InstallCount with Double]
  
  /**
    * The results will be sorted as per Last Updated date of the extensions with recently updated at the top
    */
  @js.native
  sealed trait LastUpdatedDate extends SortByType
  /* 1 */ @js.native
  object LastUpdatedDate extends TopLevel[LastUpdatedDate with Double]
  
  /**
    * The results will be sorted as per Published date of the extensions
    */
  @js.native
  sealed trait PublishedDate extends SortByType
  /* 5 */ @js.native
  object PublishedDate extends TopLevel[PublishedDate with Double]
  
  /**
    * Results will be sorted Alphabetically as per Publisher title
    */
  @js.native
  sealed trait Publisher extends SortByType
  /* 3 */ @js.native
  object Publisher
    extends TopLevel[typings.vsoNodeApi.galleryInterfacesMod.SortByType.Publisher with Double]
  
  /**
    * The results will be sorted as per ReleaseDate of the extensions (date on which the extension first went public)
    */
  @js.native
  sealed trait ReleaseDate extends SortByType
  /* 10 */ @js.native
  object ReleaseDate extends TopLevel[ReleaseDate with Double]
  
  /**
    * The results will be sorted by relevance in case search query is given, if no search query resutls will be provided as is
    */
  @js.native
  sealed trait Relevance extends SortByType
  /* 0 */ @js.native
  object Relevance extends TopLevel[Relevance with Double]
  
  /**
    * Results will be sorted Alphabetically as per the title of the extension
    */
  @js.native
  sealed trait Title extends SortByType
  /* 2 */ @js.native
  object Title extends TopLevel[Title with Double]
  
  /**
    * The results will be sorted as per Trending Daily Score of the extensions
    */
  @js.native
  sealed trait TrendingDaily extends SortByType
  /* 7 */ @js.native
  object TrendingDaily extends TopLevel[TrendingDaily with Double]
  
  /**
    * The results will be sorted as per Trending monthly Score of the extensions
    */
  @js.native
  sealed trait TrendingMonthly extends SortByType
  /* 9 */ @js.native
  object TrendingMonthly extends TopLevel[TrendingMonthly with Double]
  
  /**
    * The results will be sorted as per Trending weekly Score of the extensions
    */
  @js.native
  sealed trait TrendingWeekly extends SortByType
  /* 8 */ @js.native
  object TrendingWeekly extends TopLevel[TrendingWeekly with Double]
  
  /**
    * The results will be sorted as per Weighted Rating of the extension.
    */
  @js.native
  sealed trait WeightedRating extends SortByType
  /* 12 */ @js.native
  object WeightedRating extends TopLevel[WeightedRating with Double]
}
