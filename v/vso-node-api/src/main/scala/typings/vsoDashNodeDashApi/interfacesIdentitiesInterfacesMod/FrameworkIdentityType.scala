package typings.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FrameworkIdentityType extends js.Object

@JSImport("vso-node-api/interfaces/IdentitiesInterfaces", "FrameworkIdentityType")
@js.native
object FrameworkIdentityType extends js.Object {
  @js.native
  sealed trait AggregateIdentity extends FrameworkIdentityType
  
  @js.native
  sealed trait ImportedIdentity extends FrameworkIdentityType
  
  @js.native
  sealed trait None extends FrameworkIdentityType
  
  @js.native
  sealed trait ServiceIdentity extends FrameworkIdentityType
  
  /* 2 */ val AggregateIdentity: typings.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod.FrameworkIdentityType.AggregateIdentity with Double = js.native
  /* 3 */ val ImportedIdentity: typings.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod.FrameworkIdentityType.ImportedIdentity with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod.FrameworkIdentityType.None with Double = js.native
  /* 1 */ val ServiceIdentity: typings.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod.FrameworkIdentityType.ServiceIdentity with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FrameworkIdentityType with Double] = js.native
}

