package typings.vsoNodeApi.identitiesInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FrameworkIdentityType extends js.Object
@JSImport("vso-node-api/interfaces/IdentitiesInterfaces", "FrameworkIdentityType")
@js.native
object FrameworkIdentityType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FrameworkIdentityType with Double] = js.native
  
  @js.native
  sealed trait AggregateIdentity extends FrameworkIdentityType
  /* 2 */ @js.native
  object AggregateIdentity extends TopLevel[AggregateIdentity with Double]
  
  @js.native
  sealed trait ImportedIdentity extends FrameworkIdentityType
  /* 3 */ @js.native
  object ImportedIdentity extends TopLevel[ImportedIdentity with Double]
  
  @js.native
  sealed trait None extends FrameworkIdentityType
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait ServiceIdentity extends FrameworkIdentityType
  /* 1 */ @js.native
  object ServiceIdentity extends TopLevel[ServiceIdentity with Double]
}
