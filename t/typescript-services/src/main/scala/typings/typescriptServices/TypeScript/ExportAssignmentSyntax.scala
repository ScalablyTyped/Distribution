package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportAssignmentSyntax
  extends StObject
     with SyntaxNode {
  
  var equalsToken: ISyntaxToken = js.native
  
  var exportKeyword: ISyntaxToken = js.native
  
  var identifier: ISyntaxToken = js.native
  
  var semicolonToken: ISyntaxToken = js.native
  
  def update(
    exportKeyword: ISyntaxToken,
    equalsToken: ISyntaxToken,
    identifier: ISyntaxToken,
    semicolonToken: ISyntaxToken
  ): ExportAssignmentSyntax = js.native
  
  def withEqualsToken(equalsToken: ISyntaxToken): ExportAssignmentSyntax = js.native
  
  def withExportKeyword(exportKeyword: ISyntaxToken): ExportAssignmentSyntax = js.native
  
  def withIdentifier(identifier: ISyntaxToken): ExportAssignmentSyntax = js.native
  
  def withSemicolonToken(semicolonToken: ISyntaxToken): ExportAssignmentSyntax = js.native
}
