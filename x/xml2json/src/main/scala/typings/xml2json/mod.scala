package typings.xml2json

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.xml2json.anon.objectfalseundefinedJsonO
import typings.xml2json.anon.objecttrueJsonOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xml2json", "toJson")
  @js.native
  def toJson(xml: String): String = js.native
  @JSImport("xml2json", "toJson")
  @js.native
  def toJson(xml: String, options: objectfalseundefinedJsonO): String = js.native
  @JSImport("xml2json", "toJson")
  @js.native
  def toJson(xml: String, options: objecttrueJsonOptions): StringDictionary[js.Any] = js.native
  @JSImport("xml2json", "toJson")
  @js.native
  def toJson(xml: Buffer): String = js.native
  @JSImport("xml2json", "toJson")
  @js.native
  def toJson(xml: Buffer, options: objectfalseundefinedJsonO): String = js.native
  @JSImport("xml2json", "toJson")
  @js.native
  def toJson(xml: Buffer, options: objecttrueJsonOptions): StringDictionary[js.Any] = js.native
  @JSImport("xml2json", "toJson")
  @js.native
  def toJson_StringDictionary(xml: String): StringDictionary[js.Any] = js.native
  @JSImport("xml2json", "toJson")
  @js.native
  def toJson_StringDictionary(xml: Buffer): StringDictionary[js.Any] = js.native
  
  @JSImport("xml2json", "toXml")
  @js.native
  def toXml(json: String): String = js.native
  @JSImport("xml2json", "toXml")
  @js.native
  def toXml(json: String, options: XmlOptions): String = js.native
  @JSImport("xml2json", "toXml")
  @js.native
  def toXml(json: StringDictionary[js.Any]): String = js.native
  @JSImport("xml2json", "toXml")
  @js.native
  def toXml(json: StringDictionary[js.Any], options: XmlOptions): String = js.native
  @JSImport("xml2json", "toXml")
  @js.native
  def toXml(json: Buffer): String = js.native
  @JSImport("xml2json", "toXml")
  @js.native
  def toXml(json: Buffer, options: XmlOptions): String = js.native
  
  @js.native
  trait JsonOptions extends StObject {
    
    /**
      * Changes the default textNode property from $t to _t when option is set to true.
      * Alternatively a string can be specified which will override $t to what ever the string is.
      */
    var alternateTextNode: js.UndefOr[Boolean | String] = js.native
    
    /**
      * XML child nodes are always treated as arrays.
      * You can specify a selective array of nodes for this to apply to instead of the whole document.
      */
    var arrayNotation: js.UndefOr[Boolean | js.Array[String]] = js.native
    
    /**
      * Makes type coercion.
      * i.e.: numbers and booleans present in attributes and element values are converted from string to its correspondent data types.
      * Coerce can be optionally defined as an object with specific methods of coercion based on attribute name or tag name, with fallback to default coercion.
      */
    var coerce: js.UndefOr[Boolean] = js.native
    
    /**
      * Returns a Javascript object instead of a JSON string.
      */
    // object?: boolean; // This is now overloaded in the toJson method
    /**
      * Makes the JSON reversible to XML.
      * xml2json tranforms CDATA content to JSON, but it doesn't generate a reversible structure.
      */
    var reversible: js.UndefOr[Boolean] = js.native
    
    /**
      * Sanitizes the following characters present in element values (default true):
      * @example
      * var chars =  {
      * '<': '&lt;',
      * '>': '&gt;',
      * '(': '&#40;',
      * ')': '&#41;',
      * '#': '&#35;',
      * '&': '&amp;',
      * '"': '&quot;',
      * "'": '&apos;'
      * };
      * @example
      */
    var sanitize: js.UndefOr[Boolean] = js.native
    
    /**
      * Removes leading and trailing whitespaces as well as line terminators in element values.
      * Defaults to true.
      */
    var trim: js.UndefOr[Boolean] = js.native
  }
  object JsonOptions {
    
    @scala.inline
    def apply(): JsonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonOptions]
    }
    
    @scala.inline
    implicit class JsonOptionsMutableBuilder[Self <: JsonOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlternateTextNode(value: Boolean | String): Self = StObject.set(x, "alternateTextNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlternateTextNodeUndefined: Self = StObject.set(x, "alternateTextNode", js.undefined)
      
      @scala.inline
      def setArrayNotation(value: Boolean | js.Array[String]): Self = StObject.set(x, "arrayNotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayNotationUndefined: Self = StObject.set(x, "arrayNotation", js.undefined)
      
      @scala.inline
      def setArrayNotationVarargs(value: String*): Self = StObject.set(x, "arrayNotation", js.Array(value :_*))
      
      @scala.inline
      def setCoerce(value: Boolean): Self = StObject.set(x, "coerce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoerceUndefined: Self = StObject.set(x, "coerce", js.undefined)
      
      @scala.inline
      def setReversible(value: Boolean): Self = StObject.set(x, "reversible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReversibleUndefined: Self = StObject.set(x, "reversible", js.undefined)
      
      @scala.inline
      def setSanitize(value: Boolean): Self = StObject.set(x, "sanitize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSanitizeUndefined: Self = StObject.set(x, "sanitize", js.undefined)
      
      @scala.inline
      def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    }
  }
  
  @js.native
  trait XmlOptions extends StObject {
    
    /**
      * Ignores all null values.
      */
    var ignoreNull: js.UndefOr[Boolean] = js.native
    
    /**
      * Sanitizes the following characters present in element values (default false):
      * @example
      * var chars =  {
      * '<': '&lt;',
      * '>': '&gt;',
      * '(': '&#40;',
      * ')': '&#41;',
      * '#': '&#35;',
      * '&': '&amp;',
      * '"': '&quot;',
      * "'": '&apos;'
      * };
      * @example
      */
    var sanitize: js.UndefOr[Boolean] = js.native
  }
  object XmlOptions {
    
    @scala.inline
    def apply(): XmlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XmlOptions]
    }
    
    @scala.inline
    implicit class XmlOptionsMutableBuilder[Self <: XmlOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnoreNull(value: Boolean): Self = StObject.set(x, "ignoreNull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreNullUndefined: Self = StObject.set(x, "ignoreNull", js.undefined)
      
      @scala.inline
      def setSanitize(value: Boolean): Self = StObject.set(x, "sanitize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSanitizeUndefined: Self = StObject.set(x, "sanitize", js.undefined)
    }
  }
}
