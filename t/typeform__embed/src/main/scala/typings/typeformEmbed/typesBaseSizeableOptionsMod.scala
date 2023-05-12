package typings.typeformEmbed

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBaseSizeableOptionsMod {
  
  trait SizeableOptions
    extends StObject
       with WidthOption {
    
    /**
      * Automatically resize embed to always fit the whole form.
      *
      * @type {boolean | string}
      */
    var autoResize: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * Make the widget embed full screen, resize on viewport change to fit window
      */
    var fullScreen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify the height of the embed.
      *
      * @type {number}
      */
    var height: js.UndefOr[Double] = js.undefined
  }
  object SizeableOptions {
    
    inline def apply(): SizeableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SizeableOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SizeableOptions] (val x: Self) extends AnyVal {
      
      inline def setAutoResize(value: Boolean | String): Self = StObject.set(x, "autoResize", value.asInstanceOf[js.Any])
      
      inline def setAutoResizeUndefined: Self = StObject.set(x, "autoResize", js.undefined)
      
      inline def setFullScreen(value: Boolean): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
      
      inline def setFullScreenUndefined: Self = StObject.set(x, "fullScreen", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    }
  }
  
  trait WidthOption extends StObject {
    
    /**
      * Specify the width of the embed.
      *
      * @type {number}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object WidthOption {
    
    inline def apply(): WidthOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WidthOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WidthOption] (val x: Self) extends AnyVal {
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
