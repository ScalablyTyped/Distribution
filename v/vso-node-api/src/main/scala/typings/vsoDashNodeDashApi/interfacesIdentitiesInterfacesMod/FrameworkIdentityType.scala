package typings.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FrameworkIdentityType with Double] = js.native
  /* 2 */ @js.native
  object AggregateIdentity extends TopLevel[AggregateIdentity with Double]
  
  /* 3 */ @js.native
  object ImportedIdentity extends TopLevel[ImportedIdentity with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object ServiceIdentity extends TopLevel[ServiceIdentity with Double]
  
}

