package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeActionKind {
  
  /**
    * Empty kind.
    */
  @JSImport("vscode-languageserver-types", "CodeActionKind.Empty")
  @js.native
  val Empty: CodeActionKind = js.native
  
  /**
    * Base kind for quickfix actions: 'quickfix'
    */
  @JSImport("vscode-languageserver-types", "CodeActionKind.QuickFix")
  @js.native
  val QuickFix: CodeActionKind = js.native
  
  /**
    * Base kind for refactoring actions: 'refactor'
    */
  @JSImport("vscode-languageserver-types", "CodeActionKind.Refactor")
  @js.native
  val Refactor: CodeActionKind = js.native
  
  /**
    * Base kind for refactoring extraction actions: 'refactor.extract'
    *
    * Example extract actions:
    *
    * - Extract method
    * - Extract function
    * - Extract variable
    * - Extract interface from class
    * - ...
    */
  @JSImport("vscode-languageserver-types", "CodeActionKind.RefactorExtract")
  @js.native
  val RefactorExtract: CodeActionKind = js.native
  
  /**
    * Base kind for refactoring inline actions: 'refactor.inline'
    *
    * Example inline actions:
    *
    * - Inline function
    * - Inline variable
    * - Inline constant
    * - ...
    */
  @JSImport("vscode-languageserver-types", "CodeActionKind.RefactorInline")
  @js.native
  val RefactorInline: CodeActionKind = js.native
  
  /**
    * Base kind for refactoring rewrite actions: 'refactor.rewrite'
    *
    * Example rewrite actions:
    *
    * - Convert JavaScript function to class
    * - Add or remove parameter
    * - Encapsulate field
    * - Make method static
    * - Move method to base class
    * - ...
    */
  @JSImport("vscode-languageserver-types", "CodeActionKind.RefactorRewrite")
  @js.native
  val RefactorRewrite: CodeActionKind = js.native
  
  /**
    * Base kind for source actions: `source`
    *
    * Source code actions apply to the entire file.
    */
  @JSImport("vscode-languageserver-types", "CodeActionKind.Source")
  @js.native
  val Source: CodeActionKind = js.native
  
  /**
    * Base kind for auto-fix source actions: `source.fixAll`.
    *
    * Fix all actions automatically fix errors that have a clear fix that do not require user input.
    * They should not suppress errors or perform unsafe fixes such as generating new types or classes.
    *
    * @since 3.15.0
    */
  @JSImport("vscode-languageserver-types", "CodeActionKind.SourceFixAll")
  @js.native
  val SourceFixAll: CodeActionKind = js.native
  
  /**
    * Base kind for an organize imports source action: `source.organizeImports`
    */
  @JSImport("vscode-languageserver-types", "CodeActionKind.SourceOrganizeImports")
  @js.native
  val SourceOrganizeImports: CodeActionKind = js.native
}
