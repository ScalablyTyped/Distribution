package typings.typescriptDashServices.TypeScript

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GetAllMembersVisiblity with Double] = js.native
  /* 0 */ @js.native
  object all extends TopLevel[all with Double]
  
  /* 2 */ @js.native
  object externallyVisible extends TopLevel[externallyVisible with Double]
  
  /* 1 */ @js.native
  object internallyVisible extends TopLevel[internallyVisible with Double]
  
}

