package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceFile extends Declaration {
  var amdDependencies: js.Array[AmdDependency] = js.native
  var endOfFileToken: Token[SyntaxKind] = js.native
  var fileName: java.lang.String = js.native
  /**
    * lib.d.ts should have a reference comment like
    *
    *  /// <reference no-default-lib="true"/>
    *
    * If any other file has this comment, it signals not to include lib.d.ts
    * because this containing file is intended to act as a default library.
    */
  var hasNoDefaultLib: scala.Boolean = js.native
  var isDeclarationFile: scala.Boolean = js.native
  var languageVariant: LanguageVariant = js.native
  var languageVersion: ScriptTarget = js.native
  var libReferenceDirectives: js.Array[FileReference] = js.native
  var moduleName: js.UndefOr[java.lang.String] = js.native
  var referencedFiles: js.Array[FileReference] = js.native
  var statements: NodeArray[Statement] = js.native
  var text: java.lang.String = js.native
  var typeReferenceDirectives: js.Array[FileReference] = js.native
  def getLineAndCharacterOfPosition(pos: scala.Double): LineAndCharacter = js.native
  def getLineEndOfPosition(pos: scala.Double): scala.Double = js.native
  def getLineStarts(): js.Array[scala.Double] = js.native
  def getPositionOfLineAndCharacter(line: scala.Double, character: scala.Double): scala.Double = js.native
  def update(newText: java.lang.String, textChangeRange: TextChangeRange): SourceFile = js.native
}

