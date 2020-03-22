package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Diagnostic
import typings.typescript.mod.SortedReadonlyArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.sortAndDeduplicateDiagnostics")
@js.native
object sortAndDeduplicateDiagnostics extends js.Object {
  def apply[T /* <: Diagnostic */](diagnostics: js.Array[T]): SortedReadonlyArray[T] = js.native
}

