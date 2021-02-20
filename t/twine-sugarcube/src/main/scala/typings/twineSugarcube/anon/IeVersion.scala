package typings.twineSugarcube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IeVersion extends StObject {
  
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
  implicit class IeVersionMutableBuilder[Self <: IeVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIeVersion(value: Double): Self = StObject.set(x, "ieVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIeVersionNull: Self = StObject.set(x, "ieVersion", null)
    
    @scala.inline
    def setIsGecko(value: Boolean): Self = StObject.set(x, "isGecko", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIE(value: Boolean): Self = StObject.set(x, "isIE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMobile(value: Android): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOpera(value: Boolean): Self = StObject.set(x, "isOpera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVivaldi(value: Boolean): Self = StObject.set(x, "isVivaldi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperaVersion(value: Double): Self = StObject.set(x, "operaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperaVersionNull: Self = StObject.set(x, "operaVersion", null)
    
    @scala.inline
    def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
  }
}
