package typings.xmlbuilder.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the functions used for converting values to strings.
  */
@js.native
trait XMLStringifier extends StObject {
  
  /**
    * Escapes special characters in attribute values.
    */
  var attEscape: js.UndefOr[js.Function1[/* v */ String, String]] = js.native
  
  /**
    * Converts attribute value to string
    */
  var attValue: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  
  /**
    * Converts the contents of a CDATA node to string
    */
  var cdata: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  
  /**
    * Converts the contents of a comment node to string
    */
  var comment: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  
  /** 
    * When prepended to a JS object key, converts the key-value pair 
    * to an attribute. 
    */
  var convertAttKey: js.UndefOr[String] = js.native
  
  /** 
    * When prepended to a JS object key, converts its value to a CDATA 
    * node. 
    */
  var convertCDataKey: js.UndefOr[String] = js.native
  
  /** 
    * When prepended to a JS object key, converts its value to a 
    * comment node.
    */
  var convertCommentKey: js.UndefOr[String] = js.native
  
  /** 
    * When prepended to a JS object key, converts the key-value pair 
    * to a processing instruction node. 
    */
  var convertPIKey: js.UndefOr[String] = js.native
  
  /** 
    * When prepended to a JS object key, converts its value to a raw 
    * text node. 
    */
  var convertRawKey: js.UndefOr[String] = js.native
  
  /** 
    * When prepended to a JS object key, converts its value to a text node. 
    * 
    * _Note:_ Since JS objects cannot contain duplicate keys, multiple text 
    * nodes can be created by adding some unique text after each object 
    * key. For example: `{ '#text1': 'some text', '#text2': 'more text' };`
    */
  var convertTextKey: js.UndefOr[String] = js.native
  
  /**
    * Converts `!ATTLIST` node default value inside DocType to string
    */
  var dtdAttDefault: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  
  /**
    * Converts `!ATTLIST` node type inside DocType to string
    */
  var dtdAttType: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  
  /**
    * Converts `!ELEMENT` node content inside Doctype to string
    */
  var dtdElementValue: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  
  /**
    * Converts `!ENTITY` node content inside Doctype to string
    */
  var dtdEntityValue: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  
  /**
    * Converts `!NOTATION` node content inside Doctype to string
    */
  var dtdNData: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  
  /**
    * Converts DocType public identifier to string
    */
  var dtdPubID: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  
  /**
    * Converts DocType system identifier to string
    */
  var dtdSysID: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  
  /**
    * Converts processing instruction target to string
    */
  var insTarget: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  
  /**
    * Converts processing instruction value to string
    */
  var insValue: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  
  /**
    * Converts an element or attribute name to string
    */
  var name: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  
  /**
    * Converts the contents of a raw text node to string
    */
  var raw: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  
  /**
    * Converts the contents of a text node to string
    */
  var text: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  
  /**
    * Escapes special characters in text.
    */
  var textEscape: js.UndefOr[js.Function1[/* v */ String, String]] = js.native
  
  /**
    * Converts XML encoding to string
    */
  var xmlEncoding: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  
  /**
    * Converts standalone document declaration to string
    */
  var xmlStandalone: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  
  /**
    * Converts XML version to string
    */
  var xmlVersion: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
}
object XMLStringifier {
  
  @scala.inline
  def apply(): XMLStringifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XMLStringifier]
  }
  
  @scala.inline
  implicit class XMLStringifierMutableBuilder[Self <: XMLStringifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttEscape(value: /* v */ String => String): Self = StObject.set(x, "attEscape", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAttEscapeUndefined: Self = StObject.set(x, "attEscape", js.undefined)
    
    @scala.inline
    def setAttValue(value: /* v */ js.Any => String): Self = StObject.set(x, "attValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAttValueUndefined: Self = StObject.set(x, "attValue", js.undefined)
    
    @scala.inline
    def setCdata(value: /* v */ js.Any => String): Self = StObject.set(x, "cdata", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCdataUndefined: Self = StObject.set(x, "cdata", js.undefined)
    
    @scala.inline
    def setComment(value: /* v */ js.Any => String): Self = StObject.set(x, "comment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setConvertAttKey(value: String): Self = StObject.set(x, "convertAttKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertAttKeyUndefined: Self = StObject.set(x, "convertAttKey", js.undefined)
    
    @scala.inline
    def setConvertCDataKey(value: String): Self = StObject.set(x, "convertCDataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertCDataKeyUndefined: Self = StObject.set(x, "convertCDataKey", js.undefined)
    
    @scala.inline
    def setConvertCommentKey(value: String): Self = StObject.set(x, "convertCommentKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertCommentKeyUndefined: Self = StObject.set(x, "convertCommentKey", js.undefined)
    
    @scala.inline
    def setConvertPIKey(value: String): Self = StObject.set(x, "convertPIKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertPIKeyUndefined: Self = StObject.set(x, "convertPIKey", js.undefined)
    
    @scala.inline
    def setConvertRawKey(value: String): Self = StObject.set(x, "convertRawKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertRawKeyUndefined: Self = StObject.set(x, "convertRawKey", js.undefined)
    
    @scala.inline
    def setConvertTextKey(value: String): Self = StObject.set(x, "convertTextKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertTextKeyUndefined: Self = StObject.set(x, "convertTextKey", js.undefined)
    
    @scala.inline
    def setDtdAttDefault(value: /* v */ js.Any => String): Self = StObject.set(x, "dtdAttDefault", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDtdAttDefaultUndefined: Self = StObject.set(x, "dtdAttDefault", js.undefined)
    
    @scala.inline
    def setDtdAttType(value: /* v */ js.Any => String): Self = StObject.set(x, "dtdAttType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDtdAttTypeUndefined: Self = StObject.set(x, "dtdAttType", js.undefined)
    
    @scala.inline
    def setDtdElementValue(value: /* v */ js.Any => String): Self = StObject.set(x, "dtdElementValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDtdElementValueUndefined: Self = StObject.set(x, "dtdElementValue", js.undefined)
    
    @scala.inline
    def setDtdEntityValue(value: /* v */ js.Any => String): Self = StObject.set(x, "dtdEntityValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDtdEntityValueUndefined: Self = StObject.set(x, "dtdEntityValue", js.undefined)
    
    @scala.inline
    def setDtdNData(value: /* v */ js.Any => String): Self = StObject.set(x, "dtdNData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDtdNDataUndefined: Self = StObject.set(x, "dtdNData", js.undefined)
    
    @scala.inline
    def setDtdPubID(value: /* v */ js.Any => String): Self = StObject.set(x, "dtdPubID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDtdPubIDUndefined: Self = StObject.set(x, "dtdPubID", js.undefined)
    
    @scala.inline
    def setDtdSysID(value: /* v */ js.Any => String): Self = StObject.set(x, "dtdSysID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDtdSysIDUndefined: Self = StObject.set(x, "dtdSysID", js.undefined)
    
    @scala.inline
    def setInsTarget(value: /* v */ js.Any => String): Self = StObject.set(x, "insTarget", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsTargetUndefined: Self = StObject.set(x, "insTarget", js.undefined)
    
    @scala.inline
    def setInsValue(value: /* v */ js.Any => String): Self = StObject.set(x, "insValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsValueUndefined: Self = StObject.set(x, "insValue", js.undefined)
    
    @scala.inline
    def setName(value: /* v */ js.Any => String): Self = StObject.set(x, "name", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRaw(value: /* v */ js.Any => String): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    @scala.inline
    def setText(value: /* v */ js.Any => String): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTextEscape(value: /* v */ String => String): Self = StObject.set(x, "textEscape", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTextEscapeUndefined: Self = StObject.set(x, "textEscape", js.undefined)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setXmlEncoding(value: /* v */ js.Any => String): Self = StObject.set(x, "xmlEncoding", js.Any.fromFunction1(value))
    
    @scala.inline
    def setXmlEncodingUndefined: Self = StObject.set(x, "xmlEncoding", js.undefined)
    
    @scala.inline
    def setXmlStandalone(value: /* v */ js.Any => String): Self = StObject.set(x, "xmlStandalone", js.Any.fromFunction1(value))
    
    @scala.inline
    def setXmlStandaloneUndefined: Self = StObject.set(x, "xmlStandalone", js.undefined)
    
    @scala.inline
    def setXmlVersion(value: /* v */ js.Any => String): Self = StObject.set(x, "xmlVersion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setXmlVersionUndefined: Self = StObject.set(x, "xmlVersion", js.undefined)
  }
}
