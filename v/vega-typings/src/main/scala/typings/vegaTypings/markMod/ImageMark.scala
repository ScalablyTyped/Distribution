package typings.vegaTypings.markMod

import typings.vegaTypings.encodeMod.Encodable
import typings.vegaTypings.encodeMod.ImageEncodeEntry
import typings.vegaTypings.vegaTypingsStrings.image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageMark
  extends BaseMark
     with Encodable[ImageEncodeEntry]
     with Mark {
  var `type`: image = js.native
}

object ImageMark {
  @scala.inline
  def apply(`type`: image): ImageMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageMark]
  }
  @scala.inline
  implicit class ImageMarkOps[Self <: ImageMark] (val x: Self) extends AnyVal {
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
    def setType(value: image): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

