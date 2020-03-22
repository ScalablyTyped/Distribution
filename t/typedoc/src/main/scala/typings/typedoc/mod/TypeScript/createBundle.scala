package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Bundle
import typings.typescript.mod.InputFiles
import typings.typescript.mod.SourceFile
import typings.typescript.mod.UnparsedSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createBundle")
@js.native
object createBundle extends js.Object {
  def apply(sourceFiles: js.Array[SourceFile]): Bundle = js.native
  def apply(sourceFiles: js.Array[SourceFile], prepends: js.Array[UnparsedSource | InputFiles]): Bundle = js.native
}

