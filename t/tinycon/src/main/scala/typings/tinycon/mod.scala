package typings.tinycon

import typings.tinycon.tinyconStrings.force
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tinycon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setBubble(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBubble")().asInstanceOf[Unit]
  inline def setBubble(count: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBubble")(count.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setBubble(count: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBubble")(count.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setOptions(options: TinyconOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait TinyconOptions extends StObject {
    
    var abbreviate: js.UndefOr[Boolean] = js.undefined
    
    var background: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var fallback: js.UndefOr[Boolean | force] = js.undefined
    
    var font: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object TinyconOptions {
    
    inline def apply(): TinyconOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TinyconOptions]
    }
    
    extension [Self <: TinyconOptions](x: Self) {
      
      inline def setAbbreviate(value: Boolean): Self = StObject.set(x, "abbreviate", value.asInstanceOf[js.Any])
      
      inline def setAbbreviateUndefined: Self = StObject.set(x, "abbreviate", js.undefined)
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFallback(value: Boolean | force): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
