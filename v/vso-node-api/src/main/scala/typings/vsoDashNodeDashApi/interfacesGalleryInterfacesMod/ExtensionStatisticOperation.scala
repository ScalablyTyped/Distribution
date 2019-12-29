package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtensionStatisticOperation extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionStatisticOperation")
@js.native
object ExtensionStatisticOperation extends js.Object {
  @js.native
  sealed trait Decrement extends ExtensionStatisticOperation
  
  @js.native
  sealed trait Delete extends ExtensionStatisticOperation
  
  @js.native
  sealed trait Increment extends ExtensionStatisticOperation
  
  @js.native
  sealed trait None extends ExtensionStatisticOperation
  
  @js.native
  sealed trait Set extends ExtensionStatisticOperation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionStatisticOperation with Double] = js.native
  /* 3 */ @js.native
  object Decrement extends TopLevel[Decrement with Double]
  
  /* 4 */ @js.native
  object Delete extends TopLevel[Delete with Double]
  
  /* 2 */ @js.native
  object Increment extends TopLevel[Increment with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Set extends TopLevel[Set with Double]
  
}

