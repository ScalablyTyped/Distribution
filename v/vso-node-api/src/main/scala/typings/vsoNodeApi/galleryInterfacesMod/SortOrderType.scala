package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SortOrderType extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "SortOrderType")
@js.native
object SortOrderType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SortOrderType with Double] = js.native
  
  /**
    * The results will be sorted in Ascending order
    */
  @js.native
  sealed trait Ascending extends SortOrderType
  /* 1 */ val Ascending: typings.vsoNodeApi.galleryInterfacesMod.SortOrderType.Ascending with Double = js.native
  
  /**
    * Results will be sorted in the default order as per the sorting type defined. The default varies for each type, e.g. for Relevance, default is Descnding, for Title default is Ascending etc.
    */
  @js.native
  sealed trait Default extends SortOrderType
  /* 0 */ val Default: typings.vsoNodeApi.galleryInterfacesMod.SortOrderType.Default with Double = js.native
  
  /**
    * The results will be sorted in Descending order
    */
  @js.native
  sealed trait Descending extends SortOrderType
  /* 2 */ val Descending: typings.vsoNodeApi.galleryInterfacesMod.SortOrderType.Descending with Double = js.native
}
