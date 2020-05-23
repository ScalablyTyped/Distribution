package typings.vscode.mod

import typings.std.Error
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
class FileSystemError () extends Error {
  def this(messageOrUri: String) = this()
  def this(messageOrUri: Uri) = this()
  /**
    * A code that identifies this error.
    *
    * Possible values are names of errors, like [`FileNotFound`](#FileSystemError.FileNotFound),
    * or `Unknown` for unspecified errors.
    */
  val code: String = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
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
  def FileExists(): FileSystemError = js.native
  def FileExists(messageOrUri: String): FileSystemError = js.native
  def FileExists(messageOrUri: Uri): FileSystemError = js.native
  /**
    * Create an error to signal that a file is a folder.
    * @param messageOrUri Message or uri.
    */
  def FileIsADirectory(): FileSystemError = js.native
  def FileIsADirectory(messageOrUri: String): FileSystemError = js.native
  def FileIsADirectory(messageOrUri: Uri): FileSystemError = js.native
  /**
    * Create an error to signal that a file is not a folder.
    * @param messageOrUri Message or uri.
    */
  def FileNotADirectory(): FileSystemError = js.native
  def FileNotADirectory(messageOrUri: String): FileSystemError = js.native
  def FileNotADirectory(messageOrUri: Uri): FileSystemError = js.native
  /**
    * Create an error to signal that a file or folder wasn't found.
    * @param messageOrUri Message or uri.
    */
  def FileNotFound(): FileSystemError = js.native
  def FileNotFound(messageOrUri: String): FileSystemError = js.native
  def FileNotFound(messageOrUri: Uri): FileSystemError = js.native
  /**
    * Create an error to signal that an operation lacks required permissions.
    * @param messageOrUri Message or uri.
    */
  def NoPermissions(): FileSystemError = js.native
  def NoPermissions(messageOrUri: String): FileSystemError = js.native
  def NoPermissions(messageOrUri: Uri): FileSystemError = js.native
  /**
    * Create an error to signal that the file system is unavailable or too busy to
    * complete a request.
    * @param messageOrUri Message or uri.
    */
  def Unavailable(): FileSystemError = js.native
  def Unavailable(messageOrUri: String): FileSystemError = js.native
  def Unavailable(messageOrUri: Uri): FileSystemError = js.native
}

