package typings.typedJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("typed.js", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Typed {
    def this(elementId: String, options: TypedOptions) = this()
  }
  
  @js.native
  trait Typed extends StObject {
    
    def destroy(): Unit = js.native
    
    def reset(): Unit = js.native
    def reset(restart: Boolean): Unit = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
    
    def toggle(): Unit = js.native
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
    var fadeOutDelay: js.UndefOr[Boolean] = js.undefined
    
    /**
      * loop strings
      */
    var loop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * amount of loops
      */
    var loopCount: js.UndefOr[Double] = js.undefined
    
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
      * ID of element containing string children
      */
    var stringsElement: js.UndefOr[String] = js.undefined
    
    /**
      * type speed in milliseconds
      */
    var typeSpeed: js.UndefOr[Double] = js.undefined
  }
  object TypedOptions {
    
    @scala.inline
    def apply(): TypedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypedOptions]
    }
    
    @scala.inline
    implicit class TypedOptionsMutableBuilder[Self <: TypedOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttr(value: String): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrUndefined: Self = StObject.set(x, "attr", js.undefined)
      
      @scala.inline
      def setAutoInsertCss(value: Boolean): Self = StObject.set(x, "autoInsertCss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoInsertCssUndefined: Self = StObject.set(x, "autoInsertCss", js.undefined)
      
      @scala.inline
      def setBackDelay(value: Double): Self = StObject.set(x, "backDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackDelayUndefined: Self = StObject.set(x, "backDelay", js.undefined)
      
      @scala.inline
      def setBackSpeed(value: Double): Self = StObject.set(x, "backSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackSpeedUndefined: Self = StObject.set(x, "backSpeed", js.undefined)
      
      @scala.inline
      def setBindInputFocusEvents(value: Boolean): Self = StObject.set(x, "bindInputFocusEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindInputFocusEventsUndefined: Self = StObject.set(x, "bindInputFocusEvents", js.undefined)
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setCursorChar(value: String): Self = StObject.set(x, "cursorChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorCharUndefined: Self = StObject.set(x, "cursorChar", js.undefined)
      
      @scala.inline
      def setFadeOut(value: Boolean): Self = StObject.set(x, "fadeOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFadeOutClass(value: String): Self = StObject.set(x, "fadeOutClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFadeOutClassUndefined: Self = StObject.set(x, "fadeOutClass", js.undefined)
      
      @scala.inline
      def setFadeOutDelay(value: Boolean): Self = StObject.set(x, "fadeOutDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFadeOutDelayUndefined: Self = StObject.set(x, "fadeOutDelay", js.undefined)
      
      @scala.inline
      def setFadeOutUndefined: Self = StObject.set(x, "fadeOut", js.undefined)
      
      @scala.inline
      def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopCount(value: Double): Self = StObject.set(x, "loopCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopCountUndefined: Self = StObject.set(x, "loopCount", js.undefined)
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setOnComplete(value: /* self */ Typed => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      @scala.inline
      def setOnDestroy(value: /* self */ Typed => Unit): Self = StObject.set(x, "onDestroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDestroyUndefined: Self = StObject.set(x, "onDestroy", js.undefined)
      
      @scala.inline
      def setOnLastStringBackspaced(value: /* self */ Typed => Unit): Self = StObject.set(x, "onLastStringBackspaced", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLastStringBackspacedUndefined: Self = StObject.set(x, "onLastStringBackspaced", js.undefined)
      
      @scala.inline
      def setOnReset(value: /* self */ Typed => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      @scala.inline
      def setOnStart(value: (/* arrayPos */ Double, /* self */ Typed) => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      @scala.inline
      def setOnStop(value: (/* arrayPos */ Double, /* self */ Typed) => Unit): Self = StObject.set(x, "onStop", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
      
      @scala.inline
      def setOnStringTyped(value: (/* arrayPos */ Double, /* self */ Typed) => Unit): Self = StObject.set(x, "onStringTyped", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnStringTypedUndefined: Self = StObject.set(x, "onStringTyped", js.undefined)
      
      @scala.inline
      def setOnTypingPaused(value: (/* arrayPos */ Double, /* self */ Typed) => Unit): Self = StObject.set(x, "onTypingPaused", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnTypingPausedUndefined: Self = StObject.set(x, "onTypingPaused", js.undefined)
      
      @scala.inline
      def setOnTypingResumed(value: (/* arrayPos */ Double, /* self */ Typed) => Unit): Self = StObject.set(x, "onTypingResumed", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnTypingResumedUndefined: Self = StObject.set(x, "onTypingResumed", js.undefined)
      
      @scala.inline
      def setPreStringTyped(value: (/* arrayPos */ Double, /* self */ Typed) => Unit): Self = StObject.set(x, "preStringTyped", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPreStringTypedUndefined: Self = StObject.set(x, "preStringTyped", js.undefined)
      
      @scala.inline
      def setShowCursor(value: Boolean): Self = StObject.set(x, "showCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCursorUndefined: Self = StObject.set(x, "showCursor", js.undefined)
      
      @scala.inline
      def setShuffle(value: Boolean): Self = StObject.set(x, "shuffle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShuffleUndefined: Self = StObject.set(x, "shuffle", js.undefined)
      
      @scala.inline
      def setSmartBackspace(value: Boolean): Self = StObject.set(x, "smartBackspace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmartBackspaceUndefined: Self = StObject.set(x, "smartBackspace", js.undefined)
      
      @scala.inline
      def setStartDelay(value: Double): Self = StObject.set(x, "startDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDelayUndefined: Self = StObject.set(x, "startDelay", js.undefined)
      
      @scala.inline
      def setStrings(value: js.Array[String]): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringsElement(value: String): Self = StObject.set(x, "stringsElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringsElementUndefined: Self = StObject.set(x, "stringsElement", js.undefined)
      
      @scala.inline
      def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
      
      @scala.inline
      def setStringsVarargs(value: String*): Self = StObject.set(x, "strings", js.Array(value :_*))
      
      @scala.inline
      def setTypeSpeed(value: Double): Self = StObject.set(x, "typeSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeSpeedUndefined: Self = StObject.set(x, "typeSpeed", js.undefined)
    }
  }
}
