package typings.typescriptServices.global.TypeScript.Services

import typings.typescriptServices.TypeScript.PullSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Services.FindReferenceHelpers")
@js.native
open class FindReferenceHelpers ()
  extends StObject
     with typings.typescriptServices.TypeScript.Services.FindReferenceHelpers
object FindReferenceHelpers {
  
  @JSGlobal("TypeScript.Services.FindReferenceHelpers")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def checkSymbolsForDeclarationEquality(firstSymbol: Any, secondSymbol: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("checkSymbolsForDeclarationEquality")(firstSymbol.asInstanceOf[js.Any], secondSymbol.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /* static member */
  inline def compareSymbolsForLexicalIdentity(firstSymbol: PullSymbol, secondSymbol: PullSymbol): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareSymbolsForLexicalIdentity")(firstSymbol.asInstanceOf[js.Any], secondSymbol.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def declarationsAreSameOrParents(firstDecl: Any, secondDecl: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("declarationsAreSameOrParents")(firstDecl.asInstanceOf[js.Any], secondDecl.asInstanceOf[js.Any])).asInstanceOf[Any]
}
