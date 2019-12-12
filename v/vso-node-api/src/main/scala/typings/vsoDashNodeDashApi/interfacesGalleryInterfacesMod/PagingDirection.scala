package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.PagingDirection.Backward
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.PagingDirection.Forward
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PagingDirection with Double] = js.native
  /* 1 */ @js.native
  object Backward extends TopLevel[Backward with Double]
  
  /* 2 */ @js.native
  object Forward extends TopLevel[Forward with Double]
  
}

