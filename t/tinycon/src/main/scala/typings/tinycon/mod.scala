package typings.tinycon

import typings.tinycon.tinyconStrings.force
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tinycon", "setBubble")
  @js.native
  def setBubble(): Unit = js.native
  @JSImport("tinycon", "setBubble")
  @js.native
  def setBubble(count: String): Unit = js.native
  @JSImport("tinycon", "setBubble")
  @js.native
  def setBubble(count: Double): Unit = js.native
  
  @JSImport("tinycon", "setOptions")
  @js.native
  def setOptions(options: TinyconOptions): Unit = js.native
  
  @js.native
  trait TinyconOptions extends StObject {
    
    var abbreviate: js.UndefOr[Boolean] = js.native
    
    var background: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var fallback: js.UndefOr[Boolean | force] = js.native
    
    var font: js.UndefOr[String] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object TinyconOptions {
    
    @scala.inline
    def apply(): TinyconOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TinyconOptions]
    }
    
    @scala.inline
    implicit class TinyconOptionsMutableBuilder[Self <: TinyconOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbbreviate(value: Boolean): Self = StObject.set(x, "abbreviate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbbreviateUndefined: Self = StObject.set(x, "abbreviate", js.undefined)
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFallback(value: Boolean | force): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
