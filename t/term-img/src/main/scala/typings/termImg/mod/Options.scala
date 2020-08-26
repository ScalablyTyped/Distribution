package typings.termImg.mod

import typings.ansiEscapes.mod.ImageOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[FallbackType] extends ImageOptions {
  /**
  		Enables you to do something else when the terminal doesn't support images.
  		@default () => throw new UnsupportedTerminalError()
  		*/
  val fallback: js.UndefOr[js.Function0[FallbackType]] = js.native
}

object Options {
  @scala.inline
  def apply[FallbackType](): Options[FallbackType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[FallbackType]]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], FallbackType] (val x: Self with Options[FallbackType]) extends AnyVal {
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
    def setFallback(value: () => FallbackType): Self = this.set("fallback", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
  }
  
}

