package typings.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DeclarationCreator {
  
  @JSGlobal("TypeScript.DeclarationCreator")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(
    document: typings.typescriptServices.TypeScript.Document,
    semanticInfoChain: typings.typescriptServices.TypeScript.SemanticInfoChain,
    compilationSettings: typings.typescriptServices.TypeScript.ImmutableCompilationSettings
  ): typings.typescriptServices.TypeScript.PullDecl = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(document.asInstanceOf[js.Any], semanticInfoChain.asInstanceOf[js.Any], compilationSettings.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.PullDecl]
}
