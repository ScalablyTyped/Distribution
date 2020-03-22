package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Bundle
import typings.typescript.mod.InputFiles
import typings.typescript.mod.SourceFile
import typings.typescript.mod.UnparsedSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateBundle")
@js.native
object updateBundle extends js.Object {
  def apply(node: Bundle, sourceFiles: js.Array[SourceFile]): Bundle = js.native
  def apply(node: Bundle, sourceFiles: js.Array[SourceFile], prepends: js.Array[UnparsedSource | InputFiles]): Bundle = js.native
}

