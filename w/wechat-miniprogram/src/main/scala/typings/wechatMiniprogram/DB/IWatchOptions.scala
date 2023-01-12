package typings.wechatMiniprogram.DB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWatchOptions extends StObject {
  
  // server realtime data init & change event
  def onChange(snapshot: ISnapshot): Unit
  
  // error while connecting / listening
  def onError(error: Any): Unit
}
object IWatchOptions {
  
  inline def apply(onChange: ISnapshot => Unit, onError: Any => Unit): IWatchOptions = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), onError = js.Any.fromFunction1(onError))
    __obj.asInstanceOf[IWatchOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWatchOptions] (val x: Self) extends AnyVal {
    
    inline def setOnChange(value: ISnapshot => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnError(value: Any => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
  }
}
