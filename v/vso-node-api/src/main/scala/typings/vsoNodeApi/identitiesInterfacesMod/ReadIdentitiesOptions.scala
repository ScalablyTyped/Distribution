package typings.vsoNodeApi.identitiesInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReadIdentitiesOptions extends js.Object

@JSImport("vso-node-api/interfaces/IdentitiesInterfaces", "ReadIdentitiesOptions")
@js.native
object ReadIdentitiesOptions extends js.Object {
  @js.native
  sealed trait FilterIllegalMemberships extends ReadIdentitiesOptions
  
  @js.native
  sealed trait None extends ReadIdentitiesOptions
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReadIdentitiesOptions with Double] = js.native
  /* 1 */ @js.native
  object FilterIllegalMemberships extends TopLevel[FilterIllegalMemberships with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

