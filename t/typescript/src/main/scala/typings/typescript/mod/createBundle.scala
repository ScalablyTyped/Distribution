package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createBundle")
@js.native
object createBundle extends js.Object {
  
  /** @deprecated Use `factory.createBundle` or the factory supplied by your transformation context instead. */
  def apply(sourceFiles: js.Array[SourceFile]): Bundle = js.native
  def apply(sourceFiles: js.Array[SourceFile], prepends: js.Array[UnparsedSource | InputFiles]): Bundle = js.native
}
