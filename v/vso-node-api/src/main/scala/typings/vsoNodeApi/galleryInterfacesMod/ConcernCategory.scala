package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConcernCategory extends js.Object
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ConcernCategory")
@js.native
object ConcernCategory extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConcernCategory with Double] = js.native
  
  @js.native
  sealed trait Abusive extends ConcernCategory
  /* 2 */ @js.native
  object Abusive extends TopLevel[Abusive with Double]
  
  @js.native
  sealed trait General extends ConcernCategory
  /* 1 */ @js.native
  object General extends TopLevel[General with Double]
  
  @js.native
  sealed trait Spam extends ConcernCategory
  /* 4 */ @js.native
  object Spam extends TopLevel[Spam with Double]
}
