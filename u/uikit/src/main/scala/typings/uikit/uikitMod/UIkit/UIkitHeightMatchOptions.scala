package typings.uikit.uikitMod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitHeightMatchOptions extends StObject {
  
  var row: js.UndefOr[Boolean] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
}
object UIkitHeightMatchOptions {
  
  inline def apply(): UIkitHeightMatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitHeightMatchOptions]
  }
  
  extension [Self <: UIkitHeightMatchOptions](x: Self) {
    
    inline def setRow(value: Boolean): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
