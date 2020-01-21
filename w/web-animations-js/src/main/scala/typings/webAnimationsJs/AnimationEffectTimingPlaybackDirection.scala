package typings.webAnimationsJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.webAnimationsJs.webAnimationsJsStrings.normal
  - typings.webAnimationsJs.webAnimationsJsStrings.reverse
  - typings.webAnimationsJs.webAnimationsJsStrings.alternate
  - typings.webAnimationsJs.webAnimationsJsStrings.`alternate-reverse`
*/
trait AnimationEffectTimingPlaybackDirection extends js.Object

object AnimationEffectTimingPlaybackDirection {
  @scala.inline
  def alternate: typings.webAnimationsJs.webAnimationsJsStrings.alternate = this.cast("alternate")
  @scala.inline
  def `alternate-reverse`: typings.webAnimationsJs.webAnimationsJsStrings.`alternate-reverse` = this.cast("alternate-reverse")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def normal: typings.webAnimationsJs.webAnimationsJsStrings.normal = this.cast("normal")
  @scala.inline
  def reverse: typings.webAnimationsJs.webAnimationsJsStrings.reverse = this.cast("reverse")
}

