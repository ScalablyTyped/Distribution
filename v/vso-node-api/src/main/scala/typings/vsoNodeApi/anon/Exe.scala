package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exe extends StObject {
  
  var exe: scala.Double
  
  var msi: scala.Double
  
  var referralLink: scala.Double
  
  var vsix: scala.Double
}
object Exe {
  
  @scala.inline
  def apply(exe: scala.Double, msi: scala.Double, referralLink: scala.Double, vsix: scala.Double): Exe = {
    val __obj = js.Dynamic.literal(exe = exe.asInstanceOf[js.Any], msi = msi.asInstanceOf[js.Any], referralLink = referralLink.asInstanceOf[js.Any], vsix = vsix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exe]
  }
  
  @scala.inline
  implicit class ExeMutableBuilder[Self <: Exe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExe(value: scala.Double): Self = StObject.set(x, "exe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsi(value: scala.Double): Self = StObject.set(x, "msi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferralLink(value: scala.Double): Self = StObject.set(x, "referralLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVsix(value: scala.Double): Self = StObject.set(x, "vsix", value.asInstanceOf[js.Any])
  }
}
