package typings.xmlFormatter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(xml: String): String = ^.asInstanceOf[js.Dynamic].apply(xml.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(xml: String, options: FormatOptions): String = (^.asInstanceOf[js.Dynamic].apply(xml.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("xml-formatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FormatOptions extends StObject {
    
    var collapseContent: js.UndefOr[Boolean] = js.undefined
    
    var filter: js.UndefOr[js.Function1[/* node */ Any, Boolean]] = js.undefined
    
    var indentation: js.UndefOr[String] = js.undefined
    
    var lineSeparator: js.UndefOr[String] = js.undefined
    
    var stripComments: js.UndefOr[Boolean] = js.undefined
    
    var whiteSpaceAtEndOfSelfclosingTag: js.UndefOr[Boolean] = js.undefined
  }
  object FormatOptions {
    
    inline def apply(): FormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatOptions]
    }
    
    extension [Self <: FormatOptions](x: Self) {
      
      inline def setCollapseContent(value: Boolean): Self = StObject.set(x, "collapseContent", value.asInstanceOf[js.Any])
      
      inline def setCollapseContentUndefined: Self = StObject.set(x, "collapseContent", js.undefined)
      
      inline def setFilter(value: /* node */ Any => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setIndentation(value: String): Self = StObject.set(x, "indentation", value.asInstanceOf[js.Any])
      
      inline def setIndentationUndefined: Self = StObject.set(x, "indentation", js.undefined)
      
      inline def setLineSeparator(value: String): Self = StObject.set(x, "lineSeparator", value.asInstanceOf[js.Any])
      
      inline def setLineSeparatorUndefined: Self = StObject.set(x, "lineSeparator", js.undefined)
      
      inline def setStripComments(value: Boolean): Self = StObject.set(x, "stripComments", value.asInstanceOf[js.Any])
      
      inline def setStripCommentsUndefined: Self = StObject.set(x, "stripComments", js.undefined)
      
      inline def setWhiteSpaceAtEndOfSelfclosingTag(value: Boolean): Self = StObject.set(x, "whiteSpaceAtEndOfSelfclosingTag", value.asInstanceOf[js.Any])
      
      inline def setWhiteSpaceAtEndOfSelfclosingTagUndefined: Self = StObject.set(x, "whiteSpaceAtEndOfSelfclosingTag", js.undefined)
    }
  }
}
