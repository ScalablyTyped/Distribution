package typings.textClipper

import typings.textClipper.textClipperBooleans.`false`
import typings.textClipper.textClipperBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("text-clipper", JSImport.Default)
  @js.native
  def default(string: String, maxLength: Double): String = js.native
  @JSImport("text-clipper", JSImport.Default)
  @js.native
  def default(string: String, maxLength: Double, options: ClipOptions): String = js.native
  
  @js.native
  trait ClipHtmlOptions
    extends CommonClipOptions
       with ClipOptions {
    
    @JSName("html")
    var html_ClipHtmlOptions: `true` = js.native
    
    /**
      * The amount of characters to assume for images. This is used whenever an image is encountered,
      * but also for SVG and MathML content. Default: `2`.
      */
    var imageWeight: js.UndefOr[Double] = js.native
  }
  object ClipHtmlOptions {
    
    @scala.inline
    def apply(html: `true`): ClipHtmlOptions = {
      val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClipHtmlOptions]
    }
    
    @scala.inline
    implicit class ClipHtmlOptionsMutableBuilder[Self <: ClipHtmlOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHtml(value: `true`): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageWeight(value: Double): Self = StObject.set(x, "imageWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageWeightUndefined: Self = StObject.set(x, "imageWeight", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.textClipper.mod.ClipPlainTextOptions
    - typings.textClipper.mod.ClipHtmlOptions
  */
  trait ClipOptions extends StObject
  object ClipOptions {
    
    @scala.inline
    def ClipHtmlOptions(html: `true`): typings.textClipper.mod.ClipHtmlOptions = {
      val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.textClipper.mod.ClipHtmlOptions]
    }
    
    @scala.inline
    def ClipPlainTextOptions(): typings.textClipper.mod.ClipPlainTextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.textClipper.mod.ClipPlainTextOptions]
    }
  }
  
  @js.native
  trait ClipPlainTextOptions
    extends CommonClipOptions
       with ClipOptions {
    
    @JSName("html")
    var html_ClipPlainTextOptions: js.UndefOr[`false`] = js.native
  }
  object ClipPlainTextOptions {
    
    @scala.inline
    def apply(): ClipPlainTextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClipPlainTextOptions]
    }
    
    @scala.inline
    implicit class ClipPlainTextOptionsMutableBuilder[Self <: ClipPlainTextOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHtml(value: `false`): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    }
  }
  
  @js.native
  trait CommonClipOptions extends StObject {
    
    /**
      * By default, we try to break only at word boundaries. Set to true if this is undesired.
      */
    var breakWords: js.UndefOr[Boolean] = js.native
    
    /**
      * Set to `true` if the string is HTML-encoded. If so, this method will take extra care to make
      * sure the HTML-encoding is correctly maintained.
      */
    var html: js.UndefOr[Boolean] = js.native
    
    /**
      * The string to insert to indicate clipping. Default: "…".
      */
    var indicator: js.UndefOr[String] = js.native
    
    /**
      * Maximum amount of lines allowed. If given, the string will be clipped either at the moment
      * the maximum amount of characters is exceeded or the moment maxLines newlines are discovered,
      * whichever comes first.
      */
    var maxLines: js.UndefOr[Double] = js.native
  }
  object CommonClipOptions {
    
    @scala.inline
    def apply(): CommonClipOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonClipOptions]
    }
    
    @scala.inline
    implicit class CommonClipOptionsMutableBuilder[Self <: CommonClipOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreakWords(value: Boolean): Self = StObject.set(x, "breakWords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakWordsUndefined: Self = StObject.set(x, "breakWords", js.undefined)
      
      @scala.inline
      def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setIndicator(value: String): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
      
      @scala.inline
      def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
    }
  }
}
