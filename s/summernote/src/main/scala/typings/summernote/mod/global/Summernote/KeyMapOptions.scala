package typings.summernote.mod.global.Summernote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyMapOptions extends StObject {
  
  var mac: js.UndefOr[KeyMapMacOptions] = js.native
  
  var pc: js.UndefOr[KeyMapPcOptions] = js.native
}
object KeyMapOptions {
  
  @scala.inline
  def apply(): KeyMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyMapOptions]
  }
  
  @scala.inline
  implicit class KeyMapOptionsMutableBuilder[Self <: KeyMapOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMac(value: KeyMapMacOptions): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
    
    @scala.inline
    def setPc(value: KeyMapPcOptions): Self = StObject.set(x, "pc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPcUndefined: Self = StObject.set(x, "pc", js.undefined)
  }
}
