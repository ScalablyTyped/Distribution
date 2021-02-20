package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModuleGenTarget extends StObject
@JSGlobal("TypeScript.ModuleGenTarget")
@js.native
object ModuleGenTarget extends StObject {
  
  @js.native
  sealed trait Asynchronous extends ModuleGenTarget
  
  @js.native
  sealed trait Synchronous extends ModuleGenTarget
  
  @js.native
  sealed trait Unspecified extends ModuleGenTarget
}
