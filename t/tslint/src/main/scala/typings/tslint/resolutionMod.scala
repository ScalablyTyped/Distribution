package typings.tslint

import typings.tslint.anon.Files
import typings.tslint.runnerMod.Logger
import typings.tslint.runnerMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolutionMod {
  
  @JSImport("tslint/lib/files/resolution", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def filterFiles(files: js.Array[String], patterns: js.Array[String], include: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterFiles")(files.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any], include.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def findTsconfig(project: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findTsconfig")(project.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def resolveFilesAndProgram(hasFilesProjectExcludeOutputAbsolutePaths: Options, logger: Logger): Files = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFilesAndProgram")(hasFilesProjectExcludeOutputAbsolutePaths.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[Files]
  
  @scala.inline
  def resolveGlobs(files: js.Array[String], ignore: js.Array[String], outputAbsolutePaths: Boolean, logger: Logger): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveGlobs")(files.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any], outputAbsolutePaths.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def resolveGlobs(files: js.Array[String], ignore: js.Array[String], outputAbsolutePaths: Unit, logger: Logger): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveGlobs")(files.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any], outputAbsolutePaths.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
