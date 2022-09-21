package typings.xterm.mod

import typings.xterm.xtermStrings.center
import typings.xterm.xtermStrings.full
import typings.xterm.xtermStrings.left
import typings.xterm.xtermStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Overview ruler decoration options
  */
trait IDecorationOverviewRulerOptions extends StObject {
  
  var color: String
  
  var position: js.UndefOr[left | center | right | full] = js.undefined
}
object IDecorationOverviewRulerOptions {
  
  inline def apply(color: String): IDecorationOverviewRulerOptions = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDecorationOverviewRulerOptions]
  }
  
  extension [Self <: IDecorationOverviewRulerOptions](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: left | center | right | full): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
