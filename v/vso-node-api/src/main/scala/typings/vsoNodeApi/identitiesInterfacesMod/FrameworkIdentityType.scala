package typings.vsoNodeApi.identitiesInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FrameworkIdentityType extends StObject
@JSImport("vso-node-api/interfaces/IdentitiesInterfaces", "FrameworkIdentityType")
@js.native
object FrameworkIdentityType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FrameworkIdentityType & Double] = js.native
  
  @js.native
  sealed trait AggregateIdentity
    extends StObject
       with FrameworkIdentityType
  /* 2 */ val AggregateIdentity: typings.vsoNodeApi.identitiesInterfacesMod.FrameworkIdentityType.AggregateIdentity & Double = js.native
  
  @js.native
  sealed trait ImportedIdentity
    extends StObject
       with FrameworkIdentityType
  /* 3 */ val ImportedIdentity: typings.vsoNodeApi.identitiesInterfacesMod.FrameworkIdentityType.ImportedIdentity & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with FrameworkIdentityType
  /* 0 */ val None: typings.vsoNodeApi.identitiesInterfacesMod.FrameworkIdentityType.None & Double = js.native
  
  @js.native
  sealed trait ServiceIdentity
    extends StObject
       with FrameworkIdentityType
  /* 1 */ val ServiceIdentity: typings.vsoNodeApi.identitiesInterfacesMod.FrameworkIdentityType.ServiceIdentity & Double = js.native
}
