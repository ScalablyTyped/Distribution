package typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeActionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "CodeActionKind")
@js.native
object CodeActionKindNs extends js.Object {
  /**
    * Base kind for quickfix actions: 'quickfix'
    */
  val QuickFix: CodeActionKind = js.native
  /**
    * Base kind for refactoring actions: 'refactor'
    */
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
  val RefactorRewrite: CodeActionKind = js.native
  /**
    * Base kind for source actions: `source`
    *
    * Source code actions apply to the entire file.
    */
  val Source: CodeActionKind = js.native
  /**
    * Base kind for an organize imports source action: `source.organizeImports`
    */
  val SourceOrganizeImports: CodeActionKind = js.native
}

