package typings.vsoNodeApi.interfacesIdentitiesInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReadIdentitiesOptions extends StObject
@JSImport("vso-node-api/interfaces/IdentitiesInterfaces", "ReadIdentitiesOptions")
@js.native
object ReadIdentitiesOptions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReadIdentitiesOptions & Double] = js.native
  
  @js.native
  sealed trait FilterIllegalMemberships
    extends StObject
       with ReadIdentitiesOptions
  /* 1 */ val FilterIllegalMemberships: typings.vsoNodeApi.interfacesIdentitiesInterfacesMod.ReadIdentitiesOptions.FilterIllegalMemberships & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ReadIdentitiesOptions
  /* 0 */ val None: typings.vsoNodeApi.interfacesIdentitiesInterfacesMod.ReadIdentitiesOptions.None & Double = js.native
}
