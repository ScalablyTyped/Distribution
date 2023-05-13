package typings.textMetrics

import typings.std.Node
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("text-metrics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def init(): TextMetrics = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[TextMetrics]
  inline def init(htmlElement: Null, styleOverwrites: Styles): TextMetrics = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(htmlElement.asInstanceOf[js.Any], styleOverwrites.asInstanceOf[js.Any])).asInstanceOf[TextMetrics]
  inline def init(htmlElement: Node): TextMetrics = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(htmlElement.asInstanceOf[js.Any]).asInstanceOf[TextMetrics]
  inline def init(htmlElement: Node, styleOverwrites: Styles): TextMetrics = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(htmlElement.asInstanceOf[js.Any], styleOverwrites.asInstanceOf[js.Any])).asInstanceOf[TextMetrics]
  inline def init(htmlElement: Styles): TextMetrics = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(htmlElement.asInstanceOf[js.Any]).asInstanceOf[TextMetrics]
  inline def init(htmlElement: Styles, styleOverwrites: Styles): TextMetrics = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(htmlElement.asInstanceOf[js.Any], styleOverwrites.asInstanceOf[js.Any])).asInstanceOf[TextMetrics]
  
  trait Options extends StObject {
    
    var multiline: Boolean
  }
  object Options {
    
    inline def apply(multiline: Boolean): Options = {
      val __obj = js.Dynamic.literal(multiline = multiline.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
    }
  }
  
  type Styles = Record[String, Any]
  
  @js.native
  trait TextMetrics extends StObject {
    
    def height(): Double = js.native
    def height(textOrOptions: String): Double = js.native
    def height(textOrOptions: String, optionsOrStyleOverwrites: Unit, styleOverwrites: Styles): Double = js.native
    def height(textOrOptions: String, optionsOrStyleOverwrites: Options): Double = js.native
    def height(textOrOptions: String, optionsOrStyleOverwrites: Options, styleOverwrites: Styles): Double = js.native
    def height(textOrOptions: String, optionsOrStyleOverwrites: Styles): Double = js.native
    def height(textOrOptions: String, optionsOrStyleOverwrites: Styles, styleOverwrites: Styles): Double = js.native
    def height(textOrOptions: Unit, optionsOrStyleOverwrites: Unit, styleOverwrites: Styles): Double = js.native
    def height(textOrOptions: Unit, optionsOrStyleOverwrites: Options): Double = js.native
    def height(textOrOptions: Unit, optionsOrStyleOverwrites: Options, styleOverwrites: Styles): Double = js.native
    def height(textOrOptions: Unit, optionsOrStyleOverwrites: Styles): Double = js.native
    def height(textOrOptions: Unit, optionsOrStyleOverwrites: Styles, styleOverwrites: Styles): Double = js.native
    def height(textOrOptions: Options): Double = js.native
    def height(textOrOptions: Options, optionsOrStyleOverwrites: Unit, styleOverwrites: Styles): Double = js.native
    def height(textOrOptions: Options, optionsOrStyleOverwrites: Options): Double = js.native
    def height(textOrOptions: Options, optionsOrStyleOverwrites: Options, styleOverwrites: Styles): Double = js.native
    def height(textOrOptions: Options, optionsOrStyleOverwrites: Styles): Double = js.native
    def height(textOrOptions: Options, optionsOrStyleOverwrites: Styles, styleOverwrites: Styles): Double = js.native
    
    def lines(): js.Array[String] = js.native
    def lines(textOrOptions: String): js.Array[String] = js.native
    def lines(textOrOptions: String, optionsOrStyleOverwrites: Unit, styleOverwrites: Styles): js.Array[String] = js.native
    def lines(textOrOptions: String, optionsOrStyleOverwrites: Options): js.Array[String] = js.native
    def lines(textOrOptions: String, optionsOrStyleOverwrites: Options, styleOverwrites: Styles): js.Array[String] = js.native
    def lines(textOrOptions: String, optionsOrStyleOverwrites: Styles): js.Array[String] = js.native
    def lines(textOrOptions: String, optionsOrStyleOverwrites: Styles, styleOverwrites: Styles): js.Array[String] = js.native
    def lines(textOrOptions: Unit, optionsOrStyleOverwrites: Unit, styleOverwrites: Styles): js.Array[String] = js.native
    def lines(textOrOptions: Unit, optionsOrStyleOverwrites: Options): js.Array[String] = js.native
    def lines(textOrOptions: Unit, optionsOrStyleOverwrites: Options, styleOverwrites: Styles): js.Array[String] = js.native
    def lines(textOrOptions: Unit, optionsOrStyleOverwrites: Styles): js.Array[String] = js.native
    def lines(textOrOptions: Unit, optionsOrStyleOverwrites: Styles, styleOverwrites: Styles): js.Array[String] = js.native
    def lines(textOrOptions: Options): js.Array[String] = js.native
    def lines(textOrOptions: Options, optionsOrStyleOverwrites: Unit, styleOverwrites: Styles): js.Array[String] = js.native
    def lines(textOrOptions: Options, optionsOrStyleOverwrites: Options): js.Array[String] = js.native
    def lines(textOrOptions: Options, optionsOrStyleOverwrites: Options, styleOverwrites: Styles): js.Array[String] = js.native
    def lines(textOrOptions: Options, optionsOrStyleOverwrites: Styles): js.Array[String] = js.native
    def lines(textOrOptions: Options, optionsOrStyleOverwrites: Styles, styleOverwrites: Styles): js.Array[String] = js.native
    
    def maxFontSize(): js.UndefOr[String] = js.native
    def maxFontSize(textOrOptions: String): js.UndefOr[String] = js.native
    def maxFontSize(textOrOptions: String, optionsOrStyleOverwrites: Unit, styleOverwrites: Styles): js.UndefOr[String] = js.native
    def maxFontSize(textOrOptions: String, optionsOrStyleOverwrites: Options): js.UndefOr[String] = js.native
    def maxFontSize(textOrOptions: String, optionsOrStyleOverwrites: Options, styleOverwrites: Styles): js.UndefOr[String] = js.native
    def maxFontSize(textOrOptions: String, optionsOrStyleOverwrites: Styles): js.UndefOr[String] = js.native
    def maxFontSize(textOrOptions: String, optionsOrStyleOverwrites: Styles, styleOverwrites: Styles): js.UndefOr[String] = js.native
    def maxFontSize(textOrOptions: Unit, optionsOrStyleOverwrites: Unit, styleOverwrites: Styles): js.UndefOr[String] = js.native
    def maxFontSize(textOrOptions: Unit, optionsOrStyleOverwrites: Options): js.UndefOr[String] = js.native
    def maxFontSize(textOrOptions: Unit, optionsOrStyleOverwrites: Options, styleOverwrites: Styles): js.UndefOr[String] = js.native
    def maxFontSize(textOrOptions: Unit, optionsOrStyleOverwrites: Styles): js.UndefOr[String] = js.native
    def maxFontSize(textOrOptions: Unit, optionsOrStyleOverwrites: Styles, styleOverwrites: Styles): js.UndefOr[String] = js.native
    def maxFontSize(textOrOptions: Options): js.UndefOr[String] = js.native
    def maxFontSize(textOrOptions: Options, optionsOrStyleOverwrites: Unit, styleOverwrites: Styles): js.UndefOr[String] = js.native
    def maxFontSize(textOrOptions: Options, optionsOrStyleOverwrites: Options): js.UndefOr[String] = js.native
    def maxFontSize(textOrOptions: Options, optionsOrStyleOverwrites: Options, styleOverwrites: Styles): js.UndefOr[String] = js.native
    def maxFontSize(textOrOptions: Options, optionsOrStyleOverwrites: Styles): js.UndefOr[String] = js.native
    def maxFontSize(textOrOptions: Options, optionsOrStyleOverwrites: Styles, styleOverwrites: Styles): js.UndefOr[String] = js.native
    
    def parseArgs(): typings.textMetrics.anon.Options = js.native
    def parseArgs(textOrOptions: String): typings.textMetrics.anon.Options = js.native
    def parseArgs(textOrOptions: String, optionsOrStyleOverwrites: Unit, styleOverwrites: Styles): typings.textMetrics.anon.Options = js.native
    def parseArgs(textOrOptions: String, optionsOrStyleOverwrites: Options): typings.textMetrics.anon.Options = js.native
    def parseArgs(textOrOptions: String, optionsOrStyleOverwrites: Options, styleOverwrites: Styles): typings.textMetrics.anon.Options = js.native
    def parseArgs(textOrOptions: String, optionsOrStyleOverwrites: Styles): typings.textMetrics.anon.Options = js.native
    def parseArgs(textOrOptions: String, optionsOrStyleOverwrites: Styles, styleOverwrites: Styles): typings.textMetrics.anon.Options = js.native
    def parseArgs(textOrOptions: Unit, optionsOrStyleOverwrites: Unit, styleOverwrites: Styles): typings.textMetrics.anon.Options = js.native
    def parseArgs(textOrOptions: Unit, optionsOrStyleOverwrites: Options): typings.textMetrics.anon.Options = js.native
    def parseArgs(textOrOptions: Unit, optionsOrStyleOverwrites: Options, styleOverwrites: Styles): typings.textMetrics.anon.Options = js.native
    def parseArgs(textOrOptions: Unit, optionsOrStyleOverwrites: Styles): typings.textMetrics.anon.Options = js.native
    def parseArgs(textOrOptions: Unit, optionsOrStyleOverwrites: Styles, styleOverwrites: Styles): typings.textMetrics.anon.Options = js.native
    def parseArgs(textOrOptions: Options): typings.textMetrics.anon.Options = js.native
    def parseArgs(textOrOptions: Options, optionsOrStyleOverwrites: Unit, styleOverwrites: Styles): typings.textMetrics.anon.Options = js.native
    def parseArgs(textOrOptions: Options, optionsOrStyleOverwrites: Options): typings.textMetrics.anon.Options = js.native
    def parseArgs(textOrOptions: Options, optionsOrStyleOverwrites: Options, styleOverwrites: Styles): typings.textMetrics.anon.Options = js.native
    def parseArgs(textOrOptions: Options, optionsOrStyleOverwrites: Styles): typings.textMetrics.anon.Options = js.native
    def parseArgs(textOrOptions: Options, optionsOrStyleOverwrites: Styles, styleOverwrites: Styles): typings.textMetrics.anon.Options = js.native
    
    def width(): Double = js.native
    def width(textOrOptions: String): Double = js.native
    def width(textOrOptions: String, optionsOrStyleOverwrites: Unit, styleOverwrites: Styles): Double = js.native
    def width(textOrOptions: String, optionsOrStyleOverwrites: Options): Double = js.native
    def width(textOrOptions: String, optionsOrStyleOverwrites: Options, styleOverwrites: Styles): Double = js.native
    def width(textOrOptions: String, optionsOrStyleOverwrites: Styles): Double = js.native
    def width(textOrOptions: String, optionsOrStyleOverwrites: Styles, styleOverwrites: Styles): Double = js.native
    def width(textOrOptions: Unit, optionsOrStyleOverwrites: Unit, styleOverwrites: Styles): Double = js.native
    def width(textOrOptions: Unit, optionsOrStyleOverwrites: Options): Double = js.native
    def width(textOrOptions: Unit, optionsOrStyleOverwrites: Options, styleOverwrites: Styles): Double = js.native
    def width(textOrOptions: Unit, optionsOrStyleOverwrites: Styles): Double = js.native
    def width(textOrOptions: Unit, optionsOrStyleOverwrites: Styles, styleOverwrites: Styles): Double = js.native
    def width(textOrOptions: Options): Double = js.native
    def width(textOrOptions: Options, optionsOrStyleOverwrites: Unit, styleOverwrites: Styles): Double = js.native
    def width(textOrOptions: Options, optionsOrStyleOverwrites: Options): Double = js.native
    def width(textOrOptions: Options, optionsOrStyleOverwrites: Options, styleOverwrites: Styles): Double = js.native
    def width(textOrOptions: Options, optionsOrStyleOverwrites: Styles): Double = js.native
    def width(textOrOptions: Options, optionsOrStyleOverwrites: Styles, styleOverwrites: Styles): Double = js.native
  }
}
