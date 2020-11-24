package typings.xmlrpc.anon

import typings.xmlrpc.mod.HeadersProcessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Processors extends js.Object {
  
  var processors: js.Array[HeadersProcessor] = js.native
}
object Processors {
  
  @scala.inline
  def apply(processors: js.Array[HeadersProcessor]): Processors = {
    val __obj = js.Dynamic.literal(processors = processors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Processors]
  }
  
  @scala.inline
  implicit class ProcessorsOps[Self <: Processors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProcessorsVarargs(value: HeadersProcessor*): Self = this.set("processors", js.Array(value :_*))
    
    @scala.inline
    def setProcessors(value: js.Array[HeadersProcessor]): Self = this.set("processors", value.asInstanceOf[js.Any])
  }
}
