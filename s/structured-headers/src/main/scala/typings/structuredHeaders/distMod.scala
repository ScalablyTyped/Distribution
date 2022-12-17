package typings.structuredHeaders

import typings.structuredHeaders.distTypesMod.BareItem
import typings.structuredHeaders.distTypesMod.Dictionary
import typings.structuredHeaders.distTypesMod.InnerList
import typings.structuredHeaders.distTypesMod.Item
import typings.structuredHeaders.distTypesMod.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("structured-headers/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("structured-headers/dist", "ByteSequence")
  @js.native
  open class ByteSequence protected ()
    extends typings.structuredHeaders.distTypesMod.ByteSequence {
    def this(base64Value: String) = this()
  }
  
  @JSImport("structured-headers/dist", "ParseError")
  @js.native
  open class ParseError protected ()
    extends typings.structuredHeaders.distParserMod.ParseError {
    def this(position: Double, message: String) = this()
  }
  
  @JSImport("structured-headers/dist", "SerializeError")
  @js.native
  open class SerializeError ()
    extends typings.structuredHeaders.distSerializerMod.SerializeError
  
  @JSImport("structured-headers/dist", "Token")
  @js.native
  open class Token protected ()
    extends typings.structuredHeaders.distTokenMod.Token {
    def this(value: String) = this()
  }
  
  inline def isAscii(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAscii")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isByteSequence(input: BareItem): /* is structured-headers.structured-headers/dist/types.ByteSequence */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isByteSequence")(input.asInstanceOf[js.Any]).asInstanceOf[/* is structured-headers.structured-headers/dist/types.ByteSequence */ Boolean]
  
  inline def isInnerList(input: InnerList | Item): /* is structured-headers.structured-headers/dist/types.InnerList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInnerList")(input.asInstanceOf[js.Any]).asInstanceOf[/* is structured-headers.structured-headers/dist/types.InnerList */ Boolean]
  
  inline def isValidKeyStr(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidKeyStr")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidTokenStr(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidTokenStr")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parseDictionary(input: String): Dictionary = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDictionary")(input.asInstanceOf[js.Any]).asInstanceOf[Dictionary]
  
  inline def parseItem(input: String): Item = ^.asInstanceOf[js.Dynamic].applyDynamic("parseItem")(input.asInstanceOf[js.Any]).asInstanceOf[Item]
  
  inline def parseList(input: String): typings.structuredHeaders.distTypesMod.List = ^.asInstanceOf[js.Dynamic].applyDynamic("parseList")(input.asInstanceOf[js.Any]).asInstanceOf[typings.structuredHeaders.distTypesMod.List]
  
  inline def serializeBareItem(input: BareItem): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeBareItem")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serializeBoolean(input: Boolean): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeBoolean")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serializeByteSequence(input: typings.structuredHeaders.distTypesMod.ByteSequence): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeByteSequence")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serializeDecimal(input: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeDecimal")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serializeDictionary(input: Dictionary): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeDictionary")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serializeInnerList(input: InnerList): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeInnerList")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serializeInteger(input: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeInteger")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serializeItem(input: Item): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeItem")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serializeKey(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeKey")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serializeList(input: typings.structuredHeaders.distTypesMod.List): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeList")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serializeParameters(input: Parameters): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeParameters")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serializeString(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeString")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serializeToken(input: typings.structuredHeaders.distTokenMod.Token): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeToken")(input.asInstanceOf[js.Any]).asInstanceOf[String]
}
