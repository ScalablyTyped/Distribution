package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SortByType extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "SortByType")
@js.native
object SortByType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SortByType & Double] = js.native
  
  /**
    * The results will be sorted as per Author defined in the VSix/Metadata. If not defined, publisher name is used This is specifically needed by VS IDE, other (new and old) clients are not encouraged to use this
    */
  @js.native
  sealed trait Author
    extends StObject
       with SortByType
  /* 11 */ val Author: typings.vsoNodeApi.galleryInterfacesMod.SortByType.Author & Double = js.native
  
  /**
    * The results will be sorted as per Average ratings of the extensions
    */
  @js.native
  sealed trait AverageRating
    extends StObject
       with SortByType
  /* 6 */ val AverageRating: typings.vsoNodeApi.galleryInterfacesMod.SortByType.AverageRating & Double = js.native
  
  /**
    * Results will be sorted by Install Count
    */
  @js.native
  sealed trait InstallCount
    extends StObject
       with SortByType
  /* 4 */ val InstallCount: typings.vsoNodeApi.galleryInterfacesMod.SortByType.InstallCount & Double = js.native
  
  /**
    * The results will be sorted as per Last Updated date of the extensions with recently updated at the top
    */
  @js.native
  sealed trait LastUpdatedDate
    extends StObject
       with SortByType
  /* 1 */ val LastUpdatedDate: typings.vsoNodeApi.galleryInterfacesMod.SortByType.LastUpdatedDate & Double = js.native
  
  /**
    * The results will be sorted as per Published date of the extensions
    */
  @js.native
  sealed trait PublishedDate
    extends StObject
       with SortByType
  /* 5 */ val PublishedDate: typings.vsoNodeApi.galleryInterfacesMod.SortByType.PublishedDate & Double = js.native
  
  /**
    * Results will be sorted Alphabetically as per Publisher title
    */
  @js.native
  sealed trait Publisher
    extends StObject
       with SortByType
  /* 3 */ val Publisher: typings.vsoNodeApi.galleryInterfacesMod.SortByType.Publisher & Double = js.native
  
  /**
    * The results will be sorted as per ReleaseDate of the extensions (date on which the extension first went public)
    */
  @js.native
  sealed trait ReleaseDate
    extends StObject
       with SortByType
  /* 10 */ val ReleaseDate: typings.vsoNodeApi.galleryInterfacesMod.SortByType.ReleaseDate & Double = js.native
  
  /**
    * The results will be sorted by relevance in case search query is given, if no search query resutls will be provided as is
    */
  @js.native
  sealed trait Relevance
    extends StObject
       with SortByType
  /* 0 */ val Relevance: typings.vsoNodeApi.galleryInterfacesMod.SortByType.Relevance & Double = js.native
  
  /**
    * Results will be sorted Alphabetically as per the title of the extension
    */
  @js.native
  sealed trait Title
    extends StObject
       with SortByType
  /* 2 */ val Title: typings.vsoNodeApi.galleryInterfacesMod.SortByType.Title & Double = js.native
  
  /**
    * The results will be sorted as per Trending Daily Score of the extensions
    */
  @js.native
  sealed trait TrendingDaily
    extends StObject
       with SortByType
  /* 7 */ val TrendingDaily: typings.vsoNodeApi.galleryInterfacesMod.SortByType.TrendingDaily & Double = js.native
  
  /**
    * The results will be sorted as per Trending monthly Score of the extensions
    */
  @js.native
  sealed trait TrendingMonthly
    extends StObject
       with SortByType
  /* 9 */ val TrendingMonthly: typings.vsoNodeApi.galleryInterfacesMod.SortByType.TrendingMonthly & Double = js.native
  
  /**
    * The results will be sorted as per Trending weekly Score of the extensions
    */
  @js.native
  sealed trait TrendingWeekly
    extends StObject
       with SortByType
  /* 8 */ val TrendingWeekly: typings.vsoNodeApi.galleryInterfacesMod.SortByType.TrendingWeekly & Double = js.native
  
  /**
    * The results will be sorted as per Weighted Rating of the extension.
    */
  @js.native
  sealed trait WeightedRating
    extends StObject
       with SortByType
  /* 12 */ val WeightedRating: typings.vsoNodeApi.galleryInterfacesMod.SortByType.WeightedRating & Double = js.native
}
