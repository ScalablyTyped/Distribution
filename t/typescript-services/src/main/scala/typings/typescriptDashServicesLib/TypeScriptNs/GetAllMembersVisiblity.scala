package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GetAllMembersVisiblity extends js.Object

@JSGlobal("TypeScript.GetAllMembersVisiblity")
@js.native
object GetAllMembersVisiblity extends js.Object {
  @js.native
  sealed trait all
    extends typescriptDashServicesLib.TypeScriptNs.GetAllMembersVisiblity
  
  @js.native
  sealed trait externallyVisible
    extends typescriptDashServicesLib.TypeScriptNs.GetAllMembersVisiblity
  
  @js.native
  sealed trait internallyVisible
    extends typescriptDashServicesLib.TypeScriptNs.GetAllMembersVisiblity
  
  /* 0 */ val all: all with scala.Double = js.native
  /* 2 */ val externallyVisible: externallyVisible with scala.Double = js.native
  /* 1 */ val internallyVisible: internallyVisible with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptDashServicesLib.TypeScriptNs.GetAllMembersVisiblity with scala.Double] = js.native
}

