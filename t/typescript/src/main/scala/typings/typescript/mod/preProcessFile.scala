package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "preProcessFile")
@js.native
object preProcessFile extends js.Object {
  def apply(sourceText: java.lang.String): PreProcessedFileInfo = js.native
  def apply(
    sourceText: java.lang.String,
    readImportFiles: js.UndefOr[scala.Nothing],
    detectJavaScriptImports: Boolean
  ): PreProcessedFileInfo = js.native
  def apply(sourceText: java.lang.String, readImportFiles: Boolean): PreProcessedFileInfo = js.native
  def apply(sourceText: java.lang.String, readImportFiles: Boolean, detectJavaScriptImports: Boolean): PreProcessedFileInfo = js.native
}

