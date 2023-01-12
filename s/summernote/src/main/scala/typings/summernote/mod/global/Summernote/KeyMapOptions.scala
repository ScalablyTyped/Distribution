package typings.summernote.mod.global.Summernote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyMapOptions extends StObject {
  
  var mac: js.UndefOr[KeyMapMacOptions] = js.undefined
  
  var pc: js.UndefOr[KeyMapPcOptions] = js.undefined
}
object KeyMapOptions {
  
  inline def apply(): KeyMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyMapOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyMapOptions] (val x: Self) extends AnyVal {
    
    inline def setMac(value: KeyMapMacOptions): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    
    inline def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
    
    inline def setPc(value: KeyMapPcOptions): Self = StObject.set(x, "pc", value.asInstanceOf[js.Any])
    
    inline def setPcUndefined: Self = StObject.set(x, "pc", js.undefined)
  }
}
