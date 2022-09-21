package typings.xml

import typings.xml.mod.XmlAttrs
import typings.xml.mod._XmlDesc
import typings.xml.xmlBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attr
    extends StObject
       with _XmlDesc {
    
    var _attr: XmlAttrs
  }
  object Attr {
    
    inline def apply(_attr: XmlAttrs): Attr = {
      val __obj = js.Dynamic.literal(_attr = _attr.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attr]
    }
    
    extension [Self <: Attr](x: Self) {
      
      inline def set_attr(value: XmlAttrs): Self = StObject.set(x, "_attr", value.asInstanceOf[js.Any])
    }
  }
  
  trait AttrCdata
    extends StObject
       with _XmlDesc {
    
    var _attr: XmlAttrs
    
    var _cdata: String
  }
  object AttrCdata {
    
    inline def apply(_attr: XmlAttrs, _cdata: String): AttrCdata = {
      val __obj = js.Dynamic.literal(_attr = _attr.asInstanceOf[js.Any], _cdata = _cdata.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttrCdata]
    }
    
    extension [Self <: AttrCdata](x: Self) {
      
      inline def set_attr(value: XmlAttrs): Self = StObject.set(x, "_attr", value.asInstanceOf[js.Any])
      
      inline def set_cdata(value: String): Self = StObject.set(x, "_cdata", value.asInstanceOf[js.Any])
    }
  }
  
  trait Cdata
    extends StObject
       with _XmlDesc {
    
    var _cdata: String
  }
  object Cdata {
    
    inline def apply(_cdata: String): Cdata = {
      val __obj = js.Dynamic.literal(_cdata = _cdata.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cdata]
    }
    
    extension [Self <: Cdata](x: Self) {
      
      inline def set_cdata(value: String): Self = StObject.set(x, "_cdata", value.asInstanceOf[js.Any])
    }
  }
  
  trait Encoding extends StObject {
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var standalone: js.UndefOr[String] = js.undefined
  }
  object Encoding {
    
    inline def apply(): Encoding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Encoding]
    }
    
    extension [Self <: Encoding](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setStandalone(value: String): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      inline def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
    }
  }
  
  /* Inlined {  stream :true} & xml.xml.Option */
  trait streamtrueOption extends StObject {
    
    /**
      * Add default xml declaration (default false)
      */
    var declaration: js.UndefOr[Boolean | Encoding] = js.undefined
    
    /**
      * String used for tab, defaults to no tabs (compressed)
      */
    var indent: js.UndefOr[String] = js.undefined
    
    /**
      * Return the result as a `stream` (default false)
      */
    var stream: `true` & js.UndefOr[Boolean]
  }
  object streamtrueOption {
    
    inline def apply(stream: `true` & js.UndefOr[Boolean]): streamtrueOption = {
      val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[streamtrueOption]
    }
    
    extension [Self <: streamtrueOption](x: Self) {
      
      inline def setDeclaration(value: Boolean | Encoding): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
      
      inline def setDeclarationUndefined: Self = StObject.set(x, "declaration", js.undefined)
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setStream(value: `true` & js.UndefOr[Boolean]): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
}
