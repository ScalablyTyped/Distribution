package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings._empty
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.quickfix
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.refactor
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.refactorDotextract
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.refactorDotinline
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.refactorDotrewrite
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.source
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.sourceDotfixAll
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.sourceDotorganizeImports
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeActionKind {
  
  /**
    * Empty kind.
    */
  @JSImport("vscode-languageclient", "CodeActionKind.Empty")
  @js.native
  val Empty: _empty = js.native
  
  /**
    * Base kind for quickfix actions: 'quickfix'
    */
  @JSImport("vscode-languageclient", "CodeActionKind.QuickFix")
  @js.native
  val QuickFix: quickfix = js.native
  
  /**
    * Base kind for refactoring actions: 'refactor'
    */
  @JSImport("vscode-languageclient", "CodeActionKind.Refactor")
  @js.native
  val Refactor: refactor = js.native
  
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
  @JSImport("vscode-languageclient", "CodeActionKind.RefactorExtract")
  @js.native
  val RefactorExtract: refactorDotextract = js.native
  
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
  @JSImport("vscode-languageclient", "CodeActionKind.RefactorInline")
  @js.native
  val RefactorInline: refactorDotinline = js.native
  
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
  @JSImport("vscode-languageclient", "CodeActionKind.RefactorRewrite")
  @js.native
  val RefactorRewrite: refactorDotrewrite = js.native
  
  /**
    * Base kind for source actions: `source`
    *
    * Source code actions apply to the entire file.
    */
  @JSImport("vscode-languageclient", "CodeActionKind.Source")
  @js.native
  val Source: source = js.native
  
  /**
    * Base kind for auto-fix source actions: `source.fixAll`.
    *
    * Fix all actions automatically fix errors that have a clear fix that do not require user input.
    * They should not suppress errors or perform unsafe fixes such as generating new types or classes.
    *
    * @since 3.15.0
    */
  @JSImport("vscode-languageclient", "CodeActionKind.SourceFixAll")
  @js.native
  val SourceFixAll: sourceDotfixAll = js.native
  
  /**
    * Base kind for an organize imports source action: `source.organizeImports`
    */
  @JSImport("vscode-languageclient", "CodeActionKind.SourceOrganizeImports")
  @js.native
  val SourceOrganizeImports: sourceDotorganizeImports = js.native
}
