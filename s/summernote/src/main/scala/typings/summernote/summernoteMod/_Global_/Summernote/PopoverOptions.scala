package typings.summernote.summernoteMod._Global_.Summernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverOptions extends js.Object {
  var air: js.UndefOr[popoverAirDef] = js.undefined
  var image: js.UndefOr[popoverImageDef] = js.undefined
  var link: js.UndefOr[popoverLinkDef] = js.undefined
}

object PopoverOptions {
  @scala.inline
  def apply(air: popoverAirDef = null, image: popoverImageDef = null, link: popoverLinkDef = null): PopoverOptions = {
    val __obj = js.Dynamic.literal()
    if (air != null) __obj.updateDynamic("air")(air.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverOptions]
  }
}

