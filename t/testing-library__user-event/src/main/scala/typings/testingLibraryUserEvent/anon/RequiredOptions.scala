package typings.testingLibraryUserEvent.anon

import typings.testingLibraryUserEvent.optionsMod.PointerEventsCheckLevel
import typings.testingLibraryUserEvent.sharedMod.pointerKey
import typings.testingLibraryUserEvent.systemKeyboardMod.keyboardKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<@testing-library/user-event.@testing-library/user-event/dist/types/options.Options> */
trait RequiredOptions extends StObject {
  
  var advanceTimers: js.Function1[/* delay */ Double, js.Promise[Unit] | Unit]
  
  var applyAccept: Boolean
  
  var autoModify: Boolean
  
  var delay: Double
  
  var document: typings.std.Document
  
  var keyboardMap: js.Array[keyboardKey]
  
  var pointerEventsCheck: PointerEventsCheckLevel | Double
  
  var pointerMap: js.Array[pointerKey]
  
  var skipAutoClose: Boolean
  
  var skipClick: Boolean
  
  var skipHover: Boolean
  
  var writeToClipboard: Boolean
}
object RequiredOptions {
  
  inline def apply(
    advanceTimers: /* delay */ Double => js.Promise[Unit] | Unit,
    applyAccept: Boolean,
    autoModify: Boolean,
    delay: Double,
    document: typings.std.Document,
    keyboardMap: js.Array[keyboardKey],
    pointerEventsCheck: PointerEventsCheckLevel | Double,
    pointerMap: js.Array[pointerKey],
    skipAutoClose: Boolean,
    skipClick: Boolean,
    skipHover: Boolean,
    writeToClipboard: Boolean
  ): RequiredOptions = {
    val __obj = js.Dynamic.literal(advanceTimers = js.Any.fromFunction1(advanceTimers), applyAccept = applyAccept.asInstanceOf[js.Any], autoModify = autoModify.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], keyboardMap = keyboardMap.asInstanceOf[js.Any], pointerEventsCheck = pointerEventsCheck.asInstanceOf[js.Any], pointerMap = pointerMap.asInstanceOf[js.Any], skipAutoClose = skipAutoClose.asInstanceOf[js.Any], skipClick = skipClick.asInstanceOf[js.Any], skipHover = skipHover.asInstanceOf[js.Any], writeToClipboard = writeToClipboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredOptions]
  }
  
  extension [Self <: RequiredOptions](x: Self) {
    
    inline def setAdvanceTimers(value: /* delay */ Double => js.Promise[Unit] | Unit): Self = StObject.set(x, "advanceTimers", js.Any.fromFunction1(value))
    
    inline def setApplyAccept(value: Boolean): Self = StObject.set(x, "applyAccept", value.asInstanceOf[js.Any])
    
    inline def setAutoModify(value: Boolean): Self = StObject.set(x, "autoModify", value.asInstanceOf[js.Any])
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDocument(value: typings.std.Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setKeyboardMap(value: js.Array[keyboardKey]): Self = StObject.set(x, "keyboardMap", value.asInstanceOf[js.Any])
    
    inline def setKeyboardMapVarargs(value: keyboardKey*): Self = StObject.set(x, "keyboardMap", js.Array(value*))
    
    inline def setPointerEventsCheck(value: PointerEventsCheckLevel | Double): Self = StObject.set(x, "pointerEventsCheck", value.asInstanceOf[js.Any])
    
    inline def setPointerMap(value: js.Array[pointerKey]): Self = StObject.set(x, "pointerMap", value.asInstanceOf[js.Any])
    
    inline def setPointerMapVarargs(value: pointerKey*): Self = StObject.set(x, "pointerMap", js.Array(value*))
    
    inline def setSkipAutoClose(value: Boolean): Self = StObject.set(x, "skipAutoClose", value.asInstanceOf[js.Any])
    
    inline def setSkipClick(value: Boolean): Self = StObject.set(x, "skipClick", value.asInstanceOf[js.Any])
    
    inline def setSkipHover(value: Boolean): Self = StObject.set(x, "skipHover", value.asInstanceOf[js.Any])
    
    inline def setWriteToClipboard(value: Boolean): Self = StObject.set(x, "writeToClipboard", value.asInstanceOf[js.Any])
  }
}
