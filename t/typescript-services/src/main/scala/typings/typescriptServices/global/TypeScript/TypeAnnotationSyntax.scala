package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxToken
import typings.typescriptServices.TypeScript.ITypeSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.TypeAnnotationSyntax")
@js.native
class TypeAnnotationSyntax protected ()
  extends typings.typescriptServices.TypeScript.TypeAnnotationSyntax {
  def this(colonToken: ISyntaxToken, `type`: ITypeSyntax, parsedInStrictMode: Boolean) = this()
}
/* static members */
@JSGlobal("TypeScript.TypeAnnotationSyntax")
@js.native
object TypeAnnotationSyntax extends js.Object {
  
  def create1(`type`: ITypeSyntax): typings.typescriptServices.TypeScript.TypeAnnotationSyntax = js.native
}
