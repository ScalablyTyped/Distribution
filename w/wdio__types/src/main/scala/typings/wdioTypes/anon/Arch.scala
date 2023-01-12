package typings.wdioTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arch extends StObject {
  
  var arch: js.UndefOr[String] = js.undefined
  
  var compatibility: js.UndefOr[Double] = js.undefined
  
  var driver: js.UndefOr[String] = js.undefined
  
  var enablePopups: js.UndefOr[Boolean] = js.undefined
  
  var noFlash: js.UndefOr[Boolean] = js.undefined
}
object Arch {
  
  inline def apply(): Arch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Arch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Arch] (val x: Self) extends AnyVal {
    
    inline def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
    
    inline def setArchUndefined: Self = StObject.set(x, "arch", js.undefined)
    
    inline def setCompatibility(value: Double): Self = StObject.set(x, "compatibility", value.asInstanceOf[js.Any])
    
    inline def setCompatibilityUndefined: Self = StObject.set(x, "compatibility", js.undefined)
    
    inline def setDriver(value: String): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    inline def setDriverUndefined: Self = StObject.set(x, "driver", js.undefined)
    
    inline def setEnablePopups(value: Boolean): Self = StObject.set(x, "enablePopups", value.asInstanceOf[js.Any])
    
    inline def setEnablePopupsUndefined: Self = StObject.set(x, "enablePopups", js.undefined)
    
    inline def setNoFlash(value: Boolean): Self = StObject.set(x, "noFlash", value.asInstanceOf[js.Any])
    
    inline def setNoFlashUndefined: Self = StObject.set(x, "noFlash", js.undefined)
  }
}
