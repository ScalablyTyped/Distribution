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

object IReferenceResolverHost {
  @scala.inline
  def apply(
    directoryExists: js.Function1[java.lang.String, scala.Boolean],
    fileExists: js.Function1[java.lang.String, scala.Boolean],
    getParentDirectory: js.Function1[java.lang.String, java.lang.String],
    getScriptSnapshot: js.Function1[java.lang.String, IScriptSnapshot],
    resolveRelativePath: js.Function2[java.lang.String, java.lang.String, java.lang.String]
  ): IReferenceResolverHost = {
    val __obj = js.Dynamic.literal(directoryExists = directoryExists, fileExists = fileExists, getParentDirectory = getParentDirectory, getScriptSnapshot = getScriptSnapshot, resolveRelativePath = resolveRelativePath)
  
    __obj.asInstanceOf[IReferenceResolverHost]
  }
}

