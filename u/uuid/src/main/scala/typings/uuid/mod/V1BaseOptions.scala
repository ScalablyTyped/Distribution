package typings.uuid.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V1BaseOptions extends js.Object {
  
  var clockseq: js.UndefOr[Double] = js.native
  
  var msecs: js.UndefOr[Double | Date] = js.native
  
  var node: js.UndefOr[InputBuffer] = js.native
  
  var nsecs: js.UndefOr[Double] = js.native
}
object V1BaseOptions {
  
  @scala.inline
  def apply(): V1BaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[V1BaseOptions]
  }
  
  @scala.inline
  implicit class V1BaseOptionsOps[Self <: V1BaseOptions] (val x: Self) extends AnyVal {
    
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
    def setClockseq(value: Double): Self = this.set("clockseq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClockseq: Self = this.set("clockseq", js.undefined)
    
    @scala.inline
    def setMsecs(value: Double | Date): Self = this.set("msecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsecs: Self = this.set("msecs", js.undefined)
    
    @scala.inline
    def setNode(value: InputBuffer): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
    
    @scala.inline
    def setNsecs(value: Double): Self = this.set("nsecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNsecs: Self = this.set("nsecs", js.undefined)
  }
}
