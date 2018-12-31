package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

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
  sealed trait Author
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.SortByType
  
  /**
    * The results will be sorted as per Average ratings of the extensions
    */
  @js.native
  sealed trait AverageRating
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.SortByType
  
  /**
    * Results will be sorted by Install Count
    */
  @js.native
  sealed trait InstallCount
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.SortByType
  
  /**
    * The results will be sorted as per Last Updated date of the extensions with recently updated at the top
    */
  @js.native
  sealed trait LastUpdatedDate
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.SortByType
  
  /**
    * The results will be sorted as per Published date of the extensions
    */
  @js.native
  sealed trait PublishedDate
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.SortByType
  
  /**
    * Results will be sorted Alphabetically as per Publisher title
    */
  @js.native
  sealed trait Publisher
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.SortByType
  
  /**
    * The results will be sorted as per ReleaseDate of the extensions (date on which the extension first went public)
    */
  @js.native
  sealed trait ReleaseDate
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.SortByType
  
  /**
    * The results will be sorted by relevance in case search query is given, if no search query resutls will be provided as is
    */
  @js.native
  sealed trait Relevance
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.SortByType
  
  /**
    * Results will be sorted Alphabetically as per the title of the extension
    */
  @js.native
  sealed trait Title
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.SortByType
  
  /**
    * The results will be sorted as per Trending Daily Score of the extensions
    */
  @js.native
  sealed trait TrendingDaily
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.SortByType
  
  /**
    * The results will be sorted as per Trending monthly Score of the extensions
    */
  @js.native
  sealed trait TrendingMonthly
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.SortByType
  
  /**
    * The results will be sorted as per Trending weekly Score of the extensions
    */
  @js.native
  sealed trait TrendingWeekly
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.SortByType
  
  /**
    * The results will be sorted as per Weighted Rating of the extension.
    */
  @js.native
  sealed trait WeightedRating
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.SortByType
  
  /* 11 */ val Author: Author with scala.Double = js.native
  /* 6 */ val AverageRating: AverageRating with scala.Double = js.native
  /* 4 */ val InstallCount: InstallCount with scala.Double = js.native
  /* 1 */ val LastUpdatedDate: LastUpdatedDate with scala.Double = js.native
  /* 5 */ val PublishedDate: PublishedDate with scala.Double = js.native
  /* 3 */ val Publisher: Publisher with scala.Double = js.native
  /* 10 */ val ReleaseDate: ReleaseDate with scala.Double = js.native
  /* 0 */ val Relevance: Relevance with scala.Double = js.native
  /* 2 */ val Title: Title with scala.Double = js.native
  /* 7 */ val TrendingDaily: TrendingDaily with scala.Double = js.native
  /* 9 */ val TrendingMonthly: TrendingMonthly with scala.Double = js.native
  /* 8 */ val TrendingWeekly: TrendingWeekly with scala.Double = js.native
  /* 12 */ val WeightedRating: WeightedRating with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.SortByType with scala.Double
  ] = js.native
}

