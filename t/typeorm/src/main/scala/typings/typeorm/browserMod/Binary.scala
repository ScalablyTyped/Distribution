package typings.typeorm.browserMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "Binary")
@js.native
class Binary protected ()
  extends typings.typeorm.typingsMod.Binary {
  /**
    * @param buffer A buffer object containing the binary data.
    * @param subType The option binary type.
    */
  def this(buffer: Buffer) = this()
  def this(buffer: Buffer, subType: scala.Double) = this()
}
/* static members */
@JSImport("typeorm/browser", "Binary")
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
