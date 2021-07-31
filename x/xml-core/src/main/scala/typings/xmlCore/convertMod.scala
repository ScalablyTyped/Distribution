package typings.xmlCore

import typings.std.BufferSource
import typings.std.Date
import typings.std.Uint8Array
import typings.xmlCore.typesMod.XmlBufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convertMod {
  
  @JSImport("xml-core/dist/types/convert", "Convert")
  @js.native
  class Convert () extends StObject
  /* static members */
  object Convert {
    
    @JSImport("xml-core/dist/types/convert", "Convert")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def Base64Padding(base64: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("Base64Padding")(base64.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def FromBase64(base64Text: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("FromBase64")(base64Text.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
    
    @scala.inline
    def FromBase64Url(base64url: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("FromBase64Url")(base64url.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
    
    @scala.inline
    def FromBinary(text: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("FromBinary")(text.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
    
    /**
      * Converts Date to string
      *
      * @static
      * @param {Date} dateTime
      * @returns {string}
      *
      * @memberOf Convert
      */
    @scala.inline
    def FromDateTime(dateTime: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FromDateTime")(dateTime.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Converts HEX string to buffer
      *
      * @static
      * @param {string} hexString
      * @returns {Uint8Array}
      *
      * @memberOf Convert
      */
    @scala.inline
    def FromHex(hexString: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("FromHex")(hexString.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
    
    @scala.inline
    def FromString(str: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("FromString")(str.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
    @scala.inline
    def FromString(str: String, enc: XmlBufferEncoding): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("FromString")(str.asInstanceOf[js.Any], enc.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    
    @scala.inline
    def FromUtf8String(text: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("FromUtf8String")(text.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
    
    @scala.inline
    def ToBase64(buf: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToBase64")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def ToBase64Url(data: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToBase64Url")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def ToBinary(buffer: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToBinary")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Converts string to Date
      *
      * @static
      * @param {string} dateTime
      * @returns {Date}
      *
      * @memberOf Convert
      */
    @scala.inline
    def ToDateTime(dateTime: String): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("ToDateTime")(dateTime.asInstanceOf[js.Any]).asInstanceOf[Date]
    
    /**
      * Converts buffer to HEX string
      * @param  {BufferSource} buffer Incoming buffer
      * @returns string
      */
    @scala.inline
    def ToHex(buffer: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToHex")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def ToString(buffer: BufferSource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToString")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def ToString(buffer: BufferSource, enc: XmlBufferEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ToString")(buffer.asInstanceOf[js.Any], enc.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def ToUtf8String(buffer: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToUtf8String")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
