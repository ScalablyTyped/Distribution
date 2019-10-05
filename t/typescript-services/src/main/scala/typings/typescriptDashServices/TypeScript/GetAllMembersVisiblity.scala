package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GetAllMembersVisiblity extends js.Object

@JSGlobal("TypeScript.GetAllMembersVisiblity")
@js.native
object GetAllMembersVisiblity extends js.Object {
  @js.native
  sealed trait all extends GetAllMembersVisiblity
  
  @js.native
  sealed trait externallyVisible extends GetAllMembersVisiblity
  
  @js.native
  sealed trait internallyVisible extends GetAllMembersVisiblity
  
  /* 0 */ val all: typings.typescriptDashServices.TypeScript.GetAllMembersVisiblity.all with Double = js.native
  /* 2 */ val externallyVisible: typings.typescriptDashServices.TypeScript.GetAllMembersVisiblity.externallyVisible with Double = js.native
  /* 1 */ val internallyVisible: typings.typescriptDashServices.TypeScript.GetAllMembersVisiblity.internallyVisible with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GetAllMembersVisiblity with Double] = js.native
}

