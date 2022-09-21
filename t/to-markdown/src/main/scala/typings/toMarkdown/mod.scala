package typings.toMarkdown

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Converts HTML to markdown.
    */
  inline def apply(input: String): String = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(input: String, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("to-markdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns true / false depending on whether the element is block level.
    */
  inline def isBlock(node: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlock")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns true / false depending on whether the element is void.
    */
  inline def isVoid(node: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVoid")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns the HTML string of an element with its contents converted.
    */
  inline def outer(node: HTMLElement, content: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("outer")(node.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait Converter extends StObject {
    
    var filter: Filter
    
    def replacement(innerHTML: String, node: HTMLElement): String
  }
  object Converter {
    
    inline def apply(filter: Filter, replacement: (String, HTMLElement) => String): Converter = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], replacement = js.Any.fromFunction2(replacement))
      __obj.asInstanceOf[Converter]
    }
    
    extension [Self <: Converter](x: Self) {
      
      inline def setFilter(value: Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterFunction1(value: /* node */ HTMLElement => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterVarargs(value: String*): Self = StObject.set(x, "filter", js.Array(value*))
      
      inline def setReplacement(value: (String, HTMLElement) => String): Self = StObject.set(x, "replacement", js.Any.fromFunction2(value))
    }
  }
  
  type Filter = String | js.Array[String] | (js.Function1[/* node */ HTMLElement, Boolean])
  
  trait Options extends StObject {
    
    var converters: js.UndefOr[js.Array[Converter]] = js.undefined
    
    var gfm: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setConverters(value: js.Array[Converter]): Self = StObject.set(x, "converters", value.asInstanceOf[js.Any])
      
      inline def setConvertersUndefined: Self = StObject.set(x, "converters", js.undefined)
      
      inline def setConvertersVarargs(value: Converter*): Self = StObject.set(x, "converters", js.Array(value*))
      
      inline def setGfm(value: Boolean): Self = StObject.set(x, "gfm", value.asInstanceOf[js.Any])
      
      inline def setGfmUndefined: Self = StObject.set(x, "gfm", js.undefined)
    }
  }
}
