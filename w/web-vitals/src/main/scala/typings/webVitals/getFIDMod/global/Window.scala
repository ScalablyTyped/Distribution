package typings.webVitals.getFIDMod.global

import typings.webVitals.getFIDMod.FIDPolyfill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var perfMetrics: FIDPolyfill = js.native
}

object Window {
  @scala.inline
  def apply(perfMetrics: FIDPolyfill): Window = {
    val __obj = js.Dynamic.literal(perfMetrics = perfMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
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
    def setPerfMetrics(value: FIDPolyfill): Self = this.set("perfMetrics", value.asInstanceOf[js.Any])
  }
  
}

