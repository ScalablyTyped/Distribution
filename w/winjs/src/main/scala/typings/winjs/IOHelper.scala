package typings.winjs

import typings.winjs.WinJS.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Utility class for easy access to operations on application folders
**/
@js.native
trait IOHelper extends StObject {
  
  /**
    * Determines whether the specified file exists in the folder.
    * @param filename The name of the file.
    * @returns A promise that completes with a value of either true (if the file exists) or false.
    **/
  def exists(filename: String): Promise[Boolean] = js.native
  
  /**
    * Reads the specified file. If the file doesn't exist, the specified default value is returned.
    * @param fileName The file to read from.
    * @param def The default value to be returned if the file failed to open.
    * @returns A promise that completes with a value that is either the contents of the file, or the specified default value.
    **/
  def readText(fileName: String): Promise[String] = js.native
  def readText(fileName: String, `def`: String): Promise[String] = js.native
  
  /**
    * Deletes a file from the folder.
    * @param fileName The file to be deleted.
    * @returns A promise that is fulfilled when the file has been deleted.
    **/
  def remove(fileName: String): Promise[Unit] = js.native
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  var storage: Any = js.native
  
  /**
    * Writes the specified text to the specified file.
    * @param fileName The name of the file.
    * @param text The content to be written to the file.
    * @returns A promise that is completed when the file has been written.
    **/
  def writeText(fileName: String, text: String): Promise[Double] = js.native
}
