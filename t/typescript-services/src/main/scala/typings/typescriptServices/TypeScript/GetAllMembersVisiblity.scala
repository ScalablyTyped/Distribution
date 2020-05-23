package typings.typescriptServices.TypeScript

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
  
}

