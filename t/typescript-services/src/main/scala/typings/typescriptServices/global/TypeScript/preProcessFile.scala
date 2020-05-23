package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.IPreProcessedFileInfo
import typings.typescriptServices.TypeScript.IScriptSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.preProcessFile")
@js.native
object preProcessFile extends js.Object {
  def apply(fileName: String, sourceText: IScriptSnapshot): IPreProcessedFileInfo = js.native
  def apply(fileName: String, sourceText: IScriptSnapshot, readImportFiles: Boolean): IPreProcessedFileInfo = js.native
}

