package typings.vsoNodeApi.identitiesInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReadIdentitiesOptions extends StObject
@JSImport("vso-node-api/interfaces/IdentitiesInterfaces", "ReadIdentitiesOptions")
@js.native
object ReadIdentitiesOptions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReadIdentitiesOptions with Double] = js.native
  
  @js.native
  sealed trait FilterIllegalMemberships extends ReadIdentitiesOptions
  /* 1 */ val FilterIllegalMemberships: typings.vsoNodeApi.identitiesInterfacesMod.ReadIdentitiesOptions.FilterIllegalMemberships with Double = js.native
  
  @js.native
  sealed trait None extends ReadIdentitiesOptions
  /* 0 */ val None: typings.vsoNodeApi.identitiesInterfacesMod.ReadIdentitiesOptions.None with Double = js.native
}
