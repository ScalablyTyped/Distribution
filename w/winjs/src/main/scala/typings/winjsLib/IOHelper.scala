package typings
package winjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Utility class for easy access to operations on application folders
**/
@js.native
trait IOHelper extends js.Object {
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  var storage: js.Any = js.native
  /**
    * Determines whether the specified file exists in the folder.
    * @param filename The name of the file.
    * @returns A promise that completes with a value of either true (if the file exists) or false.
    **/
  def exists(filename: java.lang.String): winjsLib.WinJSNs.Promise[scala.Boolean] = js.native
  /**
    * Reads the specified file. If the file doesn't exist, the specified default value is returned.
    * @param fileName The file to read from.
    * @param def The default value to be returned if the file failed to open.
    * @returns A promise that completes with a value that is either the contents of the file, or the specified default value.
    **/
  def readText(fileName: java.lang.String): winjsLib.WinJSNs.Promise[java.lang.String] = js.native
  def readText(fileName: java.lang.String, `def`: java.lang.String): winjsLib.WinJSNs.Promise[java.lang.String] = js.native
  /**
    * Deletes a file from the folder.
    * @param fileName The file to be deleted.
    * @returns A promise that is fulfilled when the file has been deleted.
    **/
  def remove(fileName: java.lang.String): winjsLib.WinJSNs.Promise[scala.Unit] = js.native
  /**
    * Writes the specified text to the specified file.
    * @param fileName The name of the file.
    * @param text The content to be written to the file.
    * @returns A promise that is completed when the file has been written.
    **/
  def writeText(fileName: java.lang.String, text: java.lang.String): winjsLib.WinJSNs.Promise[scala.Double] = js.native
}

