package typings.xmlbuilder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the functions used for converting values to strings.
  */
@js.native
trait XMLStringifier extends js.Object {
  
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
  implicit class XMLStringifierOps[Self <: XMLStringifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttEscape(value: /* v */ String => String): Self = this.set("attEscape", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAttEscape: Self = this.set("attEscape", js.undefined)
    
    @scala.inline
    def setAttValue(value: /* v */ js.Any => String): Self = this.set("attValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAttValue: Self = this.set("attValue", js.undefined)
    
    @scala.inline
    def setCdata(value: /* v */ js.Any => String): Self = this.set("cdata", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCdata: Self = this.set("cdata", js.undefined)
    
    @scala.inline
    def setComment(value: /* v */ js.Any => String): Self = this.set("comment", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setConvertAttKey(value: String): Self = this.set("convertAttKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvertAttKey: Self = this.set("convertAttKey", js.undefined)
    
    @scala.inline
    def setConvertCDataKey(value: String): Self = this.set("convertCDataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvertCDataKey: Self = this.set("convertCDataKey", js.undefined)
    
    @scala.inline
    def setConvertCommentKey(value: String): Self = this.set("convertCommentKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvertCommentKey: Self = this.set("convertCommentKey", js.undefined)
    
    @scala.inline
    def setConvertPIKey(value: String): Self = this.set("convertPIKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvertPIKey: Self = this.set("convertPIKey", js.undefined)
    
    @scala.inline
    def setConvertRawKey(value: String): Self = this.set("convertRawKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvertRawKey: Self = this.set("convertRawKey", js.undefined)
    
    @scala.inline
    def setConvertTextKey(value: String): Self = this.set("convertTextKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvertTextKey: Self = this.set("convertTextKey", js.undefined)
    
    @scala.inline
    def setDtdAttDefault(value: /* v */ js.Any => String): Self = this.set("dtdAttDefault", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDtdAttDefault: Self = this.set("dtdAttDefault", js.undefined)
    
    @scala.inline
    def setDtdAttType(value: /* v */ js.Any => String): Self = this.set("dtdAttType", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDtdAttType: Self = this.set("dtdAttType", js.undefined)
    
    @scala.inline
    def setDtdElementValue(value: /* v */ js.Any => String): Self = this.set("dtdElementValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDtdElementValue: Self = this.set("dtdElementValue", js.undefined)
    
    @scala.inline
    def setDtdEntityValue(value: /* v */ js.Any => String): Self = this.set("dtdEntityValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDtdEntityValue: Self = this.set("dtdEntityValue", js.undefined)
    
    @scala.inline
    def setDtdNData(value: /* v */ js.Any => String): Self = this.set("dtdNData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDtdNData: Self = this.set("dtdNData", js.undefined)
    
    @scala.inline
    def setDtdPubID(value: /* v */ js.Any => String): Self = this.set("dtdPubID", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDtdPubID: Self = this.set("dtdPubID", js.undefined)
    
    @scala.inline
    def setDtdSysID(value: /* v */ js.Any => String): Self = this.set("dtdSysID", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDtdSysID: Self = this.set("dtdSysID", js.undefined)
    
    @scala.inline
    def setInsTarget(value: /* v */ js.Any => String): Self = this.set("insTarget", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInsTarget: Self = this.set("insTarget", js.undefined)
    
    @scala.inline
    def setInsValue(value: /* v */ js.Any => String): Self = this.set("insValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInsValue: Self = this.set("insValue", js.undefined)
    
    @scala.inline
    def setName(value: /* v */ js.Any => String): Self = this.set("name", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRaw(value: /* v */ js.Any => String): Self = this.set("raw", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    
    @scala.inline
    def setText(value: /* v */ js.Any => String): Self = this.set("text", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextEscape(value: /* v */ String => String): Self = this.set("textEscape", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTextEscape: Self = this.set("textEscape", js.undefined)
    
    @scala.inline
    def setXmlEncoding(value: /* v */ js.Any => String): Self = this.set("xmlEncoding", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteXmlEncoding: Self = this.set("xmlEncoding", js.undefined)
    
    @scala.inline
    def setXmlStandalone(value: /* v */ js.Any => String): Self = this.set("xmlStandalone", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteXmlStandalone: Self = this.set("xmlStandalone", js.undefined)
    
    @scala.inline
    def setXmlVersion(value: /* v */ js.Any => String): Self = this.set("xmlVersion", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteXmlVersion: Self = this.set("xmlVersion", js.undefined)
  }
}
