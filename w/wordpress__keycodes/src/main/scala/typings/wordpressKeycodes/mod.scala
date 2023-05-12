package typings.wordpressKeycodes

import typings.react.mod.KeyboardEvent
import typings.std.HTMLElement
import typings.std.Window
import typings.wordpressKeycodes.wordpressKeycodesInts.`121`
import typings.wordpressKeycodes.wordpressKeycodesInts.`13`
import typings.wordpressKeycodes.wordpressKeycodesInts.`27`
import typings.wordpressKeycodes.wordpressKeycodesInts.`32`
import typings.wordpressKeycodes.wordpressKeycodesInts.`33`
import typings.wordpressKeycodes.wordpressKeycodesInts.`34`
import typings.wordpressKeycodes.wordpressKeycodesInts.`35`
import typings.wordpressKeycodes.wordpressKeycodesInts.`36`
import typings.wordpressKeycodes.wordpressKeycodesInts.`37`
import typings.wordpressKeycodes.wordpressKeycodesInts.`38`
import typings.wordpressKeycodes.wordpressKeycodesInts.`39`
import typings.wordpressKeycodes.wordpressKeycodesInts.`40`
import typings.wordpressKeycodes.wordpressKeycodesInts.`46`
import typings.wordpressKeycodes.wordpressKeycodesInts.`48`
import typings.wordpressKeycodes.wordpressKeycodesInts.`8`
import typings.wordpressKeycodes.wordpressKeycodesInts.`9`
import typings.wordpressKeycodes.wordpressKeycodesStrings.alt
import typings.wordpressKeycodes.wordpressKeycodesStrings.ctrl
import typings.wordpressKeycodes.wordpressKeycodesStrings.meta
import typings.wordpressKeycodes.wordpressKeycodesStrings.shift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/keycodes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wordpress/keycodes", "ALT")
  @js.native
  val ALT: alt = js.native
  
  @JSImport("@wordpress/keycodes", "BACKSPACE")
  @js.native
  val BACKSPACE: `8` = js.native
  
  @JSImport("@wordpress/keycodes", "COMMAND")
  @js.native
  val COMMAND: meta = js.native
  
  @JSImport("@wordpress/keycodes", "CTRL")
  @js.native
  val CTRL: ctrl = js.native
  
  @JSImport("@wordpress/keycodes", "DELETE")
  @js.native
  val DELETE: `46` = js.native
  
  @JSImport("@wordpress/keycodes", "DOWN")
  @js.native
  val DOWN: `40` = js.native
  
  @JSImport("@wordpress/keycodes", "END")
  @js.native
  val END: `35` = js.native
  
  @JSImport("@wordpress/keycodes", "ENTER")
  @js.native
  val ENTER: `13` = js.native
  
  @JSImport("@wordpress/keycodes", "ESCAPE")
  @js.native
  val ESCAPE: `27` = js.native
  
  @JSImport("@wordpress/keycodes", "F10")
  @js.native
  val F10: `121` = js.native
  
  @JSImport("@wordpress/keycodes", "HOME")
  @js.native
  val HOME: `36` = js.native
  
  @JSImport("@wordpress/keycodes", "LEFT")
  @js.native
  val LEFT: `37` = js.native
  
  @JSImport("@wordpress/keycodes", "PAGEDOWN")
  @js.native
  val PAGEDOWN: `34` = js.native
  
  @JSImport("@wordpress/keycodes", "PAGEUP")
  @js.native
  val PAGEUP: `33` = js.native
  
  @JSImport("@wordpress/keycodes", "RIGHT")
  @js.native
  val RIGHT: `39` = js.native
  
  @JSImport("@wordpress/keycodes", "SHIFT")
  @js.native
  val SHIFT: shift = js.native
  
  @JSImport("@wordpress/keycodes", "SPACE")
  @js.native
  val SPACE: `32` = js.native
  
  @JSImport("@wordpress/keycodes", "TAB")
  @js.native
  val TAB: `9` = js.native
  
  @JSImport("@wordpress/keycodes", "UP")
  @js.native
  val UP: `38` = js.native
  
  @JSImport("@wordpress/keycodes", "ZERO")
  @js.native
  val ZERO: `48` = js.native
  
  @JSImport("@wordpress/keycodes", "displayShortcut")
  @js.native
  val displayShortcut: WPModifierHandler[WPKeyHandler[String]] = js.native
  
  @JSImport("@wordpress/keycodes", "displayShortcutList")
  @js.native
  val displayShortcutList: WPModifierHandler[WPKeyHandler[js.Array[String]]] = js.native
  
  inline def isAppleOS(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAppleOS")().asInstanceOf[Boolean]
  inline def isAppleOS(_window: Window): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAppleOS")(_window.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("@wordpress/keycodes", "isKeyboardEvent")
  @js.native
  val isKeyboardEvent: WPModifierHandler[WPEventKeyHandler] = js.native
  
  @JSImport("@wordpress/keycodes", "modifiers")
  @js.native
  val modifiers: WPModifierHandler[js.Function1[/* isApple */ js.Function0[Boolean], js.Array[WPModifierPart]]] = js.native
  
  @JSImport("@wordpress/keycodes", "rawShortcut")
  @js.native
  val rawShortcut: WPModifierHandler[WPKeyHandler[String]] = js.native
  
  @JSImport("@wordpress/keycodes", "shortcutAriaLabel")
  @js.native
  val shortcutAriaLabel: WPModifierHandler[WPKeyHandler[String]] = js.native
  
  type WPEventKeyHandler = js.Function3[
    /* event */ KeyboardEvent[HTMLElement] | typings.std.KeyboardEvent, 
    /* character */ String, 
    /* isApple */ js.UndefOr[js.Function0[Boolean]], 
    Boolean
  ]
  
  type WPKeyHandler[T] = js.Function2[/* character */ String, /* isApple */ js.UndefOr[js.Function0[Boolean]], T]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wordpressKeycodes.wordpressKeycodesStrings.primary
    - typings.wordpressKeycodes.wordpressKeycodesStrings.primaryShift
    - typings.wordpressKeycodes.wordpressKeycodesStrings.primaryAlt
    - typings.wordpressKeycodes.wordpressKeycodesStrings.secondary
    - typings.wordpressKeycodes.wordpressKeycodesStrings.access
    - typings.wordpressKeycodes.wordpressKeycodesStrings.ctrl
    - typings.wordpressKeycodes.wordpressKeycodesStrings.alt
    - typings.wordpressKeycodes.wordpressKeycodesStrings.ctrlShift
    - typings.wordpressKeycodes.wordpressKeycodesStrings.shift
    - typings.wordpressKeycodes.wordpressKeycodesStrings.shiftAlt
    - typings.wordpressKeycodes.wordpressKeycodesStrings.undefined
  */
  trait WPKeycodeModifier extends StObject
  object WPKeycodeModifier {
    
    inline def access: typings.wordpressKeycodes.wordpressKeycodesStrings.access = "access".asInstanceOf[typings.wordpressKeycodes.wordpressKeycodesStrings.access]
    
    inline def alt: typings.wordpressKeycodes.wordpressKeycodesStrings.alt = "alt".asInstanceOf[typings.wordpressKeycodes.wordpressKeycodesStrings.alt]
    
    inline def ctrl: typings.wordpressKeycodes.wordpressKeycodesStrings.ctrl = "ctrl".asInstanceOf[typings.wordpressKeycodes.wordpressKeycodesStrings.ctrl]
    
    inline def ctrlShift: typings.wordpressKeycodes.wordpressKeycodesStrings.ctrlShift = "ctrlShift".asInstanceOf[typings.wordpressKeycodes.wordpressKeycodesStrings.ctrlShift]
    
    inline def primary: typings.wordpressKeycodes.wordpressKeycodesStrings.primary = "primary".asInstanceOf[typings.wordpressKeycodes.wordpressKeycodesStrings.primary]
    
    inline def primaryAlt: typings.wordpressKeycodes.wordpressKeycodesStrings.primaryAlt = "primaryAlt".asInstanceOf[typings.wordpressKeycodes.wordpressKeycodesStrings.primaryAlt]
    
    inline def primaryShift: typings.wordpressKeycodes.wordpressKeycodesStrings.primaryShift = "primaryShift".asInstanceOf[typings.wordpressKeycodes.wordpressKeycodesStrings.primaryShift]
    
    inline def secondary: typings.wordpressKeycodes.wordpressKeycodesStrings.secondary = "secondary".asInstanceOf[typings.wordpressKeycodes.wordpressKeycodesStrings.secondary]
    
    inline def shift: typings.wordpressKeycodes.wordpressKeycodesStrings.shift = "shift".asInstanceOf[typings.wordpressKeycodes.wordpressKeycodesStrings.shift]
    
    inline def shiftAlt: typings.wordpressKeycodes.wordpressKeycodesStrings.shiftAlt = "shiftAlt".asInstanceOf[typings.wordpressKeycodes.wordpressKeycodesStrings.shiftAlt]
    
    inline def undefined: typings.wordpressKeycodes.wordpressKeycodesStrings.undefined = "undefined".asInstanceOf[typings.wordpressKeycodes.wordpressKeycodesStrings.undefined]
  }
  
  type WPModifier = js.Function1[/* isApple */ js.Function0[Boolean], js.Array[WPModifierPart]]
  
  /* Inlined std.Record<@wordpress/keycodes.@wordpress/keycodes.WPKeycodeModifier, T> */
  trait WPModifierHandler[T] extends StObject {
    
    var access: T
    
    var alt: T
    
    var ctrl: T
    
    var ctrlShift: T
    
    var primary: T
    
    var primaryAlt: T
    
    var primaryShift: T
    
    var secondary: T
    
    var shift: T
    
    var shiftAlt: T
    
    var undefined: T
  }
  object WPModifierHandler {
    
    inline def apply[T](
      access: T,
      alt: T,
      ctrl: T,
      ctrlShift: T,
      primary: T,
      primaryAlt: T,
      primaryShift: T,
      secondary: T,
      shift: T,
      shiftAlt: T,
      undefined: T
    ): WPModifierHandler[T] = {
      val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], alt = alt.asInstanceOf[js.Any], ctrl = ctrl.asInstanceOf[js.Any], ctrlShift = ctrlShift.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], primaryAlt = primaryAlt.asInstanceOf[js.Any], primaryShift = primaryShift.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any], shiftAlt = shiftAlt.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
      __obj.asInstanceOf[WPModifierHandler[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WPModifierHandler[?], T] (val x: Self & WPModifierHandler[T]) extends AnyVal {
      
      inline def setAccess(value: T): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
      
      inline def setAlt(value: T): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setCtrl(value: T): Self = StObject.set(x, "ctrl", value.asInstanceOf[js.Any])
      
      inline def setCtrlShift(value: T): Self = StObject.set(x, "ctrlShift", value.asInstanceOf[js.Any])
      
      inline def setPrimary(value: T): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setPrimaryAlt(value: T): Self = StObject.set(x, "primaryAlt", value.asInstanceOf[js.Any])
      
      inline def setPrimaryShift(value: T): Self = StObject.set(x, "primaryShift", value.asInstanceOf[js.Any])
      
      inline def setSecondary(value: T): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      inline def setShift(value: T): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
      
      inline def setShiftAlt(value: T): Self = StObject.set(x, "shiftAlt", value.asInstanceOf[js.Any])
      
      inline def setUndefined(value: T): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wordpressKeycodes.wordpressKeycodesStrings.alt
    - typings.wordpressKeycodes.wordpressKeycodesStrings.ctrl
    - typings.wordpressKeycodes.wordpressKeycodesStrings.meta
    - typings.wordpressKeycodes.wordpressKeycodesStrings.shift
  */
  trait WPModifierPart extends StObject
  object WPModifierPart {
    
    inline def alt: typings.wordpressKeycodes.wordpressKeycodesStrings.alt = "alt".asInstanceOf[typings.wordpressKeycodes.wordpressKeycodesStrings.alt]
    
    inline def ctrl: typings.wordpressKeycodes.wordpressKeycodesStrings.ctrl = "ctrl".asInstanceOf[typings.wordpressKeycodes.wordpressKeycodesStrings.ctrl]
    
    inline def meta: typings.wordpressKeycodes.wordpressKeycodesStrings.meta = "meta".asInstanceOf[typings.wordpressKeycodes.wordpressKeycodesStrings.meta]
    
    inline def shift: typings.wordpressKeycodes.wordpressKeycodesStrings.shift = "shift".asInstanceOf[typings.wordpressKeycodes.wordpressKeycodesStrings.shift]
  }
}
