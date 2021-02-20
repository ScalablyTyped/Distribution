package typings.vegaTooltip

import typings.std.MouseEvent
import typings.vegaTooltip.anon.Height
import typings.vegaTooltip.anon.X
import typings.vegaTypings.mod.View
import typings.vegaTypings.runtimeMod.Item
import typings.vegaTypings.runtimeMod.TooltipHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create a tooltip handler and register it with the provided view.
    *
    * @param view The Vega view.
    * @param opt Tooltip options.
    */
  @JSImport("vega-tooltip", JSImport.Default)
  @js.native
  def default(view: View): Handler = js.native
  @JSImport("vega-tooltip", JSImport.Default)
  @js.native
  def default(view: View, opt: Options): Handler = js.native
  
  object DEFAULT_OPTIONS {
    
    @JSImport("vega-tooltip", "DEFAULT_OPTIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vega-tooltip", "DEFAULT_OPTIONS.disableDefaultStyle")
    @js.native
    def disableDefaultStyle: Boolean = js.native
    @scala.inline
    def disableDefaultStyle_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableDefaultStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-tooltip", "DEFAULT_OPTIONS.id")
    @js.native
    def id: String = js.native
    @scala.inline
    def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-tooltip", "DEFAULT_OPTIONS.maxDepth")
    @js.native
    def maxDepth: Double = js.native
    @scala.inline
    def maxDepth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxDepth")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-tooltip", "DEFAULT_OPTIONS.offsetX")
    @js.native
    def offsetX: Double = js.native
    @scala.inline
    def offsetX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-tooltip", "DEFAULT_OPTIONS.offsetY")
    @js.native
    def offsetY: Double = js.native
    @scala.inline
    def offsetY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-tooltip", "DEFAULT_OPTIONS.sanitize")
    @js.native
    def sanitize: js.Function1[/* value */ js.Any, String] = js.native
    @JSImport("vega-tooltip", "DEFAULT_OPTIONS.sanitize")
    @js.native
    def sanitize(value: js.Any): String = js.native
    @scala.inline
    def sanitize_=(x: js.Function1[/* value */ js.Any, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sanitize")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-tooltip", "DEFAULT_OPTIONS.styleId")
    @js.native
    def styleId: String = js.native
    @scala.inline
    def styleId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("styleId")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-tooltip", "DEFAULT_OPTIONS.theme")
    @js.native
    def theme: String = js.native
    @scala.inline
    def theme_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])
  }
  
  /**
    * The tooltip handler class.
    */
  @JSImport("vega-tooltip", "Handler")
  @js.native
  /**
    * Create the tooltip handler and initialize the element and style.
    *
    * @param options Tooltip Options
    */
  class Handler () extends StObject {
    def this(options: Options) = this()
    
    /**
      * The handler function. We bind this to this function in the constructor.
      */
    def call(handler: js.Any, event: MouseEvent, item: Item[_], value: js.Any): Unit = js.native
    /**
      * The handler function. We bind this to this function in the constructor.
      */
    @JSName("call")
    var call_Original: TooltipHandler = js.native
    
    /**
      * The tooltip html element.
      */
    var el: js.Any = js.native
    
    /**
      * Complete tooltip options.
      */
    var options: js.Any = js.native
    
    /**
      * The tooltip handler function.
      */
    var tooltipHandler: js.Any = js.native
  }
  
  /**
    * Position the tooltip
    *
    * @param event The mouse event.
    * @param tooltipBox
    * @param offsetX Horizontal offset.
    * @param offsetY Vertical offset.
    */
  @JSImport("vega-tooltip", "calculatePosition")
  @js.native
  def calculatePosition(event: MouseEvent, tooltipBox: Height, offsetX: Double, offsetY: Double): X = js.native
  
  @JSImport("vega-tooltip", "createDefaultStyle")
  @js.native
  def createDefaultStyle(id: String): String = js.native
  
  /**
    * Escape special HTML characters.
    *
    * @param value A value to convert to string and HTML-escape.
    */
  @JSImport("vega-tooltip", "escapeHTML")
  @js.native
  def escapeHTML(value: js.Any): String = js.native
  
  /**
    * Format the value to be shown in the tooltip.
    *
    * @param value The value to show in the tooltip.
    * @param valueToHtml Function to convert a single cell value to an HTML string
    */
  @JSImport("vega-tooltip", "formatValue")
  @js.native
  def formatValue(value: js.Any, valueToHtml: js.Function1[/* value */ js.Any, String], maxDepth: Double): String = js.native
  
  @JSImport("vega-tooltip", "replacer")
  @js.native
  def replacer(maxDepth: Double): js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _] = js.native
  
  /**
    * Stringify any JS object to valid JSON
    */
  @JSImport("vega-tooltip", "stringify")
  @js.native
  def stringify(obj: js.Any, maxDepth: Double): String = js.native
  
  @JSImport("vega-tooltip", "version")
  @js.native
  val version: String = js.native
  
  /* Inlined std.Partial<{  offsetX :number,   offsetY :number,   id :string,   styleId :string,   theme :string,   disableDefaultStyle :boolean,   sanitize :typeof escapeHTML,   maxDepth :number}> */
  @js.native
  trait Options extends StObject {
    
    var disableDefaultStyle: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var maxDepth: js.UndefOr[Double] = js.native
    
    var offsetX: js.UndefOr[Double] = js.native
    
    var offsetY: js.UndefOr[Double] = js.native
    
    var sanitize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof escapeHTML */ js.Any
      ] = js.native
    
    var styleId: js.UndefOr[String] = js.native
    
    var theme: js.UndefOr[String] = js.native
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
      def setDisableDefaultStyle(value: Boolean): Self = StObject.set(x, "disableDefaultStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableDefaultStyleUndefined: Self = StObject.set(x, "disableDefaultStyle", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
      
      @scala.inline
      def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      @scala.inline
      def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      @scala.inline
      def setSanitize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: typeof escapeHTML */ js.Any
      ): Self = StObject.set(x, "sanitize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSanitizeUndefined: Self = StObject.set(x, "sanitize", js.undefined)
      
      @scala.inline
      def setStyleId(value: String): Self = StObject.set(x, "styleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleIdUndefined: Self = StObject.set(x, "styleId", js.undefined)
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
