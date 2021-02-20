package typings.svgSprite

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Attributes extends StObject {
    
    /**
      * Width and height attributes on embedded shapes
      */
    var attributes: js.UndefOr[Boolean] = js.native
    
    /**
      * Max. shape height
      */
    var maxHeight: js.UndefOr[Double] = js.native
    
    /**
      * Max. shape width
      */
    var maxWidth: js.UndefOr[Double] = js.native
    
    /**
      * Floating point precision
      */
    var precision: js.UndefOr[Double] = js.native
  }
  object Attributes {
    
    @scala.inline
    def apply(): Attributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attributes]
    }
    
    @scala.inline
    implicit class AttributesMutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: Boolean): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    }
  }
  
  @js.native
  trait Box extends StObject {
    
    /**
      * Padding strategy (similar to CSS `box-sizing`)
      */
    var box: js.UndefOr[String] = js.native
    
    /**
      * Padding around all shapes
      */
    var padding: js.UndefOr[Double | js.Array[Double]] = js.native
  }
  object Box {
    
    @scala.inline
    def apply(): Box = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Box]
    }
    
    @scala.inline
    implicit class BoxMutableBuilder[Self <: Box] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBox(value: String): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxUndefined: Self = StObject.set(x, "box", js.undefined)
      
      @scala.inline
      def setPadding(value: Double | js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Generator extends StObject {
    
    /**
      * SVG shape ID generator callback
      */
    var generator: js.UndefOr[String | (js.Function1[/* svg */ String, String])] = js.native
    
    /**
      * File name separator for shape states (e.g. ':hover')
      */
    var pseudo: js.UndefOr[String] = js.native
    
    /**
      * Separator for directory name traversal
      */
    var separator: js.UndefOr[String] = js.native
    
    /**
      * Whitespace replacement for shape IDs
      */
    var whitespace: js.UndefOr[String] = js.native
  }
  object Generator {
    
    @scala.inline
    def apply(): Generator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Generator]
    }
    
    @scala.inline
    implicit class GeneratorMutableBuilder[Self <: Generator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGenerator(value: String | (js.Function1[/* svg */ String, String])): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeneratorFunction1(value: /* svg */ String => String): Self = StObject.set(x, "generator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGeneratorUndefined: Self = StObject.set(x, "generator", js.undefined)
      
      @scala.inline
      def setPseudo(value: String): Self = StObject.set(x, "pseudo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPseudoUndefined: Self = StObject.set(x, "pseudo", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setWhitespace(value: String): Self = StObject.set(x, "whitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhitespaceUndefined: Self = StObject.set(x, "whitespace", js.undefined)
    }
  }
  
  @js.native
  trait Plugins extends StObject {
    
    var plugins: js.UndefOr[js.Array[StringDictionary[Boolean]]] = js.native
  }
  object Plugins {
    
    @scala.inline
    def apply(): Plugins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Plugins]
    }
    
    @scala.inline
    implicit class PluginsMutableBuilder[Self <: Plugins] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlugins(value: js.Array[StringDictionary[Boolean]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: StringDictionary[Boolean]*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    }
  }
}
