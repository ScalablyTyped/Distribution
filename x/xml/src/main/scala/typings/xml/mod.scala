package typings.xml

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ReadableStream
import typings.xml.anon.Attr
import typings.xml.anon.Encoding
import typings.xml.anon.Indent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xml", JSImport.Namespace)
  @js.native
  def apply(): String = js.native
  @JSImport("xml", JSImport.Namespace)
  @js.native
  def apply(xmlObject: js.UndefOr[XmlObject], options: String): String = js.native
  @JSImport("xml", JSImport.Namespace)
  @js.native
  def apply(xmlObject: js.UndefOr[XmlObject], options: Boolean): String = js.native
  @JSImport("xml", JSImport.Namespace)
  @js.native
  def apply(xmlObject: js.UndefOr[XmlObject], options: Option): String = js.native
  @JSImport("xml", JSImport.Namespace)
  @js.native
  def apply(xmlObject: js.Array[XmlObject]): String = js.native
  @JSImport("xml", JSImport.Namespace)
  @js.native
  def apply(xmlObject: js.Array[XmlObject], options: String): String = js.native
  @JSImport("xml", JSImport.Namespace)
  @js.native
  def apply(xmlObject: js.Array[XmlObject], options: Boolean): String = js.native
  @JSImport("xml", JSImport.Namespace)
  @js.native
  def apply(xmlObject: js.Array[XmlObject], options: Indent): ReadableStream = js.native
  @JSImport("xml", JSImport.Namespace)
  @js.native
  def apply(xmlObject: js.Array[XmlObject], options: Option): String = js.native
  @JSImport("xml", JSImport.Namespace)
  @js.native
  def apply(xmlObject: XmlObject): String = js.native
  @JSImport("xml", JSImport.Namespace)
  @js.native
  def apply(xmlObject: XmlObject, options: Indent): ReadableStream = js.native
  
  @JSImport("xml", "Element")
  @js.native
  def Element_(xmlObjects: XmlObject*): ElementObject = js.native
  
  @JSImport("xml", "element")
  @js.native
  def element(xmlObjects: XmlObject*): ElementObject = js.native
  
  @js.native
  trait ElementObject extends StObject {
    
    def close(): Unit = js.native
    def close(xmlObject: XmlObject): Unit = js.native
    
    def push(xmlObject: XmlObject): Unit = js.native
  }
  
  @js.native
  trait Option extends StObject {
    
    /**
      * Add default xml declaration (default false)
      */
    var declaration: js.UndefOr[Boolean | Encoding] = js.native
    
    /**
      * String used for tab, defaults to no tabs (compressed)
      */
    var indent: js.UndefOr[String] = js.native
    
    /**
      * Return the result as a `stream` (default false)
      */
    var stream: js.UndefOr[Boolean] = js.native
  }
  object Option {
    
    @scala.inline
    def apply(): Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option]
    }
    
    @scala.inline
    implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeclaration(value: Boolean | Encoding): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeclarationUndefined: Self = StObject.set(x, "declaration", js.undefined)
      
      @scala.inline
      def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
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
  
  @js.native
  trait XmlDescArray
    extends /* index */ NumberDictionary[Attr | XmlObject]
       with _XmlDesc
  object XmlDescArray {
    
    @scala.inline
    def apply(): XmlDescArray = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XmlDescArray]
    }
  }
  
  type XmlObject = (StringDictionary[ElementObject | XmlDesc]) | XmlDesc
  
  trait _XmlDesc extends StObject
  object _XmlDesc {
    
    @scala.inline
    def Attr(_attr: XmlAttrs): typings.xml.anon.Attr = {
      val __obj = js.Dynamic.literal(_attr = _attr.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.xml.anon.Attr]
    }
    
    @scala.inline
    def AttrCdata(_attr: XmlAttrs, _cdata: String): typings.xml.anon.AttrCdata = {
      val __obj = js.Dynamic.literal(_attr = _attr.asInstanceOf[js.Any], _cdata = _cdata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.xml.anon.AttrCdata]
    }
    
    @scala.inline
    def Cdata(_cdata: String): typings.xml.anon.Cdata = {
      val __obj = js.Dynamic.literal(_cdata = _cdata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.xml.anon.Cdata]
    }
    
    @scala.inline
    def XmlDescArray(): typings.xml.mod.XmlDescArray = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.xml.mod.XmlDescArray]
    }
  }
}
