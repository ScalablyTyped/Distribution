package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitLeaderOptions extends StObject {
  
  var fill: js.UndefOr[String] = js.undefined
  
  var media: js.UndefOr[Double | String] = js.undefined
}
object UIkitLeaderOptions {
  
  inline def apply(): UIkitLeaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitLeaderOptions]
  }
  
  extension [Self <: UIkitLeaderOptions](x: Self) {
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setMedia(value: Double | String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
  }
}
