package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Exe extends js.Object {
  
  var exe: scala.Double = js.native
  
  var msi: scala.Double = js.native
  
  var referralLink: scala.Double = js.native
  
  var vsix: scala.Double = js.native
}
object Exe {
  
  @scala.inline
  def apply(exe: scala.Double, msi: scala.Double, referralLink: scala.Double, vsix: scala.Double): Exe = {
    val __obj = js.Dynamic.literal(exe = exe.asInstanceOf[js.Any], msi = msi.asInstanceOf[js.Any], referralLink = referralLink.asInstanceOf[js.Any], vsix = vsix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exe]
  }
  
  @scala.inline
  implicit class ExeOps[Self <: Exe] (val x: Self) extends AnyVal {
    
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
    def setExe(value: scala.Double): Self = this.set("exe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsi(value: scala.Double): Self = this.set("msi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferralLink(value: scala.Double): Self = this.set("referralLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVsix(value: scala.Double): Self = this.set("vsix", value.asInstanceOf[js.Any])
  }
}
