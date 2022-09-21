package typings.useGestureCore

import typings.useGestureCore.anon.FnCall
import typings.useGestureCore.useGestureCoreBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object supportMod {
  
  object SUPPORT {
    
    @JSImport("@use-gesture/core/dist/declarations/src/config/support", "SUPPORT")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@use-gesture/core/dist/declarations/src/config/support", "SUPPORT.gesture")
    @js.native
    def gesture: Boolean = js.native
    inline def gesture_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gesture")(x.asInstanceOf[js.Any])
    
    @JSImport("@use-gesture/core/dist/declarations/src/config/support", "SUPPORT.isBrowser")
    @js.native
    def isBrowser: `false` | FnCall = js.native
    inline def isBrowser_=(x: `false` | FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isBrowser")(x.asInstanceOf[js.Any])
    
    @JSImport("@use-gesture/core/dist/declarations/src/config/support", "SUPPORT.pointer")
    @js.native
    def pointer: Boolean = js.native
    
    @JSImport("@use-gesture/core/dist/declarations/src/config/support", "SUPPORT.pointerLock")
    @js.native
    def pointerLock: Boolean = js.native
    inline def pointerLock_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointerLock")(x.asInstanceOf[js.Any])
    
    inline def pointer_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointer")(x.asInstanceOf[js.Any])
    
    /**
      * It looks from https://github.com/pmndrs/use-gesture/discussions/421 that
      * some touchscreens using webkits don't have 'ontouchstart' in window. So
      * we're considering that browsers support TouchEvent if they have
      * `maxTouchPoints > 1`
      */
    @JSImport("@use-gesture/core/dist/declarations/src/config/support", "SUPPORT.touch")
    @js.native
    def touch: Boolean = js.native
    inline def touch_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("touch")(x.asInstanceOf[js.Any])
    
    @JSImport("@use-gesture/core/dist/declarations/src/config/support", "SUPPORT.touchscreen")
    @js.native
    def touchscreen: Boolean = js.native
    inline def touchscreen_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("touchscreen")(x.asInstanceOf[js.Any])
  }
}
