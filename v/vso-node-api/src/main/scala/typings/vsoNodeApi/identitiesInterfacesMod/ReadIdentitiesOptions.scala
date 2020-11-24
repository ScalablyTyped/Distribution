package typings.vsoNodeApi.identitiesInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReadIdentitiesOptions extends js.Object
@JSImport("vso-node-api/interfaces/IdentitiesInterfaces", "ReadIdentitiesOptions")
@js.native
object ReadIdentitiesOptions extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReadIdentitiesOptions with Double] = js.native
  
  @js.native
  sealed trait FilterIllegalMemberships extends ReadIdentitiesOptions
  /* 1 */ @js.native
  object FilterIllegalMemberships extends TopLevel[FilterIllegalMemberships with Double]
  
  @js.native
  sealed trait None extends ReadIdentitiesOptions
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
}
