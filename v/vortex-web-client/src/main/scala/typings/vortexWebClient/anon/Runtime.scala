package typings.vortexWebClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Runtime extends js.Object {
  
  var Runtime: typings.vortexWebClient.DDS.Runtime = js.native
}
object Runtime {
  
  @scala.inline
  def apply(Runtime: typings.vortexWebClient.DDS.Runtime): Runtime = {
    val __obj = js.Dynamic.literal(Runtime = Runtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Runtime]
  }
  
  @scala.inline
  implicit class RuntimeOps[Self <: Runtime] (val x: Self) extends AnyVal {
    
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
    def setRuntime(value: typings.vortexWebClient.DDS.Runtime): Self = this.set("Runtime", value.asInstanceOf[js.Any])
  }
}
