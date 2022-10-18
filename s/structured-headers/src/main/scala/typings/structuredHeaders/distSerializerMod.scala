package typings.structuredHeaders

import typings.std.Error
import typings.structuredHeaders.distTokenMod.Token
import typings.structuredHeaders.distTypesMod.BareItem
import typings.structuredHeaders.distTypesMod.ByteSequence
import typings.structuredHeaders.distTypesMod.Dictionary
import typings.structuredHeaders.distTypesMod.InnerList
import typings.structuredHeaders.distTypesMod.Item
import typings.structuredHeaders.distTypesMod.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSerializerMod {
  
  @JSImport("structured-headers/dist/serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("structured-headers/dist/serializer", "SerializeError")
  @js.native
  open class SerializeError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def serializeBareItem(input: BareItem): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeBareItem")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serializeBoolean(input: Boolean): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeBoolean")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serializeByteSequence(input: ByteSequence): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeByteSequence")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serializeDecimal(input: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeDecimal")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serializeDictionary(input: Dictionary): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeDictionary")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serializeInnerList(input: InnerList): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeInnerList")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serializeInteger(input: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeInteger")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serializeItem(input: Item): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeItem")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serializeKey(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeKey")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serializeList(input: typings.structuredHeaders.distTypesMod.List): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeList")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serializeParameters(input: Parameters): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeParameters")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serializeString(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeString")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serializeToken(input: Token): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeToken")(input.asInstanceOf[js.Any]).asInstanceOf[String]
}
