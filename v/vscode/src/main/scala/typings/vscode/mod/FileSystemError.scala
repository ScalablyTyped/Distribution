package typings.vscode.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "FileSystemError")
@js.native
/**
  * Creates a new filesystem error.
  *
  * @param messageOrUri Message or uri.
  */
class FileSystemError ()
  extends StObject
     with Error {
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
  var message: String = js.native
  
  /* CompleteClass */
  var name: String = js.native
}
/* static members */
object FileSystemError {
  
  @JSImport("vscode", "FileSystemError")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create an error to signal that a file or folder already exists, e.g. when
    * creating but not overwriting a file.
    * @param messageOrUri Message or uri.
    */
  @scala.inline
  def FileExists(): FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileExists")().asInstanceOf[FileSystemError]
  @scala.inline
  def FileExists(messageOrUri: String): FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileExists")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[FileSystemError]
  @scala.inline
  def FileExists(messageOrUri: Uri): FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileExists")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[FileSystemError]
  
  /**
    * Create an error to signal that a file is a folder.
    * @param messageOrUri Message or uri.
    */
  @scala.inline
  def FileIsADirectory(): FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileIsADirectory")().asInstanceOf[FileSystemError]
  @scala.inline
  def FileIsADirectory(messageOrUri: String): FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileIsADirectory")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[FileSystemError]
  @scala.inline
  def FileIsADirectory(messageOrUri: Uri): FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileIsADirectory")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[FileSystemError]
  
  /**
    * Create an error to signal that a file is not a folder.
    * @param messageOrUri Message or uri.
    */
  @scala.inline
  def FileNotADirectory(): FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileNotADirectory")().asInstanceOf[FileSystemError]
  @scala.inline
  def FileNotADirectory(messageOrUri: String): FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileNotADirectory")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[FileSystemError]
  @scala.inline
  def FileNotADirectory(messageOrUri: Uri): FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileNotADirectory")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[FileSystemError]
  
  /**
    * Create an error to signal that a file or folder wasn't found.
    * @param messageOrUri Message or uri.
    */
  @scala.inline
  def FileNotFound(): FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileNotFound")().asInstanceOf[FileSystemError]
  @scala.inline
  def FileNotFound(messageOrUri: String): FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileNotFound")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[FileSystemError]
  @scala.inline
  def FileNotFound(messageOrUri: Uri): FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileNotFound")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[FileSystemError]
  
  /**
    * Create an error to signal that an operation lacks required permissions.
    * @param messageOrUri Message or uri.
    */
  @scala.inline
  def NoPermissions(): FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("NoPermissions")().asInstanceOf[FileSystemError]
  @scala.inline
  def NoPermissions(messageOrUri: String): FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("NoPermissions")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[FileSystemError]
  @scala.inline
  def NoPermissions(messageOrUri: Uri): FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("NoPermissions")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[FileSystemError]
  
  /**
    * Create an error to signal that the file system is unavailable or too busy to
    * complete a request.
    * @param messageOrUri Message or uri.
    */
  @scala.inline
  def Unavailable(): FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("Unavailable")().asInstanceOf[FileSystemError]
  @scala.inline
  def Unavailable(messageOrUri: String): FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("Unavailable")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[FileSystemError]
  @scala.inline
  def Unavailable(messageOrUri: Uri): FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("Unavailable")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[FileSystemError]
}
