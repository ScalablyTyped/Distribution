package typings.xmlbuilder.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the functions used for converting values to strings.
  */
trait XMLStringifier extends StObject {
  
  /**
    * Escapes special characters in attribute values.
    */
  var attEscape: js.UndefOr[js.Function1[/* v */ String, String]] = js.undefined
  
  /**
    * Converts attribute value to string
    */
  var attValue: js.UndefOr[js.Function1[/* v */ Any, String]] = js.undefined
  
  /**
    * Converts the contents of a CDATA node to string
    */
  var cdata: js.UndefOr[js.Function1[/* v */ Any, String]] = js.undefined
  
  /**
    * Converts the contents of a comment node to string
    */
  var comment: js.UndefOr[js.Function1[/* v */ Any, String]] = js.undefined
  
  /** 
    * When prepended to a JS object key, converts the key-value pair 
    * to an attribute. 
    */
  var convertAttKey: js.UndefOr[String] = js.undefined
  
  /** 
    * When prepended to a JS object key, converts its value to a CDATA 
    * node. 
    */
  var convertCDataKey: js.UndefOr[String] = js.undefined
  
  /** 
    * When prepended to a JS object key, converts its value to a 
    * comment node.
    */
  var convertCommentKey: js.UndefOr[String] = js.undefined
  
  /** 
    * When prepended to a JS object key, converts the key-value pair 
    * to a processing instruction node. 
    */
  var convertPIKey: js.UndefOr[String] = js.undefined
  
  /** 
    * When prepended to a JS object key, converts its value to a raw 
    * text node. 
    */
  var convertRawKey: js.UndefOr[String] = js.undefined
  
  /** 
    * When prepended to a JS object key, converts its value to a text node. 
    * 
    * _Note:_ Since JS objects cannot contain duplicate keys, multiple text 
    * nodes can be created by adding some unique text after each object 
    * key. For example: `{ '#text1': 'some text', '#text2': 'more text' };`
    */
  var convertTextKey: js.UndefOr[String] = js.undefined
  
  /**
    * Converts `!ATTLIST` node default value inside DocType to string
    */
  var dtdAttDefault: js.UndefOr[js.Function1[/* v */ Any, String]] = js.undefined
  
  /**
    * Converts `!ATTLIST` node type inside DocType to string
    */
  var dtdAttType: js.UndefOr[js.Function1[/* v */ Any, String]] = js.undefined
  
  /**
    * Converts `!ELEMENT` node content inside Doctype to string
    */
  var dtdElementValue: js.UndefOr[js.Function1[/* v */ Any, String]] = js.undefined
  
  /**
    * Converts `!ENTITY` node content inside Doctype to string
    */
  var dtdEntityValue: js.UndefOr[js.Function1[/* v */ Any, String]] = js.undefined
  
  /**
    * Converts `!NOTATION` node content inside Doctype to string
    */
  var dtdNData: js.UndefOr[js.Function1[/* v */ Any, String]] = js.undefined
  
  /**
    * Converts DocType public identifier to string
    */
  var dtdPubID: js.UndefOr[js.Function1[/* v */ Any, String]] = js.undefined
  
  /**
    * Converts DocType system identifier to string
    */
  var dtdSysID: js.UndefOr[js.Function1[/* v */ Any, String]] = js.undefined
  
  /**
    * Converts processing instruction target to string
    */
  var insTarget: js.UndefOr[js.Function1[/* v */ Any, String]] = js.undefined
  
  /**
    * Converts processing instruction value to string
    */
  var insValue: js.UndefOr[js.Function1[/* v */ Any, String]] = js.undefined
  
  /**
    * Converts an element or attribute name to string
    */
  var name: js.UndefOr[js.Function1[/* v */ Any, String]] = js.undefined
  
  /**
    * Converts the contents of a raw text node to string
    */
  var raw: js.UndefOr[js.Function1[/* v */ Any, String]] = js.undefined
  
  /**
    * Converts the contents of a text node to string
    */
  var text: js.UndefOr[js.Function1[/* v */ Any, String]] = js.undefined
  
  /**
    * Escapes special characters in text.
    */
  var textEscape: js.UndefOr[js.Function1[/* v */ String, String]] = js.undefined
  
  /**
    * Converts XML encoding to string
    */
  var xmlEncoding: js.UndefOr[js.Function1[/* v */ Any, String]] = js.undefined
  
  /**
    * Converts standalone document declaration to string
    */
  var xmlStandalone: js.UndefOr[js.Function1[/* v */ Any, String]] = js.undefined
  
  /**
    * Converts XML version to string
    */
  var xmlVersion: js.UndefOr[js.Function1[/* v */ Any, String]] = js.undefined
}
object XMLStringifier {
  
  inline def apply(): XMLStringifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XMLStringifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XMLStringifier] (val x: Self) extends AnyVal {
    
    inline def setAttEscape(value: /* v */ String => String): Self = StObject.set(x, "attEscape", js.Any.fromFunction1(value))
    
    inline def setAttEscapeUndefined: Self = StObject.set(x, "attEscape", js.undefined)
    
    inline def setAttValue(value: /* v */ Any => String): Self = StObject.set(x, "attValue", js.Any.fromFunction1(value))
    
    inline def setAttValueUndefined: Self = StObject.set(x, "attValue", js.undefined)
    
    inline def setCdata(value: /* v */ Any => String): Self = StObject.set(x, "cdata", js.Any.fromFunction1(value))
    
    inline def setCdataUndefined: Self = StObject.set(x, "cdata", js.undefined)
    
    inline def setComment(value: /* v */ Any => String): Self = StObject.set(x, "comment", js.Any.fromFunction1(value))
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setConvertAttKey(value: String): Self = StObject.set(x, "convertAttKey", value.asInstanceOf[js.Any])
    
    inline def setConvertAttKeyUndefined: Self = StObject.set(x, "convertAttKey", js.undefined)
    
    inline def setConvertCDataKey(value: String): Self = StObject.set(x, "convertCDataKey", value.asInstanceOf[js.Any])
    
    inline def setConvertCDataKeyUndefined: Self = StObject.set(x, "convertCDataKey", js.undefined)
    
    inline def setConvertCommentKey(value: String): Self = StObject.set(x, "convertCommentKey", value.asInstanceOf[js.Any])
    
    inline def setConvertCommentKeyUndefined: Self = StObject.set(x, "convertCommentKey", js.undefined)
    
    inline def setConvertPIKey(value: String): Self = StObject.set(x, "convertPIKey", value.asInstanceOf[js.Any])
    
    inline def setConvertPIKeyUndefined: Self = StObject.set(x, "convertPIKey", js.undefined)
    
    inline def setConvertRawKey(value: String): Self = StObject.set(x, "convertRawKey", value.asInstanceOf[js.Any])
    
    inline def setConvertRawKeyUndefined: Self = StObject.set(x, "convertRawKey", js.undefined)
    
    inline def setConvertTextKey(value: String): Self = StObject.set(x, "convertTextKey", value.asInstanceOf[js.Any])
    
    inline def setConvertTextKeyUndefined: Self = StObject.set(x, "convertTextKey", js.undefined)
    
    inline def setDtdAttDefault(value: /* v */ Any => String): Self = StObject.set(x, "dtdAttDefault", js.Any.fromFunction1(value))
    
    inline def setDtdAttDefaultUndefined: Self = StObject.set(x, "dtdAttDefault", js.undefined)
    
    inline def setDtdAttType(value: /* v */ Any => String): Self = StObject.set(x, "dtdAttType", js.Any.fromFunction1(value))
    
    inline def setDtdAttTypeUndefined: Self = StObject.set(x, "dtdAttType", js.undefined)
    
    inline def setDtdElementValue(value: /* v */ Any => String): Self = StObject.set(x, "dtdElementValue", js.Any.fromFunction1(value))
    
    inline def setDtdElementValueUndefined: Self = StObject.set(x, "dtdElementValue", js.undefined)
    
    inline def setDtdEntityValue(value: /* v */ Any => String): Self = StObject.set(x, "dtdEntityValue", js.Any.fromFunction1(value))
    
    inline def setDtdEntityValueUndefined: Self = StObject.set(x, "dtdEntityValue", js.undefined)
    
    inline def setDtdNData(value: /* v */ Any => String): Self = StObject.set(x, "dtdNData", js.Any.fromFunction1(value))
    
    inline def setDtdNDataUndefined: Self = StObject.set(x, "dtdNData", js.undefined)
    
    inline def setDtdPubID(value: /* v */ Any => String): Self = StObject.set(x, "dtdPubID", js.Any.fromFunction1(value))
    
    inline def setDtdPubIDUndefined: Self = StObject.set(x, "dtdPubID", js.undefined)
    
    inline def setDtdSysID(value: /* v */ Any => String): Self = StObject.set(x, "dtdSysID", js.Any.fromFunction1(value))
    
    inline def setDtdSysIDUndefined: Self = StObject.set(x, "dtdSysID", js.undefined)
    
    inline def setInsTarget(value: /* v */ Any => String): Self = StObject.set(x, "insTarget", js.Any.fromFunction1(value))
    
    inline def setInsTargetUndefined: Self = StObject.set(x, "insTarget", js.undefined)
    
    inline def setInsValue(value: /* v */ Any => String): Self = StObject.set(x, "insValue", js.Any.fromFunction1(value))
    
    inline def setInsValueUndefined: Self = StObject.set(x, "insValue", js.undefined)
    
    inline def setName(value: /* v */ Any => String): Self = StObject.set(x, "name", js.Any.fromFunction1(value))
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRaw(value: /* v */ Any => String): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setText(value: /* v */ Any => String): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
    
    inline def setTextEscape(value: /* v */ String => String): Self = StObject.set(x, "textEscape", js.Any.fromFunction1(value))
    
    inline def setTextEscapeUndefined: Self = StObject.set(x, "textEscape", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setXmlEncoding(value: /* v */ Any => String): Self = StObject.set(x, "xmlEncoding", js.Any.fromFunction1(value))
    
    inline def setXmlEncodingUndefined: Self = StObject.set(x, "xmlEncoding", js.undefined)
    
    inline def setXmlStandalone(value: /* v */ Any => String): Self = StObject.set(x, "xmlStandalone", js.Any.fromFunction1(value))
    
    inline def setXmlStandaloneUndefined: Self = StObject.set(x, "xmlStandalone", js.undefined)
    
    inline def setXmlVersion(value: /* v */ Any => String): Self = StObject.set(x, "xmlVersion", js.Any.fromFunction1(value))
    
    inline def setXmlVersionUndefined: Self = StObject.set(x, "xmlVersion", js.undefined)
  }
}
