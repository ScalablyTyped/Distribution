package typings.typescriptServices.mod.Services

import typings.typescriptServices.TypeScript.PullSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.FindReferenceHelpers")
@js.native
class FindReferenceHelpers ()
  extends StObject
     with typings.typescriptServices.TypeScript.Services.FindReferenceHelpers
object FindReferenceHelpers {
  
  @JSImport("typescript-services", "Services.FindReferenceHelpers")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def checkSymbolsForDeclarationEquality(firstSymbol: js.Any, secondSymbol: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("checkSymbolsForDeclarationEquality")(firstSymbol.asInstanceOf[js.Any], secondSymbol.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* static member */
  @scala.inline
  def compareSymbolsForLexicalIdentity(firstSymbol: PullSymbol, secondSymbol: PullSymbol): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareSymbolsForLexicalIdentity")(firstSymbol.asInstanceOf[js.Any], secondSymbol.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def declarationsAreSameOrParents(firstDecl: js.Any, secondDecl: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("declarationsAreSameOrParents")(firstDecl.asInstanceOf[js.Any], secondDecl.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
