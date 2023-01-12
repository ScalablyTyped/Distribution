package typings.tinycon

import org.scalablytyped.runtime.Shortcut
import typings.tinycon.tinyconStrings.force
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("tinycon", JSImport.Namespace)
  @js.native
  val ^ : TinyconStatic = js.native
  
  trait TinyconOptions extends StObject {
    
    /**
      * @default true
      */
    var abbreviate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default '#F03D25'
      */
    var background: js.UndefOr[String] = js.undefined
    
    /**
      * @default '#ffffff'
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * @default true
      */
    var crossOrigin: js.UndefOr[Boolean] = js.undefined
    
    var fallback: js.UndefOr[Boolean | force] = js.undefined
    
    var font: js.UndefOr[String] = js.undefined
    
    /**
      * @default 8
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * @default 7
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object TinyconOptions {
    
    inline def apply(): TinyconOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TinyconOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TinyconOptions] (val x: Self) extends AnyVal {
      
      inline def setAbbreviate(value: Boolean): Self = StObject.set(x, "abbreviate", value.asInstanceOf[js.Any])
      
      inline def setAbbreviateUndefined: Self = StObject.set(x, "abbreviate", js.undefined)
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCrossOrigin(value: Boolean): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
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
  
  @js.native
  trait TinyconStatic extends StObject {
    
    def reset(): Unit = js.native
    
    def setBubble(): TinyconStatic = js.native
    def setBubble(label: String): TinyconStatic = js.native
    def setBubble(label: String, color: String): TinyconStatic = js.native
    def setBubble(label: Double): TinyconStatic = js.native
    def setBubble(label: Double, color: String): TinyconStatic = js.native
    def setBubble(label: Null, color: String): TinyconStatic = js.native
    
    def setImage(url: String): TinyconStatic = js.native
    
    def setOptions(custom: TinyconOptions): TinyconStatic = js.native
  }
  
  type _To = TinyconStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: TinyconStatic = ^
}
