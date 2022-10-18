package typings.xadesjs.mod

import typings.std.BufferSource
import typings.xmlCore.distTypesTypesMod.XmlBufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xadesjs", "Convert")
@js.native
open class Convert ()
  extends typings.xmlCore.mod.Convert
/* static members */
object Convert {
  
  @JSImport("xadesjs", "Convert")
  @js.native
  val ^ : js.Any = js.native
  
  inline def Base64Padding(base64: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("Base64Padding")(base64.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def FromBase64(base64Text: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("FromBase64")(base64Text.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def FromBase64Url(base64url: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("FromBase64Url")(base64url.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def FromBinary(text: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("FromBinary")(text.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  /**
    * Converts Date to string
    *
    * @static
    * @param {Date} dateTime
    * @returns {string}
    *
    * @memberOf Convert
    */
  inline def FromDateTime(dateTime: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FromDateTime")(dateTime.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Converts HEX string to buffer
    *
    * @static
    * @param {string} hexString
    * @returns {Uint8Array}
    *
    * @memberOf Convert
    */
  inline def FromHex(hexString: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("FromHex")(hexString.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def FromString(str: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("FromString")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def FromString(str: String, enc: XmlBufferEncoding): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("FromString")(str.asInstanceOf[js.Any], enc.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def FromUtf8String(text: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("FromUtf8String")(text.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def ToBase64(buf: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToBase64")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def ToBase64Url(data: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToBase64Url")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def ToBinary(buffer: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToBinary")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Converts string to Date
    *
    * @static
    * @param {string} dateTime
    * @returns {Date}
    *
    * @memberOf Convert
    */
  inline def ToDateTime(dateTime: String): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("ToDateTime")(dateTime.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  /**
    * Converts buffer to HEX string
    * @param  {BufferSource} buffer Incoming buffer
    * @returns string
    */
  inline def ToHex(buffer: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToHex")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def ToString(buffer: BufferSource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToString")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def ToString(buffer: BufferSource, enc: XmlBufferEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ToString")(buffer.asInstanceOf[js.Any], enc.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def ToUtf8String(buffer: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToUtf8String")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
}
