package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "FileSystemError")
@js.native
/**
		 * Creates a new filesystem error.
		 *
		 * @param messageOrUri Message or uri.
		 */
class FileSystemError ()
  extends stdLib.Error {
  def this(messageOrUri: java.lang.String) = this()
  def this(messageOrUri: Uri) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

/* static members */
@JSImport("vscode", "FileSystemError")
@js.native
object FileSystemError extends js.Object {
  /**
  		 * Create an error to signal that a file or folder already exists, e.g. when
  		 * creating but not overwriting a file.
  		 * @param messageOrUri Message or uri.
  		 */
  def FileExists(): vscodeLib.vscodeMod.FileSystemError = js.native
  def FileExists(messageOrUri: java.lang.String): vscodeLib.vscodeMod.FileSystemError = js.native
  def FileExists(messageOrUri: vscodeLib.vscodeMod.Uri): vscodeLib.vscodeMod.FileSystemError = js.native
  /**
  		 * Create an error to signal that a file is a folder.
  		 * @param messageOrUri Message or uri.
  		 */
  def FileIsADirectory(): vscodeLib.vscodeMod.FileSystemError = js.native
  def FileIsADirectory(messageOrUri: java.lang.String): vscodeLib.vscodeMod.FileSystemError = js.native
  def FileIsADirectory(messageOrUri: vscodeLib.vscodeMod.Uri): vscodeLib.vscodeMod.FileSystemError = js.native
  /**
  		 * Create an error to signal that a file is not a folder.
  		 * @param messageOrUri Message or uri.
  		 */
  def FileNotADirectory(): vscodeLib.vscodeMod.FileSystemError = js.native
  def FileNotADirectory(messageOrUri: java.lang.String): vscodeLib.vscodeMod.FileSystemError = js.native
  def FileNotADirectory(messageOrUri: vscodeLib.vscodeMod.Uri): vscodeLib.vscodeMod.FileSystemError = js.native
  /**
  		 * Create an error to signal that a file or folder wasn't found.
  		 * @param messageOrUri Message or uri.
  		 */
  def FileNotFound(): vscodeLib.vscodeMod.FileSystemError = js.native
  def FileNotFound(messageOrUri: java.lang.String): vscodeLib.vscodeMod.FileSystemError = js.native
  def FileNotFound(messageOrUri: vscodeLib.vscodeMod.Uri): vscodeLib.vscodeMod.FileSystemError = js.native
  /**
  		 * Create an error to signal that an operation lacks required permissions.
  		 * @param messageOrUri Message or uri.
  		 */
  def NoPermissions(): vscodeLib.vscodeMod.FileSystemError = js.native
  def NoPermissions(messageOrUri: java.lang.String): vscodeLib.vscodeMod.FileSystemError = js.native
  def NoPermissions(messageOrUri: vscodeLib.vscodeMod.Uri): vscodeLib.vscodeMod.FileSystemError = js.native
  /**
  		 * Create an error to signal that the file system is unavailable or too busy to
  		 * complete a request.
  		 * @param messageOrUri Message or uri.
  		 */
  def Unavailable(): vscodeLib.vscodeMod.FileSystemError = js.native
  def Unavailable(messageOrUri: java.lang.String): vscodeLib.vscodeMod.FileSystemError = js.native
  def Unavailable(messageOrUri: vscodeLib.vscodeMod.Uri): vscodeLib.vscodeMod.FileSystemError = js.native
}

