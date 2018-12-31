package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

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
  sealed trait Ascending
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.SortOrderType
  
  /**
    * Results will be sorted in the default order as per the sorting type defined. The default varies for each type, e.g. for Relevance, default is Descnding, for Title default is Ascending etc.
    */
  @js.native
  sealed trait Default
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.SortOrderType
  
  /**
    * The results will be sorted in Descending order
    */
  @js.native
  sealed trait Descending
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.SortOrderType
  
  /* 1 */ val Ascending: Ascending with scala.Double = js.native
  /* 0 */ val Default: Default with scala.Double = js.native
  /* 2 */ val Descending: Descending with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.SortOrderType with scala.Double
  ] = js.native
}

