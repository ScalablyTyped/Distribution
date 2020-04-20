package typings.tabris

import typings.std.ArrayBuffer
import typings.tabris.mod._ImageValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Blob
/**
  * Represents raw data of a given type.
  */
@JSGlobal("Blob")
@js.native
class Blob () extends _ImageValue {
  def this(blobParts: js.Array[_]) = this()
  def this(blobParts: js.Array[_], options: AnonType) = this()
  /**
    * Size of the blob data in bytes
    * @constant
    */
  val size: Double = js.native
  /**
    * The MIME type of the blob data
    * @constant
    */
  val `type`: String = js.native
  /**
    * Reads the blob data into an ArrayBuffer and returns it in a promise. Each call creates a new
    * in-memory copy of the data.
    */
  def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
  /**
    * Decodes the blob data as a string and returns it in a promise.
    */
  def text(): js.Promise[String] = js.native
}

