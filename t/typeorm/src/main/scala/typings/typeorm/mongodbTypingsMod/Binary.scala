package typings.typeorm.mongodbTypingsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/driver/mongodb/typings", "Binary")
@js.native
class Binary protected () extends js.Object {
  /**
    * @param buffer A buffer object containing the binary data.
    * @param subType The option binary type.
    */
  def this(buffer: Buffer) = this()
  def this(buffer: Buffer, subType: scala.Double) = this()
  
  /**
    * The length of the binary.
    */
  def length(): scala.Double = js.native
  
  def put(byte_value: String): Unit = js.native
  /**
    * Updates this binary with byte_value.
    *
    * @param byte_value A single byte we wish to write.
    */
  def put(byte_value: scala.Double): Unit = js.native
  
  /**
    * Reads length bytes starting at position.
    *
    * @param position Read from the given position in the Binary.
    * @param length The number of bytes to read.
    */
  def read(position: scala.Double, length: scala.Double): Buffer = js.native
  
  /**
    * Returns the value of this binary as a string.
    */
  def value(): String = js.native
  
  def write(buffer: String, offset: scala.Double): Unit = js.native
  /**
    * Writes a buffer or string to the binary
    *
    * @param buffer A string or buffer to be written to the Binary BSON object.
    * @param offset Specify the binary of where to write the content.
    */
  def write(buffer: Buffer, offset: scala.Double): Unit = js.native
}
/* static members */
@JSImport("typeorm/driver/mongodb/typings", "Binary")
@js.native
object Binary extends js.Object {
  
  /**
    * Byte Array BSON type.
    */
  var SUBTYPE_BYTE_ARRAY: scala.Double = js.native
  
  /**
    * Default BSON type.
    */
  var SUBTYPE_DEFAULT: scala.Double = js.native
  
  /**
    * Function BSON type.
    */
  var SUBTYPE_FUNCTION: scala.Double = js.native
  
  /**
    * MD5 BSON type.
    */
  var SUBTYPE_MD5: scala.Double = js.native
  
  /**
    * User BSON type.
    */
  var SUBTYPE_USER_DEFINED: scala.Double = js.native
  
  /**
    * UUID BSON type.
    */
  var SUBTYPE_UUID: scala.Double = js.native
  
  /**
    * OLD UUID BSON type
    */
  var SUBTYPE_UUID_OLD: scala.Double = js.native
}
