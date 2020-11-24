package typings.yogLog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteLogConfig extends js.Object {
  
  var errno: Double = js.native
  
  var escape_msg: Boolean = js.native
  
  var filename_suffix: String = js.native
}
object WriteLogConfig {
  
  @scala.inline
  def apply(errno: Double, escape_msg: Boolean, filename_suffix: String): WriteLogConfig = {
    val __obj = js.Dynamic.literal(errno = errno.asInstanceOf[js.Any], escape_msg = escape_msg.asInstanceOf[js.Any], filename_suffix = filename_suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteLogConfig]
  }
  
  @scala.inline
  implicit class WriteLogConfigOps[Self <: WriteLogConfig] (val x: Self) extends AnyVal {
    
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
    def setErrno(value: Double): Self = this.set("errno", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEscape_msg(value: Boolean): Self = this.set("escape_msg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename_suffix(value: String): Self = this.set("filename_suffix", value.asInstanceOf[js.Any])
  }
}
