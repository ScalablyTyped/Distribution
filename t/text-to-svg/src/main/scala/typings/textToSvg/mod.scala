package typings.textToSvg

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("text-to-svg", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with TextToSVG {
    /**
      * Create an instance of the SVG generator, using an already parsed font file.
      *
      * You can also use {@see TextToSVG.loadSync} to create an instance with a font
      * file path or from the default font.
      *
      * @param font parsed font file
      */
    def this(font: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Font */ js.Any) = this()
  }
  @JSImport("text-to-svg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Asynchronously load a font from an URL and create a TextToSVG instance.
    * For supported file types see the "opentype.js" documentation.
    *
    * @param url of font to load
    * @param callback called, when instance has been created
    */
  /* static member */
  @scala.inline
  def load(url: String, callback: LoadCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Synchronously load a font from the filesystem and create a TextToSVG instance.
    * For supported file types see the "opentype.js" documentation.
    * If no path is provided, the default font will be used.
    *
    * @param file path to font file
    */
  /* static member */
  @scala.inline
  def loadSync(): TextToSVG = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")().asInstanceOf[TextToSVG]
  @scala.inline
  def loadSync(file: String): TextToSVG = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(file.asInstanceOf[js.Any]).asInstanceOf[TextToSVG]
  
  /**
    * Text anchor.
    * If horizontal component is omitted, it defaults to left.
    * If vertical component is omitted, it defaults to baseline.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.textToSvg.textToSvgStrings.`left baseline`
    - typings.textToSvg.textToSvgStrings.`left top`
    - typings.textToSvg.textToSvgStrings.`left bottom`
    - typings.textToSvg.textToSvgStrings.`left middle`
    - typings.textToSvg.textToSvgStrings.`center baseline`
    - typings.textToSvg.textToSvgStrings.`center top`
    - typings.textToSvg.textToSvgStrings.`center bottom`
    - typings.textToSvg.textToSvgStrings.`center middle`
    - typings.textToSvg.textToSvgStrings.`right baseline`
    - typings.textToSvg.textToSvgStrings.`right top`
    - typings.textToSvg.textToSvgStrings.`right bottom`
    - typings.textToSvg.textToSvgStrings.`right middle`
    - typings.textToSvg.textToSvgStrings.baseline
    - typings.textToSvg.textToSvgStrings.top
    - typings.textToSvg.textToSvgStrings.bottom
    - typings.textToSvg.textToSvgStrings.middle
    - typings.textToSvg.textToSvgStrings.left
    - typings.textToSvg.textToSvgStrings.center
    - typings.textToSvg.textToSvgStrings.right
  */
  trait Anchor extends StObject
  object Anchor {
    
    @scala.inline
    def baseline: typings.textToSvg.textToSvgStrings.baseline = "baseline".asInstanceOf[typings.textToSvg.textToSvgStrings.baseline]
    
    @scala.inline
    def bottom: typings.textToSvg.textToSvgStrings.bottom = "bottom".asInstanceOf[typings.textToSvg.textToSvgStrings.bottom]
    
    @scala.inline
    def center: typings.textToSvg.textToSvgStrings.center = "center".asInstanceOf[typings.textToSvg.textToSvgStrings.center]
    
    @scala.inline
    def `center baseline`: typings.textToSvg.textToSvgStrings.`center baseline` = ("center baseline").asInstanceOf[typings.textToSvg.textToSvgStrings.`center baseline`]
    
    @scala.inline
    def `center bottom`: typings.textToSvg.textToSvgStrings.`center bottom` = ("center bottom").asInstanceOf[typings.textToSvg.textToSvgStrings.`center bottom`]
    
    @scala.inline
    def `center middle`: typings.textToSvg.textToSvgStrings.`center middle` = ("center middle").asInstanceOf[typings.textToSvg.textToSvgStrings.`center middle`]
    
    @scala.inline
    def `center top`: typings.textToSvg.textToSvgStrings.`center top` = ("center top").asInstanceOf[typings.textToSvg.textToSvgStrings.`center top`]
    
    @scala.inline
    def left: typings.textToSvg.textToSvgStrings.left = "left".asInstanceOf[typings.textToSvg.textToSvgStrings.left]
    
    @scala.inline
    def `left baseline`: typings.textToSvg.textToSvgStrings.`left baseline` = ("left baseline").asInstanceOf[typings.textToSvg.textToSvgStrings.`left baseline`]
    
    @scala.inline
    def `left bottom`: typings.textToSvg.textToSvgStrings.`left bottom` = ("left bottom").asInstanceOf[typings.textToSvg.textToSvgStrings.`left bottom`]
    
    @scala.inline
    def `left middle`: typings.textToSvg.textToSvgStrings.`left middle` = ("left middle").asInstanceOf[typings.textToSvg.textToSvgStrings.`left middle`]
    
    @scala.inline
    def `left top`: typings.textToSvg.textToSvgStrings.`left top` = ("left top").asInstanceOf[typings.textToSvg.textToSvgStrings.`left top`]
    
    @scala.inline
    def middle: typings.textToSvg.textToSvgStrings.middle = "middle".asInstanceOf[typings.textToSvg.textToSvgStrings.middle]
    
    @scala.inline
    def right: typings.textToSvg.textToSvgStrings.right = "right".asInstanceOf[typings.textToSvg.textToSvgStrings.right]
    
    @scala.inline
    def `right baseline`: typings.textToSvg.textToSvgStrings.`right baseline` = ("right baseline").asInstanceOf[typings.textToSvg.textToSvgStrings.`right baseline`]
    
    @scala.inline
    def `right bottom`: typings.textToSvg.textToSvgStrings.`right bottom` = ("right bottom").asInstanceOf[typings.textToSvg.textToSvgStrings.`right bottom`]
    
    @scala.inline
    def `right middle`: typings.textToSvg.textToSvgStrings.`right middle` = ("right middle").asInstanceOf[typings.textToSvg.textToSvgStrings.`right middle`]
    
    @scala.inline
    def `right top`: typings.textToSvg.textToSvgStrings.`right top` = ("right top").asInstanceOf[typings.textToSvg.textToSvgStrings.`right top`]
    
    @scala.inline
    def top: typings.textToSvg.textToSvgStrings.top = "top".asInstanceOf[typings.textToSvg.textToSvgStrings.top]
  }
  
  trait FontOptions extends StObject {
    
    /**
      * @default "left baseline"
      */
    var anchor: js.UndefOr[Anchor | Null] = js.undefined
    
    /**
      * Size of the text.
      * @default 72
      */
    var fontSize: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * If true takes kerning information into account.
      * @default true
      */
    var kerning: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * Letter-spacing value in em.
      */
    var letterSpacing: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * Tracking value in (em / 1000).
      */
    var tracking: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * Horizontal position of the beginning of the text.
      * @default 0
      */
    var x: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * Vertical position of the baseline of the text.
      * @default 0
      */
    var y: js.UndefOr[Double | Null] = js.undefined
  }
  object FontOptions {
    
    @scala.inline
    def apply(): FontOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FontOptions]
    }
    
    @scala.inline
    implicit class FontOptionsMutableBuilder[Self <: FontOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: Anchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorNull: Self = StObject.set(x, "anchor", null)
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeNull: Self = StObject.set(x, "fontSize", null)
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setKerning(value: Boolean): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKerningNull: Self = StObject.set(x, "kerning", null)
      
      @scala.inline
      def setKerningUndefined: Self = StObject.set(x, "kerning", js.undefined)
      
      @scala.inline
      def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLetterSpacingNull: Self = StObject.set(x, "letterSpacing", null)
      
      @scala.inline
      def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      @scala.inline
      def setTracking(value: Double): Self = StObject.set(x, "tracking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackingNull: Self = StObject.set(x, "tracking", null)
      
      @scala.inline
      def setTrackingUndefined: Self = StObject.set(x, "tracking", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXNull: Self = StObject.set(x, "x", null)
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYNull: Self = StObject.set(x, "y", null)
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait GenerationOptions
    extends StObject
       with FontOptions {
    
    /**
      * Key-value pairs of attributes for `<path>` element.
      */
    var attributes: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  }
  object GenerationOptions {
    
    @scala.inline
    def apply(): GenerationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerationOptions]
    }
    
    @scala.inline
    implicit class GenerationOptionsMutableBuilder[Self <: GenerationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesNull: Self = StObject.set(x, "attributes", null)
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    }
  }
  
  type LoadCallback = js.Function2[/* error */ Error | Null, /* textToSVG */ TextToSVG | Null, Unit]
  
  trait Metrics extends StObject {
    
    var ascender: Double
    
    var baseline: Double
    
    var descender: Double
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object Metrics {
    
    @scala.inline
    def apply(
      ascender: Double,
      baseline: Double,
      descender: Double,
      height: Double,
      width: Double,
      x: Double,
      y: Double
    ): Metrics = {
      val __obj = js.Dynamic.literal(ascender = ascender.asInstanceOf[js.Any], baseline = baseline.asInstanceOf[js.Any], descender = descender.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metrics]
    }
    
    @scala.inline
    implicit class MetricsMutableBuilder[Self <: Metrics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAscender(value: Double): Self = StObject.set(x, "ascender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseline(value: Double): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescender(value: Double): Self = StObject.set(x, "descender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TextToSVG extends StObject {
    
    /**
      * Generate SVG `<path>` `d` value.
      *
      * @param text to measure
      * @param options font options and attributes
      * @returns SVG path d attribute value
      */
    def getD(text: String): String = js.native
    def getD(text: String, options: GenerationOptions): String = js.native
    
    /**
      * Measure the height of the font.
      *
      * @param fontSize to measure with
      * @returns height of the font
      */
    def getHeight(fontSize: Double): Double = js.native
    
    /**
      * Measure the text metrics.
      *
      * @param text to measure
      * @param options font options
      */
    def getMetrics(text: String): Metrics = js.native
    def getMetrics(text: String, options: FontOptions): Metrics = js.native
    
    /**
      * Generate SVG `<path>` from text.
      *
      * @param text to measure
      * @param options font options and attributes
      * @returns SVG path element string
      */
    def getPath(text: String): String = js.native
    def getPath(text: String, options: GenerationOptions): String = js.native
    
    /**
      * Generate SVG as a string with text converted to paths.
      *
      * @param text to measure
      * @param options font options and attributes
      * @returns SVG string
      */
    def getSVG(text: String): String = js.native
    def getSVG(text: String, options: GenerationOptions): String = js.native
    
    /**
      * Measure the width of the specified text.
      *
      * @param text to measure
      * @param options font options
      * @returns width of the text
      */
    def getWidth(text: String): Double = js.native
    def getWidth(text: String, options: FontOptions): Double = js.native
  }
}
