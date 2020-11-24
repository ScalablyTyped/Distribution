package typings.touch.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var atime: js.UndefOr[Boolean | Date] = js.native
  
  var closeAfter: js.UndefOr[Boolean] = js.native
  
  var force: js.UndefOr[Boolean] = js.native
  
  var mtime: js.UndefOr[Boolean | Date] = js.native
  
  var nocreate: js.UndefOr[Boolean] = js.native
  
  var ref: js.UndefOr[String] = js.native
  
  var time: js.UndefOr[Date | String | Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAtime(value: Boolean | Date): Self = this.set("atime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAtime: Self = this.set("atime", js.undefined)
    
    @scala.inline
    def setCloseAfter(value: Boolean): Self = this.set("closeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseAfter: Self = this.set("closeAfter", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    
    @scala.inline
    def setMtime(value: Boolean | Date): Self = this.set("mtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMtime: Self = this.set("mtime", js.undefined)
    
    @scala.inline
    def setNocreate(value: Boolean): Self = this.set("nocreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNocreate: Self = this.set("nocreate", js.undefined)
    
    @scala.inline
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setTime(value: Date | String | Double): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
}
