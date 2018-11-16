package typings
package vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InheritLevel extends js.Object

@JSImport("vso-node-api/interfaces/LocationsInterfaces", "InheritLevel")
@js.native
object InheritLevel extends js.Object {
  @js.native
  sealed trait Account
    extends vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.InheritLevel
  
  @js.native
  sealed trait All
    extends vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.InheritLevel
  
  @js.native
  sealed trait Collection
    extends vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.InheritLevel
  
  @js.native
  sealed trait Deployment
    extends vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.InheritLevel
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.InheritLevel
  
  /* 2 */ val Account: Account with scala.Double = js.native
  /* 7 */ val All: All with scala.Double = js.native
  /* 4 */ val Collection: Collection with scala.Double = js.native
  /* 1 */ val Deployment: Deployment with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.InheritLevel with scala.Double
  ] = js.native
}

