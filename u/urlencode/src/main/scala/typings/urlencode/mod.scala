package typings.urlencode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Encode string
    * @param str The string for encoding.
    */
  @scala.inline
  def apply(str: String): String = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(str: String, charset: String): String = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], charset.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("urlencode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Decode string
    * @param encodedString The encoded string.
    */
  @scala.inline
  def decode(encodedString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(encodedString.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def decode(encodedString: String, charset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(encodedString.asInstanceOf[js.Any], charset.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Encode string
    * @param str The string for encoding.
    */
  @scala.inline
  def encode(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def encode(str: String, charset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(str.asInstanceOf[js.Any], charset.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Parse querystring
    * @param queryString Querystring
    * @param charsetParam The charset for parsing
    */
  @scala.inline
  def parse(queryString: String, charsetParam: charsetParam): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(queryString.asInstanceOf[js.Any], charsetParam.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * Stringify object
    * @param obj Query Object
    * @param charsetParam The charset for parsing
    */
  @scala.inline
  def stringify(obj: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def stringify(obj: js.Any, prefix: Unit, charsetParam: charsetParam): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], charsetParam.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(obj: js.Any, prefix: charsetParam): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(obj: js.Any, prefix: charsetParam, charsetParam: charsetParam): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], charsetParam.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait charsetParam extends StObject {
    
    var charset: String
  }
  object charsetParam {
    
    @scala.inline
    def apply(charset: String): charsetParam = {
      val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any])
      __obj.asInstanceOf[charsetParam]
    }
    
    @scala.inline
    implicit class charsetParamMutableBuilder[Self <: charsetParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    }
  }
}
