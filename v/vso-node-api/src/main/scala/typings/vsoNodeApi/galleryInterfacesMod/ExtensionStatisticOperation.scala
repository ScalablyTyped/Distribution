package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionStatisticOperation extends js.Object
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionStatisticOperation")
@js.native
object ExtensionStatisticOperation extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionStatisticOperation with Double] = js.native
  
  @js.native
  sealed trait Decrement extends ExtensionStatisticOperation
  /* 3 */ @js.native
  object Decrement extends TopLevel[Decrement with Double]
  
  @js.native
  sealed trait Delete extends ExtensionStatisticOperation
  /* 4 */ @js.native
  object Delete extends TopLevel[Delete with Double]
  
  @js.native
  sealed trait Increment extends ExtensionStatisticOperation
  /* 2 */ @js.native
  object Increment extends TopLevel[Increment with Double]
  
  @js.native
  sealed trait None extends ExtensionStatisticOperation
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Set extends ExtensionStatisticOperation
  /* 1 */ @js.native
  object Set extends TopLevel[Set with Double]
}
