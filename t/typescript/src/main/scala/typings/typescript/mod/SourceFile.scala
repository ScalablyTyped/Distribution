package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceFile
  extends Declaration
     with BlockLike {
  
  var amdDependencies: js.Array[AmdDependency] = js.native
  
  val endOfFileToken: Token[typings.typescript.mod.SyntaxKind.EndOfFileToken] = js.native
  
  var fileName: java.lang.String = js.native
  
  def getLineAndCharacterOfPosition(pos: Double): LineAndCharacter = js.native
  
  def getLineEndOfPosition(pos: Double): Double = js.native
  
  def getLineStarts(): js.Array[Double] = js.native
  
  def getPositionOfLineAndCharacter(line: Double, character: Double): Double = js.native
  
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
  val kind_SourceFile: typings.typescript.mod.SyntaxKind.SourceFile = js.native
  
  var languageVariant: LanguageVariant = js.native
  
  var languageVersion: ScriptTarget = js.native
  
  var libReferenceDirectives: js.Array[FileReference] = js.native
  
  var moduleName: js.UndefOr[java.lang.String] = js.native
  
  var referencedFiles: js.Array[FileReference] = js.native
  
  val statements: NodeArray[Statement] = js.native
  
  var text: java.lang.String = js.native
  
  var typeReferenceDirectives: js.Array[FileReference] = js.native
  
  def update(newText: java.lang.String, textChangeRange: TextChangeRange): SourceFile = js.native
}
