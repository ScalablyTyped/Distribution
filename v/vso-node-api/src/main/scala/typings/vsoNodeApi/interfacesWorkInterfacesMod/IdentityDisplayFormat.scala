package typings.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IdentityDisplayFormat extends StObject
@JSImport("vso-node-api/interfaces/WorkInterfaces", "IdentityDisplayFormat")
@js.native
object IdentityDisplayFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IdentityDisplayFormat & Double] = js.native
  
  /**
    * Display Avatar and Full name
    */
  @js.native
  sealed trait AvatarAndFullName
    extends StObject
       with IdentityDisplayFormat
  /* 2 */ val AvatarAndFullName: typings.vsoNodeApi.interfacesWorkInterfacesMod.IdentityDisplayFormat.AvatarAndFullName & Double = js.native
  
  /**
    * Display avatar only
    */
  @js.native
  sealed trait AvatarOnly
    extends StObject
       with IdentityDisplayFormat
  /* 0 */ val AvatarOnly: typings.vsoNodeApi.interfacesWorkInterfacesMod.IdentityDisplayFormat.AvatarOnly & Double = js.native
  
  /**
    * Display Full name only
    */
  @js.native
  sealed trait FullName
    extends StObject
       with IdentityDisplayFormat
  /* 1 */ val FullName: typings.vsoNodeApi.interfacesWorkInterfacesMod.IdentityDisplayFormat.FullName & Double = js.native
}
