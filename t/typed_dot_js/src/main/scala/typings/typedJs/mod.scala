package typings.typedJs

import typings.std.Element
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("typed.js", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Typed {
    def this(elementId: Any, options: TypedOptions) = this()
  }
  
  @js.native
  trait Typed extends StObject {
    
    var arrayPos: Double = js.native
    
    /**
      * Backspaces 1 character at a time
      * @param {string} curString the current string in the strings array
      * @param {number} curStrPos the current position in the curString
      * @private
      */
    /* private */ var backspace: Any = js.native
    
    /**
      * Begins the typing animation
      * @private
      */
    /* private */ var begin: Any = js.native
    
    /**
      * If using input elements, bind focus in order to
      * start and stop the animation
      * @private
      */
    /* private */ var bindFocusEvents: Any = js.native
    
    /**
      * Full animation is complete
      * @private
      */
    /* private */ var complete: Any = js.native
    
    var curLoop: Double = js.native
    
    var cursor: HTMLSpanElement = js.native
    
    var cursorBlinking: Any = js.native
    
    /**
      * Destroy this instance of Typed
      * @public
      */
    def destroy(): Unit = js.native
    
    /**
      * We're done typing the current string
      * @param {string} curString the current string in the strings array
      * @param {number} curStrPos the current position in the curString
      * @private
      */
    /* private */ var doneTyping: Any = js.native
    
    /**
      * Speed in MS to type
      * @param {number} speed
      * @private
      */
    /* private */ var humanizer: Any = js.native
    
    /**
      * Adds a CSS class to fade out current string
      * @private
      */
    /* private */ var initFadeOut: Any = js.native
    
    /**
      * On init, insert the cursor element
      * @private
      */
    /* private */ var insertCursor: Any = js.native
    
    /**
      * Continue to the next string & begin typing
      * @param {string} curString the current string in the strings array
      * @param {number} curStrPos the current position in the curString
      * @private
      */
    /* private */ var keepTyping: Any = js.native
    
    /**
      * Replaces current text in the HTML element
      * depending on element type
      * @param {string} str
      * @private
      */
    /* private */ var replaceText: Any = js.native
    
    /**
      * Reset Typed and optionally restarts
      * @param {boolean} restart
      * @public
      */
    def reset(): Unit = js.native
    def reset(restart: Boolean): Unit = js.native
    
    var sequence: Any = js.native
    
    /**
      * Has the typing been stopped
      * @param {string} curString the current string in the strings array
      * @param {number} curStrPos the current position in the curString
      * @param {boolean} isTyping
      * @private
      */
    /* private */ var setPauseStatus: Any = js.native
    
    /**
      * Shuffle the sequence of the strings array
      * @private
      */
    /* private */ var shuffleStringsIfNeeded: Any = js.native
    
    /**
      * Start typing / backspacing after being stopped
      * @public
      */
    def start(): Unit = js.native
    
    /**
      * Stop typing / backspacing and enable cursor blinking
      * @public
      */
    def stop(): Unit = js.native
    
    var stopNum: Double = js.native
    
    var strPos: Double = js.native
    
    var temporaryPause: Boolean = js.native
    
    var timeout: Any = js.native
    
    /**
      * Toggle start() and stop() of the Typed instance
      * @public
      */
    def toggle(): Unit = js.native
    
    /**
      * Toggle the blinking cursor
      * @param {boolean} isBlinking
      * @private
      */
    /* private */ var toggleBlinking: Any = js.native
    
    /**
      * Called for each character typed
      * @param {string} curString the current string in the strings array
      * @param {number} curStrPos the current position in the curString
      * @private
      */
    /* private */ var typewrite: Any = js.native
    
    var typingComplete: Boolean = js.native
  }
  
  trait TypedOptions extends StObject {
    
    /**
      * attribute for typing Ex: input placeholder, value, or just HTML text
      */
    var attr: js.UndefOr[String] = js.undefined
    
    /**
      * insert CSS for cursor and fadeOut into HTML
      */
    var autoInsertCss: js.UndefOr[Boolean] = js.undefined
    
    /**
      * time before backspacing in milliseconds
      */
    var backDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * backspacing speed in milliseconds
      */
    var backSpeed: js.UndefOr[Double] = js.undefined
    
    /**
      * bind to focus and blur if el is text input
      */
    var bindInputFocusEvents: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 'html' or 'null' for plaintext
      */
    var contentType: js.UndefOr[String] = js.undefined
    
    /**
      * character for cursor
      */
    var cursorChar: js.UndefOr[String] = js.undefined
    
    /**
      * Fade out instead of backspace
      */
    var fadeOut: js.UndefOr[Boolean] = js.undefined
    
    /**
      * css class for fade animation
      */
    var fadeOutClass: js.UndefOr[String] = js.undefined
    
    /**
      * Fade out delay in milliseconds
      */
    var fadeOutDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * loop strings
      */
    var loop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * amount of loops
      */
    var loopCount: js.UndefOr[Double] = js.undefined
    
    /**
      * Before it begins typing the first string
      */
    var onBegin: js.UndefOr[js.Function1[/* self */ Typed, Unit]] = js.undefined
    
    /**
      * All typing is complete
      */
    var onComplete: js.UndefOr[js.Function1[/* self */ Typed, Unit]] = js.undefined
    
    /**
      * After destroy
      */
    var onDestroy: js.UndefOr[js.Function1[/* self */ Typed, Unit]] = js.undefined
    
    /**
      * During looping, after last string is typed
      */
    var onLastStringBackspaced: js.UndefOr[js.Function1[/* self */ Typed, Unit]] = js.undefined
    
    /**
      * After reset
      */
    var onReset: js.UndefOr[js.Function1[/* self */ Typed, Unit]] = js.undefined
    
    /**
      * After start
      */
    var onStart: js.UndefOr[js.Function2[/* arrayPos */ Double, /* self */ Typed, Unit]] = js.undefined
    
    /**
      * After stop
      */
    var onStop: js.UndefOr[js.Function2[/* arrayPos */ Double, /* self */ Typed, Unit]] = js.undefined
    
    /**
      * After each string is typed
      */
    var onStringTyped: js.UndefOr[js.Function2[/* arrayPos */ Double, /* self */ Typed, Unit]] = js.undefined
    
    /**
      * Typing has been stopped
      */
    var onTypingPaused: js.UndefOr[js.Function2[/* arrayPos */ Double, /* self */ Typed, Unit]] = js.undefined
    
    /**
      * Typing has been started after being stopped
      */
    var onTypingResumed: js.UndefOr[js.Function2[/* arrayPos */ Double, /* self */ Typed, Unit]] = js.undefined
    
    /**
      * Before each string is typed
      */
    var preStringTyped: js.UndefOr[js.Function2[/* arrayPos */ Double, /* self */ Typed, Unit]] = js.undefined
    
    /**
      * show cursor
      */
    var showCursor: js.UndefOr[Boolean] = js.undefined
    
    /**
      * shuffle the strings
      */
    var shuffle: js.UndefOr[Boolean] = js.undefined
    
    /**
      * only backspace what doesn't match the previous string
      */
    var smartBackspace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * time before typing starts in milliseconds
      */
    var startDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * strings to be typed
      */
    var strings: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * ID or instance of HTML element of element containing string children
      */
    var stringsElement: js.UndefOr[String | Element] = js.undefined
    
    /**
      * type speed in milliseconds
      */
    var typeSpeed: js.UndefOr[Double] = js.undefined
  }
  object TypedOptions {
    
    inline def apply(): TypedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypedOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypedOptions] (val x: Self) extends AnyVal {
      
      inline def setAttr(value: String): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
      
      inline def setAttrUndefined: Self = StObject.set(x, "attr", js.undefined)
      
      inline def setAutoInsertCss(value: Boolean): Self = StObject.set(x, "autoInsertCss", value.asInstanceOf[js.Any])
      
      inline def setAutoInsertCssUndefined: Self = StObject.set(x, "autoInsertCss", js.undefined)
      
      inline def setBackDelay(value: Double): Self = StObject.set(x, "backDelay", value.asInstanceOf[js.Any])
      
      inline def setBackDelayUndefined: Self = StObject.set(x, "backDelay", js.undefined)
      
      inline def setBackSpeed(value: Double): Self = StObject.set(x, "backSpeed", value.asInstanceOf[js.Any])
      
      inline def setBackSpeedUndefined: Self = StObject.set(x, "backSpeed", js.undefined)
      
      inline def setBindInputFocusEvents(value: Boolean): Self = StObject.set(x, "bindInputFocusEvents", value.asInstanceOf[js.Any])
      
      inline def setBindInputFocusEventsUndefined: Self = StObject.set(x, "bindInputFocusEvents", js.undefined)
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setCursorChar(value: String): Self = StObject.set(x, "cursorChar", value.asInstanceOf[js.Any])
      
      inline def setCursorCharUndefined: Self = StObject.set(x, "cursorChar", js.undefined)
      
      inline def setFadeOut(value: Boolean): Self = StObject.set(x, "fadeOut", value.asInstanceOf[js.Any])
      
      inline def setFadeOutClass(value: String): Self = StObject.set(x, "fadeOutClass", value.asInstanceOf[js.Any])
      
      inline def setFadeOutClassUndefined: Self = StObject.set(x, "fadeOutClass", js.undefined)
      
      inline def setFadeOutDelay(value: Double): Self = StObject.set(x, "fadeOutDelay", value.asInstanceOf[js.Any])
      
      inline def setFadeOutDelayUndefined: Self = StObject.set(x, "fadeOutDelay", js.undefined)
      
      inline def setFadeOutUndefined: Self = StObject.set(x, "fadeOut", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopCount(value: Double): Self = StObject.set(x, "loopCount", value.asInstanceOf[js.Any])
      
      inline def setLoopCountUndefined: Self = StObject.set(x, "loopCount", js.undefined)
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setOnBegin(value: /* self */ Typed => Unit): Self = StObject.set(x, "onBegin", js.Any.fromFunction1(value))
      
      inline def setOnBeginUndefined: Self = StObject.set(x, "onBegin", js.undefined)
      
      inline def setOnComplete(value: /* self */ Typed => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setOnDestroy(value: /* self */ Typed => Unit): Self = StObject.set(x, "onDestroy", js.Any.fromFunction1(value))
      
      inline def setOnDestroyUndefined: Self = StObject.set(x, "onDestroy", js.undefined)
      
      inline def setOnLastStringBackspaced(value: /* self */ Typed => Unit): Self = StObject.set(x, "onLastStringBackspaced", js.Any.fromFunction1(value))
      
      inline def setOnLastStringBackspacedUndefined: Self = StObject.set(x, "onLastStringBackspaced", js.undefined)
      
      inline def setOnReset(value: /* self */ Typed => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnStart(value: (/* arrayPos */ Double, /* self */ Typed) => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction2(value))
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      inline def setOnStop(value: (/* arrayPos */ Double, /* self */ Typed) => Unit): Self = StObject.set(x, "onStop", js.Any.fromFunction2(value))
      
      inline def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
      
      inline def setOnStringTyped(value: (/* arrayPos */ Double, /* self */ Typed) => Unit): Self = StObject.set(x, "onStringTyped", js.Any.fromFunction2(value))
      
      inline def setOnStringTypedUndefined: Self = StObject.set(x, "onStringTyped", js.undefined)
      
      inline def setOnTypingPaused(value: (/* arrayPos */ Double, /* self */ Typed) => Unit): Self = StObject.set(x, "onTypingPaused", js.Any.fromFunction2(value))
      
      inline def setOnTypingPausedUndefined: Self = StObject.set(x, "onTypingPaused", js.undefined)
      
      inline def setOnTypingResumed(value: (/* arrayPos */ Double, /* self */ Typed) => Unit): Self = StObject.set(x, "onTypingResumed", js.Any.fromFunction2(value))
      
      inline def setOnTypingResumedUndefined: Self = StObject.set(x, "onTypingResumed", js.undefined)
      
      inline def setPreStringTyped(value: (/* arrayPos */ Double, /* self */ Typed) => Unit): Self = StObject.set(x, "preStringTyped", js.Any.fromFunction2(value))
      
      inline def setPreStringTypedUndefined: Self = StObject.set(x, "preStringTyped", js.undefined)
      
      inline def setShowCursor(value: Boolean): Self = StObject.set(x, "showCursor", value.asInstanceOf[js.Any])
      
      inline def setShowCursorUndefined: Self = StObject.set(x, "showCursor", js.undefined)
      
      inline def setShuffle(value: Boolean): Self = StObject.set(x, "shuffle", value.asInstanceOf[js.Any])
      
      inline def setShuffleUndefined: Self = StObject.set(x, "shuffle", js.undefined)
      
      inline def setSmartBackspace(value: Boolean): Self = StObject.set(x, "smartBackspace", value.asInstanceOf[js.Any])
      
      inline def setSmartBackspaceUndefined: Self = StObject.set(x, "smartBackspace", js.undefined)
      
      inline def setStartDelay(value: Double): Self = StObject.set(x, "startDelay", value.asInstanceOf[js.Any])
      
      inline def setStartDelayUndefined: Self = StObject.set(x, "startDelay", js.undefined)
      
      inline def setStrings(value: js.Array[String]): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
      
      inline def setStringsElement(value: String | Element): Self = StObject.set(x, "stringsElement", value.asInstanceOf[js.Any])
      
      inline def setStringsElementUndefined: Self = StObject.set(x, "stringsElement", js.undefined)
      
      inline def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
      
      inline def setStringsVarargs(value: String*): Self = StObject.set(x, "strings", js.Array(value*))
      
      inline def setTypeSpeed(value: Double): Self = StObject.set(x, "typeSpeed", value.asInstanceOf[js.Any])
      
      inline def setTypeSpeedUndefined: Self = StObject.set(x, "typeSpeed", js.undefined)
    }
  }
}
