package typings.testingLibraryUserEvent.anon

import typings.testingLibraryUserEvent.optionsMod.PointerEventsCheckLevel
import typings.testingLibraryUserEvent.sharedMod.pointerKey
import typings.testingLibraryUserEvent.systemKeyboardMod.keyboardKey
import typings.testingLibraryUserEvent.systemMod.System
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @testing-library/user-event.@testing-library/user-event/dist/types/setup/directApi.DirectOptions & {  keyboardState :@testing-library/user-event.@testing-library/user-event/dist/types/system.System | undefined,   pointerState :@testing-library/user-event.@testing-library/user-event/dist/types/system.System | undefined} */
trait DirectOptionskeyboardStat extends StObject {
  
  /**
    * A function to be called internally to advance your fake timers (if applicable)
    *
    * @example jest.advanceTimersByTime
    */
  var advanceTimers: js.UndefOr[js.Function1[/* delay */ Double, js.Promise[Unit] | Unit]] = js.undefined
  
  /**
    * When using `userEvent.upload`, automatically discard files
    * that don't match an `accept` property if it exists.
    *
    * @default true
    */
  var applyAccept: js.UndefOr[Boolean] = js.undefined
  
  /**
    * We intend to automatically apply modifier keys for printable characters in the future.
    * I.e. `A` implying `{Shift>}a{/Shift}` if caps lock is not active.
    *
    * This options allows you to opt out of this change in foresight.
    * The feature therefore will not constitute a breaking change.
    *
    * @default true
    */
  var autoModify: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Between some subsequent inputs like typing a series of characters
    * the code execution is delayed per `setTimeout` for (at least) `delay` seconds.
    * This moves the next changes at least to next macro task
    * and allows other (asynchronous) code to run between events.
    *
    * `null` prevents `setTimeout` from being called.
    *
    * @default 0
    */
  var delay: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The document.
    *
    * This defaults to the owner document of an element if an API is called directly with an element and without setup.
    * Otherwise it falls back to the global document.
    *
    * @default element.ownerDocument??globalThis.document
    */
  var document: js.UndefOr[typings.std.Document] = js.undefined
  
  /**
    * An array of keyboard keys the keyboard device consists of.
    *
    * This allows to plug in different layouts / localizations.
    *
    * Defaults to a "standard" US-104-QWERTY keyboard.
    */
  var keyboardMap: js.UndefOr[js.Array[keyboardKey]] = js.undefined
  
  var keyboardState: js.UndefOr[System] = js.undefined
  
  /**
    * The pointer API includes a check if an element has or inherits `pointer-events: none`.
    * This check is known to be expensive and very expensive when checking deeply nested nodes.
    * This option determines how often the pointer related APIs perform the check.
    *
    * This is a binary flag option. You can combine multiple Levels.
    *
    * @default PointerEventsCheckLevel.EachCall
    */
  var pointerEventsCheck: js.UndefOr[PointerEventsCheckLevel | Double] = js.undefined
  
  /**
    * An array of available pointer keys.
    *
    * This allows to plug in different pointer devices.
    */
  var pointerMap: js.UndefOr[js.Array[pointerKey]] = js.undefined
  
  var pointerState: js.UndefOr[System] = js.undefined
  
  /**
    * `userEvent.type` automatically releases any keys still pressed at the end of the call.
    * This option allows to opt out of this feature.
    *
    * @default false
    */
  var skipAutoClose: js.UndefOr[Boolean] = js.undefined
  
  /**
    * `userEvent.type` implies a click at the end of the element content/value.
    * This option allows to opt out of this feature.
    *
    * @default false
    */
  var skipClick: js.UndefOr[Boolean] = js.undefined
  
  /**
    * `userEvent.click` implies moving the cursor to the target element first.
    * This options allows to opt out of this feature.
    *
    * @default false
    */
  var skipHover: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Write selected data to Clipboard API when a `cut` or `copy` is triggered.
    *
    * The Clipboard API is usually not available to test code.
    * Our `setup` replaces the `navigator.clipboard` property with a stub.
    *
    * Defaults to `false` when calling the APIs directly.
    * Defaults to `true` when calling the APIs per `setup`.
    */
  var writeToClipboard: js.UndefOr[Boolean] = js.undefined
}
object DirectOptionskeyboardStat {
  
  inline def apply(): DirectOptionskeyboardStat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectOptionskeyboardStat]
  }
  
  extension [Self <: DirectOptionskeyboardStat](x: Self) {
    
    inline def setAdvanceTimers(value: /* delay */ Double => js.Promise[Unit] | Unit): Self = StObject.set(x, "advanceTimers", js.Any.fromFunction1(value))
    
    inline def setAdvanceTimersUndefined: Self = StObject.set(x, "advanceTimers", js.undefined)
    
    inline def setApplyAccept(value: Boolean): Self = StObject.set(x, "applyAccept", value.asInstanceOf[js.Any])
    
    inline def setApplyAcceptUndefined: Self = StObject.set(x, "applyAccept", js.undefined)
    
    inline def setAutoModify(value: Boolean): Self = StObject.set(x, "autoModify", value.asInstanceOf[js.Any])
    
    inline def setAutoModifyUndefined: Self = StObject.set(x, "autoModify", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayNull: Self = StObject.set(x, "delay", null)
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDocument(value: typings.std.Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setKeyboardMap(value: js.Array[keyboardKey]): Self = StObject.set(x, "keyboardMap", value.asInstanceOf[js.Any])
    
    inline def setKeyboardMapUndefined: Self = StObject.set(x, "keyboardMap", js.undefined)
    
    inline def setKeyboardMapVarargs(value: keyboardKey*): Self = StObject.set(x, "keyboardMap", js.Array(value*))
    
    inline def setKeyboardState(value: System): Self = StObject.set(x, "keyboardState", value.asInstanceOf[js.Any])
    
    inline def setKeyboardStateUndefined: Self = StObject.set(x, "keyboardState", js.undefined)
    
    inline def setPointerEventsCheck(value: PointerEventsCheckLevel | Double): Self = StObject.set(x, "pointerEventsCheck", value.asInstanceOf[js.Any])
    
    inline def setPointerEventsCheckUndefined: Self = StObject.set(x, "pointerEventsCheck", js.undefined)
    
    inline def setPointerMap(value: js.Array[pointerKey]): Self = StObject.set(x, "pointerMap", value.asInstanceOf[js.Any])
    
    inline def setPointerMapUndefined: Self = StObject.set(x, "pointerMap", js.undefined)
    
    inline def setPointerMapVarargs(value: pointerKey*): Self = StObject.set(x, "pointerMap", js.Array(value*))
    
    inline def setPointerState(value: System): Self = StObject.set(x, "pointerState", value.asInstanceOf[js.Any])
    
    inline def setPointerStateUndefined: Self = StObject.set(x, "pointerState", js.undefined)
    
    inline def setSkipAutoClose(value: Boolean): Self = StObject.set(x, "skipAutoClose", value.asInstanceOf[js.Any])
    
    inline def setSkipAutoCloseUndefined: Self = StObject.set(x, "skipAutoClose", js.undefined)
    
    inline def setSkipClick(value: Boolean): Self = StObject.set(x, "skipClick", value.asInstanceOf[js.Any])
    
    inline def setSkipClickUndefined: Self = StObject.set(x, "skipClick", js.undefined)
    
    inline def setSkipHover(value: Boolean): Self = StObject.set(x, "skipHover", value.asInstanceOf[js.Any])
    
    inline def setSkipHoverUndefined: Self = StObject.set(x, "skipHover", js.undefined)
    
    inline def setWriteToClipboard(value: Boolean): Self = StObject.set(x, "writeToClipboard", value.asInstanceOf[js.Any])
    
    inline def setWriteToClipboardUndefined: Self = StObject.set(x, "writeToClipboard", js.undefined)
  }
}
