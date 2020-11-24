package typings.tensorflowTfjsBackendWebgl.backendWebglMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KernelInfo extends js.Object {
  
  var name: String = js.native
  
  var query: js.Promise[Double] = js.native
}
object KernelInfo {
  
  @scala.inline
  def apply(name: String, query: js.Promise[Double]): KernelInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[KernelInfo]
  }
  
  @scala.inline
  implicit class KernelInfoOps[Self <: KernelInfo] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: js.Promise[Double]): Self = this.set("query", value.asInstanceOf[js.Any])
  }
}
