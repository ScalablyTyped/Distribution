package typings.wechatMiniprogram.DB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RealtimeListener extends StObject {
  
  // "And Now His Watch Is Ended"
  def close(): js.Promise[Unit]
}
object RealtimeListener {
  
  inline def apply(close: () => js.Promise[Unit]): RealtimeListener = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
    __obj.asInstanceOf[RealtimeListener]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RealtimeListener] (val x: Self) extends AnyVal {
    
    inline def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
  }
}
