package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigSrc extends StObject {
  
  var config: js.Array[ValueDailymotion | ValuePlayable | ValueYoutube]
  
  var src: js.Array[Label]
}
object ConfigSrc {
  
  @scala.inline
  def apply(config: js.Array[ValueDailymotion | ValuePlayable | ValueYoutube], src: js.Array[Label]): ConfigSrc = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigSrc]
  }
  
  @scala.inline
  implicit class ConfigSrcMutableBuilder[Self <: ConfigSrc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: js.Array[ValueDailymotion | ValuePlayable | ValueYoutube]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigVarargs(value: (ValueDailymotion | ValuePlayable | ValueYoutube)*): Self = StObject.set(x, "config", js.Array(value :_*))
    
    @scala.inline
    def setSrc(value: js.Array[Label]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcVarargs(value: Label*): Self = StObject.set(x, "src", js.Array(value :_*))
  }
}
