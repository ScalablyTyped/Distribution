package typings.vscode.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
/* static members */
object FileSystemError {
  
  /**
    * Create an error to signal that a file or folder already exists, e.g. when
    * creating but not overwriting a file.
    * @param messageOrUri Message or uri.
    */
  @JSImport("vscode", "FileSystemError.FileExists")
  @js.native
  def FileExists(): FileSystemError = js.native
  @JSImport("vscode", "FileSystemError.FileExists")
  @js.native
  def FileExists(messageOrUri: String): FileSystemError = js.native
  @JSImport("vscode", "FileSystemError.FileExists")
  @js.native
  def FileExists(messageOrUri: Uri): FileSystemError = js.native
  
  /**
    * Create an error to signal that a file is a folder.
    * @param messageOrUri Message or uri.
    */
  @JSImport("vscode", "FileSystemError.FileIsADirectory")
  @js.native
  def FileIsADirectory(): FileSystemError = js.native
  @JSImport("vscode", "FileSystemError.FileIsADirectory")
  @js.native
  def FileIsADirectory(messageOrUri: String): FileSystemError = js.native
  @JSImport("vscode", "FileSystemError.FileIsADirectory")
  @js.native
  def FileIsADirectory(messageOrUri: Uri): FileSystemError = js.native
  
  /**
    * Create an error to signal that a file is not a folder.
    * @param messageOrUri Message or uri.
    */
  @JSImport("vscode", "FileSystemError.FileNotADirectory")
  @js.native
  def FileNotADirectory(): FileSystemError = js.native
  @JSImport("vscode", "FileSystemError.FileNotADirectory")
  @js.native
  def FileNotADirectory(messageOrUri: String): FileSystemError = js.native
  @JSImport("vscode", "FileSystemError.FileNotADirectory")
  @js.native
  def FileNotADirectory(messageOrUri: Uri): FileSystemError = js.native
  
  /**
    * Create an error to signal that a file or folder wasn't found.
    * @param messageOrUri Message or uri.
    */
  @JSImport("vscode", "FileSystemError.FileNotFound")
  @js.native
  def FileNotFound(): FileSystemError = js.native
  @JSImport("vscode", "FileSystemError.FileNotFound")
  @js.native
  def FileNotFound(messageOrUri: String): FileSystemError = js.native
  @JSImport("vscode", "FileSystemError.FileNotFound")
  @js.native
  def FileNotFound(messageOrUri: Uri): FileSystemError = js.native
  
  /**
    * Create an error to signal that an operation lacks required permissions.
    * @param messageOrUri Message or uri.
    */
  @JSImport("vscode", "FileSystemError.NoPermissions")
  @js.native
  def NoPermissions(): FileSystemError = js.native
  @JSImport("vscode", "FileSystemError.NoPermissions")
  @js.native
  def NoPermissions(messageOrUri: String): FileSystemError = js.native
  @JSImport("vscode", "FileSystemError.NoPermissions")
  @js.native
  def NoPermissions(messageOrUri: Uri): FileSystemError = js.native
  
  /**
    * Create an error to signal that the file system is unavailable or too busy to
    * complete a request.
    * @param messageOrUri Message or uri.
    */
  @JSImport("vscode", "FileSystemError.Unavailable")
  @js.native
  def Unavailable(): FileSystemError = js.native
  @JSImport("vscode", "FileSystemError.Unavailable")
  @js.native
  def Unavailable(messageOrUri: String): FileSystemError = js.native
  @JSImport("vscode", "FileSystemError.Unavailable")
  @js.native
  def Unavailable(messageOrUri: Uri): FileSystemError = js.native
}
