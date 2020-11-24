package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModuleGenTarget extends js.Object
@JSGlobal("TypeScript.ModuleGenTarget")
@js.native
object ModuleGenTarget extends js.Object {
  
  @js.native
  sealed trait Asynchronous extends ModuleGenTarget
  
  @js.native
  sealed trait Synchronous extends ModuleGenTarget
  
  @js.native
  sealed trait Unspecified extends ModuleGenTarget
}
