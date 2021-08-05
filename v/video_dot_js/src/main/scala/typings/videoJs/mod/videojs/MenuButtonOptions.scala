package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuButtonOptions
  extends StObject
     with ComponentOptions {
  
  var iniChildren: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object MenuButtonOptions {
  
  inline def apply(): MenuButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuButtonOptions]
  }
  
  extension [Self <: MenuButtonOptions](x: Self) {
    
    inline def setIniChildren(value: Boolean): Self = StObject.set(x, "iniChildren", value.asInstanceOf[js.Any])
    
    inline def setIniChildrenUndefined: Self = StObject.set(x, "iniChildren", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
