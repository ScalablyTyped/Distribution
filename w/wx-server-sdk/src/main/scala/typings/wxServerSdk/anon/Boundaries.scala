package typings.wxServerSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Boundaries extends js.Object {
  
  var boundaries: js.Array[_] = js.native
  
  var default: js.UndefOr[js.Any] = js.native
  
  var groupBy: js.Any = js.native
  
  var output: js.UndefOr[js.Object] = js.native
}
object Boundaries {
  
  @scala.inline
  def apply(boundaries: js.Array[_], groupBy: js.Any): Boundaries = {
    val __obj = js.Dynamic.literal(boundaries = boundaries.asInstanceOf[js.Any], groupBy = groupBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boundaries]
  }
  
  @scala.inline
  implicit class BoundariesOps[Self <: Boundaries] (val x: Self) extends AnyVal {
    
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
    def setBoundariesVarargs(value: js.Any*): Self = this.set("boundaries", js.Array(value :_*))
    
    @scala.inline
    def setBoundaries(value: js.Array[_]): Self = this.set("boundaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupBy(value: js.Any): Self = this.set("groupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setOutput(value: js.Object): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
  }
}
