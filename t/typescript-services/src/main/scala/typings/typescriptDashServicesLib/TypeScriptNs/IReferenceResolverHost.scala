package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReferenceResolverHost extends js.Object {
  def directoryExists(path: java.lang.String): scala.Boolean
  def fileExists(path: java.lang.String): scala.Boolean
  def getParentDirectory(path: java.lang.String): java.lang.String
  def getScriptSnapshot(fileName: java.lang.String): IScriptSnapshot
  def resolveRelativePath(path: java.lang.String, directory: java.lang.String): java.lang.String
}

