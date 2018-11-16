package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PropertySelectorType extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "PropertySelectorType")
@js.native
object PropertySelectorType extends js.Object {
  @js.native
  sealed trait Exclusion
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.PropertySelectorType
  
  @js.native
  sealed trait Inclusion
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.PropertySelectorType
  
  /* 1 */ val Exclusion: Exclusion with scala.Double = js.native
  /* 0 */ val Inclusion: Inclusion with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.PropertySelectorType with scala.Double
  ] = js.native
}

