package typings.typeorm.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "Binary")
@js.native
class Binary protected ()
  extends typings.typeorm.mongodbTypingsMod.Binary {
  /**
    * @param buffer A buffer object containing the binary data.
    * @param subType The option binary type.
    */
  def this(buffer: Buffer) = this()
  def this(buffer: Buffer, subType: scala.Double) = this()
}
/* static members */
object Binary {
  
  @JSImport("typeorm", "Binary")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Byte Array BSON type.
    */
  @JSImport("typeorm", "Binary.SUBTYPE_BYTE_ARRAY")
  @js.native
  def SUBTYPE_BYTE_ARRAY: scala.Double = js.native
  inline def SUBTYPE_BYTE_ARRAY_=(x: scala.Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUBTYPE_BYTE_ARRAY")(x.asInstanceOf[js.Any])
  
  /**
    * Default BSON type.
    */
  @JSImport("typeorm", "Binary.SUBTYPE_DEFAULT")
  @js.native
  def SUBTYPE_DEFAULT: scala.Double = js.native
  inline def SUBTYPE_DEFAULT_=(x: scala.Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUBTYPE_DEFAULT")(x.asInstanceOf[js.Any])
  
  /**
    * Function BSON type.
    */
  @JSImport("typeorm", "Binary.SUBTYPE_FUNCTION")
  @js.native
  def SUBTYPE_FUNCTION: scala.Double = js.native
  inline def SUBTYPE_FUNCTION_=(x: scala.Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUBTYPE_FUNCTION")(x.asInstanceOf[js.Any])
  
  /**
    * MD5 BSON type.
    */
  @JSImport("typeorm", "Binary.SUBTYPE_MD5")
  @js.native
  def SUBTYPE_MD5: scala.Double = js.native
  inline def SUBTYPE_MD5_=(x: scala.Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUBTYPE_MD5")(x.asInstanceOf[js.Any])
  
  /**
    * User BSON type.
    */
  @JSImport("typeorm", "Binary.SUBTYPE_USER_DEFINED")
  @js.native
  def SUBTYPE_USER_DEFINED: scala.Double = js.native
  inline def SUBTYPE_USER_DEFINED_=(x: scala.Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUBTYPE_USER_DEFINED")(x.asInstanceOf[js.Any])
  
  /**
    * UUID BSON type.
    */
  @JSImport("typeorm", "Binary.SUBTYPE_UUID")
  @js.native
  def SUBTYPE_UUID: scala.Double = js.native
  inline def SUBTYPE_UUID_=(x: scala.Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUBTYPE_UUID")(x.asInstanceOf[js.Any])
  
  /**
    * OLD UUID BSON type
    */
  @JSImport("typeorm", "Binary.SUBTYPE_UUID_OLD")
  @js.native
  def SUBTYPE_UUID_OLD: scala.Double = js.native
  inline def SUBTYPE_UUID_OLD_=(x: scala.Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUBTYPE_UUID_OLD")(x.asInstanceOf[js.Any])
}
