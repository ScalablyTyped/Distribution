package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SortOrderType extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "SortOrderType")
@js.native
object SortOrderType extends js.Object {
  /**
    * The results will be sorted in Ascending order
    */
  @js.native
  sealed trait Ascending extends SortOrderType
  
  /**
    * Results will be sorted in the default order as per the sorting type defined. The default varies for each type, e.g. for Relevance, default is Descnding, for Title default is Ascending etc.
    */
  @js.native
  sealed trait Default extends SortOrderType
  
  /**
    * The results will be sorted in Descending order
    */
  @js.native
  sealed trait Descending extends SortOrderType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SortOrderType with Double] = js.native
  /* 1 */ @js.native
  object Ascending extends TopLevel[Ascending with Double]
  
  /* 0 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 2 */ @js.native
  object Descending extends TopLevel[Descending with Double]
  
}

