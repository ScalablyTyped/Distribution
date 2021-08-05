package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "CodeActionKind")
@js.native
class CodeActionKind protected () extends StObject {
  /* private */ def this(value: String) = this()
  
  /**
    * Create a new kind by appending a more specific selector to the current kind.
    *
    * Does not modify the current kind.
    */
  def append(parts: String): CodeActionKind = js.native
  
  /**
    * Checks if `other` is a sub-kind of this `CodeActionKind`.
    *
    * The kind `"refactor.extract"` for example contains `"refactor.extract"` and ``"refactor.extract.function"`,
    * but not `"unicorn.refactor.extract"`, or `"refactor.extractAll"` or `refactor`.
    *
    * @param other Kind to check.
    */
  def contains(other: CodeActionKind): Boolean = js.native
  
  /**
    * Checks if this code action kind intersects `other`.
    *
    * The kind `"refactor.extract"` for example intersects `refactor`, `"refactor.extract"` and ``"refactor.extract.function"`,
    * but not `"unicorn.refactor.extract"`, or `"refactor.extractAll"`.
    *
    * @param other Kind to check.
    */
  def intersects(other: CodeActionKind): Boolean = js.native
  
  /**
    * String value of the kind, e.g. `"refactor.extract.function"`.
    */
  val value: String = js.native
}
/* static members */
object CodeActionKind {
  
  /**
    * Empty kind.
    */
  @JSImport("vscode", "CodeActionKind.Empty")
  @js.native
  val Empty: CodeActionKind = js.native
  
  /**
    * Base kind for quickfix actions: `quickfix`.
    *
    * Quick fix actions address a problem in the code and are shown in the normal code action context menu.
    */
  @JSImport("vscode", "CodeActionKind.QuickFix")
  @js.native
  val QuickFix: CodeActionKind = js.native
  
  /**
    * Base kind for refactoring actions: `refactor`
    *
    * Refactoring actions are shown in the refactoring context menu.
    */
  @JSImport("vscode", "CodeActionKind.Refactor")
  @js.native
  val Refactor: CodeActionKind = js.native
  
  /**
    * Base kind for refactoring extraction actions: `refactor.extract`
    *
    * Example extract actions:
    *
    * - Extract method
    * - Extract function
    * - Extract variable
    * - Extract interface from class
    * - ...
    */
  @JSImport("vscode", "CodeActionKind.RefactorExtract")
  @js.native
  val RefactorExtract: CodeActionKind = js.native
  
  /**
    * Base kind for refactoring inline actions: `refactor.inline`
    *
    * Example inline actions:
    *
    * - Inline function
    * - Inline variable
    * - Inline constant
    * - ...
    */
  @JSImport("vscode", "CodeActionKind.RefactorInline")
  @js.native
  val RefactorInline: CodeActionKind = js.native
  
  /**
    * Base kind for refactoring rewrite actions: `refactor.rewrite`
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
  @JSImport("vscode", "CodeActionKind.RefactorRewrite")
  @js.native
  val RefactorRewrite: CodeActionKind = js.native
  
  /**
    * Base kind for source actions: `source`
    *
    * Source code actions apply to the entire file. They must be explicitly requested and will not show in the
    * normal [lightbulb](https://code.visualstudio.com/docs/editor/editingevolved#_code-action) menu. Source actions
    * can be run on save using `editor.codeActionsOnSave` and are also shown in the `source` context menu.
    */
  @JSImport("vscode", "CodeActionKind.Source")
  @js.native
  val Source: CodeActionKind = js.native
  
  /**
    * Base kind for auto-fix source actions: `source.fixAll`.
    *
    * Fix all actions automatically fix errors that have a clear fix that do not require user input.
    * They should not suppress errors or perform unsafe fixes such as generating new types or classes.
    */
  @JSImport("vscode", "CodeActionKind.SourceFixAll")
  @js.native
  val SourceFixAll: CodeActionKind = js.native
  
  /**
    * Base kind for an organize imports source action: `source.organizeImports`.
    */
  @JSImport("vscode", "CodeActionKind.SourceOrganizeImports")
  @js.native
  val SourceOrganizeImports: CodeActionKind = js.native
}
