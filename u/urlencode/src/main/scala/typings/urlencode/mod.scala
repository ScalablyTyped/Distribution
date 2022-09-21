package typings.urlencode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Encode string
    * @param str The string for encoding.
    */
  inline def apply(str: String): String = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(str: String, charset: String): String = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], charset.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("urlencode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Decode string
    * @param encodedString The encoded string.
    */
  inline def decode(encodedString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(encodedString.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def decode(encodedString: String, charset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(encodedString.asInstanceOf[js.Any], charset.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Encode string
    * @param str The string for encoding.
    */
  inline def encode(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(str: String, charset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(str.asInstanceOf[js.Any], charset.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Parse querystring
    * @param queryString Querystring
    * @param charsetParam The charset for parsing
    */
  inline def parse(queryString: String, charsetParam: charsetParam): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(queryString.asInstanceOf[js.Any], charsetParam.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Stringify object
    * @param obj Query Object
    * @param charsetParam The charset for parsing
    */
  inline def stringify(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(obj: Any, prefix: Unit, charsetParam: charsetParam): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], charsetParam.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(obj: Any, prefix: charsetParam): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(obj: Any, prefix: charsetParam, charsetParam: charsetParam): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], charsetParam.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait charsetParam extends StObject {
    
    var charset: String
  }
  object charsetParam {
    
    inline def apply(charset: String): charsetParam = {
      val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any])
      __obj.asInstanceOf[charsetParam]
    }
    
    extension [Self <: charsetParam](x: Self) {
      
      inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    }
  }
}
