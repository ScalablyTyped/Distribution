package typings.textMetrics

import typings.textMetrics.mod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Options extends StObject {
    
    var options: typings.textMetrics.mod.Options
    
    var styleOverwrites: Styles
    
    var styles: Styles
    
    var text: String
  }
  object Options {
    
    inline def apply(options: typings.textMetrics.mod.Options, styleOverwrites: Styles, styles: Styles, text: String): Options = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], styleOverwrites = styleOverwrites.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setOptions(value: typings.textMetrics.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setStyleOverwrites(value: Styles): Self = StObject.set(x, "styleOverwrites", value.asInstanceOf[js.Any])
      
      inline def setStyles(value: Styles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
