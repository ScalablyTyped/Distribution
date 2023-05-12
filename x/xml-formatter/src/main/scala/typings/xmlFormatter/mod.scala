package typings.xmlFormatter

import typings.xmlParserXo.mod.XmlParserNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    /**
      * Converts the given XML into human readable format.
      */
    inline def apply(xml: String): String = ^.asInstanceOf[js.Dynamic].apply(xml.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(xml: String, options: XMLFormatterOptions): String = (^.asInstanceOf[js.Dynamic].apply(xml.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("xml-formatter", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("xml-formatter", "default.minify")
    @js.native
    def minify: js.Function2[/* xml */ String, /* options */ js.UndefOr[XMLFormatterMinifyOptions], String] = js.native
    inline def minify_=(x: js.Function2[/* xml */ String, /* options */ js.UndefOr[XMLFormatterMinifyOptions], String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minify")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined std.Omit<xml-formatter.xml-formatter.XMLFormatterOptions, 'lineSeparator' | 'indentation'> */
  trait XMLFormatterMinifyOptions extends StObject {
    
    var collapseContent: js.UndefOr[Boolean] = js.undefined
    
    var filter: js.UndefOr[js.Function1[/* node */ XmlParserNode, Boolean]] = js.undefined
    
    var throwOnFailure: js.UndefOr[Boolean] = js.undefined
    
    var whiteSpaceAtEndOfSelfclosingTag: js.UndefOr[Boolean] = js.undefined
  }
  object XMLFormatterMinifyOptions {
    
    inline def apply(): XMLFormatterMinifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XMLFormatterMinifyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XMLFormatterMinifyOptions] (val x: Self) extends AnyVal {
      
      inline def setCollapseContent(value: Boolean): Self = StObject.set(x, "collapseContent", value.asInstanceOf[js.Any])
      
      inline def setCollapseContentUndefined: Self = StObject.set(x, "collapseContent", js.undefined)
      
      inline def setFilter(value: /* node */ XmlParserNode => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setThrowOnFailure(value: Boolean): Self = StObject.set(x, "throwOnFailure", value.asInstanceOf[js.Any])
      
      inline def setThrowOnFailureUndefined: Self = StObject.set(x, "throwOnFailure", js.undefined)
      
      inline def setWhiteSpaceAtEndOfSelfclosingTag(value: Boolean): Self = StObject.set(x, "whiteSpaceAtEndOfSelfclosingTag", value.asInstanceOf[js.Any])
      
      inline def setWhiteSpaceAtEndOfSelfclosingTagUndefined: Self = StObject.set(x, "whiteSpaceAtEndOfSelfclosingTag", js.undefined)
    }
  }
  
  trait XMLFormatterOptions extends StObject {
    
    /**
      * True to keep content in the same line as the element.
      * Notes: Only works if element contains at least one text node.
      * Default: false
      */
    var collapseContent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Return false to exclude the node.
      */
    var filter: js.UndefOr[js.Function1[/* node */ XmlParserNode, Boolean]] = js.undefined
    
    /**
      * The value used for indentation.
      * Default = '    '
      */
    var indentation: js.UndefOr[String] = js.undefined
    
    /**
      * The line separator to use.
      * Default: '\r\n'
      */
    var lineSeparator: js.UndefOr[String] = js.undefined
    
    /**
      * Throw an error when XML fails to parse and get formatted.
      * Notes: If set to `false`, the original XML is returned when an error occurs.
      * Default: true
      */
    var throwOnFailure: js.UndefOr[Boolean] = js.undefined
    
    /**
      * To either end ad self closing tag with `<tag/>` or `<tag />`.
      * Default: false
      */
    var whiteSpaceAtEndOfSelfclosingTag: js.UndefOr[Boolean] = js.undefined
  }
  object XMLFormatterOptions {
    
    inline def apply(): XMLFormatterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XMLFormatterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XMLFormatterOptions] (val x: Self) extends AnyVal {
      
      inline def setCollapseContent(value: Boolean): Self = StObject.set(x, "collapseContent", value.asInstanceOf[js.Any])
      
      inline def setCollapseContentUndefined: Self = StObject.set(x, "collapseContent", js.undefined)
      
      inline def setFilter(value: /* node */ XmlParserNode => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setIndentation(value: String): Self = StObject.set(x, "indentation", value.asInstanceOf[js.Any])
      
      inline def setIndentationUndefined: Self = StObject.set(x, "indentation", js.undefined)
      
      inline def setLineSeparator(value: String): Self = StObject.set(x, "lineSeparator", value.asInstanceOf[js.Any])
      
      inline def setLineSeparatorUndefined: Self = StObject.set(x, "lineSeparator", js.undefined)
      
      inline def setThrowOnFailure(value: Boolean): Self = StObject.set(x, "throwOnFailure", value.asInstanceOf[js.Any])
      
      inline def setThrowOnFailureUndefined: Self = StObject.set(x, "throwOnFailure", js.undefined)
      
      inline def setWhiteSpaceAtEndOfSelfclosingTag(value: Boolean): Self = StObject.set(x, "whiteSpaceAtEndOfSelfclosingTag", value.asInstanceOf[js.Any])
      
      inline def setWhiteSpaceAtEndOfSelfclosingTagUndefined: Self = StObject.set(x, "whiteSpaceAtEndOfSelfclosingTag", js.undefined)
    }
  }
}
