package typings.typedoc.mod.TypeScript

import typings.typescript.mod.DocumentRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createDocumentRegistry")
@js.native
object createDocumentRegistry extends js.Object {
  
  def apply(): DocumentRegistry = js.native
  def apply(useCaseSensitiveFileNames: js.UndefOr[scala.Nothing], currentDirectory: String): DocumentRegistry = js.native
  def apply(useCaseSensitiveFileNames: Boolean): DocumentRegistry = js.native
  def apply(useCaseSensitiveFileNames: Boolean, currentDirectory: String): DocumentRegistry = js.native
}
