package typings.tslint

import typings.tslint.anon.Files
import typings.tslint.runnerMod.Logger
import typings.tslint.runnerMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/files/resolution", JSImport.Namespace)
@js.native
object resolutionMod extends js.Object {
  
  def filterFiles(files: js.Array[String], patterns: js.Array[String], include: Boolean): js.Array[String] = js.native
  
  def findTsconfig(project: String): js.UndefOr[String] = js.native
  
  def resolveFilesAndProgram(hasFilesProjectExcludeOutputAbsolutePaths: Options, logger: Logger): Files = js.native
  
  def resolveGlobs(
    files: js.Array[String],
    ignore: js.Array[String],
    outputAbsolutePaths: js.UndefOr[scala.Nothing],
    logger: Logger
  ): js.Array[String] = js.native
  def resolveGlobs(files: js.Array[String], ignore: js.Array[String], outputAbsolutePaths: Boolean, logger: Logger): js.Array[String] = js.native
}
