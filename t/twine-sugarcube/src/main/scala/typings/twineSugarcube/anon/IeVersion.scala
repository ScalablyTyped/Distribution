package typings.twineSugarcube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IeVersion extends js.Object {
  
  val ieVersion: Double | Null = js.native
  
  val isGecko: Boolean = js.native
  
  val isIE: Boolean = js.native
  
  val isMobile: Android = js.native
  
  val isOpera: Boolean = js.native
  
  val isVivaldi: Boolean = js.native
  
  val operaVersion: Double | Null = js.native
  
  val userAgent: String = js.native
}
object IeVersion {
  
  @scala.inline
  def apply(
    isGecko: Boolean,
    isIE: Boolean,
    isMobile: Android,
    isOpera: Boolean,
    isVivaldi: Boolean,
    userAgent: String
  ): IeVersion = {
    val __obj = js.Dynamic.literal(isGecko = isGecko.asInstanceOf[js.Any], isIE = isIE.asInstanceOf[js.Any], isMobile = isMobile.asInstanceOf[js.Any], isOpera = isOpera.asInstanceOf[js.Any], isVivaldi = isVivaldi.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IeVersion]
  }
  
  @scala.inline
  implicit class IeVersionOps[Self <: IeVersion] (val x: Self) extends AnyVal {
    
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
    def setIsGecko(value: Boolean): Self = this.set("isGecko", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIE(value: Boolean): Self = this.set("isIE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMobile(value: Android): Self = this.set("isMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOpera(value: Boolean): Self = this.set("isOpera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVivaldi(value: Boolean): Self = this.set("isVivaldi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIeVersion(value: Double): Self = this.set("ieVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIeVersionNull: Self = this.set("ieVersion", null)
    
    @scala.inline
    def setOperaVersion(value: Double): Self = this.set("operaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperaVersionNull: Self = this.set("operaVersion", null)
  }
}
