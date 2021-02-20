package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.FormattingOptions
import typings.typescriptServices.TypeScript.ISyntaxNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.SyntaxDedenter")
@js.native
class SyntaxDedenter protected ()
  extends typings.typescriptServices.TypeScript.SyntaxDedenter {
  def this(
    dedentFirstToken: Boolean,
    dedentationAmount: Double,
    minimumIndent: Double,
    options: FormattingOptions
  ) = this()
}
object SyntaxDedenter {
  
  /* static member */
  @JSGlobal("TypeScript.SyntaxDedenter.dedentNode")
  @js.native
  def dedentNode(
    node: ISyntaxNode,
    dedentFirstToken: Boolean,
    dedentAmount: Double,
    minimumIndent: Double,
    options: FormattingOptions
  ): ISyntaxNode = js.native
}
