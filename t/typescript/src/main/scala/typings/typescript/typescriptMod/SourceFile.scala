package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceFile
  extends Declaration
     with BlockLike {
  var amdDependencies: js.Array[AmdDependency] = js.native
  var endOfFileToken: Token[typings.typescript.typescriptMod.SyntaxKind.EndOfFileToken] = js.native
  var fileName: String = js.native
  /**
    * lib.d.ts should have a reference comment like
    *
    *  /// <reference no-default-lib="true"/>
    *
    * If any other file has this comment, it signals not to include lib.d.ts
    * because this containing file is intended to act as a default library.
    */
  var hasNoDefaultLib: Boolean = js.native
  var isDeclarationFile: Boolean = js.native
  @JSName("kind")
  var kind_SourceFile: typings.typescript.typescriptMod.SyntaxKind.SourceFile = js.native
  var languageVariant: LanguageVariant = js.native
  var languageVersion: ScriptTarget = js.native
  var libReferenceDirectives: js.Array[FileReference] = js.native
  var moduleName: js.UndefOr[String] = js.native
  var referencedFiles: js.Array[FileReference] = js.native
  var statements: NodeArray[Statement] = js.native
  var text: String = js.native
  var typeReferenceDirectives: js.Array[FileReference] = js.native
  def getLineAndCharacterOfPosition(pos: Double): LineAndCharacter = js.native
  def getLineEndOfPosition(pos: Double): Double = js.native
  def getLineStarts(): js.Array[Double] = js.native
  def getPositionOfLineAndCharacter(line: Double, character: Double): Double = js.native
  def update(newText: String, textChangeRange: TextChangeRange): SourceFile = js.native
}

