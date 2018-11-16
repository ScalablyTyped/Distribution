package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DiagnosticCategory extends js.Object

@JSImport("typescript/ts", "DiagnosticCategory")
@js.native
object DiagnosticCategory extends js.Object {
  @js.native
  sealed trait Error
    extends typescriptLib.typescriptMod.tsNs.DiagnosticCategory
  
  @js.native
  sealed trait Message
    extends typescriptLib.typescriptMod.tsNs.DiagnosticCategory
  
  @js.native
  sealed trait Suggestion
    extends typescriptLib.typescriptMod.tsNs.DiagnosticCategory
  
  @js.native
  sealed trait Warning
    extends typescriptLib.typescriptMod.tsNs.DiagnosticCategory
  
}

