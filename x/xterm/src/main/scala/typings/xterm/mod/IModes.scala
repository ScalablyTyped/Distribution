package typings.xterm.mod

import typings.xterm.xtermStrings.any
import typings.xterm.xtermStrings.drag
import typings.xterm.xtermStrings.none
import typings.xterm.xtermStrings.vt200
import typings.xterm.xtermStrings.x10
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IModes extends StObject {
  
  /**
    * Application Cursor Keys (DECCKM): `CSI ? 1 h`
    */
  val applicationCursorKeysMode: Boolean
  
  /**
    * Application Keypad Mode (DECNKM): `CSI ? 6 6 h`
    */
  val applicationKeypadMode: Boolean
  
  /**
    * Bracketed Paste Mode: `CSI ? 2 0 0 4 h`
    */
  val bracketedPasteMode: Boolean
  
  /**
    * Insert Mode (IRM): `CSI 4 h`
    */
  val insertMode: Boolean
  
  /**
    * Mouse Tracking, this can be one of the following:
    * - none: This is the default value and can be reset with DECRST
    * - x10: Send Mouse X & Y on button press `CSI ? 9 h`
    * - vt200: Send Mouse X & Y on button press and release `CSI ? 1 0 0 0 h`
    * - drag: Use Cell Motion Mouse Tracking `CSI ? 1 0 0 2 h`
    * - any: Use All Motion Mouse Tracking `CSI ? 1 0 0 3 h`
    */
  val mouseTrackingMode: none | x10 | vt200 | drag | any
  
  /**
    * Origin Mode (DECOM): `CSI ? 6 h`
    */
  val originMode: Boolean
  
  /**
    * Reverse-wraparound Mode: `CSI ? 4 5 h`
    */
  val reverseWraparoundMode: Boolean
  
  /**
    * Send FocusIn/FocusOut events: `CSI ? 1 0 0 4 h`
    */
  val sendFocusMode: Boolean
  
  /**
    * Auto-Wrap Mode (DECAWM): `CSI ? 7 h`
    */
  val wraparoundMode: Boolean
}
object IModes {
  
  inline def apply(
    applicationCursorKeysMode: Boolean,
    applicationKeypadMode: Boolean,
    bracketedPasteMode: Boolean,
    insertMode: Boolean,
    mouseTrackingMode: none | x10 | vt200 | drag | any,
    originMode: Boolean,
    reverseWraparoundMode: Boolean,
    sendFocusMode: Boolean,
    wraparoundMode: Boolean
  ): IModes = {
    val __obj = js.Dynamic.literal(applicationCursorKeysMode = applicationCursorKeysMode.asInstanceOf[js.Any], applicationKeypadMode = applicationKeypadMode.asInstanceOf[js.Any], bracketedPasteMode = bracketedPasteMode.asInstanceOf[js.Any], insertMode = insertMode.asInstanceOf[js.Any], mouseTrackingMode = mouseTrackingMode.asInstanceOf[js.Any], originMode = originMode.asInstanceOf[js.Any], reverseWraparoundMode = reverseWraparoundMode.asInstanceOf[js.Any], sendFocusMode = sendFocusMode.asInstanceOf[js.Any], wraparoundMode = wraparoundMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IModes] (val x: Self) extends AnyVal {
    
    inline def setApplicationCursorKeysMode(value: Boolean): Self = StObject.set(x, "applicationCursorKeysMode", value.asInstanceOf[js.Any])
    
    inline def setApplicationKeypadMode(value: Boolean): Self = StObject.set(x, "applicationKeypadMode", value.asInstanceOf[js.Any])
    
    inline def setBracketedPasteMode(value: Boolean): Self = StObject.set(x, "bracketedPasteMode", value.asInstanceOf[js.Any])
    
    inline def setInsertMode(value: Boolean): Self = StObject.set(x, "insertMode", value.asInstanceOf[js.Any])
    
    inline def setMouseTrackingMode(value: none | x10 | vt200 | drag | any): Self = StObject.set(x, "mouseTrackingMode", value.asInstanceOf[js.Any])
    
    inline def setOriginMode(value: Boolean): Self = StObject.set(x, "originMode", value.asInstanceOf[js.Any])
    
    inline def setReverseWraparoundMode(value: Boolean): Self = StObject.set(x, "reverseWraparoundMode", value.asInstanceOf[js.Any])
    
    inline def setSendFocusMode(value: Boolean): Self = StObject.set(x, "sendFocusMode", value.asInstanceOf[js.Any])
    
    inline def setWraparoundMode(value: Boolean): Self = StObject.set(x, "wraparoundMode", value.asInstanceOf[js.Any])
  }
}
