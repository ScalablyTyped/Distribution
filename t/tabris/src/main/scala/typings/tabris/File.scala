package typings.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// File
/**
  * Represents raw data of a given type and name.
  */
@JSGlobal("File")
@js.native
class File protected () extends Blob {
  def this(blobParts: js.Array[_], name: String) = this()
  def this(blobParts: js.Array[_], name: String, options: AnonLastModified) = this()
  /**
    * Unix timestamp of the last known modification of the file
    * @constant
    */
  val lastModified: Double = js.native
  /**
    * The name or path of the file
    * @constant
    */
  val name: String = js.native
}

