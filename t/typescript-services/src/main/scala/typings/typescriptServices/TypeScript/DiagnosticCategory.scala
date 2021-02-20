package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DiagnosticCategory extends StObject
@JSGlobal("TypeScript.DiagnosticCategory")
@js.native
object DiagnosticCategory extends StObject {
  
  @js.native
  sealed trait Error extends DiagnosticCategory
  
  @js.native
  sealed trait Message extends DiagnosticCategory
  
  @js.native
  sealed trait NoPrefix extends DiagnosticCategory
  
  @js.native
  sealed trait Warning extends DiagnosticCategory
}
