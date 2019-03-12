package typings
package typedDotJsLib.typedDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypedOptions extends js.Object {
  /**
    * attribute for typing Ex: input placeholder, value, or just HTML text
    */
  var attr: js.UndefOr[java.lang.String] = js.undefined
  /**
    * insert CSS for cursor and fadeOut into HTML
    */
  var autoInsertCss: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * time before backspacing in milliseconds
    */
  var backDelay: js.UndefOr[scala.Double] = js.undefined
  /**
    * backspacing speed in milliseconds
    */
  var backSpeed: js.UndefOr[scala.Double] = js.undefined
  /**
    * bind to focus and blur if el is text input
    */
  var bindInputFocusEvents: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 'html' or 'null' for plaintext
    */
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * character for cursor
    */
  var cursorChar: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Fade out instead of backspace
    */
  var fadeOut: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * css class for fade animation
    */
  var fadeOutClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Fade out delay in milliseconds
    */
  var fadeOutDelay: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * loop strings
    */
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * amount of loops
    */
  var loopCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * All typing is complete
    */
  var onComplete: js.UndefOr[js.Function1[/* self */ Typed, scala.Unit]] = js.undefined
  /**
    * After destroy
    */
  var onDestroy: js.UndefOr[js.Function1[/* self */ Typed, scala.Unit]] = js.undefined
  /**
    * During looping, after last string is typed
    */
  var onLastStringBackspaced: js.UndefOr[js.Function1[/* self */ Typed, scala.Unit]] = js.undefined
  /**
    * After reset
    */
  var onReset: js.UndefOr[js.Function1[/* self */ Typed, scala.Unit]] = js.undefined
  /**
    * After start
    */
  var onStart: js.UndefOr[js.Function2[/* arrayPos */ scala.Double, /* self */ Typed, scala.Unit]] = js.undefined
  /**
    * After stop
    */
  var onStop: js.UndefOr[js.Function2[/* arrayPos */ scala.Double, /* self */ Typed, scala.Unit]] = js.undefined
  /**
    * After each string is typed
    */
  var onStringTyped: js.UndefOr[js.Function2[/* arrayPos */ scala.Double, /* self */ Typed, scala.Unit]] = js.undefined
  /**
    * Typing has been stopped
    */
  var onTypingPaused: js.UndefOr[js.Function2[/* arrayPos */ scala.Double, /* self */ Typed, scala.Unit]] = js.undefined
  /**
    * Typing has been started after being stopped
    */
  var onTypingResumed: js.UndefOr[js.Function2[/* arrayPos */ scala.Double, /* self */ Typed, scala.Unit]] = js.undefined
  /**
    * Before each string is typed
    */
  var preStringTyped: js.UndefOr[js.Function2[/* arrayPos */ scala.Double, /* self */ Typed, scala.Unit]] = js.undefined
  /**
    * show cursor
    */
  var showCursor: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * shuffle the strings
    */
  var shuffle: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * only backspace what doesn't match the previous string
    */
  var smartBackspace: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * time before typing starts in milliseconds
    */
  var startDelay: js.UndefOr[scala.Double] = js.undefined
  /**
    * strings to be typed
    */
  var strings: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * ID of element containing string children
    */
  var stringsElement: js.UndefOr[java.lang.String] = js.undefined
  /**
    * type speed in milliseconds
    */
  var typeSpeed: js.UndefOr[scala.Double] = js.undefined
}

object TypedOptions {
  @scala.inline
  def apply(
    attr: java.lang.String = null,
    autoInsertCss: js.UndefOr[scala.Boolean] = js.undefined,
    backDelay: scala.Int | scala.Double = null,
    backSpeed: scala.Int | scala.Double = null,
    bindInputFocusEvents: js.UndefOr[scala.Boolean] = js.undefined,
    contentType: java.lang.String = null,
    cursorChar: java.lang.String = null,
    fadeOut: js.UndefOr[scala.Boolean] = js.undefined,
    fadeOutClass: java.lang.String = null,
    fadeOutDelay: js.UndefOr[scala.Boolean] = js.undefined,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    loopCount: scala.Int | scala.Double = null,
    onComplete: /* self */ Typed => scala.Unit = null,
    onDestroy: /* self */ Typed => scala.Unit = null,
    onLastStringBackspaced: /* self */ Typed => scala.Unit = null,
    onReset: /* self */ Typed => scala.Unit = null,
    onStart: (/* arrayPos */ scala.Double, /* self */ Typed) => scala.Unit = null,
    onStop: (/* arrayPos */ scala.Double, /* self */ Typed) => scala.Unit = null,
    onStringTyped: (/* arrayPos */ scala.Double, /* self */ Typed) => scala.Unit = null,
    onTypingPaused: (/* arrayPos */ scala.Double, /* self */ Typed) => scala.Unit = null,
    onTypingResumed: (/* arrayPos */ scala.Double, /* self */ Typed) => scala.Unit = null,
    preStringTyped: (/* arrayPos */ scala.Double, /* self */ Typed) => scala.Unit = null,
    showCursor: js.UndefOr[scala.Boolean] = js.undefined,
    shuffle: js.UndefOr[scala.Boolean] = js.undefined,
    smartBackspace: js.UndefOr[scala.Boolean] = js.undefined,
    startDelay: scala.Int | scala.Double = null,
    strings: js.Array[java.lang.String] = null,
    stringsElement: java.lang.String = null,
    typeSpeed: scala.Int | scala.Double = null
  ): TypedOptions = {
    val __obj = js.Dynamic.literal()
    if (attr != null) __obj.updateDynamic("attr")(attr)
    if (!js.isUndefined(autoInsertCss)) __obj.updateDynamic("autoInsertCss")(autoInsertCss)
    if (backDelay != null) __obj.updateDynamic("backDelay")(backDelay.asInstanceOf[js.Any])
    if (backSpeed != null) __obj.updateDynamic("backSpeed")(backSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(bindInputFocusEvents)) __obj.updateDynamic("bindInputFocusEvents")(bindInputFocusEvents)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (cursorChar != null) __obj.updateDynamic("cursorChar")(cursorChar)
    if (!js.isUndefined(fadeOut)) __obj.updateDynamic("fadeOut")(fadeOut)
    if (fadeOutClass != null) __obj.updateDynamic("fadeOutClass")(fadeOutClass)
    if (!js.isUndefined(fadeOutDelay)) __obj.updateDynamic("fadeOutDelay")(fadeOutDelay)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
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
    if (!js.isUndefined(showCursor)) __obj.updateDynamic("showCursor")(showCursor)
    if (!js.isUndefined(shuffle)) __obj.updateDynamic("shuffle")(shuffle)
    if (!js.isUndefined(smartBackspace)) __obj.updateDynamic("smartBackspace")(smartBackspace)
    if (startDelay != null) __obj.updateDynamic("startDelay")(startDelay.asInstanceOf[js.Any])
    if (strings != null) __obj.updateDynamic("strings")(strings)
    if (stringsElement != null) __obj.updateDynamic("stringsElement")(stringsElement)
    if (typeSpeed != null) __obj.updateDynamic("typeSpeed")(typeSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedOptions]
  }
}

