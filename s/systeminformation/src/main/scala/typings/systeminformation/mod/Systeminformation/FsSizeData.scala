package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 5. File System
@js.native
trait FsSizeData extends js.Object {
  
  var fs: String = js.native
  
  var mount: String = js.native
  
  var size: Double = js.native
  
  var `type`: String = js.native
  
  var use: Double = js.native
  
  var used: Double = js.native
}
object FsSizeData {
  
  @scala.inline
  def apply(fs: String, mount: String, size: Double, `type`: String, use: Double, used: Double): FsSizeData = {
    val __obj = js.Dynamic.literal(fs = fs.asInstanceOf[js.Any], mount = mount.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FsSizeData]
  }
  
  @scala.inline
  implicit class FsSizeDataOps[Self <: FsSizeData] (val x: Self) extends AnyVal {
    
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
    def setFs(value: String): Self = this.set("fs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMount(value: String): Self = this.set("mount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse(value: Double): Self = this.set("use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsed(value: Double): Self = this.set("used", value.asInstanceOf[js.Any])
  }
}
