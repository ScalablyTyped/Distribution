package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PropertySelectorType extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "PropertySelectorType")
@js.native
object PropertySelectorType extends js.Object {
  @js.native
  sealed trait Exclusion extends PropertySelectorType
  
  @js.native
  sealed trait Inclusion extends PropertySelectorType
  
  /* 1 */ val Exclusion: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.PropertySelectorType.Exclusion with Double = js.native
  /* 0 */ val Inclusion: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.PropertySelectorType.Inclusion with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PropertySelectorType with Double] = js.native
}

