package typings.weixinApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  addGlobalClass :boolean,   multipleSlots :boolean}> */
trait PartialaddGlobalClassbool extends StObject {
  
  var addGlobalClass: js.UndefOr[Boolean] = js.undefined
  
  var multipleSlots: js.UndefOr[Boolean] = js.undefined
}
object PartialaddGlobalClassbool {
  
  inline def apply(): PartialaddGlobalClassbool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialaddGlobalClassbool]
  }
  
  extension [Self <: PartialaddGlobalClassbool](x: Self) {
    
    inline def setAddGlobalClass(value: Boolean): Self = StObject.set(x, "addGlobalClass", value.asInstanceOf[js.Any])
    
    inline def setAddGlobalClassUndefined: Self = StObject.set(x, "addGlobalClass", js.undefined)
    
    inline def setMultipleSlots(value: Boolean): Self = StObject.set(x, "multipleSlots", value.asInstanceOf[js.Any])
    
    inline def setMultipleSlotsUndefined: Self = StObject.set(x, "multipleSlots", js.undefined)
  }
}
