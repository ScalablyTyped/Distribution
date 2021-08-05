package typings.xmltojson

import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xmltojson", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def grokType(sValue: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("grokType")(sValue.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def parseString(xmlString: String, opt: Options): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(xmlString.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def parseXml(oXMLParent: Document, opt: Options): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parseXml")(oXMLParent.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def stringToXml(xmlString: String): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToXml")(xmlString.asInstanceOf[js.Any]).asInstanceOf[Document]
  
  inline def xmlToString(xmlDoc: Document): String = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlToString")(xmlDoc.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait Options extends StObject {
    
    var attrKey: js.UndefOr[String] = js.undefined
    
    var attrsAsObject: js.UndefOr[Boolean] = js.undefined
    
    var cdataKey: js.UndefOr[String] = js.undefined
    
    var childrenAsArray: js.UndefOr[Boolean] = js.undefined
    
    var grokAttr: js.UndefOr[Boolean] = js.undefined
    
    var grokText: js.UndefOr[Boolean] = js.undefined
    
    var mergeCDATA: js.UndefOr[Boolean] = js.undefined
    
    var namespaceKey: js.UndefOr[String] = js.undefined
    
    var normalize: js.UndefOr[Boolean] = js.undefined
    
    var stripAttrPrefix: js.UndefOr[Boolean] = js.undefined
    
    var stripElemPrefix: js.UndefOr[Boolean] = js.undefined
    
    var textKey: js.UndefOr[String] = js.undefined
    
    var valueKey: js.UndefOr[String] = js.undefined
    
    var xmlns: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAttrKey(value: String): Self = StObject.set(x, "attrKey", value.asInstanceOf[js.Any])
      
      inline def setAttrKeyUndefined: Self = StObject.set(x, "attrKey", js.undefined)
      
      inline def setAttrsAsObject(value: Boolean): Self = StObject.set(x, "attrsAsObject", value.asInstanceOf[js.Any])
      
      inline def setAttrsAsObjectUndefined: Self = StObject.set(x, "attrsAsObject", js.undefined)
      
      inline def setCdataKey(value: String): Self = StObject.set(x, "cdataKey", value.asInstanceOf[js.Any])
      
      inline def setCdataKeyUndefined: Self = StObject.set(x, "cdataKey", js.undefined)
      
      inline def setChildrenAsArray(value: Boolean): Self = StObject.set(x, "childrenAsArray", value.asInstanceOf[js.Any])
      
      inline def setChildrenAsArrayUndefined: Self = StObject.set(x, "childrenAsArray", js.undefined)
      
      inline def setGrokAttr(value: Boolean): Self = StObject.set(x, "grokAttr", value.asInstanceOf[js.Any])
      
      inline def setGrokAttrUndefined: Self = StObject.set(x, "grokAttr", js.undefined)
      
      inline def setGrokText(value: Boolean): Self = StObject.set(x, "grokText", value.asInstanceOf[js.Any])
      
      inline def setGrokTextUndefined: Self = StObject.set(x, "grokText", js.undefined)
      
      inline def setMergeCDATA(value: Boolean): Self = StObject.set(x, "mergeCDATA", value.asInstanceOf[js.Any])
      
      inline def setMergeCDATAUndefined: Self = StObject.set(x, "mergeCDATA", js.undefined)
      
      inline def setNamespaceKey(value: String): Self = StObject.set(x, "namespaceKey", value.asInstanceOf[js.Any])
      
      inline def setNamespaceKeyUndefined: Self = StObject.set(x, "namespaceKey", js.undefined)
      
      inline def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      inline def setStripAttrPrefix(value: Boolean): Self = StObject.set(x, "stripAttrPrefix", value.asInstanceOf[js.Any])
      
      inline def setStripAttrPrefixUndefined: Self = StObject.set(x, "stripAttrPrefix", js.undefined)
      
      inline def setStripElemPrefix(value: Boolean): Self = StObject.set(x, "stripElemPrefix", value.asInstanceOf[js.Any])
      
      inline def setStripElemPrefixUndefined: Self = StObject.set(x, "stripElemPrefix", js.undefined)
      
      inline def setTextKey(value: String): Self = StObject.set(x, "textKey", value.asInstanceOf[js.Any])
      
      inline def setTextKeyUndefined: Self = StObject.set(x, "textKey", js.undefined)
      
      inline def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
      
      inline def setValueKeyUndefined: Self = StObject.set(x, "valueKey", js.undefined)
      
      inline def setXmlns(value: Boolean): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
      
      inline def setXmlnsUndefined: Self = StObject.set(x, "xmlns", js.undefined)
    }
  }
}
