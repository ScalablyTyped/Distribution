package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigSrc extends StObject {
  
  var config: js.Array[ValueDailymotion | ValuePlayable | ValueYoutube]
  
  var src: js.Array[Label]
}
object ConfigSrc {
  
  inline def apply(config: js.Array[ValueDailymotion | ValuePlayable | ValueYoutube], src: js.Array[Label]): ConfigSrc = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigSrc]
  }
  
  extension [Self <: ConfigSrc](x: Self) {
    
    inline def setConfig(value: js.Array[ValueDailymotion | ValuePlayable | ValueYoutube]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigVarargs(value: (ValueDailymotion | ValuePlayable | ValueYoutube)*): Self = StObject.set(x, "config", js.Array(value :_*))
    
    inline def setSrc(value: js.Array[Label]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcVarargs(value: Label*): Self = StObject.set(x, "src", js.Array(value :_*))
  }
}
