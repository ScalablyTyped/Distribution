package typings
package vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FrameworkIdentityType extends js.Object

@JSImport("vso-node-api/interfaces/IdentitiesInterfaces", "FrameworkIdentityType")
@js.native
object FrameworkIdentityType extends js.Object {
  @js.native
  sealed trait AggregateIdentity
    extends vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod.FrameworkIdentityType
  
  @js.native
  sealed trait ImportedIdentity
    extends vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod.FrameworkIdentityType
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod.FrameworkIdentityType
  
  @js.native
  sealed trait ServiceIdentity
    extends vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod.FrameworkIdentityType
  
  /* 2 */ val AggregateIdentity: AggregateIdentity with scala.Double = js.native
  /* 3 */ val ImportedIdentity: ImportedIdentity with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val ServiceIdentity: ServiceIdentity with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod.FrameworkIdentityType with scala.Double
  ] = js.native
}

