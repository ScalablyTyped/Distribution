package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReferenceResolverHost extends js.Object {
  def directoryExists(path: String): Boolean
  def fileExists(path: String): Boolean
  def getParentDirectory(path: String): String
  def getScriptSnapshot(fileName: String): IScriptSnapshot
  def resolveRelativePath(path: String, directory: String): String
}

object IReferenceResolverHost {
  @scala.inline
  def apply(
    directoryExists: String => Boolean,
    fileExists: String => Boolean,
    getParentDirectory: String => String,
    getScriptSnapshot: String => IScriptSnapshot,
    resolveRelativePath: (String, String) => String
  ): IReferenceResolverHost = {
    val __obj = js.Dynamic.literal(directoryExists = js.Any.fromFunction1(directoryExists), fileExists = js.Any.fromFunction1(fileExists), getParentDirectory = js.Any.fromFunction1(getParentDirectory), getScriptSnapshot = js.Any.fromFunction1(getScriptSnapshot), resolveRelativePath = js.Any.fromFunction2(resolveRelativePath))
    __obj.asInstanceOf[IReferenceResolverHost]
  }
}

