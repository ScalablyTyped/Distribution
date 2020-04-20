package typings.tabris.mod

import typings.std.ArrayBuffer
import typings.tabris.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "FileSystem")
@js.native
class FileSystem protected () extends NativeObject {
  /**
    * An external path of a directory that the app may use to store cached files. External storage may be
    * any type like permanent internal disc storage, sd-card or a usb stick. The OS may delete files in
    * this directory when the device runs low on storage. Only use this location for data that can easily
    * be re-created.
    * @constant
    */
  val cacheDir: String = js.native
  /**
    * An list of external paths that the app may use to store cached files. External storage may be any
    * type storage type like permanent internal disc storage, sd-card or a usb stick. In case no type of
    * external storage is available the list will be empty.
    * The OS may delete files in this directory when the device runs low on storage. Only use this location
    * for data that can easily be re-created.
    * @constant
    */
  val externalCacheDirs: js.Array[String] = js.native
  /**
    * A list of external paths that the app may use to store persistent files. External storage may be any
    * storage type like permanent internal disc storage, sd-card or a usb stick. In case no type of
    * external storage is available the list will be empty.
    * This is *not* the directory that contains the files bundled with the project, e.g. images, js files,
    * `package.json`. You can access these files using the `fetch` or `XMLHttpRequest` APIs.
    * @constant
    */
  val externalFileDirs: js.Array[String] = js.native
  /**
    * The path of a directory that the app may use to store persistent files. This is *not* the directory
    * that contains the files bundled with the project, e.g. images, js files, `package.json`. You can
    * access these files using the `fetch` or `XMLHttpRequest` APIs.
    * @constant
    */
  val filesDir: String = js.native
  /**
    * Writes the given binary content to the given file. If the file exists, it is appended, otherwise it
    * is created. Returns a promise that resolves with `true` if a new file was created, or with `false` if
    * the file already existed. It rejects with an Error if the path points to a directory.
    * @param path The path of the file to append.
    * @param data The content to append to the file.
    */
  def appendToFile(path: String, data: ArrayBuffer): js.Promise[Boolean] = js.native
  def appendToFile(path: String, data: Blob): js.Promise[Boolean] = js.native
  /**
    * Writes the given text to the given file using the given encoding or `utf-8` if no encoding is
    * specified. If the file exists, it is appended, otherwise it is created. Returns a promise that
    * resolves with `true` if a new file was created, or with `false` if the file already existed. It
    * rejects with an Error if the path points to a directory.
    * @param path The path of the file to append.
    * @param text The text to write to the file.
    * @param encoding The encoding to use to write a text file. When omitted, `utf-8` will be used.
    */
  def appendToFile(path: String, text: String): js.Promise[Boolean] = js.native
  def appendToFile(path: String, text: String, encoding: String): js.Promise[Boolean] = js.native
  /**
    * Creates a directory on the given path, including intermediate directories. Returns a promise that
    * resolves with `true` if the directory was created, or with `false` if it  already existed. If the
    * path points to a file the promise rejects.
    * @param path The path of the directory to create.
    */
  def createDir(path: String): js.Promise[Boolean] = js.native
  /**
    * Returns `true` if there is a directory at the given path. Otherwise (no directory, or is a file) it
    * returns `false`.
    * @param path The path of the directory.
    */
  def isDir(path: String): Boolean = js.native
  /**
    * Returns `true` if there is a file at the given path. Otherwise (no file, or is a directory) it
    * returns `false`.
    * @param path The path of the file.
    */
  def isFile(path: String): Boolean = js.native
  /**
    * Reads the contents of a given directory. Returns a promise that resolves on success to an array of
    * the names of the files in the directory excluding '.' and '..'. If no directory exists at that path
    * the Promise rejects with an error object.
    * @param path The path of the directory to read.
    */
  def readDir(path: String): js.Promise[js.Array[String]] = js.native
  /**
    * Reads the given file and returns a promise that resolves to the contents of the file on success and
    * rejects with an error object if no file exists at that path. The file contents are returned as an
    * ArrayBuffer.
    * @param path The path of the file to read.
    */
  def readFile(path: String): js.Promise[ArrayBuffer] = js.native
  /**
    * Reads the given text file and returns a promise that resolves to the contents of the file on success
    * and rejects with an Error if no file exists at that path. The file contents are returned as a string.
    * @param path The path of the file to read.
    * @param encoding The encoding to use to read text files.
    */
  def readFile(path: String, encoding: String): js.Promise[String] = js.native
  /**
    * Removes the given file or directory. If the directory is not empty all its contents will also be
    * deleted. If there is no file or directory at the given path nothing will happen. Returns a promise
    * that resolves with `true` if something was deleted, otherwise `false`. Rejects with an error object
    * only in case of an access error.
    * @param path The path to the file or directory to remove.
    */
  def remove(path: String): js.Promise[Boolean] = js.native
  /**
    * Removes the given directory if it exists. If the directory is not empty all its contents will also be
    * deleted. Returns a promise that resolves if the directory was deleted or none existed at that path.
    * If the path points to a file the promise rejects.
    * @param path The path of the directory to remove. Must be empty.
    */
  def removeDir(path: String): js.Promise[Unit] = js.native
  /**
    * Removes the given file if it exists. Returns a promise that resolves with `true` on success or with
    * `false` if no directory exists at that path. If the path points to a directory the promise rejects.
    * @param path The path of the file to remove.
    */
  def removeFile(path: String): js.Promise[Unit] = js.native
  /**
    * Writes the given binary contents to the given file. If the file exists, it is overwritten, otherwise
    * it is created. Returns a promise that resolves on success and rejects with an Error in case of a
    * failure.
    * @param path The path of the file to write.
    * @param data The contents to write to the file.
    */
  def writeFile(path: String, data: ArrayBuffer): js.Promise[Unit] = js.native
  def writeFile(path: String, data: Blob): js.Promise[Unit] = js.native
  /**
    * Writes the given text to the given file using the given encoding or `utf-8` if no encoding is
    * specified. If the file exists, it is overwritten, otherwise it is created. Returns a promise that
    * resolves on success and rejects with an Error in case of a failure.
    * @param path The path of the file to write.
    * @param text The text to write to the file.
    * @param encoding The encoding to use to write a text file. When omitted, `utf-8` will be used.
    */
  def writeFile(path: String, text: String): js.Promise[Unit] = js.native
  def writeFile(path: String, text: String, encoding: String): js.Promise[Unit] = js.native
}

