package typings.vegaDashLite.buildSrcTitleMod

import typings.vegaDashLite.buildSrcVegaDotSchemaMod.Anchor
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.TitleOrient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TitleParams extends TitleBase {
  /**
    * The title text.
    */
  var text: String
}

object TitleParams {
  @scala.inline
  def apply(
    text: String,
    anchor: Anchor = null,
    offset: Int | Double = null,
    orient: TitleOrient = null,
    style: String | js.Array[String] = null
  ): TitleParams = {
    val __obj = js.Dynamic.literal(text = text)
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleParams]
  }
}

