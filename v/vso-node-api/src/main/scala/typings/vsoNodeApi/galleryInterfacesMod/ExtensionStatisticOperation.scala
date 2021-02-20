package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionStatisticOperation extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionStatisticOperation")
@js.native
object ExtensionStatisticOperation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionStatisticOperation with Double] = js.native
  
  @js.native
  sealed trait Decrement extends ExtensionStatisticOperation
  /* 3 */ val Decrement: typings.vsoNodeApi.galleryInterfacesMod.ExtensionStatisticOperation.Decrement with Double = js.native
  
  @js.native
  sealed trait Delete extends ExtensionStatisticOperation
  /* 4 */ val Delete: typings.vsoNodeApi.galleryInterfacesMod.ExtensionStatisticOperation.Delete with Double = js.native
  
  @js.native
  sealed trait Increment extends ExtensionStatisticOperation
  /* 2 */ val Increment: typings.vsoNodeApi.galleryInterfacesMod.ExtensionStatisticOperation.Increment with Double = js.native
  
  @js.native
  sealed trait None extends ExtensionStatisticOperation
  /* 0 */ val None: typings.vsoNodeApi.galleryInterfacesMod.ExtensionStatisticOperation.None with Double = js.native
  
  @js.native
  sealed trait Set extends ExtensionStatisticOperation
  /* 1 */ val Set: typings.vsoNodeApi.galleryInterfacesMod.ExtensionStatisticOperation.Set with Double = js.native
}
