package typings.typedDotJs.typedDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypedOptions extends js.Object {
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
  def apply(
    attr: String = null,
    autoInsertCss: js.UndefOr[Boolean] = js.undefined,
    backDelay: Int | Double = null,
    backSpeed: Int | Double = null,
    bindInputFocusEvents: js.UndefOr[Boolean] = js.undefined,
    contentType: String = null,
    cursorChar: String = null,
    fadeOut: js.UndefOr[Boolean] = js.undefined,
    fadeOutClass: String = null,
    fadeOutDelay: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    loopCount: Int | Double = null,
    onComplete: /* self */ Typed => Unit = null,
    onDestroy: /* self */ Typed => Unit = null,
    onLastStringBackspaced: /* self */ Typed => Unit = null,
    onReset: /* self */ Typed => Unit = null,
    onStart: (/* arrayPos */ Double, /* self */ Typed) => Unit = null,
    onStop: (/* arrayPos */ Double, /* self */ Typed) => Unit = null,
    onStringTyped: (/* arrayPos */ Double, /* self */ Typed) => Unit = null,
    onTypingPaused: (/* arrayPos */ Double, /* self */ Typed) => Unit = null,
    onTypingResumed: (/* arrayPos */ Double, /* self */ Typed) => Unit = null,
    preStringTyped: (/* arrayPos */ Double, /* self */ Typed) => Unit = null,
    showCursor: js.UndefOr[Boolean] = js.undefined,
    shuffle: js.UndefOr[Boolean] = js.undefined,
    smartBackspace: js.UndefOr[Boolean] = js.undefined,
    startDelay: Int | Double = null,
    strings: js.Array[String] = null,
    stringsElement: String = null,
    typeSpeed: Int | Double = null
  ): TypedOptions = {
    val __obj = js.Dynamic.literal()
    if (attr != null) __obj.updateDynamic("attr")(attr.asInstanceOf[js.Any])
    if (!js.isUndefined(autoInsertCss)) __obj.updateDynamic("autoInsertCss")(autoInsertCss.asInstanceOf[js.Any])
    if (backDelay != null) __obj.updateDynamic("backDelay")(backDelay.asInstanceOf[js.Any])
    if (backSpeed != null) __obj.updateDynamic("backSpeed")(backSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(bindInputFocusEvents)) __obj.updateDynamic("bindInputFocusEvents")(bindInputFocusEvents.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (cursorChar != null) __obj.updateDynamic("cursorChar")(cursorChar.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeOut)) __obj.updateDynamic("fadeOut")(fadeOut.asInstanceOf[js.Any])
    if (fadeOutClass != null) __obj.updateDynamic("fadeOutClass")(fadeOutClass.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeOutDelay)) __obj.updateDynamic("fadeOutDelay")(fadeOutDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (loopCount != null) __obj.updateDynamic("loopCount")(loopCount.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    if (onDestroy != null) __obj.updateDynamic("onDestroy")(js.Any.fromFunction1(onDestroy))
    if (onLastStringBackspaced != null) __obj.updateDynamic("onLastStringBackspaced")(js.Any.fromFunction1(onLastStringBackspaced))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction2(onStart))
    if (onStop != null) __obj.updateDynamic("onStop")(js.Any.fromFunction2(onStop))
    if (onStringTyped != null) __obj.updateDynamic("onStringTyped")(js.Any.fromFunction2(onStringTyped))
    if (onTypingPaused != null) __obj.updateDynamic("onTypingPaused")(js.Any.fromFunction2(onTypingPaused))
    if (onTypingResumed != null) __obj.updateDynamic("onTypingResumed")(js.Any.fromFunction2(onTypingResumed))
    if (preStringTyped != null) __obj.updateDynamic("preStringTyped")(js.Any.fromFunction2(preStringTyped))
    if (!js.isUndefined(showCursor)) __obj.updateDynamic("showCursor")(showCursor.asInstanceOf[js.Any])
    if (!js.isUndefined(shuffle)) __obj.updateDynamic("shuffle")(shuffle.asInstanceOf[js.Any])
    if (!js.isUndefined(smartBackspace)) __obj.updateDynamic("smartBackspace")(smartBackspace.asInstanceOf[js.Any])
    if (startDelay != null) __obj.updateDynamic("startDelay")(startDelay.asInstanceOf[js.Any])
    if (strings != null) __obj.updateDynamic("strings")(strings.asInstanceOf[js.Any])
    if (stringsElement != null) __obj.updateDynamic("stringsElement")(stringsElement.asInstanceOf[js.Any])
    if (typeSpeed != null) __obj.updateDynamic("typeSpeed")(typeSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedOptions]
  }
}

