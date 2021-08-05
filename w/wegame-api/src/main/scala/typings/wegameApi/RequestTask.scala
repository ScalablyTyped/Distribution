package typings.wegameApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestTask extends StObject {
  
  /**
    * 中断请求任务
    */
  def abort(): Unit
}
object RequestTask {
  
  inline def apply(abort: () => Unit): RequestTask = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
    __obj.asInstanceOf[RequestTask]
  }
  
  extension [Self <: RequestTask](x: Self) {
    
    inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
  }
}
