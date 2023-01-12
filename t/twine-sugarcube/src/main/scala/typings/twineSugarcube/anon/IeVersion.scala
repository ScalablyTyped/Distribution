package typings.twineSugarcube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IeVersion extends StObject {
  
  val ieVersion: Double | Null
  
  val isGecko: Boolean
  
  val isIE: Boolean
  
  val isMobile: Android
  
  val isOpera: Boolean
  
  val isVivaldi: Boolean
  
  val operaVersion: Double | Null
  
  val userAgent: String
}
object IeVersion {
  
  inline def apply(
    isGecko: Boolean,
    isIE: Boolean,
    isMobile: Android,
    isOpera: Boolean,
    isVivaldi: Boolean,
    userAgent: String
  ): IeVersion = {
    val __obj = js.Dynamic.literal(isGecko = isGecko.asInstanceOf[js.Any], isIE = isIE.asInstanceOf[js.Any], isMobile = isMobile.asInstanceOf[js.Any], isOpera = isOpera.asInstanceOf[js.Any], isVivaldi = isVivaldi.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any], ieVersion = null, operaVersion = null)
    __obj.asInstanceOf[IeVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IeVersion] (val x: Self) extends AnyVal {
    
    inline def setIeVersion(value: Double): Self = StObject.set(x, "ieVersion", value.asInstanceOf[js.Any])
    
    inline def setIeVersionNull: Self = StObject.set(x, "ieVersion", null)
    
    inline def setIsGecko(value: Boolean): Self = StObject.set(x, "isGecko", value.asInstanceOf[js.Any])
    
    inline def setIsIE(value: Boolean): Self = StObject.set(x, "isIE", value.asInstanceOf[js.Any])
    
    inline def setIsMobile(value: Android): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
    
    inline def setIsOpera(value: Boolean): Self = StObject.set(x, "isOpera", value.asInstanceOf[js.Any])
    
    inline def setIsVivaldi(value: Boolean): Self = StObject.set(x, "isVivaldi", value.asInstanceOf[js.Any])
    
    inline def setOperaVersion(value: Double): Self = StObject.set(x, "operaVersion", value.asInstanceOf[js.Any])
    
    inline def setOperaVersionNull: Self = StObject.set(x, "operaVersion", null)
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
  }
}
