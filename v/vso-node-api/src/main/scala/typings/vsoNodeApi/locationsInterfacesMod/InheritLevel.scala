package typings.vsoNodeApi.locationsInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InheritLevel extends js.Object
@JSImport("vso-node-api/interfaces/LocationsInterfaces", "InheritLevel")
@js.native
object InheritLevel extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InheritLevel with Double] = js.native
  
  @js.native
  sealed trait Account extends InheritLevel
  /* 2 */ @js.native
  object Account extends TopLevel[Account with Double]
  
  @js.native
  sealed trait All extends InheritLevel
  /* 7 */ @js.native
  object All extends TopLevel[All with Double]
  
  @js.native
  sealed trait Collection extends InheritLevel
  /* 4 */ @js.native
  object Collection extends TopLevel[Collection with Double]
  
  @js.native
  sealed trait Deployment extends InheritLevel
  /* 1 */ @js.native
  object Deployment extends TopLevel[Deployment with Double]
  
  @js.native
  sealed trait None extends InheritLevel
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
}
