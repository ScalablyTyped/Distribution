package typings.typedoc.mod.TypeScript

import typings.typescript.mod.PreProcessedFileInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.preProcessFile")
@js.native
object preProcessFile extends js.Object {
  
  def apply(sourceText: String): PreProcessedFileInfo = js.native
  def apply(sourceText: String, readImportFiles: js.UndefOr[scala.Nothing], detectJavaScriptImports: Boolean): PreProcessedFileInfo = js.native
  def apply(sourceText: String, readImportFiles: Boolean): PreProcessedFileInfo = js.native
  def apply(sourceText: String, readImportFiles: Boolean, detectJavaScriptImports: Boolean): PreProcessedFileInfo = js.native
}
