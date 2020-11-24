package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmitContainer extends js.Object
@JSGlobal("TypeScript.EmitContainer")
@js.native
object EmitContainer extends js.Object {
  
  @js.native
  sealed trait Args extends EmitContainer
  
  @js.native
  sealed trait Class extends EmitContainer
  
  @js.native
  sealed trait Constructor extends EmitContainer
  
  @js.native
  sealed trait DynamicModule extends EmitContainer
  
  @js.native
  sealed trait Function extends EmitContainer
  
  @js.native
  sealed trait Interface extends EmitContainer
  
  @js.native
  sealed trait Module extends EmitContainer
  
  @js.native
  sealed trait Prog extends EmitContainer
}
