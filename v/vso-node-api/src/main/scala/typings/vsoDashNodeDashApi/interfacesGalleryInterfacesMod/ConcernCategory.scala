package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ConcernCategory.Abusive
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ConcernCategory.General
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ConcernCategory.Spam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConcernCategory extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ConcernCategory")
@js.native
object ConcernCategory extends js.Object {
  @js.native
  sealed trait Abusive extends ConcernCategory
  
  @js.native
  sealed trait General extends ConcernCategory
  
  @js.native
  sealed trait Spam extends ConcernCategory
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConcernCategory with Double] = js.native
  /* 2 */ @js.native
  object Abusive extends TopLevel[Abusive with Double]
  
  /* 1 */ @js.native
  object General extends TopLevel[General with Double]
  
  /* 4 */ @js.native
  object Spam extends TopLevel[Spam with Double]
  
}

