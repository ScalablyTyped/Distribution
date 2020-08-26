package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.NumberDictionary
import typings.std.HTMLTrackElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The current list of {@link HtmlTrackElement}s.
  */
@js.native
trait HTMLTrackElementList extends /* index */ NumberDictionary[HTMLTrackElement] {
  /**
    * The current number of `Track`s in the this Trackist.
    */
  var length: Double = js.native
}

object HTMLTrackElementList {
  @scala.inline
  def apply(length: Double): HTMLTrackElementList = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLTrackElementList]
  }
  @scala.inline
  implicit class HTMLTrackElementListOps[Self <: HTMLTrackElementList] (val x: Self) extends AnyVal {
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
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
  }
  
}

