package typings.xml

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ReadableStream
import typings.xml.anon.Attr
import typings.xml.anon.Encoding
import typings.xml.anon.Indent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  inline def apply(xmlObject: js.Array[XmlObject]): String = ^.asInstanceOf[js.Dynamic].apply(xmlObject.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(xmlObject: js.Array[XmlObject], options: String): String = (^.asInstanceOf[js.Dynamic].apply(xmlObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(xmlObject: js.Array[XmlObject], options: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(xmlObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(xmlObject: js.Array[XmlObject], options: Indent): ReadableStream = (^.asInstanceOf[js.Dynamic].apply(xmlObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def apply(xmlObject: js.Array[XmlObject], options: Option): String = (^.asInstanceOf[js.Dynamic].apply(xmlObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(xmlObject: Unit, options: String): String = (^.asInstanceOf[js.Dynamic].apply(xmlObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(xmlObject: Unit, options: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(xmlObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(xmlObject: Unit, options: Option): String = (^.asInstanceOf[js.Dynamic].apply(xmlObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(xmlObject: XmlObject): String = ^.asInstanceOf[js.Dynamic].apply(xmlObject.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(xmlObject: XmlObject, options: String): String = (^.asInstanceOf[js.Dynamic].apply(xmlObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(xmlObject: XmlObject, options: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(xmlObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(xmlObject: XmlObject, options: Indent): ReadableStream = (^.asInstanceOf[js.Dynamic].apply(xmlObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def apply(xmlObject: XmlObject, options: Option): String = (^.asInstanceOf[js.Dynamic].apply(xmlObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("xml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Element_(xmlObjects: XmlObject*): ElementObject = ^.asInstanceOf[js.Dynamic].applyDynamic("Element")(xmlObjects.asInstanceOf[js.Any]).asInstanceOf[ElementObject]
  
  inline def element(xmlObjects: XmlObject*): ElementObject = ^.asInstanceOf[js.Dynamic].applyDynamic("element")(xmlObjects.asInstanceOf[js.Any]).asInstanceOf[ElementObject]
  
  @js.native
  trait ElementObject extends StObject {
    
    def close(): Unit = js.native
    def close(xmlObject: XmlObject): Unit = js.native
    
    def push(xmlObject: XmlObject): Unit = js.native
  }
  
  trait Option extends StObject {
    
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
    var stream: js.UndefOr[Boolean] = js.undefined
  }
  object Option {
    
    inline def apply(): Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option]
    }
    
    extension [Self <: Option](x: Self) {
      
      inline def setDeclaration(value: Boolean | Encoding): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
      
      inline def setDeclarationUndefined: Self = StObject.set(x, "declaration", js.undefined)
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    }
  }
  
  type XmlAtom = String | Double | Boolean | Null
  
  type XmlAttrs = StringDictionary[XmlAtom]
  
  /* Rewritten from type alias, can be one of: 
    - typings.xml.anon.Attr
    - typings.xml.anon.Cdata
    - typings.xml.anon.AttrCdata
    - typings.xml.mod.XmlAtom
    - js.Array[typings.xml.mod.XmlAtom]
    - typings.xml.mod.XmlDescArray
  */
  type XmlDesc = _XmlDesc | js.Array[XmlAtom] | XmlAtom
  
  trait XmlDescArray
    extends StObject
       with /* index */ NumberDictionary[Attr | XmlObject]
       with _XmlDesc
  object XmlDescArray {
    
    inline def apply(): XmlDescArray = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XmlDescArray]
    }
  }
  
  type XmlObject = (StringDictionary[ElementObject | XmlDesc]) | XmlDesc
  
  trait _XmlDesc extends StObject
  object _XmlDesc {
    
    inline def Attr(_attr: XmlAttrs): typings.xml.anon.Attr = {
      val __obj = js.Dynamic.literal(_attr = _attr.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.xml.anon.Attr]
    }
    
    inline def AttrCdata(_attr: XmlAttrs, _cdata: String): typings.xml.anon.AttrCdata = {
      val __obj = js.Dynamic.literal(_attr = _attr.asInstanceOf[js.Any], _cdata = _cdata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.xml.anon.AttrCdata]
    }
    
    inline def Cdata(_cdata: String): typings.xml.anon.Cdata = {
      val __obj = js.Dynamic.literal(_cdata = _cdata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.xml.anon.Cdata]
    }
    
    inline def XmlDescArray(): typings.xml.mod.XmlDescArray = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.xml.mod.XmlDescArray]
    }
  }
}
