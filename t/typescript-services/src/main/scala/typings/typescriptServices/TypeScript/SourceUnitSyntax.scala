package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceUnitSyntax extends SyntaxNode {
  
  var endOfFileToken: ISyntaxToken = js.native
  
  var moduleElements: ISyntaxList = js.native
  
  def update(moduleElements: ISyntaxList, endOfFileToken: ISyntaxToken): SourceUnitSyntax = js.native
  
  def withEndOfFileToken(endOfFileToken: ISyntaxToken): SourceUnitSyntax = js.native
  
  def withModuleElement(moduleElement: IModuleElementSyntax): SourceUnitSyntax = js.native
  
  def withModuleElements(moduleElements: ISyntaxList): SourceUnitSyntax = js.native
}
