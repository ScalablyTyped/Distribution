package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReviewEventOperation extends js.Object
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ReviewEventOperation")
@js.native
object ReviewEventOperation extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReviewEventOperation with Double] = js.native
  
  @js.native
  sealed trait Create extends ReviewEventOperation
  /* 1 */ @js.native
  object Create extends TopLevel[Create with Double]
  
  @js.native
  sealed trait Delete extends ReviewEventOperation
  /* 3 */ @js.native
  object Delete extends TopLevel[Delete with Double]
  
  @js.native
  sealed trait Update extends ReviewEventOperation
  /* 2 */ @js.native
  object Update extends TopLevel[Update with Double]
}
