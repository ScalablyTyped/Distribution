package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.PropertySignatureSyntax")
@js.native
class PropertySignatureSyntax protected ()
  extends typings.typescriptServices.TypeScript.PropertySignatureSyntax {
  def this(
    propertyName: ISyntaxToken,
    questionToken: ISyntaxToken,
    typeAnnotation: typings.typescriptServices.TypeScript.TypeAnnotationSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}
/* static members */
@JSGlobal("TypeScript.PropertySignatureSyntax")
@js.native
object PropertySignatureSyntax extends js.Object {
  
  def create(propertyName: ISyntaxToken): typings.typescriptServices.TypeScript.PropertySignatureSyntax = js.native
  
  def create1(propertyName: ISyntaxToken): typings.typescriptServices.TypeScript.PropertySignatureSyntax = js.native
}
