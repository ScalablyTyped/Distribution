package typings.tslint

import typings.tslint.anon.Files
import typings.tslint.runnerMod.Logger
import typings.tslint.runnerMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolutionMod {
  
  @JSImport("tslint/lib/files/resolution", "filterFiles")
  @js.native
  def filterFiles(files: js.Array[String], patterns: js.Array[String], include: Boolean): js.Array[String] = js.native
  
  @JSImport("tslint/lib/files/resolution", "findTsconfig")
  @js.native
  def findTsconfig(project: String): js.UndefOr[String] = js.native
  
  @JSImport("tslint/lib/files/resolution", "resolveFilesAndProgram")
  @js.native
  def resolveFilesAndProgram(hasFilesProjectExcludeOutputAbsolutePaths: Options, logger: Logger): Files = js.native
  
  @JSImport("tslint/lib/files/resolution", "resolveGlobs")
  @js.native
  def resolveGlobs(
    files: js.Array[String],
    ignore: js.Array[String],
    outputAbsolutePaths: js.UndefOr[scala.Nothing],
    logger: Logger
  ): js.Array[String] = js.native
  @JSImport("tslint/lib/files/resolution", "resolveGlobs")
  @js.native
  def resolveGlobs(files: js.Array[String], ignore: js.Array[String], outputAbsolutePaths: Boolean, logger: Logger): js.Array[String] = js.native
}
