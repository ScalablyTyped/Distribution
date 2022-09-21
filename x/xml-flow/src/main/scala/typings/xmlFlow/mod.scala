package typings.xmlFlow

import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(infile: Readable): EventEmitter = ^.asInstanceOf[js.Dynamic].apply(infile.asInstanceOf[js.Any]).asInstanceOf[EventEmitter]
  inline def apply(infile: Readable, options: parserOptions): EventEmitter = (^.asInstanceOf[js.Dynamic].apply(infile.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EventEmitter]
  
  @JSImport("xml-flow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("xml-flow", "ALWAYS")
  @js.native
  val ALWAYS: /* 1 */ Double = js.native
  
  @JSImport("xml-flow", "NEVER")
  @js.native
  val NEVER: /* -1 */ Double = js.native
  
  @JSImport("xml-flow", "SOMETIMES")
  @js.native
  val SOMETIMES: /* 0 */ Double = js.native
  
  inline def toXml(obj: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toXml")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toXml(obj: js.Object, options: toXmlOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toXml")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait parserOptions extends StObject {
    
    var cdataAsText: js.UndefOr[Boolean] = js.undefined
    
    var lowercase: js.UndefOr[Boolean] = js.undefined
    
    var normalize: js.UndefOr[Boolean] = js.undefined
    
    var preserveMarkup: js.UndefOr[/* -1 */ Double] = js.undefined
    
    var simplifyNodes: js.UndefOr[Boolean] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
    
    var trim: js.UndefOr[Boolean] = js.undefined
    
    var useArrays: js.UndefOr[/* -1 */ Double] = js.undefined
  }
  object parserOptions {
    
    inline def apply(): parserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[parserOptions]
    }
    
    extension [Self <: parserOptions](x: Self) {
      
      inline def setCdataAsText(value: Boolean): Self = StObject.set(x, "cdataAsText", value.asInstanceOf[js.Any])
      
      inline def setCdataAsTextUndefined: Self = StObject.set(x, "cdataAsText", js.undefined)
      
      inline def setLowercase(value: Boolean): Self = StObject.set(x, "lowercase", value.asInstanceOf[js.Any])
      
      inline def setLowercaseUndefined: Self = StObject.set(x, "lowercase", js.undefined)
      
      inline def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      inline def setPreserveMarkup(value: /* -1 */ Double): Self = StObject.set(x, "preserveMarkup", value.asInstanceOf[js.Any])
      
      inline def setPreserveMarkupUndefined: Self = StObject.set(x, "preserveMarkup", js.undefined)
      
      inline def setSimplifyNodes(value: Boolean): Self = StObject.set(x, "simplifyNodes", value.asInstanceOf[js.Any])
      
      inline def setSimplifyNodesUndefined: Self = StObject.set(x, "simplifyNodes", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      inline def setUseArrays(value: /* -1 */ Double): Self = StObject.set(x, "useArrays", value.asInstanceOf[js.Any])
      
      inline def setUseArraysUndefined: Self = StObject.set(x, "useArrays", js.undefined)
    }
  }
  
  trait toXmlOptions extends StObject {
    
    var escape: js.UndefOr[js.Function1[/* s */ String, String]] = js.undefined
    
    var indent: js.UndefOr[String] = js.undefined
    
    var selfClosing: js.UndefOr[Boolean] = js.undefined
  }
  object toXmlOptions {
    
    inline def apply(): toXmlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[toXmlOptions]
    }
    
    extension [Self <: toXmlOptions](x: Self) {
      
      inline def setEscape(value: /* s */ String => String): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
      
      inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setSelfClosing(value: Boolean): Self = StObject.set(x, "selfClosing", value.asInstanceOf[js.Any])
      
      inline def setSelfClosingUndefined: Self = StObject.set(x, "selfClosing", js.undefined)
    }
  }
}
