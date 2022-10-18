package typings.testingLibraryUserEvent

import typings.std.Record
import typings.testingLibraryUserEvent.anon.Alt
import typings.testingLibraryUserEvent.anon.UnpreventedDefault
import typings.testingLibraryUserEvent.distTypesSetupSetupMod.Instance
import typings.testingLibraryUserEvent.distTypesSystemMod.System
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemKeyboardMod {
  
  @js.native
  sealed trait DOM_KEY_LOCATION extends StObject
  @JSImport("@testing-library/user-event/dist/types/system/keyboard", "DOM_KEY_LOCATION")
  @js.native
  object DOM_KEY_LOCATION extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DOM_KEY_LOCATION & Double] = js.native
    
    @js.native
    sealed trait LEFT
      extends StObject
         with DOM_KEY_LOCATION
    /* 1 */ val LEFT: typings.testingLibraryUserEvent.distTypesSystemKeyboardMod.DOM_KEY_LOCATION.LEFT & Double = js.native
    
    @js.native
    sealed trait NUMPAD
      extends StObject
         with DOM_KEY_LOCATION
    /* 3 */ val NUMPAD: typings.testingLibraryUserEvent.distTypesSystemKeyboardMod.DOM_KEY_LOCATION.NUMPAD & Double = js.native
    
    @js.native
    sealed trait RIGHT
      extends StObject
         with DOM_KEY_LOCATION
    /* 2 */ val RIGHT: typings.testingLibraryUserEvent.distTypesSystemKeyboardMod.DOM_KEY_LOCATION.RIGHT & Double = js.native
    
    @js.native
    sealed trait STANDARD
      extends StObject
         with DOM_KEY_LOCATION
    /* 0 */ val STANDARD: typings.testingLibraryUserEvent.distTypesSystemKeyboardMod.DOM_KEY_LOCATION.STANDARD & Double = js.native
  }
  
  @JSImport("@testing-library/user-event/dist/types/system/keyboard", "KeyboardHost")
  @js.native
  open class KeyboardHost protected () extends StObject {
    def this(system: System) = this()
    
    var carryChar: String = js.native
    
    def getPressedKeys(): js.Array[keyboardKey] = js.native
    
    /* private */ var hasKeyPress: Any = js.native
    
    def isKeyPressed(keyDef: keyboardKey): Boolean = js.native
    
    /** Press a key */
    def keydown(instance: Instance, keyDef: keyboardKey): js.Promise[Unit] = js.native
    
    /** Release a key */
    def keyup(instance: Instance, keyDef: keyboardKey): js.Promise[Unit] = js.native
    
    /* private */ var lastKeydownTarget: Any = js.native
    
    /* private */ val modifierLockStart: Any = js.native
    
    val modifiers: Alt = js.native
    
    val pressed: Record[String, UnpreventedDefault] = js.native
    
    /* private */ var setKeydownTarget: Any = js.native
    
    val system: System = js.native
  }
  
  trait keyboardKey extends StObject {
    
    /** Does the character in `key` require/imply AltRight to be pressed? */
    var altGr: js.UndefOr[Boolean] = js.undefined
    
    /** Physical location on a keyboard */
    var code: js.UndefOr[String] = js.undefined
    
    /** Character or functional key descriptor */
    var key: js.UndefOr[String] = js.undefined
    
    /** Location on the keyboard for keys with multiple representation */
    var location: js.UndefOr[DOM_KEY_LOCATION] = js.undefined
    
    /** Does the character in `key` require/imply a shiftKey to be pressed? */
    var shift: js.UndefOr[Boolean] = js.undefined
  }
  object keyboardKey {
    
    inline def apply(): keyboardKey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[keyboardKey]
    }
    
    extension [Self <: keyboardKey](x: Self) {
      
      inline def setAltGr(value: Boolean): Self = StObject.set(x, "altGr", value.asInstanceOf[js.Any])
      
      inline def setAltGrUndefined: Self = StObject.set(x, "altGr", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLocation(value: DOM_KEY_LOCATION): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setShift(value: Boolean): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
      
      inline def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
    }
  }
}
