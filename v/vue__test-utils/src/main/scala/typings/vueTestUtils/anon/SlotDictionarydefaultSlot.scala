package typings.vueTestUtils.anon

import org.scalablytyped.runtime.StringDictionary
import typings.vueTestUtils.distTypesMod.Slot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @vue/test-utils.@vue/test-utils/dist/types.SlotDictionary & {  default :@vue/test-utils.@vue/test-utils/dist/types.Slot | undefined} */
trait SlotDictionarydefaultSlot
  extends StObject
     with /* key */ StringDictionary[Slot] {
  
  var default: js.UndefOr[Slot] = js.undefined
}
object SlotDictionarydefaultSlot {
  
  inline def apply(): SlotDictionarydefaultSlot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlotDictionarydefaultSlot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlotDictionarydefaultSlot] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: Slot): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
