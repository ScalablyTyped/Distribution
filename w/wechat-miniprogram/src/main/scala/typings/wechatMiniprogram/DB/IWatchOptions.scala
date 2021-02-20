package typings.wechatMiniprogram.DB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWatchOptions extends StObject {
  
  // server realtime data init & change event
  def onChange(snapshot: ISnapshot): Unit = js.native
  
  // error while connecting / listening
  def onError(error: js.Any): Unit = js.native
}
object IWatchOptions {
  
  @scala.inline
  def apply(onChange: ISnapshot => Unit, onError: js.Any => Unit): IWatchOptions = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), onError = js.Any.fromFunction1(onError))
    __obj.asInstanceOf[IWatchOptions]
  }
  
  @scala.inline
  implicit class IWatchOptionsMutableBuilder[Self <: IWatchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnChange(value: ISnapshot => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnError(value: js.Any => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
  }
}
