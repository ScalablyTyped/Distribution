package typings.vsoDashNodeDashApi.interfacesLocationsInterfacesMod

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
  
  /* 2 */ val Account: typings.vsoDashNodeDashApi.interfacesLocationsInterfacesMod.InheritLevel.Account with Double = js.native
  /* 7 */ val All: typings.vsoDashNodeDashApi.interfacesLocationsInterfacesMod.InheritLevel.All with Double = js.native
  /* 4 */ val Collection: typings.vsoDashNodeDashApi.interfacesLocationsInterfacesMod.InheritLevel.Collection with Double = js.native
  /* 1 */ val Deployment: typings.vsoDashNodeDashApi.interfacesLocationsInterfacesMod.InheritLevel.Deployment with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesLocationsInterfacesMod.InheritLevel.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InheritLevel with Double] = js.native
}

