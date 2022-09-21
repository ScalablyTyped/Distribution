package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "Input")
@js.native
/**
  * The `input` object is supposed to fire global touch events with coordinates relative to the app
  * window.
  */
/* private */ open class Input_ () extends NativeObject {
  
  /**
    * Fired instead of 'pointerUp' when the touch ends on another app window than it started on.
    */
  var onPointerCancel: Listeners[PointerEvent[this.type]] = js.native
  
  /**
    * Fired when the app window is touched.
    */
  var onPointerDown: Listeners[PointerEvent[this.type]] = js.native
  
  /**
    * Fired repeatedly while swiping across the app window.
    */
  var onPointerMove: Listeners[PointerEvent[this.type]] = js.native
  
  /**
    * Fired when a touch ends on the app window than it started on.
    */
  var onPointerUp: Listeners[PointerEvent[this.type]] = js.native
  
  /**
    * Fired when the app window size has changed.
    */
  var onResize: Listeners[InputResizeEvent[this.type]] = js.native
}
