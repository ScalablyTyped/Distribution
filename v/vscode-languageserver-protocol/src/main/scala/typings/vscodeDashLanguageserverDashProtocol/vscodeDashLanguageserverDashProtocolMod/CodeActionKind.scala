package typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "CodeActionKind")
@js.native
object CodeActionKind extends js.Object {
  /**
    * Base kind for quickfix actions: 'quickfix'
    */
  val QuickFix: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeActionKind = js.native
  /**
    * Base kind for refactoring actions: 'refactor'
    */
  val Refactor: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeActionKind = js.native
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
  val RefactorExtract: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeActionKind = js.native
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
  val RefactorInline: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeActionKind = js.native
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
  val RefactorRewrite: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeActionKind = js.native
  /**
    * Base kind for source actions: `source`
    *
    * Source code actions apply to the entire file.
    */
  val Source: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeActionKind = js.native
  /**
    * Base kind for an organize imports source action: `source.organizeImports`
    */
  val SourceOrganizeImports: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeActionKind = js.native
}

