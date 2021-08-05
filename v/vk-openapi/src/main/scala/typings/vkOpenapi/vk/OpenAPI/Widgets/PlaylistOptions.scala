package typings.vkOpenapi.vk.OpenAPI.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistOptions extends StObject {
  
  var width: js.UndefOr[Double] = js.undefined
}
object PlaylistOptions {
  
  inline def apply(): PlaylistOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistOptions]
  }
  
  extension [Self <: PlaylistOptions](x: Self) {
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
