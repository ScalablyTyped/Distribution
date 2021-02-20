package typings.xml

import typings.xml.mod.XmlAttrs
import typings.xml.mod._XmlDesc
import typings.xml.xmlBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Attr extends _XmlDesc {
    
    var _attr: XmlAttrs = js.native
  }
  object Attr {
    
    @scala.inline
    def apply(_attr: XmlAttrs): Attr = {
      val __obj = js.Dynamic.literal(_attr = _attr.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attr]
    }
    
    @scala.inline
    implicit class AttrMutableBuilder[Self <: Attr] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_attr(value: XmlAttrs): Self = StObject.set(x, "_attr", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AttrCdata extends _XmlDesc {
    
    var _attr: XmlAttrs = js.native
    
    var _cdata: String = js.native
  }
  object AttrCdata {
    
    @scala.inline
    def apply(_attr: XmlAttrs, _cdata: String): AttrCdata = {
      val __obj = js.Dynamic.literal(_attr = _attr.asInstanceOf[js.Any], _cdata = _cdata.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttrCdata]
    }
    
    @scala.inline
    implicit class AttrCdataMutableBuilder[Self <: AttrCdata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_attr(value: XmlAttrs): Self = StObject.set(x, "_attr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_cdata(value: String): Self = StObject.set(x, "_cdata", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Cdata extends _XmlDesc {
    
    var _cdata: String = js.native
  }
  object Cdata {
    
    @scala.inline
    def apply(_cdata: String): Cdata = {
      val __obj = js.Dynamic.literal(_cdata = _cdata.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cdata]
    }
    
    @scala.inline
    implicit class CdataMutableBuilder[Self <: Cdata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_cdata(value: String): Self = StObject.set(x, "_cdata", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Encoding extends StObject {
    
    var encoding: js.UndefOr[String] = js.native
    
    var standalone: js.UndefOr[String] = js.native
  }
  object Encoding {
    
    @scala.inline
    def apply(): Encoding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Encoding]
    }
    
    @scala.inline
    implicit class EncodingMutableBuilder[Self <: Encoding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setStandalone(value: String): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
    }
  }
  
  @js.native
  trait Indent extends StObject {
    
    var indent: js.UndefOr[String] = js.native
    
    var stream: `true` = js.native
  }
  object Indent {
    
    @scala.inline
    def apply(stream: `true`): Indent = {
      val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[Indent]
    }
    
    @scala.inline
    implicit class IndentMutableBuilder[Self <: Indent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setStream(value: `true`): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
}
