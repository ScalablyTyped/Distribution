package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ExportAssignmentSyntax")
@js.native
class ExportAssignmentSyntax protected ()
  extends typings.typescriptServices.TypeScript.ExportAssignmentSyntax {
  def this(
    exportKeyword: ISyntaxToken,
    equalsToken: ISyntaxToken,
    identifier: ISyntaxToken,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
object ExportAssignmentSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.ExportAssignmentSyntax.create1")
  @js.native
  def create1(identifier: ISyntaxToken): typings.typescriptServices.TypeScript.ExportAssignmentSyntax = js.native
}
