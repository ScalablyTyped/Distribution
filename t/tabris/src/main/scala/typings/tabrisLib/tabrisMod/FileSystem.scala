package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `fs` object provides methods to read and write files. All methods are asynchronous and return a
  * promise.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tabrisLib.tabrisMod._FileSystemProperties because Already inherited */ @JSImport("tabris", "FileSystem")
@js.native
class FileSystem protected () extends NativeObject {
  /**
    * The path of a directory that the app may use to store cached files. The OS may delete files in this
    * directory when the device runs low on storage. Only use this location for data that can easily be
    * re-created.
    * @static
    */
  val cacheDir: java.lang.String = js.native
  /**
    * The path of a directory that the app may use to store persistent files.
    * @static
    */
  val filesDir: java.lang.String = js.native
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_FileSystem: tabrisLib.FileSystemProperties = js.native
  /**
    * Reads the contents of a given directory. Returns a promise that resolves on success to an array of
    * the names of the files in the directory excluding '.' and '..'. In case of failure, the Promise
    * rejects with an Error.
    * @param path The path of the directory to read.
    */
  def readDir(path: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  /**
    * Reads the given file and returns a promise that resolves to the contents of the file on success and
    * rejects with an Error in case of a failure. The file contents are returned as an ArrayBuffer.
    * @param path The path of the file to read.
    */
  def readFile(path: java.lang.String): js.Promise[stdLib.ArrayBuffer] = js.native
  /**
    * Reads the given text file and returns a promise that resolves to the contents of the file on success
    * and rejects with an Error in case of a failure. The file contents are returned as a string.
    * @param path The path of the file to read.
    * @param encoding The encoding to use to read text files.
    */
  def readFile(path: java.lang.String, encoding: java.lang.String): js.Promise[java.lang.String] = js.native
  /**
    * Removes the given file. Returns a promise that resolves on success and rejects with an Error in case
    * of a failure.
    * @param path The path of the file to remove.
    */
  def removeFile(path: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Writes the given binary contents to the given file. If the file exists, it is overwritten, otherwise
    * it is created. Returns a promise that resolves on success and rejects with an Error in case of a
    * failure.
    * @param path The path of the file to write.
    * @param data The contents to write to the file.
    */
  def writeFile(path: java.lang.String, data: stdLib.ArrayBuffer): js.Promise[scala.Unit] = js.native
  /**
    * Writes the given text to the given file using the given encoding or `utf-8` if no encoding is
    * specified. If the file exists, it is overwritten, otherwise it is created. Returns a promise that
    * resolves on success and rejects with an Error in case of a failure.
    * @param path The path of the file to write.
    * @param text The text to write to the file.
    * @param encoding The encoding to use to write a text file. When omitted, `utf-8` will be used.
    */
  def writeFile(path: java.lang.String, text: java.lang.String): js.Promise[scala.Unit] = js.native
  def writeFile(path: java.lang.String, text: java.lang.String, encoding: java.lang.String): js.Promise[scala.Unit] = js.native
}

