package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PagingDirection extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "PagingDirection")
@js.native
object PagingDirection extends js.Object {
  /**
    * Backward will return results from earlier in the resultset.
    */
  @js.native
  sealed trait Backward extends PagingDirection
  
  /**
    * Forward will return results from later in the resultset.
    */
  @js.native
  sealed trait Forward extends PagingDirection
  
  /* 1 */ val Backward: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.PagingDirection.Backward with Double = js.native
  /* 2 */ val Forward: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.PagingDirection.Forward with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PagingDirection with Double] = js.native
}

