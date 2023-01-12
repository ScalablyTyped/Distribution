package typings.umijsSsrDarkreader

import typings.std.Response
import typings.umijsSsrDarkreader.anon.PartialTheme
import typings.umijsSsrDarkreader.umijsSsrDarkreaderBooleans.`false`
import typings.umijsSsrDarkreader.umijsSsrDarkreaderInts.`0`
import typings.umijsSsrDarkreader.umijsSsrDarkreaderInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@umijs/ssr-darkreader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Enables dark mode when system color scheme is dark.
    * @param theme Theme options.
    * @param fixes Fixes for the generated theme.
    */
  inline def auto(theme: PartialTheme): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("auto")(theme.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def auto(theme: PartialTheme, fixes: DynamicThemeFix): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("auto")(theme.asInstanceOf[js.Any], fixes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Stops watching for system color scheme.
    * @param isEnabled Boolean `false` value.
    */
  inline def auto_false(theme: `false`): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("auto")(theme.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def auto_false(theme: `false`, fixes: DynamicThemeFix): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("auto")(theme.asInstanceOf[js.Any], fixes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Disables dark mode for current web page.
    */
  inline def disable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[Unit]
  
  /**
    * Enables dark mode for current web page.
    * @param theme Theme options.
    * @param fixes Fixes for the generated theme.
    */
  inline def enable(theme: PartialTheme): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")(theme.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def enable(theme: PartialTheme, fixes: DynamicThemeFix): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enable")(theme.asInstanceOf[js.Any], fixes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Returns the generated CSS by Dark Reader as a string.
    */
  inline def exportGeneratedCSS(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportGeneratedCSS")().asInstanceOf[js.Promise[String]]
  
  /**
    * Returns if darkreader is enabled.
    */
  inline def isEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnabled")().asInstanceOf[Boolean]
  
  /**
    * Sets a function for making CORS requests.
    * @param fetch A fetch function.
    */
  inline def setFetchMethod(fetch: js.Function1[/* url */ String, js.Promise[Response]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFetchMethod")(fetch.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Contains fixes for the generated theme.
    */
  trait DynamicThemeFix extends StObject {
    
    /**
      * Additional CSS.
      * ${color} template should be used to apply theme options to a color.
      * Example:
      * ```
      * body {
      *     background-color: ${white} !important;
      *     background-image: none !important;
      * }
      * ```
      */
    var css: String
    
    /**
      * A toggle to disable the proxying of `document.styleSheets`.
      * This is a API-Exclusive option, as it can break legitmate websites,
      * who are using the Dark Reader API.
      */
    var disableStyleSheetsProxy: Boolean
    
    /**
      * List of CSS selectors where it's image should not be analyzed
      * Mostly used for wrongly inverted background-images
      */
    var ignoreImageAnalysis: js.Array[String]
    
    /**
      * List of CSS selectors where it's inline style should not be analyzed
      * Mostly used for color pickers
      */
    var ignoreInlineStyle: js.Array[String]
    
    /**
      * List of CSS selectors that should be inverted.
      * Usually icons that are contained in sprites.
      */
    var invert: js.Array[String]
  }
  object DynamicThemeFix {
    
    inline def apply(
      css: String,
      disableStyleSheetsProxy: Boolean,
      ignoreImageAnalysis: js.Array[String],
      ignoreInlineStyle: js.Array[String],
      invert: js.Array[String]
    ): DynamicThemeFix = {
      val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], disableStyleSheetsProxy = disableStyleSheetsProxy.asInstanceOf[js.Any], ignoreImageAnalysis = ignoreImageAnalysis.asInstanceOf[js.Any], ignoreInlineStyle = ignoreInlineStyle.asInstanceOf[js.Any], invert = invert.asInstanceOf[js.Any])
      __obj.asInstanceOf[DynamicThemeFix]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DynamicThemeFix] (val x: Self) extends AnyVal {
      
      inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setDisableStyleSheetsProxy(value: Boolean): Self = StObject.set(x, "disableStyleSheetsProxy", value.asInstanceOf[js.Any])
      
      inline def setIgnoreImageAnalysis(value: js.Array[String]): Self = StObject.set(x, "ignoreImageAnalysis", value.asInstanceOf[js.Any])
      
      inline def setIgnoreImageAnalysisVarargs(value: String*): Self = StObject.set(x, "ignoreImageAnalysis", js.Array(value*))
      
      inline def setIgnoreInlineStyle(value: js.Array[String]): Self = StObject.set(x, "ignoreInlineStyle", value.asInstanceOf[js.Any])
      
      inline def setIgnoreInlineStyleVarargs(value: String*): Self = StObject.set(x, "ignoreInlineStyle", js.Array(value*))
      
      inline def setInvert(value: js.Array[String]): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
      
      inline def setInvertVarargs(value: String*): Self = StObject.set(x, "invert", js.Array(value*))
    }
  }
  
  /**
    * Theme options.
    */
  trait Theme extends StObject {
    
    /**
      * Brightness (0 - 100+).
      * Default 100.
      */
    var brightness: Double
    
    /**
      * Contrast (0 - 100+).
      * Default 100.
      */
    var contrast: Double
    
    /**
      * Background color to use for dark mode.
      * Default #181a1b
      */
    var darkSchemeBackgroundColor: String
    
    /**
      * Text color to use for dark mode.
      * Default #e8e6e3
      */
    var darkSchemeTextColor: String
    
    /**
      * Font family to use.
      */
    var fontFamily: String
    
    /**
      * Grayscale (0 - 100).
      * Default 0.
      */
    var grayscale: Double
    
    /**
      * Background color to use for light mode.
      * Default #dcdad7
      */
    var lightSchemeBackgroundColor: String
    
    /**
      * Text color to use for light mode.
      * Default #181a1b
      */
    var lightSchemeTextColor: String
    
    /**
      * 1 - dark mode, 0 - dimmed mode.
      * Default 1.
      */
    var mode: `0` | `1`
    
    /**
      * Scrollbar color
      * Default auto
      */
    var scrollbarColor: String
    
    /**
      * Selection color
      * Default auto
      */
    var selectionColor: String
    
    /**
      * Sepia (0 - 100).
      * Default 0.
      */
    var sepia: Double
    
    /**
      * Specifies if it has to style system controls
      * Default true
      */
    var styleSystemControls: Boolean
    
    /**
      * Makes text look bolder (0 - 1px).
      * Default 0.
      */
    var textStroke: Double
    
    /**
      * Specifies if custom font should be used.
      * Default false.
      */
    var useFont: Boolean
  }
  object Theme {
    
    inline def apply(
      brightness: Double,
      contrast: Double,
      darkSchemeBackgroundColor: String,
      darkSchemeTextColor: String,
      fontFamily: String,
      grayscale: Double,
      lightSchemeBackgroundColor: String,
      lightSchemeTextColor: String,
      mode: `0` | `1`,
      scrollbarColor: String,
      selectionColor: String,
      sepia: Double,
      styleSystemControls: Boolean,
      textStroke: Double,
      useFont: Boolean
    ): Theme = {
      val __obj = js.Dynamic.literal(brightness = brightness.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], darkSchemeBackgroundColor = darkSchemeBackgroundColor.asInstanceOf[js.Any], darkSchemeTextColor = darkSchemeTextColor.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], grayscale = grayscale.asInstanceOf[js.Any], lightSchemeBackgroundColor = lightSchemeBackgroundColor.asInstanceOf[js.Any], lightSchemeTextColor = lightSchemeTextColor.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], scrollbarColor = scrollbarColor.asInstanceOf[js.Any], selectionColor = selectionColor.asInstanceOf[js.Any], sepia = sepia.asInstanceOf[js.Any], styleSystemControls = styleSystemControls.asInstanceOf[js.Any], textStroke = textStroke.asInstanceOf[js.Any], useFont = useFont.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
      
      inline def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
      
      inline def setContrast(value: Double): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
      
      inline def setDarkSchemeBackgroundColor(value: String): Self = StObject.set(x, "darkSchemeBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setDarkSchemeTextColor(value: String): Self = StObject.set(x, "darkSchemeTextColor", value.asInstanceOf[js.Any])
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setGrayscale(value: Double): Self = StObject.set(x, "grayscale", value.asInstanceOf[js.Any])
      
      inline def setLightSchemeBackgroundColor(value: String): Self = StObject.set(x, "lightSchemeBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setLightSchemeTextColor(value: String): Self = StObject.set(x, "lightSchemeTextColor", value.asInstanceOf[js.Any])
      
      inline def setMode(value: `0` | `1`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setScrollbarColor(value: String): Self = StObject.set(x, "scrollbarColor", value.asInstanceOf[js.Any])
      
      inline def setSelectionColor(value: String): Self = StObject.set(x, "selectionColor", value.asInstanceOf[js.Any])
      
      inline def setSepia(value: Double): Self = StObject.set(x, "sepia", value.asInstanceOf[js.Any])
      
      inline def setStyleSystemControls(value: Boolean): Self = StObject.set(x, "styleSystemControls", value.asInstanceOf[js.Any])
      
      inline def setTextStroke(value: Double): Self = StObject.set(x, "textStroke", value.asInstanceOf[js.Any])
      
      inline def setUseFont(value: Boolean): Self = StObject.set(x, "useFont", value.asInstanceOf[js.Any])
    }
  }
}
