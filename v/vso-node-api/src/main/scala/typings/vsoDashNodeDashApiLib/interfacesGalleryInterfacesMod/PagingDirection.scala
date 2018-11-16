package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

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
  sealed trait Backward
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PagingDirection
  
  /**
       * Forward will return results from later in the resultset.
       */
  @js.native
  sealed trait Forward
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PagingDirection
  
  /* 1 */ val Backward: Backward with scala.Double = js.native
  /* 2 */ val Forward: Forward with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PagingDirection with scala.Double
  ] = js.native
}

