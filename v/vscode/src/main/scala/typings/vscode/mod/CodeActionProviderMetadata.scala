package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeActionProviderMetadata extends js.Object {
  
  /**
    * Static documentation for a class of code actions.
    *
    * Documentation from the provider is shown in the code actions menu if either:
    *
    * - Code actions of `kind` are requested by VS Code. In this case, VS Code will show the documentation that
    *   most closely matches the requested code action kind. For example, if a provider has documentation for
    *   both `Refactor` and `RefactorExtract`, when the user requests code actions for `RefactorExtract`,
    *   VS Code will use the documentation for `RefactorExtract` instead of the documentation for `Refactor`.
    *
    * - Any code actions of `kind` are returned by the provider.
    *
    * At most one documentation entry will be shown per provider.
    */
  val documentation: js.UndefOr[js.Array[typings.vscode.anon.Command]] = js.native
  
  /**
    * List of [CodeActionKinds](#CodeActionKind) that a [CodeActionProvider](#CodeActionProvider) may return.
    *
    * This list is used to determine if a given `CodeActionProvider` should be invoked or not.
    * To avoid unnecessary computation, every `CodeActionProvider` should list use `providedCodeActionKinds`. The
    * list of kinds may either be generic, such as `[CodeActionKind.Refactor]`, or list out every kind provided,
    * such as `[CodeActionKind.Refactor.Extract.append('function'), CodeActionKind.Refactor.Extract.append('constant'), ...]`.
    */
  val providedCodeActionKinds: js.UndefOr[js.Array[CodeActionKind]] = js.native
}
object CodeActionProviderMetadata {
  
  @scala.inline
  def apply(): CodeActionProviderMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeActionProviderMetadata]
  }
  
  @scala.inline
  implicit class CodeActionProviderMetadataOps[Self <: CodeActionProviderMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDocumentationVarargs(value: typings.vscode.anon.Command*): Self = this.set("documentation", js.Array(value :_*))
    
    @scala.inline
    def setDocumentation(value: js.Array[typings.vscode.anon.Command]): Self = this.set("documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
    
    @scala.inline
    def setProvidedCodeActionKindsVarargs(value: CodeActionKind*): Self = this.set("providedCodeActionKinds", js.Array(value :_*))
    
    @scala.inline
    def setProvidedCodeActionKinds(value: js.Array[CodeActionKind]): Self = this.set("providedCodeActionKinds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvidedCodeActionKinds: Self = this.set("providedCodeActionKinds", js.undefined)
  }
}
