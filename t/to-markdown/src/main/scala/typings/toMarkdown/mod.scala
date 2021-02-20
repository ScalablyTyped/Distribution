package typings.toMarkdown

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Converts HTML to markdown.
    */
  @JSImport("to-markdown", JSImport.Namespace)
  @js.native
  def apply(input: String): String = js.native
  @JSImport("to-markdown", JSImport.Namespace)
  @js.native
  def apply(input: String, options: Options): String = js.native
  
  /**
    * Returns true / false depending on whether the element is block level.
    */
  @JSImport("to-markdown", "isBlock")
  @js.native
  def isBlock(node: HTMLElement): Boolean = js.native
  
  /**
    * Returns true / false depending on whether the element is void.
    */
  @JSImport("to-markdown", "isVoid")
  @js.native
  def isVoid(node: HTMLElement): Boolean = js.native
  
  /**
    * Returns the HTML string of an element with its contents converted.
    */
  @JSImport("to-markdown", "outer")
  @js.native
  def outer(node: HTMLElement, content: String): Boolean = js.native
  
  @js.native
  trait Converter extends StObject {
    
    var filter: Filter = js.native
    
    def replacement(innerHTML: String, node: HTMLElement): String = js.native
  }
  object Converter {
    
    @scala.inline
    def apply(filter: Filter, replacement: (String, HTMLElement) => String): Converter = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], replacement = js.Any.fromFunction2(replacement))
      __obj.asInstanceOf[Converter]
    }
    
    @scala.inline
    implicit class ConverterMutableBuilder[Self <: Converter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterFunction1(value: /* node */ HTMLElement => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterVarargs(value: String*): Self = StObject.set(x, "filter", js.Array(value :_*))
      
      @scala.inline
      def setReplacement(value: (String, HTMLElement) => String): Self = StObject.set(x, "replacement", js.Any.fromFunction2(value))
    }
  }
  
  type Filter = String | js.Array[String] | (js.Function1[/* node */ HTMLElement, Boolean])
  
  @js.native
  trait Options extends StObject {
    
    var converters: js.UndefOr[js.Array[Converter]] = js.native
    
    var gfm: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConverters(value: js.Array[Converter]): Self = StObject.set(x, "converters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConvertersUndefined: Self = StObject.set(x, "converters", js.undefined)
      
      @scala.inline
      def setConvertersVarargs(value: Converter*): Self = StObject.set(x, "converters", js.Array(value :_*))
      
      @scala.inline
      def setGfm(value: Boolean): Self = StObject.set(x, "gfm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGfmUndefined: Self = StObject.set(x, "gfm", js.undefined)
    }
  }
}
