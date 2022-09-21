package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeActionProviderMetadata extends StObject {
  
  /**
    * Static documentation for a class of code actions.
    *
    * Documentation from the provider is shown in the code actions menu if either:
    *
    * - Code actions of `kind` are requested by the editor. In this case, the editor will show the documentation that
    *   most closely matches the requested code action kind. For example, if a provider has documentation for
    *   both `Refactor` and `RefactorExtract`, when the user requests code actions for `RefactorExtract`,
    *   the editor will use the documentation for `RefactorExtract` instead of the documentation for `Refactor`.
    *
    * - Any code actions of `kind` are returned by the provider.
    *
    * At most one documentation entry will be shown per provider.
    */
  val documentation: js.UndefOr[js.Array[typings.vscode.anon.Command]] = js.undefined
  
  /**
    * List of {@link CodeActionKind CodeActionKinds} that a {@link CodeActionProvider} may return.
    *
    * This list is used to determine if a given `CodeActionProvider` should be invoked or not.
    * To avoid unnecessary computation, every `CodeActionProvider` should list use `providedCodeActionKinds`. The
    * list of kinds may either be generic, such as `[CodeActionKind.Refactor]`, or list out every kind provided,
    * such as `[CodeActionKind.Refactor.Extract.append('function'), CodeActionKind.Refactor.Extract.append('constant'), ...]`.
    */
  val providedCodeActionKinds: js.UndefOr[js.Array[CodeActionKind]] = js.undefined
}
object CodeActionProviderMetadata {
  
  inline def apply(): CodeActionProviderMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeActionProviderMetadata]
  }
  
  extension [Self <: CodeActionProviderMetadata](x: Self) {
    
    inline def setDocumentation(value: js.Array[typings.vscode.anon.Command]): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setDocumentationVarargs(value: typings.vscode.anon.Command*): Self = StObject.set(x, "documentation", js.Array(value*))
    
    inline def setProvidedCodeActionKinds(value: js.Array[CodeActionKind]): Self = StObject.set(x, "providedCodeActionKinds", value.asInstanceOf[js.Any])
    
    inline def setProvidedCodeActionKindsUndefined: Self = StObject.set(x, "providedCodeActionKinds", js.undefined)
    
    inline def setProvidedCodeActionKindsVarargs(value: CodeActionKind*): Self = StObject.set(x, "providedCodeActionKinds", js.Array(value*))
  }
}
