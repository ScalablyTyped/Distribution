package typings.vueTestUtils

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import typings.std.Number
import typings.vueTestUtils.distConstantsDomEventsMod.DomEventNameWithModifier
import typings.vueTestUtils.vueTestUtilsInts.`13`
import typings.vueTestUtils.vueTestUtilsInts.`27`
import typings.vueTestUtils.vueTestUtilsInts.`32`
import typings.vueTestUtils.vueTestUtilsInts.`33`
import typings.vueTestUtils.vueTestUtilsInts.`34`
import typings.vueTestUtils.vueTestUtilsInts.`35`
import typings.vueTestUtils.vueTestUtilsInts.`36`
import typings.vueTestUtils.vueTestUtilsInts.`37`
import typings.vueTestUtils.vueTestUtilsInts.`38`
import typings.vueTestUtils.vueTestUtilsInts.`39`
import typings.vueTestUtils.vueTestUtilsInts.`40`
import typings.vueTestUtils.vueTestUtilsInts.`45`
import typings.vueTestUtils.vueTestUtilsInts.`46`
import typings.vueTestUtils.vueTestUtilsInts.`8`
import typings.vueTestUtils.vueTestUtilsInts.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCreateDomEventMod {
  
  @JSImport("@vue/test-utils/dist/createDomEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDOMEvent(eventString: String): Event & TriggerOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("createDOMEvent")(eventString.asInstanceOf[js.Any]).asInstanceOf[Event & TriggerOptions]
  inline def createDOMEvent(eventString: String, options: TriggerOptions): Event & TriggerOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("createDOMEvent")(eventString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Event & TriggerOptions]
  inline def createDOMEvent(eventString: DomEventNameWithModifier): Event & TriggerOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("createDOMEvent")(eventString.asInstanceOf[js.Any]).asInstanceOf[Event & TriggerOptions]
  inline def createDOMEvent(eventString: DomEventNameWithModifier, options: TriggerOptions): Event & TriggerOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("createDOMEvent")(eventString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Event & TriggerOptions]
  
  object keyCodesByKeyName {
    
    @JSImport("@vue/test-utils/dist/createDomEvent", "keyCodesByKeyName.backspace")
    @js.native
    val backspace: `8` = js.native
    
    @JSImport("@vue/test-utils/dist/createDomEvent", "keyCodesByKeyName.delete")
    @js.native
    val delete: `46` = js.native
    
    @JSImport("@vue/test-utils/dist/createDomEvent", "keyCodesByKeyName.down")
    @js.native
    val down: `40` = js.native
    
    @JSImport("@vue/test-utils/dist/createDomEvent", "keyCodesByKeyName.end")
    @js.native
    val end: `35` = js.native
    
    @JSImport("@vue/test-utils/dist/createDomEvent", "keyCodesByKeyName.enter")
    @js.native
    val enter: `13` = js.native
    
    @JSImport("@vue/test-utils/dist/createDomEvent", "keyCodesByKeyName.esc")
    @js.native
    val esc: `27` = js.native
    
    @JSImport("@vue/test-utils/dist/createDomEvent", "keyCodesByKeyName.home")
    @js.native
    val home: `36` = js.native
    
    @JSImport("@vue/test-utils/dist/createDomEvent", "keyCodesByKeyName.insert")
    @js.native
    val insert: `45` = js.native
    
    @JSImport("@vue/test-utils/dist/createDomEvent", "keyCodesByKeyName.left")
    @js.native
    val left: `37` = js.native
    
    @JSImport("@vue/test-utils/dist/createDomEvent", "keyCodesByKeyName.pagedown")
    @js.native
    val pagedown: `34` = js.native
    
    @JSImport("@vue/test-utils/dist/createDomEvent", "keyCodesByKeyName.pageup")
    @js.native
    val pageup: `33` = js.native
    
    @JSImport("@vue/test-utils/dist/createDomEvent", "keyCodesByKeyName.right")
    @js.native
    val right: `39` = js.native
    
    @JSImport("@vue/test-utils/dist/createDomEvent", "keyCodesByKeyName.space")
    @js.native
    val space: `32` = js.native
    
    @JSImport("@vue/test-utils/dist/createDomEvent", "keyCodesByKeyName.tab")
    @js.native
    val tab: `9` = js.native
    
    @JSImport("@vue/test-utils/dist/createDomEvent", "keyCodesByKeyName.up")
    @js.native
    val up: `38` = js.native
  }
  
  trait TriggerOptions
    extends StObject
       with /* custom */ StringDictionary[Any] {
    
    var code: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var keyCode: js.UndefOr[Number] = js.undefined
  }
  object TriggerOptions {
    
    inline def apply(): TriggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TriggerOptions]
    }
    
    extension [Self <: TriggerOptions](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyCode(value: Number): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      inline def setKeyCodeUndefined: Self = StObject.set(x, "keyCode", js.undefined)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
}
