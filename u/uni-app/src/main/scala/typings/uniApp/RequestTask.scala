package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestTask extends StObject {
  
  /**
    * 中断请求任务
    */
  def abort(): Unit = js.native
}
object RequestTask {
  
  @scala.inline
  def apply(abort: () => Unit): RequestTask = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
    __obj.asInstanceOf[RequestTask]
  }
  
  @scala.inline
  implicit class RequestTaskMutableBuilder[Self <: RequestTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
  }
}
