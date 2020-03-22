package typings.typedoc.mod.TypeScript

import typings.typescript.mod.FileReference
import typings.typescript.mod.SourceFile
import typings.typescript.mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateSourceFileNode")
@js.native
object updateSourceFileNode extends js.Object {
  def apply(node: SourceFile, statements: js.Array[Statement]): SourceFile = js.native
  def apply(node: SourceFile, statements: js.Array[Statement], isDeclarationFile: Boolean): SourceFile = js.native
  def apply(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: js.Array[FileReference]
  ): SourceFile = js.native
  def apply(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: js.Array[FileReference],
    typeReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def apply(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: js.Array[FileReference],
    typeReferences: js.Array[FileReference],
    hasNoDefaultLib: Boolean
  ): SourceFile = js.native
  def apply(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: js.Array[FileReference],
    typeReferences: js.Array[FileReference],
    hasNoDefaultLib: Boolean,
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
}

