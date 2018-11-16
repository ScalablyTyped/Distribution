package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEnvironment extends js.Object {
  var arguments: js.Array[java.lang.String] = js.native
  var newLine: java.lang.String = js.native
  var standardOut: stdLib.ITextWriter = js.native
  def currentDirectory(): java.lang.String = js.native
  def deleteFile(path: java.lang.String): scala.Unit = js.native
  def directoryExists(path: java.lang.String): scala.Boolean = js.native
  def fileExists(path: java.lang.String): scala.Boolean = js.native
  def listFiles(path: java.lang.String): js.Array[java.lang.String] = js.native
  def listFiles(path: java.lang.String, re: stdLib.RegExp): js.Array[java.lang.String] = js.native
  def listFiles(path: java.lang.String, re: stdLib.RegExp, options: typescriptDashServicesLib.Anon_Recursive): js.Array[java.lang.String] = js.native
  def readFile(path: java.lang.String, codepage: scala.Double): FileInformation = js.native
  def supportsCodePage(): scala.Boolean = js.native
  def writeFile(path: java.lang.String, contents: java.lang.String, writeByteOrderMark: scala.Boolean): scala.Unit = js.native
}

