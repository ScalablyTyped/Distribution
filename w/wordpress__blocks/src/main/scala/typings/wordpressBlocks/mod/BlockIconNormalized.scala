package typings.wordpressBlocks.mod

import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.wordpressComponents.dashiconMod.Dashicon.Icon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockIconNormalized extends StObject {
  
  var background: js.UndefOr[String] = js.undefined
  
  var foreground: js.UndefOr[String] = js.undefined
  
  var shadowColor: js.UndefOr[String] = js.undefined
  
  var src: Icon | ReactElement | ComponentType[js.Object]
}
object BlockIconNormalized {
  
  inline def apply(src: Icon | ReactElement | ComponentType[js.Object]): BlockIconNormalized = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockIconNormalized]
  }
  
  extension [Self <: BlockIconNormalized](x: Self) {
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setForeground(value: String): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
    
    inline def setForegroundUndefined: Self = StObject.set(x, "foreground", js.undefined)
    
    inline def setShadowColor(value: String): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    inline def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
    
    inline def setSrc(value: Icon | ReactElement | ComponentType[js.Object]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
