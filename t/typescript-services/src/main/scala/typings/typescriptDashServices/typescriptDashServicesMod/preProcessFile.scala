package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.IPreProcessedFileInfo
import typings.typescriptDashServices.TypeScript.IScriptSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "preProcessFile")
@js.native
object preProcessFile extends js.Object {
  def apply(fileName: String, sourceText: IScriptSnapshot): IPreProcessedFileInfo = js.native
  def apply(fileName: String, sourceText: IScriptSnapshot, readImportFiles: Boolean): IPreProcessedFileInfo = js.native
}

