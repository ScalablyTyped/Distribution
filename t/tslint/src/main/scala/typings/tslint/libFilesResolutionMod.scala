package typings.tslint

import typings.tslint.libRunnerMod.Logger
import typings.tslint.libRunnerMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/files/resolution", JSImport.Namespace)
@js.native
object libFilesResolutionMod extends js.Object {
  def filterFiles(files: js.Array[String], patterns: js.Array[String], include: Boolean): js.Array[String] = js.native
  def findTsconfig(project: String): js.UndefOr[String] = js.native
  def resolveFilesAndProgram(hasFilesProjectExcludeOutputAbsolutePaths: Options, logger: Logger): Anon_Files = js.native
  def resolveGlobs(
    files: js.Array[String],
    ignore: js.Array[String],
    outputAbsolutePaths: js.UndefOr[scala.Nothing],
    logger: Logger
  ): js.Array[String] = js.native
  def resolveGlobs(files: js.Array[String], ignore: js.Array[String], outputAbsolutePaths: Boolean, logger: Logger): js.Array[String] = js.native
}

