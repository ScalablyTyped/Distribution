package typings.wxJsSdkBrowser.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnSearchBeaconsConfig
  extends StObject
     with WxBaseRequestConfig {
  
  @JSName("complete")
  def complete_MOnSearchBeaconsConfig(argv: Any): Unit
}
object OnSearchBeaconsConfig {
  
  inline def apply(complete: Any => Unit): OnSearchBeaconsConfig = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
    __obj.asInstanceOf[OnSearchBeaconsConfig]
  }
  
  extension [Self <: OnSearchBeaconsConfig](x: Self) {
    
    inline def setComplete(value: Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
  }
}
