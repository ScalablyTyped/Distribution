package typings.xmldomSre

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.Document
import typings.std.Node
import typings.std.Record
import typings.xmldomSre.xmldomSreStrings.error
import typings.xmldomSre.xmldomSreStrings.fatalError
import typings.xmldomSre.xmldomSreStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmldomMod {
  
  @JSImport("@xmldom/xmldom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@xmldom/xmldom", "DOMImplementation")
  @js.native
  open class DOMImplementation ()
    extends StObject
       with typings.std.DOMImplementation
  @JSImport("@xmldom/xmldom", "DOMImplementation")
  @js.native
  def DOMImplementation: DOMImplementationStatic = js.native
  inline def DOMImplementation_=(x: DOMImplementationStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOMImplementation")(x.asInstanceOf[js.Any])
  
  @js.native
  trait DOMParser extends StObject {
    
    def parseFromString(source: String): js.UndefOr[Document] = js.native
    def parseFromString(source: String, mimeType: String): js.UndefOr[Document] = js.native
  }
  @JSImport("@xmldom/xmldom", "DOMParser")
  @js.native
  def DOMParser: DOMParserStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@xmldom/xmldom", "DOMParser")
  @js.native
  open class DOMParserCls ()
    extends StObject
       with DOMParser {
    def this(options: DOMParserOptions) = this()
  }
  
  inline def DOMParser_=(x: DOMParserStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOMParser")(x.asInstanceOf[js.Any])
  
  trait XMLSerializer extends StObject {
    
    def serializeToString(node: Node): String
  }
  object XMLSerializer {
    
    @JSImport("@xmldom/xmldom", "XMLSerializer")
    @js.native
    val ^ : XMLSerializerStatic = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XMLSerializer] (val x: Self) extends AnyVal {
      
      inline def setSerializeToString(value: Node => String): Self = StObject.set(x, "serializeToString", js.Any.fromFunction1(value))
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@xmldom/xmldom", "XMLSerializer")
  @js.native
  open class XMLSerializerCls ()
    extends StObject
       with XMLSerializer {
    
    /* CompleteClass */
    override def serializeToString(node: Node): String = js.native
  }
  
  @js.native
  trait DOMImplementationStatic
    extends StObject
       with Instantiable0[typings.std.DOMImplementation]
  
  trait DOMParserOptions extends StObject {
    
    var errorHandler: js.UndefOr[ErrorHandlerFunction | ErrorHandlerObject] = js.undefined
    
    var locator: js.UndefOr[Boolean] = js.undefined
    
    var normalizeLineEndings: js.UndefOr[js.Function1[/* source */ String, String]] = js.undefined
    
    var xmlns: js.UndefOr[Record[String, js.UndefOr[String | Null]]] = js.undefined
  }
  object DOMParserOptions {
    
    inline def apply(): DOMParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DOMParserOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DOMParserOptions] (val x: Self) extends AnyVal {
      
      inline def setErrorHandler(value: ErrorHandlerFunction | ErrorHandlerObject): Self = StObject.set(x, "errorHandler", value.asInstanceOf[js.Any])
      
      inline def setErrorHandlerFunction2(value: (/* level */ warn | error | fatalError, /* msg */ String) => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction2(value))
      
      inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      inline def setLocator(value: Boolean): Self = StObject.set(x, "locator", value.asInstanceOf[js.Any])
      
      inline def setLocatorUndefined: Self = StObject.set(x, "locator", js.undefined)
      
      inline def setNormalizeLineEndings(value: /* source */ String => String): Self = StObject.set(x, "normalizeLineEndings", js.Any.fromFunction1(value))
      
      inline def setNormalizeLineEndingsUndefined: Self = StObject.set(x, "normalizeLineEndings", js.undefined)
      
      inline def setXmlns(value: Record[String, js.UndefOr[String | Null]]): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
      
      inline def setXmlnsUndefined: Self = StObject.set(x, "xmlns", js.undefined)
    }
  }
  
  @js.native
  trait DOMParserStatic
    extends StObject
       with Instantiable0[DOMParser]
       with Instantiable1[/* options */ DOMParserOptions, DOMParser]
  
  type ErrorHandlerFunction = js.Function2[/* level */ warn | error | fatalError, /* msg */ String, Unit]
  
  trait ErrorHandlerObject extends StObject {
    
    var error: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
    
    var fatalError: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
    
    var warning: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
  }
  object ErrorHandlerObject {
    
    inline def apply(): ErrorHandlerObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorHandlerObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorHandlerObject] (val x: Self) extends AnyVal {
      
      inline def setError(value: /* msg */ String => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFatalError(value: /* msg */ String => Unit): Self = StObject.set(x, "fatalError", js.Any.fromFunction1(value))
      
      inline def setFatalErrorUndefined: Self = StObject.set(x, "fatalError", js.undefined)
      
      inline def setWarning(value: /* msg */ String => Unit): Self = StObject.set(x, "warning", js.Any.fromFunction1(value))
      
      inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  @js.native
  trait XMLSerializerStatic
    extends StObject
       with Instantiable0[XMLSerializer]
}
