package typings.xml2json

import typings.xml2json.xml2jsonBooleans.`false`
import typings.xml2json.xml2jsonBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined {  object :false | undefined} & xml2json.xml2json.JsonOptions */
  @js.native
  trait objectfalseundefinedJsonO extends StObject {
    
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
    
    var `object`: js.UndefOr[`false`] = js.native
    
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
  object objectfalseundefinedJsonO {
    
    @scala.inline
    def apply(): objectfalseundefinedJsonO = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[objectfalseundefinedJsonO]
    }
    
    @scala.inline
    implicit class objectfalseundefinedJsonOMutableBuilder[Self <: objectfalseundefinedJsonO] (val x: Self) extends AnyVal {
      
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
      def setObject(value: `false`): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
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
  
  /* Inlined {  object :true} & xml2json.xml2json.JsonOptions */
  @js.native
  trait objecttrueJsonOptions extends StObject {
    
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
    
    var `object`: `true` = js.native
    
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
  object objecttrueJsonOptions {
    
    @scala.inline
    def apply(`object`: `true`): objecttrueJsonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[objecttrueJsonOptions]
    }
    
    @scala.inline
    implicit class objecttrueJsonOptionsMutableBuilder[Self <: objecttrueJsonOptions] (val x: Self) extends AnyVal {
      
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
      def setObject(value: `true`): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
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
}
