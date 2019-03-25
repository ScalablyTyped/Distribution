package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "CodeActionKind")
@js.native
class CodeActionKind protected () extends js.Object {
  protected def this(value: java.lang.String) = this()
  /**
  		 * String value of the kind, e.g. `"refactor.extract.function"`.
  		 */
  val value: java.lang.String = js.native
  /**
  		 * Create a new kind by appending a more specific selector to the current kind.
  		 *
  		 * Does not modify the current kind.
  		 */
  def append(parts: java.lang.String): CodeActionKind = js.native
  /**
  		 * Checks if `other` is a sub-kind of this `CodeActionKind`.
  		 *
  		 * The kind `"refactor.extract"` for example contains `"refactor.extract"` and ``"refactor.extract.function"`,
  		 * but not `"unicorn.refactor.extract"`, or `"refactor.extractAll"` or `refactor`.
  		 *
  		 * @param other Kind to check.
  		 */
  def contains(other: CodeActionKind): scala.Boolean = js.native
  /**
  		 * Checks if this code action kind intersects `other`.
  		 *
  		 * The kind `"refactor.extract"` for example intersects `refactor`, `"refactor.extract"` and ``"refactor.extract.function"`,
  		 * but not `"unicorn.refactor.extract"`, or `"refactor.extractAll"`.
  		 *
  		 * @param other Kind to check.
  		 */
  def intersects(other: CodeActionKind): scala.Boolean = js.native
}

/* static members */
@JSImport("vscode", "CodeActionKind")
@js.native
object CodeActionKind extends js.Object {
  /**
  		 * Empty kind.
  		 */
  val Empty: vscodeLib.vscodeMod.CodeActionKind = js.native
  /**
  		 * Base kind for quickfix actions: `quickfix`.
  		 *
  		 * Quick fix actions address a problem in the code and are shown in the normal code action context menu.
  		 */
  val QuickFix: vscodeLib.vscodeMod.CodeActionKind = js.native
  /**
  		 * Base kind for refactoring actions: `refactor`
  		 *
  		 * Refactoring actions are shown in the refactoring context menu.
  		 */
  val Refactor: vscodeLib.vscodeMod.CodeActionKind = js.native
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
  val RefactorExtract: vscodeLib.vscodeMod.CodeActionKind = js.native
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
  val RefactorInline: vscodeLib.vscodeMod.CodeActionKind = js.native
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
  val RefactorRewrite: vscodeLib.vscodeMod.CodeActionKind = js.native
  /**
  		 * Base kind for source actions: `source`
  		 *
  		 * Source code actions apply to the entire file and can be run on save
  		 * using `editor.codeActionsOnSave`. They also are shown in `source` context menu.
  		 */
  val Source: vscodeLib.vscodeMod.CodeActionKind = js.native
  /**
  		 * Base kind for auto-fix source actions: `source.fixAll`.
  		 *
  		 * Fix all actions automatically fix errors that have a clear fix that do not require user input.
  		 * They should not suppress errors or perform unsafe fixes such as generating new types or classes.
  		 */
  val SourceFixAll: vscodeLib.vscodeMod.CodeActionKind = js.native
  /**
  		 * Base kind for an organize imports source action: `source.organizeImports`.
  		 */
  val SourceOrganizeImports: vscodeLib.vscodeMod.CodeActionKind = js.native
}

