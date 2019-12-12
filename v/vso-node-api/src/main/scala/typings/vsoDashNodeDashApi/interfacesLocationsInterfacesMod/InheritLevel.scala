package typings.vsoDashNodeDashApi.interfacesLocationsInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesLocationsInterfacesMod.InheritLevel.Account
import typings.vsoDashNodeDashApi.interfacesLocationsInterfacesMod.InheritLevel.All
import typings.vsoDashNodeDashApi.interfacesLocationsInterfacesMod.InheritLevel.Collection
import typings.vsoDashNodeDashApi.interfacesLocationsInterfacesMod.InheritLevel.Deployment
import typings.vsoDashNodeDashApi.interfacesLocationsInterfacesMod.InheritLevel.None
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InheritLevel extends js.Object

@JSImport("vso-node-api/interfaces/LocationsInterfaces", "InheritLevel")
@js.native
object InheritLevel extends js.Object {
  @js.native
  sealed trait Account extends InheritLevel
  
  @js.native
  sealed trait All extends InheritLevel
  
  @js.native
  sealed trait Collection extends InheritLevel
  
  @js.native
  sealed trait Deployment extends InheritLevel
  
  @js.native
  sealed trait None extends InheritLevel
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InheritLevel with Double] = js.native
  /* 2 */ @js.native
  object Account extends TopLevel[Account with Double]
  
  /* 7 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 4 */ @js.native
  object Collection extends TopLevel[Collection with Double]
  
  /* 1 */ @js.native
  object Deployment extends TopLevel[Deployment with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

