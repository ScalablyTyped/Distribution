package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReviewEventOperation extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ReviewEventOperation")
@js.native
object ReviewEventOperation extends js.Object {
  @js.native
  sealed trait Create extends ReviewEventOperation
  
  @js.native
  sealed trait Delete extends ReviewEventOperation
  
  @js.native
  sealed trait Update extends ReviewEventOperation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReviewEventOperation with Double] = js.native
  /* 1 */ @js.native
  object Create extends TopLevel[Create with Double]
  
  /* 3 */ @js.native
  object Delete extends TopLevel[Delete with Double]
  
  /* 2 */ @js.native
  object Update extends TopLevel[Update with Double]
  
}

