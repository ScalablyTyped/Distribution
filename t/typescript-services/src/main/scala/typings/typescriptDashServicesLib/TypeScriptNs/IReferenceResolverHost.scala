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
    directoryExists: java.lang.String => scala.Boolean,
    fileExists: java.lang.String => scala.Boolean,
    getParentDirectory: java.lang.String => java.lang.String,
    getScriptSnapshot: java.lang.String => IScriptSnapshot,
    resolveRelativePath: (java.lang.String, java.lang.String) => java.lang.String
  ): IReferenceResolverHost = {
    val __obj = js.Dynamic.literal(directoryExists = js.Any.fromFunction1(directoryExists), fileExists = js.Any.fromFunction1(fileExists), getParentDirectory = js.Any.fromFunction1(getParentDirectory), getScriptSnapshot = js.Any.fromFunction1(getScriptSnapshot), resolveRelativePath = js.Any.fromFunction2(resolveRelativePath))
  
    __obj.asInstanceOf[IReferenceResolverHost]
  }
}

