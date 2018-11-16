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

