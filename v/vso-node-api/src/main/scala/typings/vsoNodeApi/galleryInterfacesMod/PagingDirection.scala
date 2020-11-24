package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PagingDirection extends js.Object
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "PagingDirection")
@js.native
object PagingDirection extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PagingDirection with Double] = js.native
  
  /**
    * Backward will return results from earlier in the resultset.
    */
  @js.native
  sealed trait Backward extends PagingDirection
  /* 1 */ @js.native
  object Backward extends TopLevel[Backward with Double]
  
  /**
    * Forward will return results from later in the resultset.
    */
  @js.native
  sealed trait Forward extends PagingDirection
  /* 2 */ @js.native
  object Forward extends TopLevel[Forward with Double]
}
