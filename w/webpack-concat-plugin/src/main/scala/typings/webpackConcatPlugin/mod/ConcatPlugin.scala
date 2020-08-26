package typings.webpackConcatPlugin.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A plugin to help webpack concat js and inject into html
  */
@js.native
trait ConcatPlugin extends Plugin {
  def ensureTrailingSlash(str: String): String = js.native
  def getFileName(file: String): String = js.native
  def getFileName(file: String, filePath: String): String = js.native
  def getFileName(file: StringDictionary[String]): String = js.native
  def getFileName(file: StringDictionary[String], filePath: String): String = js.native
  def getRelativePathAsync(context: String): js.Promise[String] = js.native
  def hashFile(files: String): String = js.native
  def hashFile(files: StringDictionary[String]): String = js.native
  def resolveConcatAndUglify(
    compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ js.Any,
    files: js.Array[String]
  ): Unit = js.native
  def resolveReadFiles(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any
  ): Unit = js.native
}

