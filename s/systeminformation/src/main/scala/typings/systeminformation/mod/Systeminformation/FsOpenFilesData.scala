package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FsOpenFilesData extends js.Object {
  
  var allocated: Double = js.native
  
  var available: Double = js.native
  
  var max: Double = js.native
}
object FsOpenFilesData {
  
  @scala.inline
  def apply(allocated: Double, available: Double, max: Double): FsOpenFilesData = {
    val __obj = js.Dynamic.literal(allocated = allocated.asInstanceOf[js.Any], available = available.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[FsOpenFilesData]
  }
  
  @scala.inline
  implicit class FsOpenFilesDataOps[Self <: FsOpenFilesData] (val x: Self) extends AnyVal {
    
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
    def setAllocated(value: Double): Self = this.set("allocated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailable(value: Double): Self = this.set("available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
  }
}
