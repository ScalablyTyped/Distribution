package typings.typedJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypedOptions extends js.Object {
  /**
    * attribute for typing Ex: input placeholder, value, or just HTML text
    */
  var attr: js.UndefOr[String] = js.native
  /**
    * insert CSS for cursor and fadeOut into HTML
    */
  var autoInsertCss: js.UndefOr[Boolean] = js.native
  /**
    * time before backspacing in milliseconds
    */
  var backDelay: js.UndefOr[Double] = js.native
  /**
    * backspacing speed in milliseconds
    */
  var backSpeed: js.UndefOr[Double] = js.native
  /**
    * bind to focus and blur if el is text input
    */
  var bindInputFocusEvents: js.UndefOr[Boolean] = js.native
  /**
    * 'html' or 'null' for plaintext
    */
  var contentType: js.UndefOr[String] = js.native
  /**
    * character for cursor
    */
  var cursorChar: js.UndefOr[String] = js.native
  /**
    * Fade out instead of backspace
    */
  var fadeOut: js.UndefOr[Boolean] = js.native
  /**
    * css class for fade animation
    */
  var fadeOutClass: js.UndefOr[String] = js.native
  /**
    * Fade out delay in milliseconds
    */
  var fadeOutDelay: js.UndefOr[Boolean] = js.native
  /**
    * loop strings
    */
  var loop: js.UndefOr[Boolean] = js.native
  /**
    * amount of loops
    */
  var loopCount: js.UndefOr[Double] = js.native
  /**
    * All typing is complete
    */
  var onComplete: js.UndefOr[js.Function1[/* self */ Typed, Unit]] = js.native
  /**
    * After destroy
    */
  var onDestroy: js.UndefOr[js.Function1[/* self */ Typed, Unit]] = js.native
  /**
    * During looping, after last string is typed
    */
  var onLastStringBackspaced: js.UndefOr[js.Function1[/* self */ Typed, Unit]] = js.native
  /**
    * After reset
    */
  var onReset: js.UndefOr[js.Function1[/* self */ Typed, Unit]] = js.native
  /**
    * After start
    */
  var onStart: js.UndefOr[js.Function2[/* arrayPos */ Double, /* self */ Typed, Unit]] = js.native
  /**
    * After stop
    */
  var onStop: js.UndefOr[js.Function2[/* arrayPos */ Double, /* self */ Typed, Unit]] = js.native
  /**
    * After each string is typed
    */
  var onStringTyped: js.UndefOr[js.Function2[/* arrayPos */ Double, /* self */ Typed, Unit]] = js.native
  /**
    * Typing has been stopped
    */
  var onTypingPaused: js.UndefOr[js.Function2[/* arrayPos */ Double, /* self */ Typed, Unit]] = js.native
  /**
    * Typing has been started after being stopped
    */
  var onTypingResumed: js.UndefOr[js.Function2[/* arrayPos */ Double, /* self */ Typed, Unit]] = js.native
  /**
    * Before each string is typed
    */
  var preStringTyped: js.UndefOr[js.Function2[/* arrayPos */ Double, /* self */ Typed, Unit]] = js.native
  /**
    * show cursor
    */
  var showCursor: js.UndefOr[Boolean] = js.native
  /**
    * shuffle the strings
    */
  var shuffle: js.UndefOr[Boolean] = js.native
  /**
    * only backspace what doesn't match the previous string
    */
  var smartBackspace: js.UndefOr[Boolean] = js.native
  /**
    * time before typing starts in milliseconds
    */
  var startDelay: js.UndefOr[Double] = js.native
  /**
    * strings to be typed
    */
  var strings: js.UndefOr[js.Array[String]] = js.native
  /**
    * ID of element containing string children
    */
  var stringsElement: js.UndefOr[String] = js.native
  /**
    * type speed in milliseconds
    */
  var typeSpeed: js.UndefOr[Double] = js.native
}

object TypedOptions {
  @scala.inline
  def apply(): TypedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypedOptions]
  }
  @scala.inline
  implicit class TypedOptionsOps[Self <: TypedOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttr(value: String): Self = this.set("attr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttr: Self = this.set("attr", js.undefined)
    @scala.inline
    def setAutoInsertCss(value: Boolean): Self = this.set("autoInsertCss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoInsertCss: Self = this.set("autoInsertCss", js.undefined)
    @scala.inline
    def setBackDelay(value: Double): Self = this.set("backDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackDelay: Self = this.set("backDelay", js.undefined)
    @scala.inline
    def setBackSpeed(value: Double): Self = this.set("backSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackSpeed: Self = this.set("backSpeed", js.undefined)
    @scala.inline
    def setBindInputFocusEvents(value: Boolean): Self = this.set("bindInputFocusEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindInputFocusEvents: Self = this.set("bindInputFocusEvents", js.undefined)
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setCursorChar(value: String): Self = this.set("cursorChar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursorChar: Self = this.set("cursorChar", js.undefined)
    @scala.inline
    def setFadeOut(value: Boolean): Self = this.set("fadeOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFadeOut: Self = this.set("fadeOut", js.undefined)
    @scala.inline
    def setFadeOutClass(value: String): Self = this.set("fadeOutClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFadeOutClass: Self = this.set("fadeOutClass", js.undefined)
    @scala.inline
    def setFadeOutDelay(value: Boolean): Self = this.set("fadeOutDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFadeOutDelay: Self = this.set("fadeOutDelay", js.undefined)
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setLoopCount(value: Double): Self = this.set("loopCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoopCount: Self = this.set("loopCount", js.undefined)
    @scala.inline
    def setOnComplete(value: /* self */ Typed => Unit): Self = this.set("onComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    @scala.inline
    def setOnDestroy(value: /* self */ Typed => Unit): Self = this.set("onDestroy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDestroy: Self = this.set("onDestroy", js.undefined)
    @scala.inline
    def setOnLastStringBackspaced(value: /* self */ Typed => Unit): Self = this.set("onLastStringBackspaced", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLastStringBackspaced: Self = this.set("onLastStringBackspaced", js.undefined)
    @scala.inline
    def setOnReset(value: /* self */ Typed => Unit): Self = this.set("onReset", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReset: Self = this.set("onReset", js.undefined)
    @scala.inline
    def setOnStart(value: (/* arrayPos */ Double, /* self */ Typed) => Unit): Self = this.set("onStart", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
    @scala.inline
    def setOnStop(value: (/* arrayPos */ Double, /* self */ Typed) => Unit): Self = this.set("onStop", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnStop: Self = this.set("onStop", js.undefined)
    @scala.inline
    def setOnStringTyped(value: (/* arrayPos */ Double, /* self */ Typed) => Unit): Self = this.set("onStringTyped", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnStringTyped: Self = this.set("onStringTyped", js.undefined)
    @scala.inline
    def setOnTypingPaused(value: (/* arrayPos */ Double, /* self */ Typed) => Unit): Self = this.set("onTypingPaused", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnTypingPaused: Self = this.set("onTypingPaused", js.undefined)
    @scala.inline
    def setOnTypingResumed(value: (/* arrayPos */ Double, /* self */ Typed) => Unit): Self = this.set("onTypingResumed", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnTypingResumed: Self = this.set("onTypingResumed", js.undefined)
    @scala.inline
    def setPreStringTyped(value: (/* arrayPos */ Double, /* self */ Typed) => Unit): Self = this.set("preStringTyped", js.Any.fromFunction2(value))
    @scala.inline
    def deletePreStringTyped: Self = this.set("preStringTyped", js.undefined)
    @scala.inline
    def setShowCursor(value: Boolean): Self = this.set("showCursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCursor: Self = this.set("showCursor", js.undefined)
    @scala.inline
    def setShuffle(value: Boolean): Self = this.set("shuffle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShuffle: Self = this.set("shuffle", js.undefined)
    @scala.inline
    def setSmartBackspace(value: Boolean): Self = this.set("smartBackspace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmartBackspace: Self = this.set("smartBackspace", js.undefined)
    @scala.inline
    def setStartDelay(value: Double): Self = this.set("startDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDelay: Self = this.set("startDelay", js.undefined)
    @scala.inline
    def setStringsVarargs(value: String*): Self = this.set("strings", js.Array(value :_*))
    @scala.inline
    def setStrings(value: js.Array[String]): Self = this.set("strings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrings: Self = this.set("strings", js.undefined)
    @scala.inline
    def setStringsElement(value: String): Self = this.set("stringsElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringsElement: Self = this.set("stringsElement", js.undefined)
    @scala.inline
    def setTypeSpeed(value: Double): Self = this.set("typeSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeSpeed: Self = this.set("typeSpeed", js.undefined)
  }
  
}

