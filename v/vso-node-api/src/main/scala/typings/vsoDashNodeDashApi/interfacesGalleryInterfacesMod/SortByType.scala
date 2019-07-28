package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

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
  
  /* 11 */ val Author: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.SortByType.Author with Double = js.native
  /* 6 */ val AverageRating: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.SortByType.AverageRating with Double = js.native
  /* 4 */ val InstallCount: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.SortByType.InstallCount with Double = js.native
  /* 1 */ val LastUpdatedDate: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.SortByType.LastUpdatedDate with Double = js.native
  /* 5 */ val PublishedDate: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.SortByType.PublishedDate with Double = js.native
  /* 3 */ val Publisher: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.SortByType.Publisher with Double = js.native
  /* 10 */ val ReleaseDate: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.SortByType.ReleaseDate with Double = js.native
  /* 0 */ val Relevance: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.SortByType.Relevance with Double = js.native
  /* 2 */ val Title: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.SortByType.Title with Double = js.native
  /* 7 */ val TrendingDaily: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.SortByType.TrendingDaily with Double = js.native
  /* 9 */ val TrendingMonthly: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.SortByType.TrendingMonthly with Double = js.native
  /* 8 */ val TrendingWeekly: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.SortByType.TrendingWeekly with Double = js.native
  /* 12 */ val WeightedRating: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.SortByType.WeightedRating with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SortByType with Double] = js.native
}

