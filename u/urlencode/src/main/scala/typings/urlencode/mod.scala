package typings.urlencode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Encode string
    * @param str The string for encoding.
    */
  @JSImport("urlencode", JSImport.Namespace)
  @js.native
  def apply(str: String): String = js.native
  @JSImport("urlencode", JSImport.Namespace)
  @js.native
  def apply(str: String, charset: String): String = js.native
  
  /**
    * Decode string
    * @param encodedString The encoded string.
    */
  @JSImport("urlencode", "decode")
  @js.native
  def decode(encodedString: String): String = js.native
  @JSImport("urlencode", "decode")
  @js.native
  def decode(encodedString: String, charset: String): String = js.native
  
  /**
    * Encode string
    * @param str The string for encoding.
    */
  @JSImport("urlencode", "encode")
  @js.native
  def encode(str: String): String = js.native
  @JSImport("urlencode", "encode")
  @js.native
  def encode(str: String, charset: String): String = js.native
  
  /**
    * Parse querystring
    * @param queryString Querystring
    * @param charsetParam The charset for parsing
    */
  @JSImport("urlencode", "parse")
  @js.native
  def parse(queryString: String, charsetParam: charsetParam): js.Any = js.native
  
  /**
    * Stringify object
    * @param obj Query Object
    * @param charsetParam The charset for parsing
    */
  @JSImport("urlencode", "stringify")
  @js.native
  def stringify(obj: js.Any): String = js.native
  @JSImport("urlencode", "stringify")
  @js.native
  def stringify(obj: js.Any, prefix: js.UndefOr[scala.Nothing], charsetParam: charsetParam): String = js.native
  @JSImport("urlencode", "stringify")
  @js.native
  def stringify(obj: js.Any, prefix: charsetParam): String = js.native
  @JSImport("urlencode", "stringify")
  @js.native
  def stringify(obj: js.Any, prefix: charsetParam, charsetParam: charsetParam): String = js.native
  
  @js.native
  trait charsetParam extends StObject {
    
    var charset: String = js.native
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
