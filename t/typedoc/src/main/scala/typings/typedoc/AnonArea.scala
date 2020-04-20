package typings.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArea extends js.Object {
  var area: Boolean
  var base: Boolean
  var br: Boolean
  var col: Boolean
  var command: Boolean
  var embed: Boolean
  var hr: Boolean
  var img: Boolean
  var input: Boolean
  var link: Boolean
  var meta: Boolean
  var param: Boolean
  var source: Boolean
  var wbr: Boolean
}

object AnonArea {
  @scala.inline
  def apply(
    area: Boolean,
    base: Boolean,
    br: Boolean,
    col: Boolean,
    command: Boolean,
    embed: Boolean,
    hr: Boolean,
    img: Boolean,
    input: Boolean,
    link: Boolean,
    meta: Boolean,
    param: Boolean,
    source: Boolean,
    wbr: Boolean
  ): AnonArea = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], embed = embed.asInstanceOf[js.Any], hr = hr.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], wbr = wbr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArea]
  }
}

