package typings.xml2json

import typings.xml2json.xml2jsonBooleans.`false`
import typings.xml2json.xml2jsonBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined {  object :false | undefined} & xml2json.xml2json.JsonOptions */
  trait objectfalseundefinedJsonO extends StObject {
    
    /**
      * Changes the default textNode property from $t to _t when option is set to true.
      * Alternatively a string can be specified which will override $t to what ever the string is.
      */
    var alternateTextNode: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * XML child nodes are always treated as arrays.
      * You can specify a selective array of nodes for this to apply to instead of the whole document.
      */
    var arrayNotation: js.UndefOr[Boolean | js.Array[String]] = js.undefined
    
    /**
      * Makes type coercion.
      * i.e.: numbers and booleans present in attributes and element values are converted from string to its correspondent data types.
      * Coerce can be optionally defined as an object with specific methods of coercion based on attribute name or tag name, with fallback to default coercion.
      */
    var coerce: js.UndefOr[Boolean] = js.undefined
    
    var `object`: js.UndefOr[`false`] = js.undefined
    
    /**
      * Returns a Javascript object instead of a JSON string.
      */
    // object?: boolean; // This is now overloaded in the toJson method
    /**
      * Makes the JSON reversible to XML.
      * xml2json tranforms CDATA content to JSON, but it doesn't generate a reversible structure.
      */
    var reversible: js.UndefOr[Boolean] = js.undefined
    
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
    var sanitize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Removes leading and trailing whitespaces as well as line terminators in element values.
      * Defaults to true.
      */
    var trim: js.UndefOr[Boolean] = js.undefined
  }
  object objectfalseundefinedJsonO {
    
    inline def apply(): objectfalseundefinedJsonO = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[objectfalseundefinedJsonO]
    }
    
    extension [Self <: objectfalseundefinedJsonO](x: Self) {
      
      inline def setAlternateTextNode(value: Boolean | String): Self = StObject.set(x, "alternateTextNode", value.asInstanceOf[js.Any])
      
      inline def setAlternateTextNodeUndefined: Self = StObject.set(x, "alternateTextNode", js.undefined)
      
      inline def setArrayNotation(value: Boolean | js.Array[String]): Self = StObject.set(x, "arrayNotation", value.asInstanceOf[js.Any])
      
      inline def setArrayNotationUndefined: Self = StObject.set(x, "arrayNotation", js.undefined)
      
      inline def setArrayNotationVarargs(value: String*): Self = StObject.set(x, "arrayNotation", js.Array(value*))
      
      inline def setCoerce(value: Boolean): Self = StObject.set(x, "coerce", value.asInstanceOf[js.Any])
      
      inline def setCoerceUndefined: Self = StObject.set(x, "coerce", js.undefined)
      
      inline def setObject(value: `false`): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setReversible(value: Boolean): Self = StObject.set(x, "reversible", value.asInstanceOf[js.Any])
      
      inline def setReversibleUndefined: Self = StObject.set(x, "reversible", js.undefined)
      
      inline def setSanitize(value: Boolean): Self = StObject.set(x, "sanitize", value.asInstanceOf[js.Any])
      
      inline def setSanitizeUndefined: Self = StObject.set(x, "sanitize", js.undefined)
      
      inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    }
  }
  
  /* Inlined {  object :true} & xml2json.xml2json.JsonOptions */
  trait objecttrueJsonOptions extends StObject {
    
    /**
      * Changes the default textNode property from $t to _t when option is set to true.
      * Alternatively a string can be specified which will override $t to what ever the string is.
      */
    var alternateTextNode: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * XML child nodes are always treated as arrays.
      * You can specify a selective array of nodes for this to apply to instead of the whole document.
      */
    var arrayNotation: js.UndefOr[Boolean | js.Array[String]] = js.undefined
    
    /**
      * Makes type coercion.
      * i.e.: numbers and booleans present in attributes and element values are converted from string to its correspondent data types.
      * Coerce can be optionally defined as an object with specific methods of coercion based on attribute name or tag name, with fallback to default coercion.
      */
    var coerce: js.UndefOr[Boolean] = js.undefined
    
    var `object`: `true`
    
    /**
      * Returns a Javascript object instead of a JSON string.
      */
    // object?: boolean; // This is now overloaded in the toJson method
    /**
      * Makes the JSON reversible to XML.
      * xml2json tranforms CDATA content to JSON, but it doesn't generate a reversible structure.
      */
    var reversible: js.UndefOr[Boolean] = js.undefined
    
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
    var sanitize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Removes leading and trailing whitespaces as well as line terminators in element values.
      * Defaults to true.
      */
    var trim: js.UndefOr[Boolean] = js.undefined
  }
  object objecttrueJsonOptions {
    
    inline def apply(): objecttrueJsonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("object")(true)
      __obj.asInstanceOf[objecttrueJsonOptions]
    }
    
    extension [Self <: objecttrueJsonOptions](x: Self) {
      
      inline def setAlternateTextNode(value: Boolean | String): Self = StObject.set(x, "alternateTextNode", value.asInstanceOf[js.Any])
      
      inline def setAlternateTextNodeUndefined: Self = StObject.set(x, "alternateTextNode", js.undefined)
      
      inline def setArrayNotation(value: Boolean | js.Array[String]): Self = StObject.set(x, "arrayNotation", value.asInstanceOf[js.Any])
      
      inline def setArrayNotationUndefined: Self = StObject.set(x, "arrayNotation", js.undefined)
      
      inline def setArrayNotationVarargs(value: String*): Self = StObject.set(x, "arrayNotation", js.Array(value*))
      
      inline def setCoerce(value: Boolean): Self = StObject.set(x, "coerce", value.asInstanceOf[js.Any])
      
      inline def setCoerceUndefined: Self = StObject.set(x, "coerce", js.undefined)
      
      inline def setObject(value: `true`): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setReversible(value: Boolean): Self = StObject.set(x, "reversible", value.asInstanceOf[js.Any])
      
      inline def setReversibleUndefined: Self = StObject.set(x, "reversible", js.undefined)
      
      inline def setSanitize(value: Boolean): Self = StObject.set(x, "sanitize", value.asInstanceOf[js.Any])
      
      inline def setSanitizeUndefined: Self = StObject.set(x, "sanitize", js.undefined)
      
      inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    }
  }
}
