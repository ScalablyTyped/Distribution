package typings.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DeclarationCreator {
  
  @JSImport("typescript-services", "DeclarationCreator")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    document: typings.typescriptServices.TypeScript.Document,
    semanticInfoChain: typings.typescriptServices.TypeScript.SemanticInfoChain,
    compilationSettings: typings.typescriptServices.TypeScript.ImmutableCompilationSettings
  ): typings.typescriptServices.TypeScript.PullDecl = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(document.asInstanceOf[js.Any], semanticInfoChain.asInstanceOf[js.Any], compilationSettings.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.PullDecl]
}
