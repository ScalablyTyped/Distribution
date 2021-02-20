package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PagingDirection extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "PagingDirection")
@js.native
object PagingDirection extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PagingDirection with Double] = js.native
  
  /**
    * Backward will return results from earlier in the resultset.
    */
  @js.native
  sealed trait Backward extends PagingDirection
  /* 1 */ val Backward: typings.vsoNodeApi.galleryInterfacesMod.PagingDirection.Backward with Double = js.native
  
  /**
    * Forward will return results from later in the resultset.
    */
  @js.native
  sealed trait Forward extends PagingDirection
  /* 2 */ val Forward: typings.vsoNodeApi.galleryInterfacesMod.PagingDirection.Forward with Double = js.native
}
