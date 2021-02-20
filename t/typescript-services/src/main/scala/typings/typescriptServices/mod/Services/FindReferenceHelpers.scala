package typings.typescriptServices.mod.Services

import typings.typescriptServices.TypeScript.PullSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.FindReferenceHelpers")
@js.native
class FindReferenceHelpers ()
  extends typings.typescriptServices.TypeScript.Services.FindReferenceHelpers
object FindReferenceHelpers {
  
  /* static member */
  @JSImport("typescript-services", "Services.FindReferenceHelpers.checkSymbolsForDeclarationEquality")
  @js.native
  def checkSymbolsForDeclarationEquality(firstSymbol: js.Any, secondSymbol: js.Any): js.Any = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.FindReferenceHelpers.compareSymbolsForLexicalIdentity")
  @js.native
  def compareSymbolsForLexicalIdentity(firstSymbol: PullSymbol, secondSymbol: PullSymbol): Boolean = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.FindReferenceHelpers.declarationsAreSameOrParents")
  @js.native
  def declarationsAreSameOrParents(firstDecl: js.Any, secondDecl: js.Any): js.Any = js.native
}
